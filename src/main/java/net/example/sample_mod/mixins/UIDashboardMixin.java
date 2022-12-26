package net.example.sample_mod.mixins;

import mchorse.bbs.ui.dashboard.UIDashboard;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(UIDashboard.class)
public abstract class UIDashboardMixin
{
    @Inject(method = "<init>(Lmchorse/bbs/IBridge;)V", at = @At("RETURN"))
    public void injectInConstructor(CallbackInfo info)
    {
        System.out.println("Welcome to the dashboard!");
    }
}