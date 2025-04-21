
package net.mcreator.diggysbruhcraft.block;

import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.TrapDoorBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.core.BlockPos;

public class NutteTrapdoorBlock extends TrapDoorBlock {
	public NutteTrapdoorBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.WOOD).strength(2f, 20f), BlockSetType.STONE);
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 0;
	}
}
