
package net.mcreator.diggysbruhcraft.item;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.LivingEntity;

import net.mcreator.diggysbruhcraft.procedures.PicaretaDeEncantoLivingEntityIsHitWithToolProcedure;
import net.mcreator.diggysbruhcraft.init.DiggysBruhcraftModItems;

public class PicaretaDeEncantoItem extends PickaxeItem {
	public PicaretaDeEncantoItem() {
		super(new Tier() {
			public int getUses() {
				return 1000;
			}

			public float getSpeed() {
				return 10f;
			}

			public float getAttackDamageBonus() {
				return 2f;
			}

			public int getLevel() {
				return 4;
			}

			public int getEnchantmentValue() {
				return 2;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(DiggysBruhcraftModItems.TIN_INGOT.get()), new ItemStack(Blocks.DIAMOND_BLOCK));
			}
		}, 1, -3f, new Item.Properties());
	}

	@Override
	public boolean hurtEnemy(ItemStack itemstack, LivingEntity entity, LivingEntity sourceentity) {
		boolean retval = super.hurtEnemy(itemstack, entity, sourceentity);
		PicaretaDeEncantoLivingEntityIsHitWithToolProcedure.execute(entity);
		return retval;
	}
}
