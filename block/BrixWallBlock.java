
package net.mcreator.diggysbruhcraft.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.WallBlock;
import net.minecraft.world.level.block.SoundType;

public class BrixWallBlock extends WallBlock {
	public BrixWallBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.STONE).strength(2f, 20f).requiresCorrectToolForDrops().forceSolidOn());
	}
}
