# Midnight Obsidian - Android Implementation Guide

## Quick Start for Developers

### Setup Overview
This guide provides step-by-step instructions to implement the Midnight Obsidian design system in an Android app using Jetpack Compose or XML layouts with Material Design 3.

---

## 1. Color System Setup

### colors.xml (XML Implementation)

```xml
<?xml version="1.0" encoding="utf-8"?>
<resources>
    <!-- Primary Accent -->
    <color name="md3_primary">#ffb3ae</color>
    <color name="md3_primary_dark">#FF4B4B</color>
    
    <!-- Surfaces & Backgrounds -->
    <color name="md3_background">#111317</color>
    <color name="md3_surface">#1a1c20</color>
    <color name="md3_surface_high">#282a2e</color>
    <color name="md3_surface_highest">#333539</color>
    <color name="md3_surface_variant">#333539</color>
    <color name="md3_surface_bright">#37393e</color>
    <color name="md3_surface_dim">#111317</color>
    <color name="md3_surface_container">#1e2024</color>
    <color name="md3_surface_container_low">#1a1c20</color>
    <color name="md3_surface_container_lowest">#0c0e12</color>
    
    <!-- Text Colors -->
    <color name="md3_on_surface">#e2e2e8</color>
    <color name="md3_on_surface_secondary">#b6b8c1</color>
    <color name="md3_on_surface_variant">#e4bdba</color>
    
    <!-- Borders & Outlines -->
    <color name="md3_outline">#ab8886</color>
    <color name="md3_outline_variant">#5b403e</color>
    
    <!-- Secondary Colors -->
    <color name="md3_secondary">#c4c6d0</color>
    <color name="md3_on_secondary">#2d3038</color>
    
    <!-- Error Colors -->
    <color name="md3_error">#ffb4ab</color>
    <color name="md3_on_error">#690005</color>
    <color name="md3_error_container">#93000a</color>
    
    <!-- Additional -->
    <color name="md3_tertiary">#c3c6d2</color>
    <color name="md3_inverse_primary">#bb1522</color>
    <color name="md3_inverse_surface">#e2e2e8</color>
</resources>
```

### Compose Color System

```kotlin
// Color.kt
package com.tpchat.ui.theme

import androidx.compose.material3.darkColorScheme
import androidx.compose.ui.graphics.Color

// Primary Colors
val Primary = Color(0xFFFFB3AE)
val PrimaryDark = Color(0xFFFF4B4B)

// Surfaces
val Background = Color(0xFF111317)
val Surface = Color(0xFF1a1c20)
val SurfaceHigh = Color(0xFF282a2e)
val SurfaceHighest = Color(0xFF333539)
val SurfaceVariant = Color(0xFF333539)

// Text
val OnSurface = Color(0xFFe2e2e8)
val OnSurfaceSecondary = Color(0xFFb6b8c1)
val OnSurfaceVariant = Color(0xFFe4bdba)

// Outlines
val Outline = Color(0xFFab8886)
val OutlineVariant = Color(0xFF5b403e)

// Error
val Error = Color(0xFFffb4ab)
val OnError = Color(0xFF690005)

val MidnightColorScheme = darkColorScheme(
    primary = Primary,
    secondary = Color(0xFFC4C6D0),
    tertiary = Color(0xFFC3C6D2),
    background = Background,
    surface = Surface,
    surfaceVariant = SurfaceVariant,
    error = Error,
    onSurface = OnSurface,
    onSurfaceVariant = OnSurfaceVariant,
    outline = Outline,
    outlineVariant = OutlineVariant
)
```

---

## 2. Typography Setup

### Font Resource (XML)

