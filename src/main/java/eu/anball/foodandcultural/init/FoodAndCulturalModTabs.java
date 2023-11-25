
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package eu.anball.foodandcultural.init;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;

import eu.anball.foodandcultural.FoodAndCulturalMod;

public class FoodAndCulturalModTabs {
	public static ResourceKey<CreativeModeTab> TAB_FOOD = ResourceKey.create(Registries.CREATIVE_MODE_TAB, new ResourceLocation(FoodAndCulturalMod.MODID, "food"));
	public static ResourceKey<CreativeModeTab> TAB_CULTURAL = ResourceKey.create(Registries.CREATIVE_MODE_TAB, new ResourceLocation(FoodAndCulturalMod.MODID, "cultural"));

	public static void load() {
		Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, TAB_FOOD, FabricItemGroup.builder().title(Component.translatable("item_group." + FoodAndCulturalMod.MODID + ".food")).icon(() -> new ItemStack(FoodAndCulturalModItems.CORN)).build());
		Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, TAB_CULTURAL,
				FabricItemGroup.builder().title(Component.translatable("item_group." + FoodAndCulturalMod.MODID + ".cultural")).icon(() -> new ItemStack(FoodAndCulturalModBlocks.SOMBRERO)).build());
	}
}
