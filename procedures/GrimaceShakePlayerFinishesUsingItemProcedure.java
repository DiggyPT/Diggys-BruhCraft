package net.mcreator.diggysbruhcraft.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.diggysbruhcraft.init.DiggysBruhcraftModMobEffects;

public class GrimaceShakePlayerFinishesUsingItemProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
			_entity.addEffect(new MobEffectInstance(DiggysBruhcraftModMobEffects.GRIMACE.get(), 3600, 1));
	}
}