```xml
<!-- res/font/plus_jakarta_sans_regular.ttf -->
<!-- res/font/plus_jakarta_sans_medium.ttf -->
<!-- res/font/plus_jakarta_sans_semibold.ttf -->
<!-- res/font/plus_jakarta_sans_bold.ttf -->

<!-- dimens.xml -->
<resources>
    <!-- Typography -->
    <dimen name="text_size_headline_large">28sp</dimen>
    <dimen name="text_size_headline_medium">22sp</dimen>
    <dimen name="text_size_headline_small">20sp</dimen>
    <dimen name="text_size_body_large">16sp</dimen>
    <dimen name="text_size_body_medium">14sp</dimen>
    <dimen name="text_size_body_small">12sp</dimen>
    <dimen name="text_size_label_small">12sp</dimen>
    <dimen name="text_size_label_medium">12sp</dimen>
    <dimen name="text_size_label_large">14sp</dimen>
    
    <!-- Line Heights -->
    <dimen name="line_height_headline_large">36sp</dimen>
    <dimen name="line_height_headline_medium">28sp</dimen>
    <dimen name="line_height_body_large">24sp</dimen>
    <dimen name="line_height_body_medium">20sp</dimen>
    <dimen name="line_height_label_small">16sp</dimen>
</resources>
```

### Compose Typography

```kotlin
// Type.kt
package com.tpchat.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

val PlusJakartaSans = FontFamily(
    Font(R.font.plus_jakarta_sans_regular, FontWeight.Normal),
    Font(R.font.plus_jakarta_sans_medium, FontWeight.Medium),
    Font(R.font.plus_jakarta_sans_semibold, FontWeight.SemiBold),
    Font(R.font.plus_jakarta_sans_bold, FontWeight.Bold),
)

val MidnightTypography = Typography(
    headlineLarge = TextStyle(
        fontFamily = PlusJakartaSans,
        fontWeight = FontWeight.Bold,
        fontSize = 28.sp,
        lineHeight = 36.sp,
        letterSpacing = (-0.02).sp
    ),
    headlineMedium = TextStyle(
        fontFamily = PlusJakartaSans,
        fontWeight = FontWeight.SemiBold,
        fontSize = 22.sp,
        lineHeight = 28.sp,
        letterSpacing = (-0.01).sp
    ),
    bodyLarge = TextStyle(
        fontFamily = PlusJakartaSans,
        fontWeight = FontWeight.Medium,
        fontSize = 16.sp,
        lineHeight = 24.sp,
        letterSpacing = 0.5.sp
    ),
    bodyMedium = TextStyle(
        fontFamily = PlusJakartaSans,
        fontWeight = FontWeight.Normal,
        fontSize = 14.sp,
        lineHeight = 20.sp,
        letterSpacing = 0.25.sp
    ),
    labelSmall = TextStyle(
        fontFamily = PlusJakartaSans,
        fontWeight = FontWeight.SemiBold,
        fontSize = 12.sp,
        lineHeight = 16.sp,
        letterSpacing = 0.5.sp
    )
)
```

---

## 3. Shape System Setup

### XML - Custom ShapeAppearanceOverlay

```xml
<!-- res/values/styles.xml -->
<style name="ShapeAppearanceOverlay.MidnightObsidian.Button" parent="">
    <item name="cornerRadius">24dp</item>
</style>

<style name="ShapeAppearanceOverlay.MidnightObsidian.Card" parent="">
    <item name="cornerRadius">24dp</item>
</style>

<style name="ShapeAppearanceOverlay.MidnightObsidian.InputField" parent="">
    <item name="cornerRadius">24dp</item>
</style>

<style name="ShapeAppearanceOverlay.MidnightObsidian.Search" parent="">
    <item name="cornerRadius">32dp</item>
</style>
```

### Compose - RoundedCornerShape

```kotlin
// Shapes.kt
package com.tpchat.ui.theme

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Shapes
import androidx.compose.ui.unit.dp

val MidnightShapes = Shapes(
    small = RoundedCornerShape(12.dp),
    medium = RoundedCornerShape(24.dp),
    large = RoundedCornerShape(32.dp),
    extraLarge = RoundedCornerShape(48.dp)
)

// Individual shapes for different components
val ButtonShape = RoundedCornerShape(24.dp)
val PillShape = RoundedCornerShape(9999.dp)  // Fully rounded
val CardShape = RoundedCornerShape(24.dp)
val InputShape = RoundedCornerShape(24.dp)
val SearchShape = RoundedCornerShape(32.dp)
```

---

## 4. Spacing System Setup

### dimens.xml

