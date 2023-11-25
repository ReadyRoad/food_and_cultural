
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package eu.anball.foodandcultural.init;

import net.minecraft.world.level.block.Block;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;

import eu.anball.foodandcultural.block.SombreroBlock;
import eu.anball.foodandcultural.FoodAndCulturalMod;

public class FoodAndCulturalModBlocks {
	public static Block SOMBRERO;

	public static void load() {
		SOMBRERO = Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(FoodAndCulturalMod.MODID, "sombrero"), new SombreroBlock());
	}

	public static void clientLoad() {
		SombreroBlock.clientInit();
	}
}
