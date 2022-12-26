package net.example.sample_mod.ui;

import mchorse.bbs.resources.Link;
import mchorse.bbs.ui.utils.icons.Icon;
import mchorse.bbs.ui.utils.icons.Icons;
import net.example.sample_mod.SampleMod;

public class SampleIcons
{
    public static final Link ATLAS = new Link(SampleMod.MOD_ID, "textures/icons.png");

    /* Register an icon with our icon atlas, at 0,0 UV whose size is
     * 16x16 by default. Icon is by default assumes that given atlas
     * is 256x256, so if your atlas is of different size, pass more arguments.
     *
     * Refer to Icon's constructors for more information. */
    public static final Icon SMILEY = Icons.register(new Icon(ATLAS, "sample.smiley", 0, 0));
}