```xml
<!-- res/values/dimens.xml -->
<resources>
    <!-- Spacing Base -->
    <dimen name="spacing_base">4dp</dimen>
    <dimen name="spacing_xs">8dp</dimen>
    <dimen name="spacing_sm">12dp</dimen>
    <dimen name="spacing_md">16dp</dimen>
    <dimen name="spacing_lg">24dp</dimen>
    <dimen name="spacing_xl">32dp</dimen>
    <dimen name="spacing_gutter">16dp</dimen>
    <dimen name="spacing_margin_mobile">20dp</dimen>
    
    <!-- Component Sizes -->
    <dimen name="component_icon_size">24dp</dimen>
    <dimen name="component_icon_size_large">28dp</dimen>
    <dimen name="component_button_height">48dp</dimen>
    <dimen name="component_button_height_large">56dp</dimen>
    <dimen name="component_button_height_small">40dp</dimen>
    <dimen name="component_avatar_size_small">32dp</dimen>
    <dimen name="component_avatar_size_medium">40dp</dimen>
    <dimen name="component_avatar_size_large">48dp</dimen>
    <dimen name="component_avatar_size_xlarge">80dp</dimen>
    <dimen name="component_avatar_size_xxlarge">120dp</dimen>
    
    <!-- Elevation/Blur -->
    <dimen name="elevation_default">8dp</dimen>
    <dimen name="blur_backdrop">20dp</dimen>
    <dimen name="blur_backdrop_heavy">24dp</dimen>
</resources>
```

### Compose Spacing

```kotlin
// Spacing.kt
package com.tpchat.ui.theme

import androidx.compose.ui.unit.dp

object Spacing {
    val base = 4.dp
    val xs = 8.dp
    val sm = 12.dp
    val md = 16.dp
    val lg = 24.dp
    val xl = 32.dp
    val gutter = 16.dp
    val mobileMargin = 20.dp
}

object ComponentSize {
    val iconSmall = 24.dp
    val iconLarge = 28.dp
    val buttonHeight = 48.dp
    val buttonHeightLarge = 56.dp
    val buttonHeightSmall = 40.dp
    val avatarSmall = 32.dp
    val avatarMedium = 40.dp
    val avatarLarge = 48.dp
    val avatarXLarge = 80.dp
    val avatarXXLarge = 120.dp
}
```

---

## 5. Primary Button Component

### XML Layout

```xml
<!-- res/layout/component_button_primary.xml -->
<com.google.android.material.button.MaterialButton
    android:id="@+id/button_primary"
    android:layout_width="match_parent"
    android:layout_height="@dimen/component_button_height"
    android:text="Button Text"
    android:textColor="@color/md3_on_surface"
    android:letterSpacing="0.01"
    app:backgroundTint="@color/md3_primary"
    app:cornerRadius="@dimen/corner_radius_pill"
    app:textAppearance="@style/TextAppearance.Material3.LabelLarge"
    app:elevation="0dp"
    app:rippleColor="@color/md3_primary_dark" />
```

### Compose Component

```kotlin
// Button.kt
package com.tpchat.ui.components

import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.tpchat.ui.theme.MidnightColorScheme
import com.tpchat.ui.theme.MidnightTypography
import com.tpchat.ui.theme.PillShape

@Composable
fun PrimaryButton(
    text: String,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true
) {
    Button(
        onClick = onClick,
        modifier = modifier,
        shape = PillShape,
        colors = ButtonDefaults.buttonColors(
            containerColor = MidnightColorScheme.primary,
            contentColor = MidnightColorScheme.onSurface,
            disabledContainerColor = MidnightColorScheme.primary.copy(alpha = 0.5f)
        ),
        enabled = enabled
    ) {
        Text(
            text = text,
            style = MidnightTypography.labelLarge
        )
    }
}

@Composable
fun SecondaryButton(
    text: String,
    onClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    Button(
        onClick = onClick,
        modifier = modifier,
        shape = RoundedCornerShape(24.dp),
        colors = ButtonDefaults.outlinedButtonColors(
            contentColor = MidnightColorScheme.onSurface
        ),
        border = BorderStroke(1.dp, MidnightColorScheme.outlineVariant)
    ) {
        Text(
            text = text,
            style = MidnightTypography.labelLarge
        )
    }
}

@Composable
fun IconButton(
    onClick: () -> Unit,
    icon: @Composable () -> Unit,
    modifier: Modifier = Modifier
) {
    Surface(
        modifier = modifier
            .size(48.dp)
            .clickable(onClick = onClick),
        shape = RoundedCornerShape(12.dp),
        color = Color.Transparent
    ) {
        Box(
            modifier = Modifier.fillMaxSize(),
            contentAlignment = Alignment.Center
        ) {
            icon()
        }
    }
}
```

