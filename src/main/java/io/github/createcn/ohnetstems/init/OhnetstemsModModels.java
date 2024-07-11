
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package io.github.createcn.ohnetstems.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import io.github.createcn.ohnetstems.client.model.Modelxuewang;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class OhnetstemsModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(Modelxuewang.LAYER_LOCATION, Modelxuewang::createBodyLayer);
	}
}
