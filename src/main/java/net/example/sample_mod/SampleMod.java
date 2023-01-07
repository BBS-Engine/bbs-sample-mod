package net.example.sample_mod;

import mchorse.bbs.BBS;
import mchorse.bbs.events.register.RegisterConfigsEvent;
import mchorse.bbs.events.register.RegisterCoreEvent;
import mchorse.bbs.events.register.RegisterDashboardPanels;
import mchorse.bbs.events.register.RegisterL10nEvent;
import mchorse.bbs.l10n.keys.IKey;
import mchorse.bbs.resources.Link;
import mchorse.bbs.resources.packs.InternalAssetsSourcePack;
import mchorse.bbs.ui.dashboard.UIDashboard;
import net.example.sample_mod.ui.SampleIcons;
import net.example.sample_mod.ui.UISampleDashboardPanel;
import net.fabricmc.api.ModInitializer;
import org.greenrobot.eventbus.Subscribe;

public class SampleMod implements ModInitializer
{
    public static final String MOD_ID = "sample_mod";

    @Override
    public void onInitialize()
    {
        System.out.println("Hello, BBS!");

        /* Register event handler so the methods above would be called
         * upon registered events below. */
        BBS.events.register(this);
    }

    @Subscribe
    public void registerCore(RegisterCoreEvent event)
    {
        /* Register an internal asset source pack which allows L10n to find
         * the language file to load strings from. The font doesn't support
         * non latin (and even accented latin characters) yet, so language
         * support isn't available straight out of the box... :( */
        BBS.getProvider().register(new InternalAssetsSourcePack(MOD_ID, this.getClass().getClassLoader()));
    }

    @Subscribe
    public void registerL10n(RegisterL10nEvent event)
    {
        /* Register the sample_mod/lang/all.json file to be (re)loaded by the
         * localization manager, which allows you to use keys and IKey instead
         * of raw strings. */
        event.l10n.register(new Link(MOD_ID, "lang/all.json"));
    }

    @Subscribe
    public void registerConfiguration(RegisterConfigsEvent event)
    {
        /* Register a config for this mod. A new file by the ID would be saved
         * based on the options registered in the SampleSettings.register().
         * In this case, game/config/sample_mod.json would be created with
         * default values written. */
        event.register(MOD_ID, SampleSettings::register);
    }

    @Subscribe
    public void registerDashboardPanels(RegisterDashboardPanels event)
    {
        /* In case other mods, or BBS itself, have other dashboard UIs, an
         * instanceof check is important here. */
        if (SampleSettings.registerPanel.get() && event.dashboard instanceof UIDashboard)
        {
            UISampleDashboardPanel panel = new UISampleDashboardPanel((UIDashboard) event.dashboard);

            event.dashboard.panels.registerPanel(panel, IKey.lang("sample_mod.ui.panels.sample.title"), SampleIcons.SMILEY);
        }
    }
}