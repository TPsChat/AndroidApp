---
name: ChatApp — Neumorphic Copper
description: Dark-premium Android chat client with image canvas, embossed soft-UI surfaces, and copper accent #C8875A. Home activity is the reference implementation.
stitch:
  platform: android
  density: 4
  variance: 6
  motion: 5
colors:
  canvas-void: "#1E2124"
  canvas-image: "drawable/chatapp_bg"
  surface-sunken: "#12161C"
  surface-raised: "#2F3745"
  surface-high: "#394252"
  surface-highest: "#2B3340"
  emboss-shadow: "#111722"
  emboss-highlight: "#394252"
  emboss-face-start: "#2F3745"
  emboss-face-end: "#1E2530"
  bubble-sent: "#C8875A"
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
    backgroundColor: "{colors.copper-signal}"
    textColor: "{colors.ink-primary}"
    rounded: "{rounded.lg}"
  bubble-received:
    backgroundColor: "{colors.emboss-face-end}"
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
  bezel-outer:
    backgroundColor: "{colors.neu-shadow}"
    borderColor: "{colors.border-subtle}"
    rounded: "{rounded.xl}"
    padding: "6dp"
  bezel-inner:
    backgroundColor: "{colors.surface-sunken}"
    borderColor: "{colors.border-subtle}"
    rounded: "{rounded.lg}"
  ambient-canvas:
    drawable: "bg_auth_screen"
    description: "Void base with warm copper radial glow (≤10% opacity), no purple mesh"
---

# Design System: ChatApp — Void Copper

## 1. Visual Theme & Atmosphere

**Creative north star: "The Private Evening Terminal"**

A dark communication surface built for frequent, low-light use. The mood is clinical yet warm — like a well-lit architecture studio at night. Deep void canvas, warm-tinted neutral surfaces, crisp white type, and one copper accent that marks action without Messenger-blue fatigue.

**Atmosphere scores (Stitch calibration):**
- **Density:** 4 / 10 — Daily-app balanced. Dense where data is dense (chat list, message thread); airy where users decide (auth, ringing, empty states).
- **Variance:** 6 / 10 — Offset asymmetric. Left-aligned flat headers, divider lists, asymmetric bubble tails. No decorative bento grids.
- **Motion:** 5 / 10 — Fluid but restrained. Spring-like ease-out on press and modal entry; no bounce, no cinematic scroll choreography.

**Platform:** Native Android (Java/XML). Phone-first; tablet widens margins and bubble max-width.

**Rejects:** Facebook/Messenger brightness, AI-slop purple gradients, decorative glassmorphism, floating glass pill nav, legacy Midnight Slate azure chrome.

**Key characteristics:**
- Void canvas with warm-tinted surface steps — depth through tone, not blur
- Single accent: Copper Signal — appears on ≤10% of any screen
- Flat edge-to-edge dock navigation with top hairline
- Divider-based lists, not card-per-row
- Touch targets ≥48dp; WCAG AA on dark surfaces
- All user-facing copy in `strings.xml`; accessibility labels on icon-only controls
- Reduced motion respected via `MotionUtils.isMotionReduced()`
- Ambient canvas via `bg_auth_screen` (alias `bg_chat_screen_dark`) on all primary activities
- Double-bezel panels (`bg_bezel_outer` + `bg_bezel_inner`) for auth form, empty states, and premium inset surfaces
- One auth eyebrow kicker only (`AppEyebrowTag`) — never per-section eyebrow scaffolding

---

## 2. Color Palette & Roles

Warm void neutrals carry depth. Copper is the only decorative accent. Green and red are status-only.

### Canvas & surfaces
| Descriptive name | Hex | Role |
|------------------|-----|------|
| **Canvas Void** | `#0B0D11` | Universal app background, status bar, nav bar. Never pure black. |
| **Surface Sunken** | `#12161C` | Dock nav, dialogs, inputs, composer wells |
| **Surface Raised** | `#1A2028` | List row highlight, received bubbles, secondary buttons |
| **Surface High** | `#222932` | Elevated panels, option rows |
| **Surface Highest** | `#2B3340` | Modals, emphasis blocks |
| **Video Stage** | `#080A0E` | Full-bleed call/video background |

