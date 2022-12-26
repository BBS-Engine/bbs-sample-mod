package net.example.sample_mod.ui;

import mchorse.bbs.l10n.keys.IKey;
import mchorse.bbs.ui.dashboard.UIDashboard;
import mchorse.bbs.ui.dashboard.UIDashboardPanel;
import mchorse.bbs.ui.framework.elements.buttons.UIButton;
import mchorse.bbs.ui.framework.elements.overlay.UIMessageOverlayPanel;
import mchorse.bbs.ui.framework.elements.overlay.UIOverlay;

public class UISampleDashboardPanel extends UIDashboardPanel<UIDashboard>
{
    public UIButton pressMe;

    public UISampleDashboardPanel(UIDashboard dashboard)
    {
        super(dashboard);

        this.pressMe = new UIButton(IKey.lang("sample_mod.ui.panels.sample.press_me"), this::handlePressMe);
        this.pressMe.flex().relative(this).xy(0.5F, 0.5F).wh(100, 20).anchor(0.5F);
        this.pressMe.tooltip(IKey.lang("sample_mod.ui.panels.sample.press_me-tooltip"));

        this.add(this.pressMe);
    }

    private void handlePressMe(UIButton b)
    {
        UIMessageOverlayPanel panel = new UIMessageOverlayPanel(
            IKey.lang("sample_mod.ui.panels.sample.modal.title"),
            IKey.lang("sample_mod.ui.panels.sample.modal.description")
        );

        UIOverlay.addOverlay(this.getContext(), panel);
    }
}