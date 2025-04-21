package net.mcreator.diggysbruhcraft.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

public class GrimaceOnEffectActiveTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		world.setBlock(BlockPos.containing(x, y - 1, z), Blocks.PURPLE_GLAZED_TERRACOTTA.defaultBlockState(), 3);
		world.setBlock(BlockPos.containing(x, y + 2, z), Blocks.PURPLE_GLAZED_TERRACOTTA.defaultBlockState(), 3);
	}
}
