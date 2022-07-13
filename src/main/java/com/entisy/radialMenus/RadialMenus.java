package com.entisy.radialMenus;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;

@Mod(RadialMenus.MOD_ID)
public class RadialMenus {
    public static final String MOD_ID = "radialmenu";

    public RadialMenus() {
//        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

        MinecraftForge.EVENT_BUS.register(this);
    }
}
