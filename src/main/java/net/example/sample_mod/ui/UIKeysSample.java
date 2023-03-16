package net.example.sample_mod.ui;

import mchorse.bbs.l10n.keys.IKey;

/**
 * It's preferable that localization strings would go into a single file
 * so that it was easier to track language keys with an IDE. It also helps
 * with generation.
 */
public class UIKeysSample
{
    public static final IKey PRESS_ME = IKey.lang("sample_mod.ui.panels.sample.press_me");
    public static final IKey PRESS_ME_TOOLTIP = IKey.lang("sample_mod.ui.panels.sample.press_me-tooltip");

    public static final IKey SAMPLE_MODAL_TITLE = IKey.lang("sample_mod.ui.panels.sample.modal.title");
    public static final IKey SAMPLE_MODAL_DESCRIPTION = IKey.lang("sample_mod.ui.panels.sample.modal.description");

    /**
     * This language string isn't used anywhere in the sample mod, but
     * it shows that you don't need to write translation keys in the JSON
     * files, because there is a feature which allows to generate language
     * strings.
     *
     * After loading sample mod, you can press F6, and under "Language strings,"
     * press "Compile" button. It will offer to open a folder where the strings
     * were generated, and there you would be able to find a file with all your strings.
     *
     * Last argument is a reference to already existing string in the file. You have to
     * specify it so that a language string would be generated in your file (in this case
     * lang.sample_mod_lang.en_US.json), and not in a lang.assets_lazy.json.
     */
    public static final IKey EXAMPLE_GENERATION = IKey.lang("sample_mod.ui.test", "This is a test", PRESS_ME);
}