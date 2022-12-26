package net.example.sample_mod;

import mchorse.bbs.config.ConfigBuilder;
import mchorse.bbs.config.values.ValueBoolean;

public class SampleSettings
{
    public static ValueBoolean registerPanel;

    public static void register(ConfigBuilder builder)
    {
        registerPanel = builder.category("general").getBoolean("panel", true);
    }
}