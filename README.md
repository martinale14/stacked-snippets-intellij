# stacked-snippets-intellij

![Build](https://github.com/martinale14/stacked-snippets-intellij/workflows/Build/badge.svg)
[![Version](https://img.shields.io/jetbrains/plugin/v/PLUGIN_ID.svg)](https://plugins.jetbrains.com/plugin/PLUGIN_ID)
[![Downloads](https://img.shields.io/jetbrains/plugin/d/PLUGIN_ID.svg)](https://plugins.jetbrains.com/plugin/PLUGIN_ID)

## Template ToDo list
- [x] Create a new [IntelliJ Platform Plugin Template][template] project.
- [x] Get familiar with the [template documentation][template].
- [x] Verify the [pluginGroup](./gradle.properties), [plugin ID](./src/main/resources/META-INF/plugin.xml) and [sources package](./src/main/kotlin).
- [x] Review the [Legal Agreements](https://plugins.jetbrains.com/docs/marketplace/legal-agreements.html).
- [x] [Publish a plugin manually](https://plugins.jetbrains.com/docs/intellij/publishing-plugin.html?from=IJPluginTemplate) for the first time.
- [x] Set the Plugin ID in the above README badges.
- [x] Set the [Deployment Token](https://plugins.jetbrains.com/docs/marketplace/plugin-upload.html).
- [x] Click the <kbd>Watch</kbd> button on the top of the [IntelliJ Platform Plugin Template][template] to be notified about releases containing new features and fixes.

<!-- Plugin description -->
# README

![snippets in action](https://res.cloudinary.com/dhlvkhuhz/image/upload/v1663806291/personal/example_intellij_plugin_clbskf.gif)

A set of helpful Flutter and Dart snippets for day to day Flutter development.

## Features

Simply Flutter set of snippets for sacked arquitecture

I'm working hard to select all the day to day widgets, so wait for more!.

### Snippets

### Stacked Arquitecture related snippets

| Snippet    | Description                                                                       |
| ---------- | --------------------------------------------------------------------------------- |
| `hookW`    | Creates a Hook ViewModel Widget from stacked_hooks package with a given viewModel |
| `sService` | Creates a Service with lazySingleton annotation from injectable package           |
| `cDataS`   | Creates a DataSource from the ChopperApi with a basic structure                   |

### Flutter related snippets

| Snippet | Description                            |
| ------- | -------------------------------------- |
| `sbh`   | Create a Sized Box with a given height |
| `sbw`   | Create a Sized Box with a given width  |

<!-- Plugin description end -->

## Installation

- Using IDE built-in plugin system:
  
  <kbd>Settings/Preferences</kbd> > <kbd>Plugins</kbd> > <kbd>Marketplace</kbd> > <kbd>Search for "stacked-snippets-intellij"</kbd> >
  <kbd>Install Plugin</kbd>
  
- Manually:

  Download the [latest release](https://github.com/martinale14/stacked-snippets-intellij/releases/latest) and install it manually using
  <kbd>Settings/Preferences</kbd> > <kbd>Plugins</kbd> > <kbd>⚙️</kbd> > <kbd>Install plugin from disk...</kbd>


---
Plugin based on the [IntelliJ Platform Plugin Template][template].

[template]: https://github.com/JetBrains/intellij-platform-plugin-template