---

## 6. Input Field Component

### XML

```xml
<!-- res/layout/component_input_field.xml -->
<com.google.android.material.textfield.TextInputLayout
    android:id="@+id/text_input_layout"
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    android:hint="Hint text"
    app:hintTextColor="@color/md3_on_surface_secondary"
    app:boxCornerRadiusBottomEnd="@dimen/corner_radius_24"
    app:boxCornerRadiusBottomStart="@dimen/corner_radius_24"
    app:boxCornerRadiusTopEnd="@dimen/corner_radius_24"
    app:boxCornerRadiusTopStart="@dimen/corner_radius_24"
    app:boxBackgroundColor="@color/md3_surface_high"
    app:boxStrokeColor="@color/md3_outline_variant">

    <com.google.android.material.textfield.TextInputEditText
        android:id="@+id/edit_text"
        android:layout_width="match_parent"
        android:layout_height="@dimen/component_button_height"
        android:paddingStart="@dimen/spacing_md"
        android:paddingEnd="@dimen/spacing_md"
        android:textColor="@color/md3_on_surface"
        android:textColorHint="@color/md3_on_surface_secondary"
        android:textSize="@dimen/text_size_body_medium" />

</com.google.android.material.textfield.TextInputLayout>
```

### Compose

```kotlin
// TextField.kt
package com.tpchat.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.tpchat.ui.theme.InputShape
import com.tpchat.ui.theme.MidnightColorScheme
import com.tpchat.ui.theme.Spacing

@Composable
fun PrimaryTextField(
    value: String,
    onValueChange: (String) -> Unit,
    placeholder: String = "",
    modifier: Modifier = Modifier
) {
    TextField(
        value = value,
        onValueChange = onValueChange,
        modifier = modifier
            .fillMaxWidth()
            .height(48.dp),
        placeholder = { Text(placeholder) },
        shape = InputShape,
        colors = TextFieldDefaults.colors(
            focusedContainerColor = MidnightColorScheme.surfaceHigh,
            unfocusedContainerColor = MidnightColorScheme.surfaceHigh,
            focusedTextColor = MidnightColorScheme.onSurface,
            unfocusedTextColor = MidnightColorScheme.onSurface,
            focusedPlaceholderColor = MidnightColorScheme.onSurfaceSecondary,
            unfocusedPlaceholderColor = MidnightColorScheme.onSurfaceSecondary,
            focusedIndicatorColor = Color.Transparent,
            unfocusedIndicatorColor = Color.Transparent
        )
    )
}
```

---

## 7. Glassmorphism Effect

### XML - Custom Background Drawable

```xml
<!-- res/drawable/background_glassmorphic.xml -->
<shape xmlns:android="http://schemas.android.com/apk/res/android">
    <solid android:color="@color/md3_surface_high" />
    <corners android:radius="@dimen/corner_radius_24" />
    <stroke
        android:width="1dp"
        android:color="@color/md3_outline_variant" />
</shape>
```

### Compose - Glassmorphism

```kotlin
// Glassmorphic.kt
package com.tpchat.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.tpchat.ui.theme.MidnightColorScheme
import com.tpchat.ui.theme.CardShape

@Composable
fun GlassmorphicCard(
    modifier: Modifier = Modifier,
    content: @Composable () -> Unit
) {
    Box(
        modifier = modifier
            .background(
                color = MidnightColorScheme.surface.copy(alpha = 0.8f),
                shape = CardShape
            )
            .border(
                width = 1.dp,
                color = MidnightColorScheme.outlineVariant,
                shape = CardShape
            )
    ) {
        content()
    }
}

// For API 31+, use RenderEffect for backdrop blur
@Composable
fun FloatingIsland(
    modifier: Modifier = Modifier,
    content: @Composable () -> Unit
) {
    Box(
        modifier = modifier
            .background(
                color = MidnightColorScheme.surface.copy(alpha = 0.8f),
                shape = RoundedCornerShape(32.dp)
            )
            .border(
                width = 1.dp,
                color = MidnightColorScheme.outlineVariant,
                shape = RoundedCornerShape(32.dp)
            )
    ) {
        content()
    }
}
```

