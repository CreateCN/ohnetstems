
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package io.github.createcn.ohnetstems.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import io.github.createcn.ohnetstems.OhnetstemsMod;

public class OhnetstemsModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, OhnetstemsMod.MODID);
	public static final RegistryObject<SoundEvent> OHNETSTEMS_TAIDIDILE = REGISTRY.register("ohnetstems.taididile", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("ohnetstems", "ohnetstems.taididile")));
	public static final RegistryObject<SoundEvent> OHNETSTEMS_WOWOWO = REGISTRY.register("ohnetstems.wowowo", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("ohnetstems", "ohnetstems.wowowo")));
	public static final RegistryObject<SoundEvent> OHNETSTEMS_WODESHENGAO = REGISTRY.register("ohnetstems.wodeshengao", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("ohnetstems", "ohnetstems.wodeshengao")));
	public static final RegistryObject<SoundEvent> OHNETSTEMS_KAOMIANJING = REGISTRY.register("ohnetstems.kaomianjing", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("ohnetstems", "ohnetstems.kaomianjing")));
}
