package net.mcreator.diggysbruhcraft.procedures;

import net.minecraft.world.entity.Entity;

public class DeathEelPlaybackConditionProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		return entity.isInWater();
	}
}