### Accent (max one)
| Descriptive name | Hex | Role |
|------------------|-----|------|
| **Copper Signal** | `#C8875A` | Primary buttons, active tabs, send, focus rings, switch on |
| **Copper Deep** | `#A66D45` | Pressed primary, gradient end |
| **Copper Soft** | `#E0A67E` | OTP ring filled, light highlights |

### Text
| Descriptive name | Hex | Role |
|------------------|-----|------|
| **Ink Primary** | `#F2F4F7` | Headlines, message body, primary labels |
| **Ink Muted** | `#8A939F` | Timestamps, metadata (≥4.5:1 on void and raised) |
| **Ink Whisper** | `#9AA0A8` | Hints on raised surfaces (verify contrast on image canvas) |
| **Neu Copper Ink Muted** | `#A8B0BA` | Search/composer hints on `chatapp_bg` canvas (WCAG AA target) |

### Structure
| Descriptive name | Hex | Role |
|------------------|-----|------|
| **Border Subtle** | `#2A323D` | Hairlines, bubble strokes, dock top border |
| **Border Outline** | `#3D4654` | Strong dividers, disabled outlines |

### Chat bubbles
| Descriptive name | Hex | Role |
|------------------|-----|------|
| **Bubble Sent** | `#141C24` | Outgoing message fill |
| **Bubble Received** | `#1A2028` | Incoming message fill |
| **Bubble Reply** | `#1E2733` | Reply quote strip inside bubble |

### Semantic (status only — never decorative)
| Descriptive name | Hex | Role |
|------------------|-----|------|
| **Danger Rose** | `#E05A5A` | Delete, decline call, destructive confirm |
| **Success Green** | `#3DB88C` | Accept call, success toast |
| **Warning Amber** | `#D4A054` | Caution banners |

**The one accent rule:** Copper on ≤10% of any screen. No azure/blue accent. No purple/neon gradients. No warm/cool gray mixing — all neutrals are warm-tinted.

---

## 3. Typography Rules

**Display / body font:** Plus Jakarta Sans (`@font/plus_jakarta_sans`), weights 400–700.

**Character:** Confident and readable in low light. Hierarchy through weight and color before size shrink. Sentence case everywhere — no all-caps body or button labels.

### Hierarchy

| Style | Size | Weight | Use |
|-------|------|--------|-----|
| Display (`AppHeadlineLarge`) | 28sp | 700 | Auth titles, major headers |
| Headline (`AppHeadlineMedium`) | 22sp | 700 | Dialog titles, screen titles |
| Title (`AppHeadlineSmall`) | 20sp | 700 | Section headers, empty state titles |
| Body Large (`AppBodyLarge`) | 16sp | 400 | Form fields, list labels |
| Body (`AppBodyMedium`) | 14sp | 400 | Message text, previews |
| Caption (`AppBodySmall`) | 12sp | 400 | Timestamps, metadata |
| Label (`AppLabelSmall`) | 12sp | 700 | Badges, emphasized labels |

**Rules:**
- Body line length: cap preview text; full messages scroll in thread
- Secondary hierarchy: Ink Muted + Medium (500) weight before dropping below 14sp
- Negative letter-spacing on display (-0.02em); positive on small labels (+0.02em)
- Timestamps and counts: tabular figures where applicable
- **Banned:** Inter, Roboto, Arial, generic system sans for premium screens. No all-caps subheaders. No gradient text on large headers.

---

## 4. Hero & First-Run Screens

For Stitch-generated auth and onboarding screens:

**Auth (login / register):**
- **Layout:** Left-weighted or split — not centered hero when variance > 4. App mark + display title on void canvas; form fields in Surface Sunken inset panel.
- **Structure:** One primary CTA (copper pill). Tab switcher for sign-in / sign-up — no secondary "Learn more" link.
- **No filler:** No "Scroll to explore", bouncing chevrons, or decorative arrows.
- **Background:** Canvas Void only — optional very subtle warm radial glow at 8% opacity max; no mesh gradients or purple orbs.

**Ringing / incoming call:**
- Full-bleed Video Stage or void scrim. Caller avatar centered with restrained pulse (respect reduced motion). Accept (green) and decline (rose) at 48dp minimum.

**Empty states (`component_empty_state`):**
- Title in Title style, subtitle in Body Muted. Optional single icon in copper-tinted circle. No lorem ipsum — bind real `strings.xml` copy.

---

