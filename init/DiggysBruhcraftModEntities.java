
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.diggysbruhcraft.init;

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

import net.mcreator.diggysbruhcraft.entity.YehProjectileEntity;
import net.mcreator.diggysbruhcraft.entity.HyperNexusGuardianEntity;
import net.mcreator.diggysbruhcraft.entity.HngProjectileEntity;
import net.mcreator.diggysbruhcraft.entity.GugEntity;
import net.mcreator.diggysbruhcraft.entity.GoonPearlProjectileEntity;
import net.mcreator.diggysbruhcraft.entity.GoofyTraderEntity;
import net.mcreator.diggysbruhcraft.entity.DeathEelEntity;
import net.mcreator.diggysbruhcraft.entity.BordEntity;
import net.mcreator.diggysbruhcraft.DiggysBruhcraftMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class DiggysBruhcraftModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, DiggysBruhcraftMod.MODID);
	public static final RegistryObject<EntityType<DeathEelEntity>> DEATH_EEL = register("death_eel",
			EntityType.Builder.<DeathEelEntity>of(DeathEelEntity::new, MobCategory.WATER_CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(DeathEelEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<BordEntity>> BORD = register("bord",
			EntityType.Builder.<BordEntity>of(BordEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(BordEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<YehProjectileEntity>> YEH_PROJECTILE = register("yeh_projectile",
			EntityType.Builder.<YehProjectileEntity>of(YehProjectileEntity::new, MobCategory.MISC).setCustomClientFactory(YehProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<GoofyTraderEntity>> GOOFY_TRADER = register("goofy_trader",
			EntityType.Builder.<GoofyTraderEntity>of(GoofyTraderEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(GoofyTraderEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<HyperNexusGuardianEntity>> HYPER_NEXUS_GUARDIAN = register("hyper_nexus_guardian",
			EntityType.Builder.<HyperNexusGuardianEntity>of(HyperNexusGuardianEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(HyperNexusGuardianEntity::new)

					.sized(8f, 8f));
	public static final RegistryObject<EntityType<GoonPearlProjectileEntity>> GOON_PEARL_PROJECTILE = register("goon_pearl_projectile", EntityType.Builder.<GoonPearlProjectileEntity>of(GoonPearlProjectileEntity::new, MobCategory.MISC)
			.setCustomClientFactory(GoonPearlProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<HngProjectileEntity>> HNG_PROJECTILE = register("hng_projectile",
			EntityType.Builder.<HngProjectileEntity>of(HngProjectileEntity::new, MobCategory.MISC).setCustomClientFactory(HngProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<GugEntity>> GUG = register("gug",
			EntityType.Builder.<GugEntity>of(GugEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(GugEntity::new)

					.sized(0.6f, 1.8f));

	// Start of user code block custom entities
	// End of user code block custom entities
	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			DeathEelEntity.init();
			BordEntity.init();
			GoofyTraderEntity.init();
			HyperNexusGuardianEntity.init();
			GugEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(DEATH_EEL.get(), DeathEelEntity.createAttributes().build());
		event.put(BORD.get(), BordEntity.createAttributes().build());
		event.put(GOOFY_TRADER.get(), GoofyTraderEntity.createAttributes().build());
		event.put(HYPER_NEXUS_GUARDIAN.get(), HyperNexusGuardianEntity.createAttributes().build());
		event.put(GUG.get(), GugEntity.createAttributes().build());
	}
}
