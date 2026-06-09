package com.example.chatappjava.utils;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.DrawableRes;
import androidx.annotation.StringRes;

import com.example.chatappjava.R;

public final class EmptyStateHelper {

    private EmptyStateHelper() {
    }

    public static void bind(
            View emptyStateRoot,
            @StringRes int titleRes,
            @StringRes int subtitleRes
    ) {
        bind(emptyStateRoot, titleRes, subtitleRes, 0);
    }

    public static void bind(
            View emptyStateRoot,
            @StringRes int titleRes,
            @StringRes int subtitleRes,
            @DrawableRes int iconRes
    ) {
        if (emptyStateRoot == null) {
            return;
        }

        TextView titleView = emptyStateRoot.findViewById(R.id.tv_empty_title);
        TextView subtitleView = emptyStateRoot.findViewById(R.id.tv_empty_subtitle);
        ImageView iconView = emptyStateRoot.findViewById(R.id.iv_empty_icon);

        if (titleView != null) {
            titleView.setText(titleRes);
        }
        if (subtitleView != null) {
            subtitleView.setText(subtitleRes);
        }
        if (iconView != null) {
            if (iconRes != 0) {
                iconView.setImageResource(iconRes);
                iconView.setVisibility(View.VISIBLE);
            } else {
                iconView.setVisibility(View.GONE);
            }
        }
    }

    public static void bindAndReveal(
            android.content.Context context,
            View emptyStateRoot,
            @StringRes int titleRes,
            @StringRes int subtitleRes,
            @DrawableRes int iconRes
    ) {
        bind(emptyStateRoot, titleRes, subtitleRes, iconRes);
        MotionUtils.revealView(context, emptyStateRoot);
    }
}
