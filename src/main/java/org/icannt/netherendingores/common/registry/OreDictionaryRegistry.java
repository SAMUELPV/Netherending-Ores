package org.icannt.netherendingores.common.registry;

import org.icannt.netherendingores.NetherendingOres;
import org.icannt.netherendingores.lib.Util;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;

/**
 * Created by ICannt on 03/09/17.
 */

@GameRegistry.ObjectHolder(NetherendingOres.MOD_ID)
public class OreDictionaryRegistry {
 
	public static void registerDictionaryOres() {
		
    	Util.LOG.info("Registering Ore Dictionary Entries");
    	
		// Registration of Vanilla items that are not registered :(, purely a guess at what other mods might use
    	if (OreDictionary.doesOreNameExist("coal") == false) {
    		OreDictionary.registerOre("coal", new ItemStack(Items.COAL));
    	}
    	
    	// Registration of Mod items that are not registered, follows usual conventions
    	// TODO: This fails miserably, needs fixing
    	/*
    	if (Loader.isModLoaded("appliedenergistics2")) {
	    	if (OreDictionary.doesOreNameExist("crystalChargedCertusQuartz") == false) {
	    		OreDictionary.registerOre("crystalChargedCertusQuartz", new ItemStack(Item.getByNameOrId("appliedenergistics2:material:1")));
	    	}
    	}
    	*/
    	
    	for (BlockRecipeData blockData : BlockRecipeData.values()) {
        	if (blockData.getRecipeMultiplier() > 0) {
        		OreDictionary.registerOre(blockData.getOreDictName(), new ItemStack(blockData.getBlock(), 1, blockData.getBlockMeta()));
        	}    		
    	}
		
    	Util.LOG.info("Registered Ore Dictionary Entries");
		
	}

}
