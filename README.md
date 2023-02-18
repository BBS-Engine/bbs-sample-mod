> **Disclaimer**: This is a copy of [Modding](https://github.com/mchorse/bbs/wiki/Modding) page from BBS' Wiki... if something doesn't work, this page might be outdated, so please check out the original!

---

BBS provides modding capabilities powered by [Fabric Loader](https://fabricmc.net/wiki/documentation:fabric_loader).

## Prerequisites

Before starting modding BBS, there are some prerequisites you must have: Java programming experience (Java `8` is used in BBS), [Gradle](https://gradle.org/releases/) (`7.3.1` is used in BBS) and an IDE ([IntelliJ IDEA `2022.3.1` (Community Edition)](https://www.jetbrains.com/idea/download/#section=windows) is used to develop BBS).

If you have everything, then you can continue reading. If not, then you'll have troubles.

## Setting up

To setup modding environment, follow these steps:

1. Clone/download as ZIP [BBS sample mod](https://github.com/mchorse/bbs-sample-mod) repository.
2. Copy `launcher.jar` file from BBS into the sample mod's folder (right next to `build.gradle`).
3. Open it in an IDE as a gradle project.

That should do it.

## Launching BBS with the mod

To launch BBS with IntelliJ (I don't know how to do it with Eclipse or other IDE), you need to setup a run configuration. Which you can do by:

1. Copy the file `Run_configuration-windows.xml` (or `Run_configuration-macOS.xml` for macOS or for *nix, if it doesn't launch on *nix, remove `-XstartOnFirstThread`) into `.idea/runConfigurations`.
2. Open "Edit configurations..." menu (it's hidden in the bar next to ▶ icon).
3. Select `Sample mod` under **Run Configurations**.

After that, you should be able to launch BBS with the sample mod installed. You would see `sample-mod` in the **Loading mods** list.

```
[16:00:40] [INFO] [FabricLoader/GameProvider]: Loading BBS 0.1 (dev) with Fabric Loader 0.13.0
[16:00:41] [INFO] [FabricLoader/]: Loading 3 mods:
	- fabricloader 0.13.0
	- java 8
	- sample-mod 0.1
```

## What's next?

There is no documentation for BBS yet, so you can either explore the source by looking into `launcher.jar` with built-in decompiler (a good place to start is by looking up `mchorse.app.Game` and `mchorse.app.GameEngine` classes). Alternatively, join BBS' dedicated [Discord server](https://discord.gg/N7ZZyNd4UC) and feel free to ask for pointers in #engine-modding channel. Keep in mind that **intermediate Java understanding** is **expected**.

Have fun modding! 😉 