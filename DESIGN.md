---
name: ChatApp — Midnight Slate
description: Dark-premium Android chat client with cool slate surfaces and a single azure accent.
colors:
  canvas-deep: "#151A24"
  surface-sunken: "#1C2230"
  surface-raised: "#2A3142"
  surface-high: "#313A4D"
  surface-highest: "#3A4559"
  bubble-sent: "#1E2A3D"
  bubble-received: "#2A3142"
  bubble-reply: "#253042"
  azure-signal: "#3B82F6"
  azure-deep: "#2563EB"
  azure-soft: "#60A5FA"
  ink-primary: "#FFFFFF"
  ink-muted: "#8B95A8"
  ink-whisper: "#6B7589"
  border-subtle: "#2E3748"
  border-outline: "#4A5568"
  danger-rose: "#E05252"
  success-green: "#2DA87A"
  warning-amber: "#D4A054"
  video-stage: "#0D1117"
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
    letterSpacing: "0.03em"
rounded:
  sm: "8dp"
  md: "16dp"
  lg: "24dp"
  xl: "32dp"
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
    backgroundColor: "{colors.azure-signal}"
    textColor: "{colors.ink-primary}"
    rounded: "{rounded.pill}"
    padding: "12dp 24dp"
    height: "52dp"
  button-primary-pressed:
    backgroundColor: "{colors.azure-deep}"
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
    rounded: "{rounded.pill}"
    height: "48dp"
  filter-pill-active:
    backgroundColor: "{colors.azure-signal}"
    textColor: "{colors.ink-primary}"
    rounded: "{rounded.pill}"
---

# Design System: ChatApp — Midnight Slate

## 1. Overview

**Creative North Star: "The Focused Night Console"**

A dark-premium Android communication surface built for low-light, frequent use. The interface reads like a calm control room at night: deep slate canvas, layered surfaces that whisper depth, white type with disciplined hierarchy, and one azure accent that marks action without shouting. Chat bubbles, call controls, and feed cards share the same material language so the app feels like one instrument, not a stack of screens pasted together.

This system explicitly rejects Facebook/Messenger brightness, AI-slop purple gradients, decorative glassmorphism, and flat gray-on-gray chat clones with no readable secondary text. Density is balanced: chat lists are efficient; auth and ringing screens breathe.

**Key Characteristics:**
- Cool slate neutral family (`#151A24` → `#3A4559`) with clear surface steps
- Single accent: Azure Signal (`#3B82F6`) for CTAs, active tabs, primary icons
- Plus Jakarta Sans across all UI; weight-driven hierarchy, sentence case
- Tonal elevation via offset layer-lists and 1dp borders, not heavy drop shadows
- Message bubbles use asymmetric corner radii (24dp with 4dp tail corner)
- Touch targets ≥44dp on primary controls; WCAG AA contrast on dark surfaces

## 2. Colors: The Midnight Slate Palette

Cool-leaning slate neutrals carry depth; azure marks the single accent lane. No warm beige, no pure black, no second accent color.

### Primary
- **Azure Signal** (`#3B82F6`): Primary buttons, active tab indicator, send circle, focus rings, active icons, filter pill selected state.
- **Azure Deep** (`#2563EB`): Pressed primary state, gradient end on primary buttons.
- **Azure Soft** (`#60A5FA`): OTP filled ring, light accent highlights on dark surfaces.

### Neutral
- **Canvas Deep** (`#151A24`): App background, status bar, navigation bar, video overlay scrim base.
- **Surface Sunken** (`#1C2230`): Dialog background, input insets, search field fill, lowest elevation containers.
- **Surface Raised** (`#2A3142`): Cards, list rows, received message bubbles, dialog secondary buttons.
- **Surface High** (`#313A4D`): Elevated containers, tertiary backgrounds.
- **Surface Highest** (`#3A4559`): Top elevation tier for modals and emphasis panels.
- **Whisper Border** (`#2E3748`): 1dp structural borders on bubbles, cards, inputs.
- **Outline Steel** (`#4A5568`): Stronger dividers, OTP empty ring, disabled outlines.

### Semantic (status only, not accent)
- **Danger Rose** (`#E05252`): Decline call, destructive actions, error text, love reaction.
- **Success Green** (`#2DA87A`): Accept call, confirm actions, success indicators.
- **Warning Amber** (`#D4A054`): Warning states only.

### Text on dark
- **Ink Primary** (`#FFFFFF`): Headlines, body, message text, button labels on dark surfaces.
- **Ink Muted** (`#8B95A8`): Timestamps, metadata, secondary labels, inactive utility copy. Must pass 4.5:1 on `#151A24` and `#2A3142`.
- **Ink Whisper** (`#6B7589`): Hints, placeholders, disabled tertiary copy.

### Chat-specific
- **Bubble Sent** (`#1E2A3D`): Outgoing message background (`my_message_bg`).
- **Bubble Received** (`#2A3142`): Incoming message background (`other_message_bg`).
- **Bubble Reply** (`#253042`): Reply quote blocks inside received messages.

**The One Accent Rule.** Azure appears on ≤10% of any screen surface area. Its scarcity is the point. Status colors (green/red) are never used as decorative accents.

## 3. Typography

**Display / Headline / Body Font:** Plus Jakarta Sans (weights 400, 500, 600, 700)

**Character:** Confident and tight on headlines; relaxed on body. No serif. No all-caps headlines. Sentence case for labels and buttons.

