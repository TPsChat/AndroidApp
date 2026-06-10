package com.example.chatappjava.utils;

import android.content.Context;
import android.provider.Settings;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.TextView;

import androidx.annotation.AnimRes;
import androidx.annotation.Nullable;
import androidx.core.view.animation.PathInterpolatorCompat;

import com.example.chatappjava.R;

public final class MotionUtils {

    private MotionUtils() {
    }

    public static boolean isMotionReduced(Context context) {
        if (context == null) {
            return false;
        }
        try {
            float animatorScale = Settings.Global.getFloat(
                    context.getContentResolver(),
                    Settings.Global.ANIMATOR_DURATION_SCALE,
                    1f
            );
            float transitionScale = Settings.Global.getFloat(
                    context.getContentResolver(),
                    Settings.Global.TRANSITION_ANIMATION_SCALE,
                    1f
            );
            return animatorScale == 0f || transitionScale == 0f;
        } catch (Exception ignored) {
            return false;
        }
    }

    public static boolean shouldAnimate(Context context, boolean requested) {
        return requested && !isMotionReduced(context);
    }

    public static Interpolator getEaseOutInterpolator() {
        return PathInterpolatorCompat.create(0.25f, 1f, 0.5f, 1f);
    }

    public static long normalDuration(Context context) {
        return isMotionReduced(context) ? 0L : context.getResources().getInteger(R.integer.anim_duration_normal);
    }

    public static void playAnimation(Context context, View view, @AnimRes int animationRes) {
        if (view == null || context == null) {
            return;
        }
        if (isMotionReduced(context)) {
            return;
        }
        Animation animation = AnimationUtils.loadAnimation(context, animationRes);
        if (animation != null) {
            view.startAnimation(animation);
        }
    }

    /**
     * Touch-down scale feedback that does not consume clicks. Safe for nav tabs and list rows.
     */
    public static void attachPressFeedback(Context context, View view) {
        if (view == null || context == null) {
            return;
        }
        final float pressedScale = 0.96f;
        final int duration = context.getResources().getInteger(R.integer.anim_duration_press);
        view.setOnTouchListener((v, event) -> {
            if (isMotionReduced(context)) {
                return false;
            }
            switch (event.getActionMasked()) {
                case MotionEvent.ACTION_DOWN:
                    v.animate().cancel();
                    v.animate()
                            .scaleX(pressedScale)
                            .scaleY(pressedScale)
                            .setDuration(duration)
                            .setInterpolator(getEaseOutInterpolator())
                            .start();
                    break;
                case MotionEvent.ACTION_UP:
                case MotionEvent.ACTION_CANCEL:
                    v.animate().cancel();
                    v.animate()
                            .scaleX(1f)
                            .scaleY(1f)
                            .setDuration(duration)
                            .setInterpolator(getEaseOutInterpolator())
                            .start();
                    break;
                default:
                    break;
            }
            return false;
        });
    }

    public static void attachPressFeedback(Context context, View... views) {
        if (views == null) {
            return;
        }
        for (View view : views) {
            attachPressFeedback(context, view);
        }
    }

    public static void playPressScale(Context context, View view) {
        if (view == null || context == null || isMotionReduced(context)) {
            return;
        }
        view.animate().cancel();
        view.animate()
                .scaleX(0.94f)
                .scaleY(0.94f)
                .setDuration(context.getResources().getInteger(R.integer.anim_duration_press))
                .setInterpolator(getEaseOutInterpolator())
                .withEndAction(() -> view.animate()
                        .scaleX(1f)
                        .scaleY(1f)
                        .setDuration(context.getResources().getInteger(R.integer.anim_duration_press))
                        .setInterpolator(getEaseOutInterpolator())
                        .start())
                .start();
    }

