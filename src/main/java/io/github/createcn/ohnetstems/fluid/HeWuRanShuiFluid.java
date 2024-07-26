
package io.github.createcn.ohnetstems.fluid;

import net.minecraftforge.fluids.ForgeFlowingFluid;

import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.LiquidBlock;

import io.github.createcn.ohnetstems.init.OhnetstemsModItems;
import io.github.createcn.ohnetstems.init.OhnetstemsModFluids;
import io.github.createcn.ohnetstems.init.OhnetstemsModFluidTypes;
import io.github.createcn.ohnetstems.init.OhnetstemsModBlocks;

public abstract class HeWuRanShuiFluid extends ForgeFlowingFluid {
	public static final ForgeFlowingFluid.Properties PROPERTIES = new ForgeFlowingFluid.Properties(() -> OhnetstemsModFluidTypes.HE_WU_RAN_SHUI_TYPE.get(), () -> OhnetstemsModFluids.HE_WU_RAN_SHUI.get(),
			() -> OhnetstemsModFluids.FLOWING_HE_WU_RAN_SHUI.get()).explosionResistance(100f).bucket(() -> OhnetstemsModItems.HE_WU_RAN_SHUI_BUCKET.get()).block(() -> (LiquidBlock) OhnetstemsModBlocks.HE_WU_RAN_SHUI.get());

	private HeWuRanShuiFluid() {
		super(PROPERTIES);
	}

	public static class Source extends HeWuRanShuiFluid {
		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends HeWuRanShuiFluid {
		protected void createFluidStateDefinition(StateDefinition.Builder<Fluid, FluidState> builder) {
			super.createFluidStateDefinition(builder);
			builder.add(LEVEL);
		}

		public int getAmount(FluidState state) {
			return state.getValue(LEVEL);
		}

		public boolean isSource(FluidState state) {
			return false;
		}
	}
}
