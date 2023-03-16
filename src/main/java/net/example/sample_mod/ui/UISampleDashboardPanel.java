package net.example.sample_mod.ui;

import mchorse.bbs.ui.dashboard.UIDashboard;
import mchorse.bbs.ui.dashboard.panels.UIDashboardPanel;
import mchorse.bbs.ui.framework.elements.buttons.UIButton;
import mchorse.bbs.ui.framework.elements.overlay.UIMessageOverlayPanel;
import mchorse.bbs.ui.framework.elements.overlay.UIOverlay;

public class UISampleDashboardPanel extends UIDashboardPanel
{
    public UIButton pressMe;

    public UISampleDashboardPanel(UIDashboard dashboard)
    {
        super(dashboard);

        this.pressMe = new UIButton(UIKeysSample.PRESS_ME, this::handlePressMe);
        this.pressMe.flex().relative(this).xy(0.5F, 0.5F).wh(100, 20).anchor(0.5F);
        this.pressMe.tooltip(UIKeysSample.PRESS_ME_TOOLTIP);

        this.add(this.pressMe);
    }

    private void handlePressMe(UIButton b)
    {
        UIMessageOverlayPanel panel = new UIMessageOverlayPanel(
            UIKeysSample.SAMPLE_MODAL_TITLE,
            UIKeysSample.SAMPLE_MODAL_DESCRIPTION
        );

        UIOverlay.addOverlay(this.getContext(), panel);
    }
}