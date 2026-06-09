---
name: ChatApp — Void Copper
description: Dark-premium Android chat client with void canvas, warm-tinted surfaces, and a single copper accent.
colors:
  canvas-void: "#0B0D11"
  surface-sunken: "#12161C"
  surface-raised: "#1A2028"
  surface-high: "#222932"
  surface-highest: "#2B3340"
  bubble-sent: "#141C24"
  bubble-received: "#1A2028"
  bubble-reply: "#1E2733"
  copper-signal: "#C8875A"
  copper-deep: "#A66D45"
  copper-soft: "#E0A67E"
  ink-primary: "#F2F4F7"
  ink-muted: "#8A939F"
  ink-whisper: "#7F8996"
  border-subtle: "#2A323D"
  border-outline: "#3D4654"
  danger-rose: "#E05A5A"
  success-green: "#3DB88C"
  warning-amber: "#D4A054"
  video-stage: "#080A0E"
typography:
  display:
    fontFamily: "Plus Jakarta Sans, sans-serif"
    fontSize: "28sp"
    fontWeight: 700
    lineHeight: 1.1
    letterSpacing: "-0.02em"
  headline:
    fontFamily: "Plus Jakarta Sans, sans-serif"
    fontSize: "22sp"
    fontWeight: 700
    lineHeight: 1.2
    letterSpacing: "-0.01em"
  title:
    fontFamily: "Plus Jakarta Sans, sans-serif"
    fontSize: "20sp"
    fontWeight: 600
    lineHeight: 1.25
  body:
    fontFamily: "Plus Jakarta Sans, sans-serif"
    fontSize: "14sp"
    fontWeight: 400
    lineHeight: 1.5
  body-large:
    fontFamily: "Plus Jakarta Sans, sans-serif"
    fontSize: "16sp"
    fontWeight: 400
    lineHeight: 1.5
  label:
    fontFamily: "Plus Jakarta Sans, sans-serif"
    fontSize: "12sp"
    fontWeight: 700
    letterSpacing: "0.02em"
rounded:
  sm: "6dp"
  md: "12dp"
  lg: "20dp"
  xl: "28dp"
  pill: "999dp"
spacing:
  xs: "8dp"
  sm: "12dp"
  md: "16dp"
  lg: "24dp"
  xl: "32dp"
  gutter: "16dp"
  screen-margin: "20dp"
components:
  button-primary:
    backgroundColor: "{colors.copper-signal}"
    textColor: "{colors.ink-primary}"
    rounded: "{rounded.pill}"
    padding: "12dp 24dp"
    height: "52dp"
  button-primary-pressed:
    backgroundColor: "{colors.copper-deep}"
    textColor: "{colors.ink-primary}"
    rounded: "{rounded.pill}"
  button-secondary:
    backgroundColor: "{colors.surface-raised}"
    textColor: "{colors.ink-primary}"
    rounded: "{rounded.pill}"
    padding: "12dp 24dp"
  button-danger:
    backgroundColor: "{colors.danger-rose}"
    textColor: "{colors.ink-primary}"
    rounded: "{rounded.pill}"
    height: "52dp"
  bubble-sent:
    backgroundColor: "{colors.bubble-sent}"
    textColor: "{colors.ink-primary}"
    rounded: "{rounded.lg}"
  bubble-received:
    backgroundColor: "{colors.bubble-received}"
    textColor: "{colors.ink-primary}"
    rounded: "{rounded.lg}"
  input-search:
    backgroundColor: "{colors.surface-sunken}"
    textColor: "{colors.ink-primary}"
    rounded: "{rounded.md}"
    height: "48dp"
  input-field:
    backgroundColor: "{colors.surface-sunken}"
    textColor: "{colors.ink-primary}"
    rounded: "{rounded.md}"
    height: "52dp"
  filter-pill-active:
    backgroundColor: "{colors.copper-signal}"
    textColor: "{colors.ink-primary}"
    rounded: "{rounded.pill}"
  filter-pill-inactive:
    backgroundColor: "{colors.surface-raised}"
    textColor: "{colors.ink-muted}"
    rounded: "{rounded.pill}"
