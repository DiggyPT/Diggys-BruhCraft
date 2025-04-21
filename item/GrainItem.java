
package net.mcreator.diggysbruhcraft.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class GrainItem extends Item {
	public GrainItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
