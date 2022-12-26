package net.example.sample_mod;

import mchorse.app.utils.ValueModButtons;
import mchorse.bbs.config.ConfigBuilder;
import mchorse.bbs.config.values.ValueBoolean;

/**
 * Sample mod's settings class.
 *
 * <p>This class can be used for registering custom options. By default,
 * language strings for configuration options have the following conventions:</p>
 *
 * <ul>
 *     <li>%MOD_ID%.config.title = title of the mod in the sidebar</li>
 *     <li>%MOD_ID%.config.%CATEGORY%.title = title of a category</li>
 *     <li>%MOD_ID%.config.%CATEGORY%.tooltip = tooltip that will be shown when hovering on category title</li>
 *     <li>%MOD_ID%.config.%CATEGORY%.%OPTION_ID% = display label for an option</li>
 *     <li>%MOD_ID%.config.%CATEGORY%.%OPTION_ID%-comment = tooltip that will be shown when hovering on option's UI controls</li>
 * </ul>
 *
 * <p>See src/main/resources/sample_mod/lang/all.json for more information.</p>
 */
public class SampleSettings
{
    public static ValueBoolean registerPanel;

    public static void register(ConfigBuilder builder)
    {
        /* A category must be created first before options can be created! */
        builder.category("general").register(new ValueModButtons(SampleMod.MOD_ID));

        registerPanel = builder.getBoolean("panel", true);
    }
}