    public static void pulseTabIcon(Context context, @Nullable View tabIcon) {
        if (tabIcon == null || !shouldAnimate(context, true)) {
            return;
        }
        tabIcon.animate().cancel();
        tabIcon.setScaleX(1f);
        tabIcon.setScaleY(1f);
        tabIcon.animate()
                .scaleX(1.1f)
                .scaleY(1.1f)
                .setDuration(120L)
                .setInterpolator(getEaseOutInterpolator())
                .withEndAction(() -> tabIcon.animate()
                        .scaleX(1f)
                        .scaleY(1f)
                        .setDuration(140L)
                        .setInterpolator(getEaseOutInterpolator())
                        .start())
                .start();
    }

    public static void staggeredReveal(Context context, View... views) {
        if (views == null || views.length == 0) {
            return;
        }
        if (!shouldAnimate(context, true)) {
            for (View view : views) {
                if (view != null) {
                    view.setAlpha(1f);
                    view.setTranslationY(0f);
                }
            }
            return;
        }
        long step = context.getResources().getInteger(R.integer.anim_duration_stagger_step);
        long duration = context.getResources().getInteger(R.integer.anim_duration_entry);
        float travel = dp(context, 12f);
        long delay = 0L;
        for (View view : views) {
            if (view == null) {
                continue;
            }
            // Content stays readable; motion enhances, never gates visibility (Impeccable product rule).
            view.setAlpha(0.92f);
            view.setTranslationY(travel);
            view.animate()
                    .alpha(1f)
                    .translationY(0f)
                    .setStartDelay(delay)
                    .setDuration(duration)
                    .setInterpolator(getEaseOutInterpolator())
                    .start();
            delay += step;
        }
    }

    public static void revealView(Context context, View view) {
        if (view == null) {
            return;
        }
        if (!shouldAnimate(context, true)) {
            view.setAlpha(1f);
            view.setTranslationY(0f);
            return;
        }
        view.setAlpha(0.88f);
        view.setTranslationY(dp(context, 6f));
        view.animate()
                .alpha(1f)
                .translationY(0f)
                .setDuration(normalDuration(context))
                .setInterpolator(getEaseOutInterpolator())
                .start();
    }

    public static void animateDialogIn(Context context, View dialogRoot) {
        if (dialogRoot == null) {
            return;
        }
        if (!shouldAnimate(context, true)) {
            dialogRoot.setAlpha(1f);
            dialogRoot.setTranslationY(0f);
            return;
        }
        dialogRoot.setAlpha(0f);
        dialogRoot.setTranslationY(dp(context, 18f));
        dialogRoot.animate()
                .alpha(1f)
                .translationY(0f)
                .setDuration(context.getResources().getInteger(R.integer.anim_duration_modal))
                .setInterpolator(getEaseOutInterpolator())
                .start();
    }

    public static void crossfadeText(Context context, TextView textView, Runnable updateText) {
        if (textView == null || updateText == null) {
            return;
        }
        if (!shouldAnimate(context, true)) {
            updateText.run();
            textView.setAlpha(1f);
            textView.setTranslationY(0f);
            return;
        }
        float travel = dp(context, 8f);
        textView.animate().cancel();
        textView.animate()
                .alpha(0f)
                .translationY(-travel * 0.4f)
                .setDuration(120L)
                .setInterpolator(getEaseOutInterpolator())
                .withEndAction(() -> {
                    updateText.run();
                    textView.setTranslationY(travel * 0.3f);
                    textView.animate()
                            .alpha(1f)
                            .translationY(0f)
                            .setDuration(180L)
                            .setInterpolator(getEaseOutInterpolator())
                            .start();
                })
                .start();
    }

    public static void crossfadePanel(Context context, @Nullable View panel) {
        if (panel == null || !shouldAnimate(context, true)) {
            return;
        }
        panel.setAlpha(0.92f);
        panel.animate()
                .alpha(1f)
                .setDuration(context.getResources().getInteger(R.integer.anim_duration_fast))
                .setInterpolator(getEaseOutInterpolator())
                .start();
    }

    private static float dp(Context context, float value) {
        return value * context.getResources().getDisplayMetrics().density;
    }
}
