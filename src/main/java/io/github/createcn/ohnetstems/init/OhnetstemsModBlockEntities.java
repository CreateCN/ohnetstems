
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package io.github.createcn.ohnetstems.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

import io.github.createcn.ohnetstems.block.entity.StemWorkbenchBlockEntity;
import io.github.createcn.ohnetstems.OhnetstemsMod;

public class OhnetstemsModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, OhnetstemsMod.MODID);
	public static final RegistryObject<BlockEntityType<?>> STEM_WORKBENCH = register("stem_workbench", OhnetstemsModBlocks.STEM_WORKBENCH, StemWorkbenchBlockEntity::new);

	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block, BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}
