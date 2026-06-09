# Product

## Register

product

## Users

General-purpose communicators: friends, classmates, small teams, and casual groups. They open the app to message someone, catch up on a feed, join a call, or manage their profile. Context varies (commute, evening at home, quick check between tasks), so the UI must stay legible in low light and feel calm under frequent use.

## Product Purpose

A self-hosted Android chat client for private and group messaging, social posts, and voice/video calls against a Node.js backend. Success means users complete core workflows (send a message, start a call, post or react) without friction, and the interface feels cohesive dark-premium rather than a patchwork of screens.

Primary design focus right now: **finish and unify the Midnight Slate dark theme** across chat, feed, calls, auth, and settings.

## Brand Personality

**Dark · Premium · Cinematic**

The app should feel like a focused night-mode tool: deep slate surfaces, confident typography, restrained motion, and one clear accent. Not playful-social-bright; not enterprise-cold. Presence without noise.

## Anti-references

- **Facebook / Messenger**: bright blue chrome, cluttered feed density, generic social patterns.
- **AI slop**: purple/blue neon gradients, decorative glassmorphism, identical icon+heading+card grids, gradient text, side-stripe accent borders, hero-metric blocks.
- **Category-default dark chat clones**: flat gray-on-gray with no surface hierarchy or readable secondary text.

## Design Principles

1. **Dark serves the task** — contrast and hierarchy exist so users can read and act quickly; decoration never competes with messages or calls.
2. **One accent, many neutrals** — a single azure signal for primary actions; slate surfaces carry depth through elevation and border, not extra colors.
3. **Chat-native rhythm** — lists, bubbles, composers, and call controls follow mobile messaging conventions; social feed and settings inherit the same tokens.
4. **Premium through restraint** — fewer surfaces, consistent spacing, purposeful motion; density where data is dense (chat list), air where decisions matter (auth, ringing).
5. **Practice what you ship** — error, empty, loading, and offline states get the same craft as happy paths; no placeholder-only screens.

## Accessibility & Inclusion

- **WCAG AA** contrast for body and large text on dark backgrounds; placeholder and muted text must remain readable, not decorative gray.
- **Touch targets** ≥44dp on primary controls; comfortable spacing in composer and call UI.
- **Reduced motion** — respect system `prefers-reduced-motion` / Android animator settings; avoid gating content visibility on entrance animations.
