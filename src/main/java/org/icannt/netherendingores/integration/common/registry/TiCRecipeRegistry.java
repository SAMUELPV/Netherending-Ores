package org.icannt.netherendingores.integration.common.registry;

import org.icannt.netherendingores.common.registry.BlockRecipeData;
import org.icannt.netherendingores.common.registry.RecipeHelper;
import org.icannt.netherendingores.integration.common.registry.data.TiCRecipeData;
import org.icannt.netherendingores.lib.Log;

import net.minecraftforge.fluids.FluidRegistry;

/**
 * Created by ICannt on 02/04/18.
 */
public class TiCRecipeRegistry {
	
	/**
	 * Register TInkers' construct recipes
	 */
	public static void registerRecipes() {

		Log.debug("Registering Tinkers' Construct Recipes");

		for (BlockRecipeData blockData : BlockRecipeData.values()) {
			// Add smelt recipe if: The recipe millibuckets is greater than 0 and if the target fluid exists.
			if (TiCRecipeData.getMilliBuckets(blockData) > 0 && FluidRegistry.isFluidRegistered(blockData.getRawOreName())) {
    			RecipeHelper.tryRecipe(blockData, "smeltery", false);
			}
		}
		
		Log.info("Registered Tinkers' Construct Recipes");	
		
	}
	
}
