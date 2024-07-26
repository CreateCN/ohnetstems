
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package io.github.createcn.ohnetstems.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.effect.MobEffect;

import io.github.createcn.ohnetstems.potion.HeWuRanMobEffect;
import io.github.createcn.ohnetstems.OhnetstemsMod;

public class OhnetstemsModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, OhnetstemsMod.MODID);
	public static final RegistryObject<MobEffect> HE_WU_RAN = REGISTRY.register("he_wu_ran", () -> new HeWuRanMobEffect());
}
