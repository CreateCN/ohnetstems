
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package io.github.createcn.ohnetstems.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.renderer.entity.ThrownItemRenderer;

import io.github.createcn.ohnetstems.client.renderer.ZiMinRenderer;
import io.github.createcn.ohnetstems.client.renderer.XueWangRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class OhnetstemsModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(OhnetstemsModEntities.ZI_MIN.get(), ZiMinRenderer::new);
		event.registerEntityRenderer(OhnetstemsModEntities.XUE_WANG.get(), XueWangRenderer::new);
		event.registerEntityRenderer(OhnetstemsModEntities.XUE_WANG_PROJECTILE.get(), ThrownItemRenderer::new);
	}
}
