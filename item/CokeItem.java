
package net.mcreator.diggysbruhcraft.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class CokeItem extends Item {
	public CokeItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
