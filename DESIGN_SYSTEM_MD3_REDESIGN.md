# TP CHAT - Midnight Obsidian Design System

## 🎨 Design System Overview

**Theme Name:** Midnight Obsidian  
**Style:** Ultra-dark glassmorphism with neon accents, designed for premium mobile experience  
**Typography:** Plus Jakarta Sans (400, 500, 600, 700 weights)  
**Icons:** Material Symbols Outlined  

### Design Philosophy
- **Foundation:** Deep obsidian-like surfaces with high contrast for OLED optimization
- **Accents:** Vibrant coral/neon primary color for high-priority actions and active states
- **Depth:** Multi-layered elevation using inner glows, backdrop blur, and diffused shadows
- **Shapes:** Extreme softness with 24-32px corner radius throughout (pill-shaped buttons and containers)
- **Feel:** Cinematic, immersive, exclusive, and tactilely modern

### Color System
- **Primary Accent:** Coral/Neon Red (used for buttons, active states, badges)
- **Background:** Deep Black (#111317 equivalent)
- **Surface:** Elevated containers at various depth levels
- **Text:** Off-white with opacity variations for hierarchy
- **Secondary Text:** 50-60% opacity for secondary information

### Typography Scale
- **Headline Large (28px, 700):** Major screen titles
- **Headline Medium (22px, 600):** Section headers
- **Body Large (16px, 500):** Primary text content
- **Body Medium (14px, 400):** Secondary text
- **Label Small (12px, 600):** Small labels and badges

### Spacing & Layout
- **Base Unit:** 4px
- **Standard Spacing:** 8px, 12px, 16px, 24px, 32px
- **Mobile Margins:** 20px on sides
- **Card Padding:** 16-24px internal padding
- **Corner Radius:** 24-32px (Pill-shaped, extremely soft)

---

## 📱 Screen Layouts & Functions

### 1. Login & Registration Screen

**Purpose:** Authenticate users or create new accounts.

**Layout Structure:**
- Top centered logo and app name
- Two-tab system: "Sign In" / "Sign Up" (tabs with secondary styling)
- Email/username input field (soft inset, 24px radius)
- Password input field with visibility toggle icon
- Sign-up mode adds: name field, phone field, terms agreement checkbox
- Primary action button for submit (coral, pill-shaped)
- "Forgot Password?" text link
- OR divider section
- Social login buttons (Google, Facebook) as outlined secondary buttons
- Bottom switch text for toggling between modes

**Content Display:**
- Form validation states (errors, success)
- Input placeholder text and labels
- Button labels: "Sign In", "Create Account", "Continue"
- Social provider names

**Component Specs:**
- Input fields: soft inset style with 24px radius, 16px padding
- Buttons: 48dp height minimum, 24-32px radius
- Text sizing: headline-md for screen title, body-lg for labels, label-sm for helper text

---

### 2. Home & Chat List Screen

**Purpose:** Display active conversations and provide quick navigation.

**Layout Structure:**
- **Top Bar:** User avatar (leading, 40dp), "Chats" title (headline-lg), + action button (trailing, coral)
- **Search Bar:** Floating glassmorphic search input with icon (pill-shaped, 32px radius, backdrop blur)
- **Tab Row:** "Direct", "Groups", "Archived" tabs (secondary style, underline indicator)
- **Chat List:** RecyclerView with cards for each conversation
- **Empty State:** Illustration, title, subtitle, action button

**Chat List Item Content:**
- Participant/Group avatar (48dp circular, left-aligned)
- Chat name (headline-md, left side)
- Last message preview (body-md, 60% opacity text, truncated)
- Timestamp (label-sm, right-aligned)
- Unread count badge (coral pill-shaped badge, white text, 20-24dp)
- Vertical indicator: 4px coral line on left for active/unread conversations

**Floating Action Button:**
- Large pill-shaped button with + icon (56-64dp)
- Coral background with neon glow effect
- Action: Start new conversation

**Component Specs:**
- Card padding: 16dp vertical, 12dp horizontal
- Gap between items: 8dp
- Badge radius: 9999px (fully rounded)
- Search bar: 48dp height, 20px backdrop blur

---

### 3. Search Results Screen

**Purpose:** Search and discover users, groups, and posts.

**Layout Structure:**
- **Top Bar:** Back button (leading), search input field (expanded, 32px radius), close icon (trailing)
- **Filter Chips:** "All Results", "People", "Channels" (secondary style chips, 24px radius)
- **Results List:** RecyclerView of matching items
- **No Results State:** Illustration, title, subtitle, suggestion text

**Search Result Item Content:**
- Avatar or icon (leading, 40dp)
- Name/title (headline-md)
- Username/handle or status (body-md, secondary opacity)
- Action button: "Follow", "Message", or related action (trailing, secondary style)

**Component Specs:**
- Chips: 24-32px radius, 12px horizontal padding
- Result item: 16dp padding, 12dp bottom margin
- Buttons: 40-48dp height, pill-shaped

---

### 4. Private Chat Screen

**Purpose:** Display 1-on-1 conversation with messaging capabilities.

**Layout Structure:**
- **Top Bar:** Back button (leading), participant avatar + name + status (center, headline-md), voice/video call icons + menu icon (trailing)
- **Messages List:** Scrollable list with message bubbles and date separators
- **Input Area:** Bottom sticky area (using floating island design, 80% opacity, 20px blur)

**Message Bubble Variants:**
- **Sent Messages:** Right-aligned, coral background (primary color), rounded (24px), 12-16dp padding
- **Received Messages:** Left-aligned, dark container (#1a1c20 equivalent) with 1px border, rounded (24px)
- **Reply Quotes:** Nested message container with 4px left coral border indicator
- **Voice Messages:** Play button (icon), duration label (label-sm), waveform visual indicator
- **Image Messages:** Thumbnail preview (rounded 16px), size indicator, aspect ratio maintained
- **Date Separators:** Centered label text with secondary opacity ("Today" / "2 days ago" / date)

**Message Input Components:**
- Text input field (expandable, multiline support, soft inset 24px radius)
- Attachment menu: Media, Files, Location, Camera icons (icon buttons)
- Send button (coral, circular or pill-shaped 40dp minimum)
- Voice message button (appears when text field is empty)

**Component Specs:**
- Message bubbles: 12-16dp padding, 24px radius, max-width 80% of screen
- Input area: 16-24dp padding, 20px backdrop blur, 80% opacity
- Timestamp on messages: label-sm, secondary opacity, positioned right/left of bubble
- Avatar on bubble: 32dp circular

---

### 5. Group Chat Screen

**Purpose:** Display group conversation with participant context.

**Layout Structure:**
- **Top Bar:** Back button (leading), group avatar + group name + member count (center), video call + info icons (trailing)
- **Messages List:** Same as private chat, with sender name and avatar for each message
- **Input Area:** Same as private chat

**Group Message Content:**
- Sender avatar (24-32dp, left of message)
- Sender name (label-sm, above message, primary accent color or secondary opacity)
- Message bubble (dark container, rounded 24px)
- Timestamp (label-sm, secondary opacity, below message)

**Component Specs:**
- Sender name: label-sm weight/size, positioned top-left of bubble
- Avatar: 32dp circular, left-aligned
- Grouping: Messages from same sender grouped without repeated avatar/name
- Read receipts: Small checkmark icons under last message (optional)

---

### 6. Social Feed Screen

**Purpose:** Browse posts from connections and communities.

**Layout Structure:**
- **Top Bar:** User avatar (leading, 40dp), "Explore" / "Posts" title (headline-lg), + action button (trailing, coral)
- **Tab Row:** "For You", "Following", "Trending" tabs (secondary style)
- **Content Feed:** Vertical list of post cards (16dp margin on sides)

**Post Card Content:**
- Author section: Avatar (leading, 48dp) + name (headline-md) + handle (label-sm, secondary) + timestamp (label-sm, secondary)
- Overflow menu button (icon, top-right corner of card)
- Post text content (body-lg, 16dp padding, max lines 4 with expand)
- Media grid (1-4 images, rounded 12-16px, 8dp gap)
- Engagement stats: like count, comment count, share count (label-sm, right-aligned)
- Action buttons: Like, Comment, Share (icon + label buttons, secondary style)

**Floating Action Button:**
- Large pill-shaped button with + icon (56-64dp)
- Coral background
- Action: Create new post

**Component Specs:**
- Post card: 16-24dp padding, 24px radius, 8-12dp bottom margin
- Avatar: 48dp circular
- Media grid: 16:9 or 1:1 aspect ratio
- Engagement row: Centered distribution, secondary text opacity

---

### 7. Create Post Screen

**Purpose:** Compose and publish a new social post.

**Layout Structure:**
- **Top Bar:** Close button (leading), "Create Post" title (headline-md), "Publish" action button (trailing, coral)
- **Author Section:** Avatar (leading, 40dp) + name (headline-md) + privacy selector dropdown (trailing)
- **Text Area:** Large input field with placeholder "What's on your mind?" (24px radius, soft inset)
- **Media Section:** Grid for attaching images + "Add Media" button
- **Action Buttons Row:** Add Photo, Add Location, Add Tags (icon buttons with labels)

**Content Display:**
- Character count (bottom-right of text area, body-md)
- Attached media previews with remove (X) option on each
- Selected privacy level indicator
- Post actions/options (edit, delete from media preview)

**Component Specs:**
- Text area: Min height 120dp, expandable, 24px radius, 16dp padding
- Media grid: 2 columns, square aspect, 12dp gap
- Character count: body-md, secondary opacity
- Privacy selector: Secondary style button/dropdown

---

### 8. User Profile Screen

**Purpose:** Display user profile information and activity.

**Layout Structure:**
- **Top Bar:** Back button (leading), "Profile" title (headline-md), menu button (trailing)
- **Profile Header:** Avatar (large, 80dp, centered) + name (headline-lg-mobile, 24px) + username (body-md) + bio (body-md)
- **Stats Row:** Posts (number + label), Followers (number + label), Following (number + label) - equally distributed
- **Action Buttons:** Edit Profile / Message (primary, pill-shaped), Share (secondary), More (icon)
- **Tab Row:** "Posts", "Saved", "Tagged" (secondary tabs)
- **Content Grid:** Grid layout of profile items (posts, saved items, tagged content)
- **Settings Section:** Menu items with icons and labels (Privacy, Notifications, Blocked Users, Help, Logout)

**Profile Content Display:**
- User name (headline-md)
- Username/handle (label-sm, secondary)
- Bio text (body-md)
- Posts count, Followers count, Following count (headline-sm, coral accent)
- Posts and media grid items (square 1:1 aspect, 8dp gap)
- Settings menu options with icons (24-32dp)

**Component Specs:**
- Avatar: 80dp circular
- Stats: 3 equal columns, center-aligned text
- Buttons: 40-48dp height, pill-shaped
- Grid: 2-3 columns based on screen width, 8-12dp gap
- Menu items: 56dp height, 16dp padding horizontal

---

### 9. Video Call Screen

**Purpose:** Manage active video call with participants and controls.

**Layout Structure:**
- **Fullscreen Video Area:** Main participant video (background, full screen)
- **Remote Participants:** Small preview tiles in horizontal scroll or grid (bottom-right corner area)
- **Header Overlay:** Name (headline-md) + timestamp (label-sm) + Recording indicator (optional)
- **Controls Panel:** Floating bottom area (floating island, 80% opacity, 20px blur) with buttons
- **Stats Overlay:** Top-right corner with call duration and connection quality

**Video Call Controls:**
- Microphone toggle (icon button, 48dp, active/inactive state with coral accent)
- Video camera toggle (icon button, 48dp, active/inactive state)
- Switch camera button (icon button, 48dp)
- End call button (coral, large pill-shaped 56dp minimum)
- More options menu (icon button, 48dp)

**Information Display:**
- Caller/participant name (headline-md, centered top)
- Call duration timer (label-sm, white text)
- Active participant indicator (border/glow around active video)
- Connection quality indicator (icon + label, top-right, secondary opacity)
- End-to-end encryption status label (optional, top area)

**Component Specs:**
- Control buttons: 48-56dp, icon-only style
- Remote tiles: 80-120dp width, rounded 16-20px
- Control panel: 20px blur, 80% opacity, 60dp height
- Overlay text: white or high contrast

---

### 10. Incoming Call Screen

**Purpose:** Display incoming call notification with accept/decline options.

**Layout Structure:**
- Top centered text: "INCOMING VIDEO CALL" (label-sm, secondary opacity)
- Caller name (headline-lg, centered, 28px)
- Caller info: Device type and location (body-md, centered)
- Caller avatar: Large circular (120-160dp) with concentric rings animation
- Action buttons: Message button, Remind Me button (secondary, outlined)
- Accept button (green or primary accent, large pill-shaped 64dp, bottom-right)
- Decline button (coral/red, large pill-shaped 64dp, bottom-left)

**Caller Information Display:**
- Caller full name (headline-md)
- Device type (Mobile, iPad, etc.) - body-md
- Location if available - body-md
- Profile picture - large circular with animation

**Component Specs:**
- Avatar: 120-160dp circular with subtle animation (ring glow)
- Buttons: 64dp height, pill-shaped (9999px radius)
- Spacing: Centered layout with vertical distribution
- Text: All centered alignment, generous spacing (24-32dp between elements)

---

## 🧩 Component Library

### Buttons

**Primary Button:**
- Shape: Fully pill-shaped (9999px radius)
- Height: 48-56dp (depending on context)
- Function: Main actions (Send, Publish, Post, Accept call)
- States: Default (coral), pressed (scale 0.95), hover (slight glow), disabled (50% opacity)
- Typography: Label-sm or body-md, semibold

**Secondary Button:**
- Shape: Pill-shaped (24-32px radius)
- Height: 40-48dp
- Style: Dark background with 1px border, or text-only
- Function: Optional or supportive actions
- States: Outlined (border visible), filled (dark bg), or text-only

**Icon Button:**
- Shape: Square or circular (32-48dp)
- Function: Compact actions (settings, menu, call)
- States: Active (coral accent), inactive (secondary opacity), hover (subtle glow)

### Cards & Containers

**Elevated Card:**
- Shape: Rounded (24px)
- Use: List items, post cards, message containers
- Elevation: Level 1-2 with subtle inner glow
- Padding: 16-24dp
- Border: Optional 1px subtle border

**Floating Island:**
- Shape: Rounded (24-32px)
- Style: Semi-transparent with backdrop blur (20-24px)
- Opacity: 80%
- Use: Search bars, bottom navigation, floating menus
- Animation: Subtle spring effect on appear

**Message Bubble:**
- Shape: Rounded (24px)
- Content: Message text, media, reactions
- Alignment: Right (sent), Left (received)
- Padding: 12-16dp

### Input Fields

**Text Input:**
- Shape: Rounded (24px)
- Style: Soft inset (darker background than container)
- Padding: 16dp
- Placeholder: Secondary opacity text
- Focus State: Subtle glow effect with primary accent
- Height: 48-56dp (minimum touch target)

**Search Bar:**
- Shape: Rounded (32px - fully pill-shaped)
- Icon: Search icon on left (24-28dp)
- Glassmorphism: Backdrop blur (20px)
- Clear button: Right-aligned when active
- Height: 48dp

### Lists & Grids

**List Item:**
- Padding: 16-24dp internal spacing
- Margin: 8-12dp between items
- Height: 56-72dp (minimum touch target)
- Indicator: Optional 4px coral left border or indicator
- Contains: Avatar, title, subtitle, trailing element

**Grid Layout:**
- Columns: 2-3 based on screen size
- Aspect Ratio: Flexible (usually 1:1 for media)
- Gap: 8-12dp between items
- Item size: Flexible to fill width

### Badges & Indicators

**Notification Badge:**
- Shape: Pill (9999px)
- Size: 20-24dp height
- Content: Number or icon
- Background: Coral (#ffb3ae or #FF4B4B)
- Text: White, semibold (label-sm)

**Status Indicator:**
- Shape: Circular (8-12dp)
- Position: Usually corner of avatar
- States: Online (green), Offline (gray), Away (yellow)
- Border: Subtle white/light border (1px)

---

## 🎬 Interaction Patterns

### Navigation
- **Bottom Navigation Bar:** Floating island with 4-5 main icons (20px blur, 80% opacity)
- **Tabs:** Secondary style for sub-sections (Direct/Groups/Archived) with underline indicator
- **Stack Navigation:** Back button (icon, 24-28dp) for hierarchical screens

### Feedback & States
- **Active States:** Coral accent color or highlight on interactive elements
- **Pressed States:** Slight scale reduction (0.95-0.98) + 50ms transition
- **Disabled States:** 50% opacity + cursor disabled
- **Loading States:** Skeleton loaders with subtle animation (pulse effect)
- **Error States:** Red/error accent color with error message (body-md)

### Animations
- **Transitions:** 300ms ease-in-out for screen changes
- **Button Press:** 150ms scale animation (0.95 scale)
- **Message Appear:** Fade + slide up over 200-300ms
- **Pulse Effects:** Used for recording indicators, calling state (1.5s loop)
- **Glow Effects:** Neon accent glow on primary buttons (15-25% opacity)

---

## ✅ Implementation Notes

### For Android XML/Jetpack Compose
1. Use Material 3 with dark theme enabled
2. Implement glassmorphism with RenderEffect (API 31+) or custom background drawable
3. Create custom shapes for 24-32px corner radius (use ShapeAppearanceModel)
4. Use Material theme attributes for semantic colors
5. Implement proper elevation/shadow with custom shadow drawables
6. Add backdrop blur support (BlurMaskFilter or RenderEffect)
7. Support animations with proper duration/interpolators

### Accessibility
- Minimum touch target: 48×48dp (guideline-compliant)
- Use proper contrast ratios (WCAG AA minimum 4.5:1 for text)
- Provide content descriptions for all icons (@string resources)
- Support text scaling up to 200%
- Ensure keyboard navigation support and focus indicators
- Include vibration/haptic feedback for critical actions

### Performance
- Use proper image optimization for avatars and media (compress WebP format)
- Implement lazy loading for lists and grids (RecyclerView with ViewModel)
- Avoid overdraw with proper layer optimization (Profile tool in Android Studio)
- Cache frequently used assets (Glide, Picasso, or Coil)
- Use proper coroutines for network/disk operations

---

## 📊 Screen Inventory

| Screen | Purpose | Key Content | Complexity |
|--------|---------|------------|-----------|
| Login & Registration | User authentication | Form fields, social options, tabs | Medium |
| Home Chat List | View conversations | Conversation list, search, fab, tabs | High |
| Search Results | Find users/groups/posts | Search results, filter chips | Medium |
| Private Chat | 1-on-1 messaging | Messages, input, actions, participant info | High |
| Group Chat | Group messaging | Messages with sender context, group info | High |
| Social Feed | Browse posts | Post cards, engagement, tabs | High |
| Create Post | Compose post | Text area, media, actions, privacy | Medium |
| User Profile | View user info | Profile header, stats, grid, settings | High |
| Video Call | Active call | Video streams, controls, participant tiles | High |
| Incoming Call | Receive call | Caller info, accept/decline, animation | Medium |

---

## 🔔 Dialogs and Modal Content

### Confirmation Dialog
- Title describing the action (headline-md)
- Supporting message explaining the choice (body-md)
- Primary confirm button label (coral, pill-shaped)
- Secondary cancel button label (outlined)

### Action Sheet
- Title (optional, headline-md)
- List of actions with icons and labels (each 56dp height)
- Optional destructive option at the bottom (red/error color)
- Cancel action to close (secondary style button)

### Input Dialog
- Title for context (headline-md)
- Single text field with placeholder (24px radius, soft inset)
- Supporting text/hint (label-sm, secondary)
- Submit and cancel buttons (primary and secondary)

### Profile Option Dialog
- Options for view profile, message, block, report (each with icon)
- Each option displays icon (24-28dp) and text (body-md)
- Optional destructive option (red/error color)

---

## 🧭 Component Function Notes

### Buttons
- **Primary button:** For main actions requiring emphasis (Send, Publish, Create, Confirm)
- **Secondary button:** For optional or supportive actions (Cancel, Skip, More)
- **Outlined button:** For cancel, back, or low-priority actions
- **Icon button:** For compact actions (settings, menu, call, info)
- **Text button:** For inline actions and links

### Cards
- **Elevated cards:** For list items and content grouping (post cards, chat items)
- **Filled cards:** For content containers and message bubbles
- **Outlined cards:** For optional sections or grouped settings

### Text Fields
- **Filled text field:** For standard form entry (login, signup)
- **Outlined text field:** For search and chat input
- **Multiline text field:** For post composition, bio editing

### Lists
- **Each list item:** Avatar/icon (leading), title, subtitle, trailing action/status
- **Empty state:** Icon, title, description, optional action button
- **Grouped lists:** Optional header row, dividers between groups
- **Infinite scroll:** Bottom loading indicator, pagination support

---

## 📋 Data Display Guidelines

- **Names:** Always display in clear, readable typography (headline-md or body-lg)
- **Messages:** Use body-lg for primary content, label-sm for timestamps
- **Timestamps:** Relative format ("2 mins ago", "Today", "Yesterday") where appropriate
- **Statuses:** Use visual indicators (badges, colors) combined with text labels
- **Avatars:** Always 40-80dp circular, with initials or image fallback
- **Engagement metrics:** Use compact formatting (123K, 1.2M) with label-sm typography
- **Actions:** Always provide clear button labels, avoid icon-only for primary actions

---

**Design System Version:** 2.0 (Midnight Obsidian)  
**Last Updated:** May 24, 2026  
**Status:** Ready for Implementation
