
package io.github.createcn.ohnetstems.item;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;

public class KaoMianJingItem extends RecordItem {
	public KaoMianJingItem() {
		super(0, () -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ohnetstems:ohnetstems.kaomianjing")), new Item.Properties().stacksTo(1).rarity(Rarity.EPIC), 860);
	}
}
