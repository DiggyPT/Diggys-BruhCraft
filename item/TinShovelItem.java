
package net.mcreator.diggysbruhcraft.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ShovelItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.diggysbruhcraft.init.DiggysBruhcraftModItems;

public class TinShovelItem extends ShovelItem {
	public TinShovelItem() {
		super(new Tier() {
			public int getUses() {
				return 189;
			}

			public float getSpeed() {
				return 54f;
			}

			public float getAttackDamageBonus() {
				return 2f;
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
		}, 1, -3f, new Item.Properties());
	}
}
