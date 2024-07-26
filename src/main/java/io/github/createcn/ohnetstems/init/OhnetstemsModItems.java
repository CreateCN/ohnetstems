
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package io.github.createcn.ohnetstems.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import io.github.createcn.ohnetstems.item.ShiLiItem;
import io.github.createcn.ohnetstems.item.ShenGaoItem;
import io.github.createcn.ohnetstems.item.NetStemGemItem;
import io.github.createcn.ohnetstems.item.KaoMianJingItem;
import io.github.createcn.ohnetstems.item.HuaJiItem;
import io.github.createcn.ohnetstems.item.HeWuRanShuiItem;
import io.github.createcn.ohnetstems.item.EmeraldPickaxeItem;
import io.github.createcn.ohnetstems.item.CyberIlliterateItem;
import io.github.createcn.ohnetstems.OhnetstemsMod;

public class OhnetstemsModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, OhnetstemsMod.MODID);
	public static final RegistryObject<Item> NET_STEM_GEM = REGISTRY.register("net_stem_gem", () -> new NetStemGemItem());
	public static final RegistryObject<Item> HUA_JI = REGISTRY.register("hua_ji", () -> new HuaJiItem());
	public static final RegistryObject<Item> NET_STEM_ORE = block(OhnetstemsModBlocks.NET_STEM_ORE);
	public static final RegistryObject<Item> HUA_JI_LOG = block(OhnetstemsModBlocks.HUA_JI_LOG);
	public static final RegistryObject<Item> HUA_JI_SAPLING = block(OhnetstemsModBlocks.HUA_JI_SAPLING);
	public static final RegistryObject<Item> HUA_JI_LEVEL = block(OhnetstemsModBlocks.HUA_JI_LEVEL);
	public static final RegistryObject<Item> ZI_MIN_SPAWN_EGG = REGISTRY.register("zi_min_spawn_egg", () -> new ForgeSpawnEggItem(OhnetstemsModEntities.ZI_MIN, -16737997, -13369549, new Item.Properties()));
	public static final RegistryObject<Item> SHI_LI = REGISTRY.register("shi_li", () -> new ShiLiItem());
	public static final RegistryObject<Item> KAO_MIAN_JIN = REGISTRY.register("kao_mian_jin", () -> new KaoMianJingItem());
	public static final RegistryObject<Item> XUE_WANG_SPAWN_EGG = REGISTRY.register("xue_wang_spawn_egg", () -> new ForgeSpawnEggItem(OhnetstemsModEntities.XUE_WANG, -1, -3355444, new Item.Properties()));
	public static final RegistryObject<Item> EMERALD_PICKAXE = REGISTRY.register("emerald_pickaxe", () -> new EmeraldPickaxeItem());
	public static final RegistryObject<Item> SHEN_GAO = REGISTRY.register("shen_gao", () -> new ShenGaoItem());
	public static final RegistryObject<Item> HE_WU_RAN_SHUI_BUCKET = REGISTRY.register("he_wu_ran_shui_bucket", () -> new HeWuRanShuiItem());
	public static final RegistryObject<Item> STEM_WORKBENCH = block(OhnetstemsModBlocks.STEM_WORKBENCH);
	public static final RegistryObject<Item> CYBER_ILLITERATE = REGISTRY.register("cyber_illiterate", () -> new CyberIlliterateItem());

	// Start of user code block custom items
	// End of user code block custom items
	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