### Hierarchy
- **Display** (Bold 700, 28sp, line-height 1.1): Screen titles (login hero, settings header).
- **Headline** (Bold 700, 22sp, line-height 1.2): Section headers, dialog titles.
- **Title** (SemiBold 600, 20sp, line-height 1.25): Card titles, chat names in list.
- **Body Large** (Regular 400, 16sp, line-height 1.5): Primary reading text, post content.
- **Body** (Regular 400, 14sp, line-height 1.5): Message text, form fields, list previews.
- **Label** (Bold 700, 12sp, letter-spacing 0.03em): Badges, tab labels, timestamps when emphasized.

**The Weight-Not-Size Rule.** Secondary hierarchy uses Ink Muted color and Medium (500) weight before shrinking below 14sp. Never rely on 10sp gray alone for essential information.

## 4. Elevation

This system uses **tonal layering**, not Material drop shadows. Depth is conveyed by surface color steps (`sunken` → `raised` → `high`), 1dp `border-subtle` strokes, and offset layer-list shadows tinted to the canvas hue (`#0D000000` at 5% opacity).

Raised cards and bubbles use a 2dp bottom-right offset shadow layer before the fill layer. Video call stage uses `#0D1117` full-bleed with semi-transparent control scrims (`#66151A24`).

**The Flat-Canvas Rule.** The app background stays at Canvas Deep. Elevated elements rise through surface tokens; do not add arbitrary box-shadow on every list row.

### Shadow Vocabulary
- **Shadow Tint Subtle** (`#0D000000`, 2dp offset): Message bubbles, neu-raised cards.
- **Shadow Tint** (`#1A000000`, 2dp offset): Pills and buttons with azure glow underlay (`#1A3B82F6`).

## 5. Components

### Buttons
- **Shape:** Pill radius (999dp). Min height 52dp. Horizontal padding 24dp.
- **Primary:** Azure gradient `#3B82F6` → `#2563EB` at 135°, white label, no all-caps.
- **Pressed:** Background shifts to Azure Deep; tactile 1dp translateY on active state.
- **Secondary / Ghost:** Surface Raised fill, 1dp Whisper Border, Ink Primary text.
- **Danger:** Gradient `#E05252` → `#C44040`, white text. Used for decline, delete, destructive dialog actions.

### Message Bubbles
- **Sent:** Bubble Sent fill, Whisper Border stroke, asymmetric corners (24dp with 4dp bottom-right tail).
- **Received:** Bubble Received fill, same corner logic mirrored (4dp bottom-left tail).
- **Reply inset:** Bubble Reply fill inside parent bubble, 12dp inner radius.
- **Text:** 14sp Body, Ink Primary. Timestamps: 10–11sp, Ink Muted.

### Inputs / Search
- **Style:** Surface Sunken fill, pill radius, 48dp min height, 1dp Whisper Border.
- **Focus:** Border shifts to Azure Signal; no floating labels.
- **Hint:** Ink Whisper; must remain readable (not decorative gray).

### Filter Pills / Tabs
- **Inactive:** Transparent or Surface Raised, Ink Muted text.
- **Active:** Azure gradient fill, Ink Primary text, md3 ripple underlay.
- **Tab bar:** 64dp height; icons use `icon_active` (azure) vs `icon_inactive` (`#6B7589`).

### Dialogs
- **Background:** Surface Sunken (`dialog_bg`).
- **Title:** Headline 22sp Bold, Ink Primary.
- **Body:** Body 14sp, Ink Muted for secondary lines.
- **Actions:** Filled primary right, secondary pill left, danger gradient for destructive.

### Call UI
- **Stage:** Video Stage `#0D1117` full screen.
- **Accept:** Success Green circle gradient.
- **Decline:** Danger Rose circle gradient.
- **Controls:** Semi-transparent scrim buttons, 44dp minimum touch target.

### Cards / List Rows
- **Corner Style:** 24dp (`radius_lg`) on containers; 16dp on inner elements.
- **Background:** Surface Raised.
- **Border:** 1dp Whisper Border when elevation alone is insufficient.
- **Padding:** 16dp horizontal gutter, 12–16dp vertical rhythm.

### Navigation
- **Bottom tabs:** Home, Feed, Search, Profile. Active icon azure; inactive `#6B7589`.
- **Header:** 56dp height, Canvas Deep background, Ink Primary title.

## 6. Do's and Don'ts

### Do:
- **Do** use Canvas Deep (`#151A24`) as the universal app background. Never pure `#000000`.
- **Do** keep one azure accent. Primary actions, active tabs, and focus rings only.
- **Do** separate sent (`#1E2A3D`) and received (`#2A3142`) bubbles by surface step, not by accent color.
- **Do** use Ink Muted (`#8B95A8`) for timestamps and metadata so hierarchy survives on dark bg.
- **Do** maintain 44dp minimum touch targets on composer send, call accept/decline, and primary buttons.
- **Do** use Plus Jakarta Sans with weight contrast (700 display, 400 body, 500 card titles).
- **Do** tint shadows toward the canvas hue. Never pure black at high opacity on dark surfaces.

### Don't:
- **Don't** use Facebook/Messenger bright blue chrome or cluttered feed density.
- **Don't** use AI slop: purple/blue neon gradients, decorative glassmorphism, gradient text, side-stripe accent borders, identical icon+heading+card grids, hero-metric blocks.
- **Don't** flatten all text to `#FFFFFF` without secondary Ink Muted. That kills hierarchy and fails WCAG intent for metadata.
- **Don't** add a second accent color. Green and red are status-only.
- **Don't** use glass blur as default decoration. `bg_glass_search` is a tinted fill with border, not frosted glass chrome.
- **Don't** gate content visibility on entrance animations. Reduced motion must show content immediately.
- **Don't** use all-caps for headlines or button labels. Sentence case only.
