package net.mcreator.diggysbruhcraft.procedures;

import net.minecraft.world.entity.Entity;

public class GoonPearlProjectileProjectileHitsLivingEntityProcedure {
	public static void execute(Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		sourceentity.startRiding(entity);
	}
}
