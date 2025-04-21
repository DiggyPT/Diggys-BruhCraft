
package net.mcreator.diggysbruhcraft.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.InteractionResult;
import net.minecraft.network.chat.Component;

import net.mcreator.diggysbruhcraft.procedures.HNGSpawnerDollyRightclickedOnBlockProcedure;

import java.util.List;

public class HNGSpawnerDollyItem extends Item {
	public HNGSpawnerDollyItem() {
		super(new Item.Properties().durability(12).rarity(Rarity.COMMON));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level level, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, level, list, flag);
		list.add(Component.translatable("item.diggys_bruhcraft.hng_spawner_dolly.description_0"));
	}

	@Override
	public InteractionResult useOn(UseOnContext context) {
		super.useOn(context);
		HNGSpawnerDollyRightclickedOnBlockProcedure.execute(context.getLevel(), context.getClickedPos().getX(), context.getClickedPos().getY(), context.getClickedPos().getZ(), context.getLevel().getBlockState(context.getClickedPos()),
				context.getItemInHand());
		return InteractionResult.SUCCESS;
	}
}