---

# Design System: ChatApp — Void Copper

## 1. Overview

**Creative North Star: "The Private Evening Terminal"**

A dark communication surface for frequent, low-light use. Deep void canvas, warm-tinted neutral surfaces, crisp white type, and one copper accent that marks action without Messenger-blue fatigue. Chat bubbles, call controls, and feed rows share one flat material language: tone steps, hairline borders, no floating glass chrome.

Rejects: Facebook/Messenger brightness, AI-slop purple gradients, decorative glassmorphism, legacy Midnight Slate azure + pill nav.

**Key Characteristics:**
- Void canvas `#0B0D11` with warm-tinted surface steps
- Single accent: Copper Signal `#C8875A`
- Plus Jakarta Sans; weight-driven hierarchy; sentence case
- Flat edge-to-edge dock navigation with top hairline
- Divider-based lists (not card-per-row)
- Message bubbles: 20dp radius, 6dp tail corner
- Touch targets ≥48dp; WCAG AA on dark surfaces
- User-facing copy in `strings.xml`; accessibility labels on all icon controls
- Reduced motion respected via `MotionUtils.isMotionReduced()`

**Responsive posture:** Phone-first (`values/`). Narrow phones (`values-w360dp/`) tighten nav tab padding. Tablets (`values-sw600dp/`) widen screen margins (32dp), bubble max width (360dp), and cap home content at 640dp.

## 2. Colors

Warm void neutrals carry depth; copper is the only decorative accent.

### Primary
- **Copper Signal** `#C8875A` (`palette_crimson`, `md3_primary`): Primary buttons, active tabs, send, focus rings, switch track on.
- **Copper Deep** `#A66D45` (`palette_wine`, `md3_primary_dark`): Pressed primary, gradient end.
- **Copper Soft** `#E0A67E` (`brand_red_light`): OTP ring filled, light highlights.

### Neutral
- **Canvas Void** `#0B0D11` (`palette_charcoal`, `app_bg`): App background, status bar, nav bar.
- **Surface Sunken** `#12161C` (`neu_surface_sunken`): Dialogs, inputs, dock nav.
- **Surface Raised** `#1A2028` (`neu_surface_raised`): List highlight, received bubbles, secondary buttons.
- **Surface High** `#222932` (`neu_highlight`): Elevated panels.
- **Surface Highest** `#2B3340` (`md3_surface_container_highest`): Modals, emphasis.
- **Border Subtle** `#2A323D` (`md3_border_subtle`): Hairlines, bubble strokes, switch track off tint.
- **Border Outline** `#3D4654` (`md3_outline`): Strong dividers, disabled outlines.

### Semantic (status only)
- **Danger Rose** `#E05A5A` (`danger`, `call_decline`)
- **Success Green** `#3DB88C` (`accept`, `call_accept`)
- **Warning Amber** `#D4A054` (`warning_color`)

### Text
- **Ink Primary** `#F2F4F7` (`ink_primary`, `text_primary`)
- **Ink Muted** `#8A939F` (`ink_muted`): Timestamps, metadata (≥4.5:1 on void and raised)
- **Ink Whisper** `#7F8996` (`ink_whisper`, `text_hint`): Hints, placeholders, inactive nav icons (≥4.5:1 on void and sunken)

### Chat
- **Bubble Sent** `#141C24` (`my_message_bg`)
- **Bubble Received** `#1A2028` (`other_message_bg`)
- **Bubble Reply** `#1E2733` (`reply_message_bg`)

**The One Accent Rule.** Copper appears on ≤10% of any screen. Green and red are status-only, never decorative accents.

## 3. Typography

**Display / Body Font:** Plus Jakarta Sans (`@font/plus_jakarta_sans`), weights 400–700.

**Character:** Confident and readable in low light. Weight contrast before size shrink. Sentence case everywhere; no all-caps body or button labels.

### Hierarchy