---

## 8. Theme Integration

### Compose Theme Provider

```kotlin
// Theme.kt
package com.tpchat.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import com.tpchat.ui.theme.MidnightColorScheme
import com.tpchat.ui.theme.MidnightTypography
import com.tpchat.ui.theme.MidnightShapes

@Composable
fun MidnightObsidianTheme(
    content: @Composable () -> Unit
) {
    MaterialTheme(
        colorScheme = MidnightColorScheme,
        typography = MidnightTypography,
        shapes = MidnightShapes,
        content = content
    )
}
```

### XML Theme

```xml
<!-- res/values/themes.xml -->
<style name="Theme.TPChat" parent="Theme.Material3.DayNight">
    <item name="colorPrimary">@color/md3_primary</item>
    <item name="colorOnPrimary">@color/md3_on_surface</item>
    <item name="colorPrimaryContainer">@color/md3_primary_container</item>
    <item name="colorOnPrimaryContainer">@color/md3_on_primary_container</item>
    
    <item name="colorSecondary">@color/md3_secondary</item>
    <item name="colorOnSecondary">@color/md3_on_secondary</item>
    
    <item name="colorBackground">@color/md3_background</item>
    <item name="colorOnBackground">@color/md3_on_surface</item>
    
    <item name="colorSurface">@color/md3_surface</item>
    <item name="colorOnSurface">@color/md3_on_surface</item>
    <item name="colorSurfaceVariant">@color/md3_surface_variant</item>
    <item name="colorOnSurfaceVariant">@color/md3_on_surface_variant</item>
    
    <item name="colorError">@color/md3_error</item>
    <item name="colorOnError">@color/md3_on_error</item>
    <item name="colorErrorContainer">@color/md3_error_container</item>
    
    <item name="shapeAppearanceSmallComponent">@style/ShapeAppearanceOverlay.MidnightObsidian.Button</item>
    <item name="shapeAppearanceMediumComponent">@style/ShapeAppearanceOverlay.MidnightObsidian.Card</item>
    <item name="shapeAppearanceLargeComponent">@style/ShapeAppearanceOverlay.MidnightObsidian.Card</item>
    
    <item name="fontFamily">@font/plus_jakarta_sans_regular</item>
</style>

<!-- res/values-night/themes.xml -->
<style name="Theme.TPChat" parent="Theme.Material3.Dark">
    <!-- Same as above (already dark mode) -->
</style>
```

---

## 9. Quick Implementation Checklist

### Phase 1: Setup (Day 1-2)
- [ ] Add color resources (colors.xml)
- [ ] Add typography resources
- [ ] Import Plus Jakarta Sans font
- [ ] Create shapes and border radius definitions
- [ ] Add spacing/dimen resources
- [ ] Apply Material 3 dark theme

### Phase 2: Components (Day 3-4)
- [ ] Create primary button component
- [ ] Create secondary button component
- [ ] Create icon button component
- [ ] Create input field component
- [ ] Create card components
- [ ] Create badge/indicator components

### Phase 3: Screens (Day 5-7)
- [ ] Login & Registration screen
- [ ] Home & Chat List screen
- [ ] Private Chat screen
- [ ] Other screens...

### Phase 4: Polish (Day 8)
- [ ] Add animations
- [ ] Test accessibility
- [ ] Optimize performance
- [ ] Final review

---

## 10. Useful Resources

- Material Design 3: https://material.io/design
- Jetpack Compose: https://developer.android.com/jetpack/compose
- Material Components for Android: https://material.io/components/android
- Plus Jakarta Sans Font: https://fonts.google.com/specimen/Plus+Jakarta+Sans
- Android Accessibility: https://developer.android.com/guide/topics/ui/accessibility

---

**Implementation Version:** 1.0  
**Status:** Ready to implement  
**Framework:** Jetpack Compose / Material Design 3  
**Minimum SDK:** API 24+
