
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package io.github.createcn.ohnetstems.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import io.github.createcn.ohnetstems.entity.ZiMinEntity;
import io.github.createcn.ohnetstems.entity.XueWangEntityProjectile;
import io.github.createcn.ohnetstems.entity.XueWangEntity;
import io.github.createcn.ohnetstems.OhnetstemsMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class OhnetstemsModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, OhnetstemsMod.MODID);
	public static final RegistryObject<EntityType<ZiMinEntity>> ZI_MIN = register("zi_min",
			EntityType.Builder.<ZiMinEntity>of(ZiMinEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(ZiMinEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<XueWangEntity>> XUE_WANG = register("xue_wang",
			EntityType.Builder.<XueWangEntity>of(XueWangEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(XueWangEntity::new)

					.sized(1f, 1f));
	public static final RegistryObject<EntityType<XueWangEntityProjectile>> XUE_WANG_PROJECTILE = register("projectile_xue_wang", EntityType.Builder.<XueWangEntityProjectile>of(XueWangEntityProjectile::new, MobCategory.MISC)
			.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).setCustomClientFactory(XueWangEntityProjectile::new).sized(0.5f, 0.5f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			ZiMinEntity.init();
			XueWangEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(ZI_MIN.get(), ZiMinEntity.createAttributes().build());
		event.put(XUE_WANG.get(), XueWangEntity.createAttributes().build());
	}
}