## 5. Component Stylings

### Buttons
- **Shape:** Full pill (`radius_pill` 999dp), 52dp min height primary, 48dp min touch on all interactive controls.
- **Primary:** Solid Copper Signal fill, Ink Primary text. Pressed → Copper Deep. Tactile scale via `MotionUtils.applyPressScale()` — no neon outer glow.
- **Secondary:** Surface Raised fill + Border Subtle 1dp outline. Ghost text links for tertiary actions.
- **Danger:** Rose fill for delete, leave group, decline call.

### Message bubbles
- **Shape:** 20dp corner radius, 6dp tail corner. Sent: tail bottom-right; received: tail bottom-left.
- **Fill:** Bubble Sent / Bubble Received tokens. 1dp hairline border optional on received.
- **Reactions:** Emoji glyph badges (👍 ❤️ 😂 etc.) rendered via `ReactionEmojis` — never text labels like "Luv" or "+1".
- **Max width:** 280dp phone, 360dp tablet.

### Inputs & search
- **Search bar:** Recessed emboss pill (`bg_neu_copper_sunken_pill` / alias `bg_glass_search`), 52dp height. Hint in `neu_copper_ink_muted`.
- **Form fields:** Recessed emboss md (`bg_neu_emboss_sunken_md` / alias `bg_soft_inset`), 52dp. Label above field; error text below inline.

### Navigation
- **Home dock:** Floating raised pill (`bg_neu_copper_nav_dock`), 72dp, 16dp margin. Tab wells recessed; **selected = copper icon only**, background unchanged.
- **Composer dock:** Raised bar (`bg_neu_composer_dock` / alias `bg_glass_nav`) for chat/post input areas.
- **Inner screens:** Transparent header (`bg_flat_header`) over image canvas + `component_back_button` + title.

### Lists
- Rows on image canvas; hairline dividers (`bg_neu_copper_list_row`). Avatar in recessed circle well. Timestamp copper. Min row height 72dp.
- **No nested cards per row.** Depth via emboss layers only.

### Dialogs
- Raised emboss panel (`bg_neu_emboss_raised_md` / alias `bg_glass_panel`), 12dp corner radius. Headline 22sp bold centered or left per context.
- Option rows: `AppOptionRow` on Surface Raised. Destructive rows use Danger Rose text on `bg_danger_option_row`.
- Confirm via `DialogUtils.showConfirm()` with standardized copy from `strings.xml`.

### Cards & panels
- Use cards only when elevation communicates hierarchy (dialogs, composer wells). Never wrap every list row in a card.
- Shadow: 1dp offset tint (`#0A000000`) under bubbles and primary buttons only — no generic `box-shadow` black at 30%.

### Loading, empty, error
- **Loading:** `component_list_skeleton` + `item_skeleton_list_row` — five-row placeholder matching chat/search list geometry. No centered `ProgressBar` on content areas.
- **Empty:** `EmptyStateHelper.bind()` inside double-bezel `component_empty_state` with optional copper-tinted icon shell.
- **Error / offline:** Inline banner or toast via `strings.xml` — direct copy ("Could not load messages"), no "Oops!" or exclamation-heavy success text.

### Emboss surfaces (soft UI — reference: Home)
- **Raised:** shadow layer `top +4dp` `#111722`, highlight `bottom +2dp` `#394252`, face gradient `#2F3745`→`#1E2530` (`bg_neu_copper_raised_rect`, `bg_neu_copper_nav_dock`, `bg_neu_copper_fab`).
- **Recessed:** inverted offsets for wells (`bg_neu_copper_sunken_pill`, `bg_neu_copper_sunken_circle`, `bg_neu_emboss_sunken_md`).
- **Primary copper:** `bg_neu_emboss_fab_pill` / `bg_neu_copper_fab` with accent gradient `#E0A67E`→`#A66D45`.
- **Legacy aliases:** `bg_soft_inset`, `bg_glass_search`, `bg_glass_nav`, `bg_send_circle_modern`, `bg_bezel_*` delegate to emboss drawables.

### Ambient canvas
- **Image:** `drawable-nodpi/chatapp_bg.webp` via `bg_chatapp_canvas`.
- **Aliases:** `bg_auth_screen`, `bg_neu_copper_canvas`, `bg_chat_screen_dark` → `bg_chatapp_canvas`. Legacy `neu_red_*` / `bg_neu_red_*` alias to copper.
- **Banned:** Purple mesh, decorative blur, pure `#000000`.

