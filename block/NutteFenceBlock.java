
package net.mcreator.diggysbruhcraft.block;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.FenceBlock;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.core.BlockPos;

public class NutteFenceBlock extends FenceBlock {
	public NutteFenceBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.WOOD).strength(2f, 20f).forceSolidOn());
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 0;
	}
}
