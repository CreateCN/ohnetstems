
package io.github.createcn.ohnetstems.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class NetStemGemItem extends Item {
	public NetStemGemItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
