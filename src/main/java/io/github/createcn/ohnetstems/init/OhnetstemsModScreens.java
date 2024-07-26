
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package io.github.createcn.ohnetstems.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

import io.github.createcn.ohnetstems.client.gui.InfoGuiScreen;
import io.github.createcn.ohnetstems.client.gui.CyberIllitetateGUIScreen;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class OhnetstemsModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(OhnetstemsModMenus.INFO_GUI.get(), InfoGuiScreen::new);
			MenuScreens.register(OhnetstemsModMenus.CYBER_ILLITETATE_GUI.get(), CyberIllitetateGUIScreen::new);
		});
	}
}
