
package io.github.createcn.ohnetstems.potion;

import net.minecraft.world.entity.ai.attributes.AttributeMap;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import io.github.createcn.ohnetstems.procedures.HeWuRanXiaoGuoChiXuShiMeiKeFaShengProcedure;
import io.github.createcn.ohnetstems.procedures.HeWuRanXiaoGuoChiXuShiMeiKeFaProcedure;

public class HeWuRanMobEffect extends MobEffect {
	public HeWuRanMobEffect() {
		super(MobEffectCategory.HARMFUL, -6684775);
	}

	@Override
	public void addAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		HeWuRanXiaoGuoChiXuShiMeiKeFaShengProcedure.execute(entity);
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		HeWuRanXiaoGuoChiXuShiMeiKeFaProcedure.execute(entity.level(), entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
