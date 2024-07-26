
/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package io.github.createcn.ohnetstems.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.ItemBlockRenderTypes;

import io.github.createcn.ohnetstems.fluid.HeWuRanShuiFluid;
import io.github.createcn.ohnetstems.OhnetstemsMod;

public class OhnetstemsModFluids {
	public static final DeferredRegister<Fluid> REGISTRY = DeferredRegister.create(ForgeRegistries.FLUIDS, OhnetstemsMod.MODID);
	public static final RegistryObject<FlowingFluid> HE_WU_RAN_SHUI = REGISTRY.register("he_wu_ran_shui", () -> new HeWuRanShuiFluid.Source());
	public static final RegistryObject<FlowingFluid> FLOWING_HE_WU_RAN_SHUI = REGISTRY.register("flowing_he_wu_ran_shui", () -> new HeWuRanShuiFluid.Flowing());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			ItemBlockRenderTypes.setRenderLayer(HE_WU_RAN_SHUI.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_HE_WU_RAN_SHUI.get(), RenderType.translucent());
		}
	}
}