### Switches & settings
- Track: copper on / muted off. `NotificationSettingsHelper` binds push, sound, vibrate.
- Settings: `item_settings_content` + `SettingsActionsHelper` — single component path for home tab and settings activity.

---

## 6. Layout Principles

**Grid & containment:**
- Screen margin 20dp phone (`margin_mobile`), 32dp tablet (`values-sw600dp`).
- Home feed content max 640dp centered on tablet.
- Use ConstraintLayout / LinearLayout — no percentage flex hacks.

**List rhythm:**
- Divider-based lists on home, search, settings, friend requests, group members.
- Chat list: avatar + title + preview + timestamp; unread badge in copper or rose.

**Chat composer:**
- Bottom-fixed composer on Surface Sunken. Attach, emoji, voice, send at 48dp. Reply strip above input when active.

**Spacing scale:** 8 / 12 / 16 / 24 / 32dp (`spacing_xs` through `spacing_xl`). Double padding on empty states and auth.

**Responsive:**
- **Phone (`values/`):** Default gutters and bubble width.
- **Narrow (`values-w360dp/`):** Tighter nav tab padding.
- **Tablet (`values-sw600dp/`):** Wider margins, 360dp bubble max, 640dp content cap.

**Banned layouts:** Three equal feature cards in a row. Centered hero on high-variance screens. Floating pill navbar. Card grid for simple lists. Edge-to-edge text without screen margin.

---

## 7. Motion & Interaction

**Engine:** `MotionUtils.java` + `res/anim/` + `res/interpolator/ease_out_quart.xml`

| Duration | Ms | Use |
|----------|-----|-----|
| Press | 120 | Button/tab press scale |
| Fast | 150 | Fade out, panel crossfade |
| Normal | 220 | Text swap, empty reveal |
| Modal | 280 | Dialog entrance |
| Highlight | 320 | Scroll-to-message pulse |
| Stagger step | 90 | Auth entry cascade delay between elements |
| Entry | 300 | Auth reveal translation |

**Easing:** PathInterpolator (0.25, 1, 0.5, 1) — ease-out quart. No bounce, no elastic.

**API surface (`MotionUtils`):**
- `attachPressFeedback()` — touch-down scale on nav tabs, list rows, buttons (does not consume clicks)
- `staggeredReveal()` — auth entry only; starts at `alpha 0.92` (content never hidden)
- `revealView()` / `bindAndReveal()` — empty state appearance
- `playPressScale()` — click-end pulse on primary actions

**Interactions:**
- Press: `scale(0.94)` → release with ease-out
- Tab switch: crossfade title + content, not instant jump
- Message highlight: `R.anim.message_highlight` via `MotionUtils.playAnimation()`
- Ringing avatar: subtle pulse — skipped when `isMotionReduced()`
- RecyclerView: prefer `notifyItemChanged` / range updates over `notifyDataSetChanged`

**Reduced motion:** Check `Settings.Global.ANIMATOR_DURATION_SCALE`. Decorative loops skip; content never gated on animation completion.

**Banned motion:** Linear or ease-in-out as default. Animating `top`/`left`/`width`/`height`. Entrance animations that hide content until complete.

---

## 8. Reusable Components (implementation map)

| Asset | Path | Use when |
|-------|------|----------|
| Back button | `component_back_button` | 48dp back affordance |
| Flat header | `component_flat_header` | Title + back row |
| Empty state | `component_empty_state` | Zero-item lists (double-bezel) |
| List skeleton | `component_list_skeleton` | Search/list loading placeholder |
| Neu header | `component_neu_header` | Avatar well + title + FAB (Home) |
| Neu toolbar | `component_neu_toolbar` | Back well + title + action slot (Settings) |
| Neu search (tap) | `component_neu_search` | Tappable search trench |
| Neu search (field) | `component_neu_search_field` | Icon + EditText + clear |
| Neu nav dock | `component_neu_nav_dock` | Bottom tab dock (Home) |
| Tab/chip styles | `AppNeuTabBar`, `AppNeuTabItem`, `AppNeuChip` | FG-only copper selection |
| Create post bar | `component_create_post_bar` | Feed composer strip (emboss raised) |
| Settings body | `item_settings_content` | Settings list (shared with `SettingsActionsHelper`) |
| Composer dock | `bg_neu_composer_dock` | Chat/post/comment input bars (legacy alias `bg_glass_nav`) |
| Tablet content cap | `@dimen/home_content_max_width` | Feed, search, post detail, profile, group flows (640dp on `sw600dp`) |
| Dialog panel | `bg_neu_emboss_raised_md` | Option sheets and pickers (legacy alias `bg_glass_panel`) |

