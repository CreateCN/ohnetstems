
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package io.github.createcn.ohnetstems.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import io.github.createcn.ohnetstems.OhnetstemsMod;

public class OhnetstemsModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, OhnetstemsMod.MODID);
	public static final RegistryObject<CreativeModeTab> OH_NET_STEMS = REGISTRY.register("oh_net_stems",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.ohnetstems.oh_net_stems")).icon(() -> new ItemStack(OhnetstemsModItems.HUA_JI.get())).displayItems((parameters, tabData) -> {
				tabData.accept(OhnetstemsModItems.HUA_JI.get());
				tabData.accept(OhnetstemsModItems.NET_STEM_GEM.get());
				tabData.accept(OhnetstemsModBlocks.NET_STEM_ORE.get().asItem());
				tabData.accept(OhnetstemsModBlocks.HUA_JI_LOG.get().asItem());
				tabData.accept(OhnetstemsModBlocks.HUA_JI_SAPLING.get().asItem());
				tabData.accept(OhnetstemsModBlocks.HUA_JI_LEVEL.get().asItem());
				tabData.accept(OhnetstemsModItems.ZI_MIN_SPAWN_EGG.get());
				tabData.accept(OhnetstemsModItems.SHI_LI.get());
				tabData.accept(OhnetstemsModItems.EMERALD_PICKAXE.get());
				tabData.accept(OhnetstemsModItems.SHEN_GAO.get());
				tabData.accept(OhnetstemsModItems.KAO_MIAN_JIN.get());
				tabData.accept(OhnetstemsModItems.XUE_WANG_SPAWN_EGG.get());
			})

					.build());
}
