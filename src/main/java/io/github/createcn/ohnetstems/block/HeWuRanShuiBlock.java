
package io.github.createcn.ohnetstems.block;

import net.minecraft.world.level.material.PushReaction;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

import io.github.createcn.ohnetstems.procedures.HeWuRanShuiShengWuWanJiaPengZhuangGaiFangKuaiShiProcedure;
import io.github.createcn.ohnetstems.init.OhnetstemsModFluids;

public class HeWuRanShuiBlock extends LiquidBlock {
	public HeWuRanShuiBlock() {
		super(() -> OhnetstemsModFluids.HE_WU_RAN_SHUI.get(), BlockBehaviour.Properties.of().mapColor(MapColor.WATER).strength(100f).hasPostProcess((bs, br, bp) -> true).emissiveRendering((bs, br, bp) -> true).noCollission().noLootTable().liquid()
				.pushReaction(PushReaction.DESTROY).sound(SoundType.EMPTY).replaceable());
	}

	@Override
	public void entityInside(BlockState blockstate, Level world, BlockPos pos, Entity entity) {
		super.entityInside(blockstate, world, pos, entity);
		HeWuRanShuiShengWuWanJiaPengZhuangGaiFangKuaiShiProcedure.execute(entity);
	}
}
