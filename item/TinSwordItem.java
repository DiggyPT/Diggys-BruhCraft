
package net.mcreator.diggysbruhcraft.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.diggysbruhcraft.init.DiggysBruhcraftModItems;

public class TinSwordItem extends SwordItem {
	public TinSwordItem() {
		super(new Tier() {
			public int getUses() {
				return 189;
			}

			public float getSpeed() {
				return 54f;
			}

			public float getAttackDamageBonus() {
				return 1f;
			}

			public int getLevel() {
				return 1;
			}

			public int getEnchantmentValue() {
				return 2;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(DiggysBruhcraftModItems.TIN_INGOT.get()));
			}
		}, 3, -3f, new Item.Properties());
	}
}
