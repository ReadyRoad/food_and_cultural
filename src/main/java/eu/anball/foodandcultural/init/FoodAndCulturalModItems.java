/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package eu.anball.foodandcultural.init;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;

import eu.anball.foodandcultural.item.CornItem;
import eu.anball.foodandcultural.FoodAndCulturalMod;

public class FoodAndCulturalModItems {
	public static Item CORN;
	public static Item SOMBRERO;

	public static void load() {
		CORN = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(FoodAndCulturalMod.MODID, "corn"), new CornItem());
		SOMBRERO = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(FoodAndCulturalMod.MODID, "sombrero"), new BlockItem(FoodAndCulturalModBlocks.SOMBRERO, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(FoodAndCulturalModTabs.TAB_CULTURAL).register(content -> content.accept(SOMBRERO));
	}

	public static void clientLoad() {
	}
}
