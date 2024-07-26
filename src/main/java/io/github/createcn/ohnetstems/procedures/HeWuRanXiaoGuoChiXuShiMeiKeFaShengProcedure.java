package io.github.createcn.ohnetstems.procedures;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

import io.github.createcn.ohnetstems.network.OhnetstemsModVariables;

public class HeWuRanXiaoGuoChiXuShiMeiKeFaShengProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if ((entity.getCapability(OhnetstemsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new OhnetstemsModVariables.PlayerVariables())).hewuran == false) {
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) <= 4) {
				if (entity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal((entity.getDisplayName().getString() + "" + Component.translatable("ohnetstems.hewuran2.translation").getString())), false);
			} else {
				if (entity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal((entity.getDisplayName().getString() + "" + Component.translatable("ohnetstems.hewuran1.translation").getString())), false);
			}
			{
				boolean _setval = true;
				entity.getCapability(OhnetstemsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.hewuran = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
	}
}
