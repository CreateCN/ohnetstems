
package io.github.createcn.ohnetstems.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BucketItem;

import io.github.createcn.ohnetstems.init.OhnetstemsModFluids;

public class HeWuRanShuiItem extends BucketItem {
	public HeWuRanShuiItem() {
		super(OhnetstemsModFluids.HE_WU_RAN_SHUI, new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1).rarity(Rarity.COMMON));
	}
}