| Style (`styles.xml`) | Role | Size | Weight | Use |
|----------------------|------|------|--------|-----|
| `AppHeadlineLarge` | Display | 28sp | 700 | Auth titles, major headers |
| `AppHeadlineMedium` | Headline | 22sp | 700 | Dialog titles, screen titles |
| `AppHeadlineSmall` | Title | 20sp | 700 | Section headers, empty states |
| `AppBodyLarge` | Body Large | 16sp | 400 | Form fields, list labels |
| `AppBodyMedium` | Body | 14sp | 400 | Message text, previews |
| `AppBodySmall` / `AppCaptionMuted` | Caption | 12sp | 400 | Timestamps, metadata |
| `AppLabelSmall` | Label | 12sp | 700 | Badges, emphasized labels |
| `AppBannerText` | Banner | 13sp | 700 | Inline banners |

**The Weight-Not-Size Rule.** Secondary hierarchy uses Ink Muted and Medium weight before dropping below 14sp.

Legacy `Midnight*` style names alias to `App*` for backward compatibility. Do not use Midnight Slate visual values.

## 4. Elevation

Tonal layering only. No drop shadows on list rows.

Depth comes from surface step (`void` → `sunken` → `raised` → `high`) plus 1dp hairline borders (`border-subtle`). Bubbles and primary buttons may use a 1dp offset tint (`shadow_tint_subtle` `#0A000000`). Video stage is full-bleed `#080A0E`.

**The Flat-Canvas Rule.** The app background stays Canvas Void. Elevated elements rise through surface tokens, not blur or floating pills.

## 5. Components

### Buttons
- **Shape:** Pill (`radius_pill` 999dp), 52dp min height (`AppPrimaryButton`, `input_field_height`).
- **Primary:** Solid copper (`bg_button_normal_ripple`), Ink Primary text, copper ripple.
- **Pressed:** Copper Deep via drawable state; `MotionUtils.applyPressScale()` on key surfaces.
- **Secondary:** Surface Raised + `border-subtle` outline (`bg_neu_raised`).
- **Danger:** Rose gradient (`bg_button_danger_selected_ripple`), 52dp, for delete/decline.

### Message Bubbles
- **Shape:** 20dp radius (`radius_lg`), 6dp tail (`bubble_tail_radius`). Sent: tail bottom-right; received: tail bottom-left.
- **Drawables:** `bg_message_sent`, `bg_message_received`, `bg_message_reply_*`.
- **Max width:** 280dp phone, 360dp tablet (`message_bubble_max_width`).

### Inputs / Search
- **Search:** Surface Sunken (`bg_glass_search`), 48dp height, 12dp radius. Focus: copper border (`border_focus`).
- **Form fields:** `AppInputField` on `bg_soft_inset`, 52dp, Ink Whisper hints.

### Switches
- Track: `switch_track_selector` (copper on `#55C8875A`, off `#334A5568`).
- Persisted via `DatabaseManager` + `NotificationSettingsHelper`; FCM respects push/sound/vibrate flags.

### Navigation
- **Flat dock:** Full width, Surface Sunken (`bg_glass_nav`), 1dp top border, 56dp height (`nav_bar_height`).
- **Tabs:** 48dp touch (`nav_tab_height`). Active: copper icon; inactive: Ink Whisper.
- **Flat header:** `AppFlatHeader` + `component_back_button` + `AppToolbarTitle` on inner screens.

### Lists
- Rows on void canvas; `divider_height` 1dp hairline (`bg_list_row_divider`).
- Row min height 72dp (`list_row_min_height`). No nested cards per row.

### Dialogs
- Surface Sunken (`bg_glass_panel`), 20dp corner radius. Headline 22sp bold.
- Confirm flows via `DialogUtils.showConfirm()`. Entrance: `MotionUtils` modal duration (280ms) unless reduced motion.

### Call UI
- Video stage full bleed (`video_stage`). Accept green circle, decline rose circle. 48dp controls on scrim (`call_overlay_scrim`).

