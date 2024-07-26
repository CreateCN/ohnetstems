package io.github.createcn.ohnetstems.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;

import io.github.createcn.ohnetstems.init.OhnetstemsModMobEffects;

public class HeWuRanShuiShengWuWanJiaPengZhuangGaiFangKuaiShiProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof LivingEntity _livEnt0 && _livEnt0.hasEffect(OhnetstemsModMobEffects.HE_WU_RAN.get())) == false) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(OhnetstemsModMobEffects.HE_WU_RAN.get(), 1200, 0));
		} else if ((entity instanceof LivingEntity _livEnt2 && _livEnt2.hasEffect(OhnetstemsModMobEffects.HE_WU_RAN.get())) == true) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(OhnetstemsModMobEffects.HE_WU_RAN.get(), 2400, 1));
		}
	}
}
