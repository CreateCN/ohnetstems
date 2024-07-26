
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package io.github.createcn.ohnetstems.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import io.github.createcn.ohnetstems.block.StemWorkbenchBlock;
import io.github.createcn.ohnetstems.block.NetStemOreBlock;
import io.github.createcn.ohnetstems.block.HuaJiSaplingBlock;
import io.github.createcn.ohnetstems.block.HuaJiLogBlock;
import io.github.createcn.ohnetstems.block.HuaJiLevelBlock;
import io.github.createcn.ohnetstems.block.HeWuRanShuiBlock;
import io.github.createcn.ohnetstems.OhnetstemsMod;

public class OhnetstemsModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, OhnetstemsMod.MODID);
	public static final RegistryObject<Block> NET_STEM_ORE = REGISTRY.register("net_stem_ore", () -> new NetStemOreBlock());
	public static final RegistryObject<Block> HUA_JI_LOG = REGISTRY.register("hua_ji_log", () -> new HuaJiLogBlock());
	public static final RegistryObject<Block> HUA_JI_SAPLING = REGISTRY.register("hua_ji_sapling", () -> new HuaJiSaplingBlock());
	public static final RegistryObject<Block> HUA_JI_LEVEL = REGISTRY.register("hua_ji_level", () -> new HuaJiLevelBlock());
	public static final RegistryObject<Block> HE_WU_RAN_SHUI = REGISTRY.register("he_wu_ran_shui", () -> new HeWuRanShuiBlock());
	public static final RegistryObject<Block> STEM_WORKBENCH = REGISTRY.register("stem_workbench", () -> new StemWorkbenchBlock());
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