### Empty states
- `component_empty_state`: title (`AppHeadlineSmall`), subtitle (`AppBodyMedium` muted), optional icon.
- Bind with `EmptyStateHelper.bind(root, titleRes, subtitleRes, iconRes)` or `bindAndReveal()` for motion.

### Reusable layout components (`res/layout/component_*.xml`)

| Component | Use when |
|-----------|----------|
| `component_back_button` | Any screen toolbar needs a 48dp back affordance (`iv_back`) |
| `component_flat_header` | Simple title screen: back + `tv_title` inside `AppFlatHeader` |
| `component_empty_state` | List/feed has zero items |
| `component_search_bar` | Tappable search affordance (hint row, not editable field) |
| `component_create_post_bar` | Feed composer strip with avatar, hint, and post actions |

### Reusable styles (`res/values/styles.xml`)

| Style | Use when |
|-------|----------|
| `AppFlatHeader` | Full-width flat toolbar container |
| `AppBackButton` | Back icon sizing, circle background, 48dp target |
| `AppToolbarTitle` | Single-line screen title beside back button |
| `AppSettingsSectionTitle` / `AppSettingsSectionTitleSpaced` | Settings section headings |
| `AppListDividerRow` + icon/label/chevron variants | Divider list rows (settings, options) |
| `AppOptionRow` | Dialog option rows on raised surface |
| `AppInputField` | Auth and settings text inputs |
| `AppPrimaryButton` | Primary CTA buttons |
| `AppSearchBar` | Search container background and height |

### Motion (`MotionUtils`, `res/anim/`, `res/interpolator/`)

| Duration token | Ms | Use |
|----------------|-----|-----|
| `anim_duration_press` | 120 | Button press, tab pulse |
| `anim_duration_fast` | 150 | Fades out, panel crossfade |
| `anim_duration_normal` | 220 | Text swap, empty reveal |
| `anim_duration_modal` | 280 | Dialog entrance |
| `anim_duration_highlight` | 320 | Scroll-to-message highlight |

Easing: `ease_out_quart` (`PathInterpolator` 0.25, 1, 0.5, 1). No bounce or elastic.

**Reduced motion:** `MotionUtils.isMotionReduced()` checks animator/transition duration scale. Decorative loops (ringing pulse, recording pulse) skip when reduced. Content stays visible; animations never gate visibility.

**Wired surfaces:** login tab switch, home dock tabs + title + empty states, confirm dialogs, chat message highlight, video call press, voice recording indicator.

### Production helpers (hardening)

| Helper | Role |
|--------|------|
| `EmptyStateHelper` | Bind empty state copy and icons |
| `MotionUtils` | Duration, easing, reduced motion, press scale, reveals |
| `NotificationSettingsHelper` | Sync settings toggles with `DatabaseManager` |
| `DialogUtils` | Consistent confirm/cancel dialogs |

All user-visible strings belong in `res/values/strings.xml`. Icon-only controls require `contentDescription` string resources.

## 6. Do's and Don'ts

### Do
- **Do** use Canvas Void as universal background.
- **Do** keep one copper accent for primary actions, active tabs, and focus rings.
- **Do** use divider lists on home, search, settings, and friend requests.
- **Do** use Ink Muted for timestamps and metadata; Ink Whisper only where contrast passes on its surface.
- **Do** maintain 48dp touch targets on primary controls (`touch_target_min`).
- **Do** respect reduced motion and keep content visible without animation gates.
- **Do** externalize copy and accessibility labels to `strings.xml`.

### Don't
- **Don't** use Facebook/Messenger bright blue chrome or cluttered feed density.
- **Don't** use AI slop: purple neon gradients, decorative glassmorphism, gradient text, side-stripe borders, identical card grids, hero-metric blocks.
- **Don't** use floating glass pill navigation (legacy Midnight Slate).
- **Don't** wrap every list row in a card.
- **Don't** use azure/blue as accent.
- **Don't** flatten all text to Ink Primary without muted hierarchy.
- **Don't** gate content visibility on entrance animations.
- **Don't** hardcode user-facing strings or `contentDescription` literals in layouts or Java.
