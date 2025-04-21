
package net.mcreator.diggysbruhcraft.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.SlabBlock;

public class BrixSlabBlock extends SlabBlock {
	public BrixSlabBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.STONE).strength(2f, 20f).requiresCorrectToolForDrops());
	}
}