**Surfaces on neu toolbar:** Profile, Profile view, Post detail, Comment thread, Settings, Group settings, Create group, Friend requests.

**Auth/Ringing:** Login keeps bezel auth layout (copper ink tokens); Ringing uses copper text on call stage (no toolbar).

**Retired:** `component_search_bar` (use `component_neu_search` or `component_neu_search_field`).

**Key helpers:** `MotionUtils`, `EmptyStateHelper`, `DialogUtils`, `SettingsActionsHelper`, `CallAccessibilityHelper`, `ReactionEmojis`, `NotificationSettingsHelper`

**i18n:** All `android:text`, hints, toasts, and `contentDescription` via `strings.xml`. Emoji pickers use `emoji_reaction_*` glyph strings; reaction type labels stay in accessibility strings only.

---

## 9. Anti-Patterns (Banned)

### Visual
- Pure black `#000000` backgrounds
- Purple/blue neon gradients, AI-slop mesh orbs, decorative glassmorphism
- Azure/blue as accent (legacy Midnight Slate)
- Messenger-bright blue chrome
- Generic black drop shadows at high opacity
- Gradient text on headlines
- Floating glass pill navigation
- Card wrapping every list row
- Warm and cool grays mixed in one screen

### Typography
- Inter, Roboto, Arial as display/body
- All-caps body copy or button labels
- Orphaned single-word headline lines without `text-wrap: balance` where supported

### Layout
- Three equal columns as default feature row
- Centered symmetric hero on auth when variance > 4
- `height: 100vh` equivalent full-screen sections without `min-height` flexibility
- Buttons not bottom-aligned in variable-height card groups

### Content & copy
- "Elevate", "Seamless", "Unleash", "Next-Gen", "Game-changer"
- "Oops!" error messages — use direct failure copy
- "John Doe", "Acme Corp", "Nexus" placeholder names
- Hardcoded strings in Java layouts or toasts
- Reaction text labels ("Luv", "+1") instead of emoji glyphs in pickers and badges

### Motion & a11y
- Content visibility gated on entrance animation (`alpha` must not start at 0 on product screens)
- Centered `ProgressBar` spinners in list/content areas
- Eyebrow kickers on every section (one auth kicker allowed)
- Ignoring reduced motion for decorative loops
- Touch targets below 48dp on primary controls
- Icon buttons without `contentDescription`
- `notifyDataSetChanged()` when targeted updates suffice

### Code quality (Android)
- Inline hardcoded colors outside `colors.xml` / theme tokens
- Duplicate settings UI paths (use `SettingsActionsHelper` + `item_settings_content`)
- Raw `ObjectAnimator` outside `MotionUtils` for standard press/pulse/highlight

---

## 10. Do's and Don'ts (quick reference)

### Do
- Use Canvas Void as universal background
- Keep one copper accent for primary actions, active tabs, focus rings
- Use divider lists on home, search, settings, friend requests
- Use Ink Muted for timestamps; Ink Whisper only where contrast passes
- Maintain 48dp touch targets (`touch_target_min`)
- Externalize all copy and a11y labels to `strings.xml`
- Route standard animations through `MotionUtils`

### Don't
- Use Facebook/Messenger bright patterns or cluttered feed density
- Use AI slop patterns listed in section 9
- Wrap every list row in a card
- Flatten all text to Ink Primary without muted hierarchy
- Hardcode user-facing strings or reaction label text in UI

---

*Stitch prompt hint:* When generating new screens for this app, reference **Void Copper**, **Canvas Void `#0B0D11`**, **Copper Signal `#C8875A`**, **Plus Jakarta Sans**, flat dock nav, divider lists, 48dp targets, and sentence-case copy. Platform is **Android native** — use dp, sp, and Material-style flat surfaces, not web glassmorphism.
