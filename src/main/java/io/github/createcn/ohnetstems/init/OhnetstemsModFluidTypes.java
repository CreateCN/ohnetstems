
/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package io.github.createcn.ohnetstems.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fluids.FluidType;

import io.github.createcn.ohnetstems.fluid.types.HeWuRanShuiFluidType;
import io.github.createcn.ohnetstems.OhnetstemsMod;

public class OhnetstemsModFluidTypes {
	public static final DeferredRegister<FluidType> REGISTRY = DeferredRegister.create(ForgeRegistries.Keys.FLUID_TYPES, OhnetstemsMod.MODID);
	public static final RegistryObject<FluidType> HE_WU_RAN_SHUI_TYPE = REGISTRY.register("he_wu_ran_shui", () -> new HeWuRanShuiFluidType());
}
