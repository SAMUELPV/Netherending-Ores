package org.icannt.netherendingores.common.registry;

import org.icannt.netherendingores.lib.Info;
import org.icannt.netherendingores.lib.StringUtil;

import com.google.common.base.CaseFormat;

import net.minecraft.block.Block;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.IStringSerializable;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.oredict.OreDictionary;

/**
 * Created by ICannt on 08/04/18.
 */
public enum BlockRecipeData implements IStringSerializable {

	
    NETHER_COAL_ORE ("nether_coal_ore", "ore_nether_vanilla", 0, new String[0], "coal", true, 2, 0),
    NETHER_DIAMOND_ORE ("nether_diamond_ore", "ore_nether_vanilla", 1, new String[0], "gem", true, 2, 0),
    NETHER_EMERALD_ORE ("nether_emerald_ore", "ore_nether_vanilla", 2, new String[0], "gem", true, 2, 0),
    NETHER_GOLD_ORE ("nether_gold_ore", "ore_nether_vanilla", 3, new String[0], "", true, 2, 0),
    NETHER_IRON_ORE ("nether_iron_ore", "ore_nether_vanilla", 4, new String[0], "", true, 2, 0),
    NETHER_LAPIS_ORE ("nether_lapis_ore", "ore_nether_vanilla", 5, new String[0], "gem", true, 2, 0),
    NETHER_REDSTONE_ORE ("nether_redstone_ore", "ore_nether_vanilla", 6, new String[0], "dust", true, 2, 0),
    END_COAL_ORE ("end_coal_ore", "ore_end_vanilla", 0, new String[0], "coal", true, 2, 0),
    END_DIAMOND_ORE ("end_diamond_ore", "ore_end_vanilla", 1, new String[0], "gem", true, 2, 0),
    END_EMERALD_ORE ("end_emerald_ore", "ore_end_vanilla", 2, new String[0], "gem", true, 2, 0),
    END_GOLD_ORE ("end_gold_ore", "ore_end_vanilla", 3, new String[0], "", true, 2, 0),
    END_IRON_ORE ("end_iron_ore", "ore_end_vanilla", 4, new String[0], "", true, 2, 0),
    END_LAPIS_ORE ("end_lapis_ore", "ore_end_vanilla", 5, new String[0], "gem", true, 2, 0),
    END_REDSTONE_ORE ("end_redstone_ore", "ore_end_vanilla", 6, new String[0], "dust", true, 2, 0),
    NETHER_ALUMINUM_ORE ("nether_aluminum_ore", "ore_nether_modded_1", 0, new String[]{"aluminium"}, "", true, 2, 0),
    NETHER_COPPER_ORE ("nether_copper_ore", "ore_nether_modded_1", 1, new String[0], "", true, 2, 0),
    NETHER_IRIDIUM_ORE ("nether_iridium_ore", "ore_nether_modded_1", 2, new String[0], "", true, 2, 0),
    NETHER_LEAD_ORE ("nether_lead_ore", "ore_nether_modded_1", 3, new String[0], "", true, 2, 0),
    NETHER_MITHRIL_ORE ("nether_mithril_ore", "ore_nether_modded_1", 4, new String[0], "", true, 2, 0),
    NETHER_NICKEL_ORE ("nether_nickel_ore", "ore_nether_modded_1", 5, new String[0], "", true, 2, 0),
    NETHER_PLATINUM_ORE ("nether_platinum_ore", "ore_nether_modded_1", 6, new String[0], "", true, 2, 0),
    NETHER_SILVER_ORE ("nether_silver_ore", "ore_nether_modded_1", 7, new String[0], "", true, 2, 0),
    NETHER_TIN_ORE ("nether_tin_ore", "ore_nether_modded_1", 8, new String[0], "", true, 2, 0),
    NETHER_CERTUS_QUARTZ_ORE ("nether_certus_quartz_ore", "ore_nether_modded_1", 9, new String[0], "dustCertusQuartz", false, 2, 0),
    NETHER_CHARGED_CERTUS_QUARTZ_ORE ("nether_charged_certus_quartz_ore", "ore_nether_modded_1", 10, new String[0], "dustCertusQuartz", false, 2, 0),
    NETHER_OSMIUM_ORE ("nether_osmium_ore", "ore_nether_modded_1", 11, new String[0], "", true, 2, 0),
    NETHER_URANIUM_ORE ("nether_uranium_ore", "ore_nether_modded_1", 12, new String[0], "", false, 2, 0),
    NETHER_YELLORITE_ORE ("nether_yellorite_ore", "ore_nether_modded_1", 13, new String[]{"yellorium"}, "", true, 2, 0),
    NETHER_DILITHIUM_ORE ("nether_dilithium_ore", "ore_nether_modded_1", 14, new String[0], "gem", false, 2, 0),
    NETHER_TRITANIUM_ORE ("nether_tritanium_ore", "ore_nether_modded_1", 15, new String[0], "", true, 2, 0),
    END_ALUMINUM_ORE ("end_aluminum_ore", "ore_end_modded_1", 0, new String[]{"aluminium"}, "", true, 2, 0),
    END_COPPER_ORE ("end_copper_ore", "ore_end_modded_1", 1, new String[0], "", true, 2, 0),
    END_IRIDIUM_ORE ("end_iridium_ore", "ore_end_modded_1", 2, new String[0], "", true, 2, 0),
    END_LEAD_ORE ("end_lead_ore", "ore_end_modded_1", 3, new String[0], "", true, 2, 0),
    END_MITHRIL_ORE ("end_mithril_ore", "ore_end_modded_1", 4, new String[0], "", true, 2, 0),
    END_NICKEL_ORE ("end_nickel_ore", "ore_end_modded_1", 5, new String[0], "", true, 2, 0),
    END_PLATINUM_ORE ("end_platinum_ore", "ore_end_modded_1", 6, new String[0], "", true, 2, 0),
    END_SILVER_ORE ("end_silver_ore", "ore_end_modded_1", 7, new String[0], "", true, 2, 0),
    END_TIN_ORE ("end_tin_ore", "ore_end_modded_1", 8, new String[0], "", true, 2, 0),
    END_CERTUS_QUARTZ_ORE ("end_certus_quartz_ore", "ore_end_modded_1", 9, new String[0], "dustCertusQuartz", false, 2, 0),
    END_CHARGED_CERTUS_QUARTZ_ORE ("end_charged_certus_quartz_ore", "ore_end_modded_1", 10, new String[0], "dustCertusQuartz", false, 2, 0),
    END_OSMIUM_ORE ("end_osmium_ore", "ore_end_modded_1", 11, new String[0], "", true, 2, 0),
    END_URANIUM_ORE ("end_uranium_ore", "ore_end_modded_1", 12, new String[0], "", false, 2, 0),
    END_YELLORITE_ORE ("end_yellorite_ore", "ore_end_modded_1", 13, new String[]{"yellorium"}, "", true, 2, 0),
    END_DILITHIUM_ORE ("end_dilithium_ore", "ore_end_modded_1", 14, new String[0], "gem", false, 2, 0),
    END_TRITANIUM_ORE ("end_tritanium_ore", "ore_end_modded_1", 15, new String[0], "", true, 2, 0),
    OVERWORLD_QUARTZ_ORE ("overworld_quartz_ore", "ore_other_1", 0, new String[0], "gem", true, 1, 0),
    END_QUARTZ_ORE ("end_quartz_ore", "ore_other_1", 1, new String[0], "gem", true, 1, 0),
    OVERWORLD_ARDITE_ORE ("overworld_ardite_ore", "ore_other_1", 2, new String[0], "", true, 1, 0),
    END_ARDITE_ORE ("end_ardite_ore", "ore_other_1", 3, new String[0], "", true, 1, 0),
    OVERWORLD_COBALT_ORE ("overworld_cobalt_ore", "ore_other_1", 4, new String[0], "", true, 1, 0),
    END_COBALT_ORE ("end_cobalt_ore", "ore_other_1", 5, new String[0], "", true, 1, 0);


    private String name;
    private String blockName;
    private int blockMeta;
    private String[] itemAltOreDictSuffix;
    private String itemOreDictPrefix;
    private boolean furnaceItemEnabled;
    private int defaultRecipeMultiplier;
    private int recipeMultiplier;
	
    
	BlockRecipeData(String name, String blockName, int blockMeta, String[] itemAltOreDictSuffix, String itemOreDictPrefix, boolean furnaceItemEnabled, int defaultRecipeMultiplier, int recipeMultiplier) {
		this.name = name;
		this.blockName = blockName;
		this.blockMeta = blockMeta;
		this.itemAltOreDictSuffix = itemAltOreDictSuffix;
		this.itemOreDictPrefix = itemOreDictPrefix;
		this.furnaceItemEnabled = furnaceItemEnabled;
		this.defaultRecipeMultiplier = defaultRecipeMultiplier;
		this.recipeMultiplier = recipeMultiplier;
	}
	
	//
    @Override
    public String getName() {
        return name;
    }

    //
	public String[] getItemAltOreDictSuffix() {
		return itemAltOreDictSuffix;
	}
	
	//
    public int getDefaultRecipeMultiplier() {
        return defaultRecipeMultiplier;
    }
    
    //
    public int getRecipeMultiplier() {
    	return recipeMultiplier;
    }

    //
    public void setRecipeMultiplier(int multiplier) {
    	this.recipeMultiplier = multiplier;
    }
    
    
    /****************************\
    *  Vanilla Crafting Helpers  *
    \****************************/

    //
    public int getFurnaceAmount() {
    	return recipeMultiplier;
    }
    
    //
	public boolean isFurnaceItemEnabled() {
    	return furnaceItemEnabled;
    }
	
    //
    public Ingredient[] getConversionIngredient() {
		return new Ingredient[]{Ingredient.fromStacks(getModBlockItemStack())};
    }
    
    //
    public ResourceLocation getConversionResourceLocation(String material) {
		return new ResourceLocation(Info.MOD_ID + ":" + name + "_to_" + StringUtil.lowerUnder(getOreDictOtherModBlockName(material)));
    }
    
    
    /***************************\
    *  Block/Item Name Helpers  *
    \***************************/
    
    
    //
    public String getBlockName() {
    	String meta = blockMeta > 0 ? ":" + blockMeta : ""; 
    	return Info.MOD_ID + ":" + blockName + meta;
    }
    
    //
    public String getAltMaterialName(String material) {
    	return name.replace(getRawOreName(name), material);
    }
	
	// 
	private String getOreDictOutputName(String type) {
		return getOreDictOutputName(recipeMultiplier, type, "name");
	}
	
	// 
	public String getOreDictOutputName(String type, String material) {
		return getOreDictOutputName(recipeMultiplier, type, material);
	}
		
	// 
	private String getOreDictOutputName(int multiplier, String type, String material) {
		material = material == "name" ? name : material;
		switch (type) {
			case "smelt":
				if (multiplier == 1) {
					return getOreDictSmeltItemName(itemOreDictPrefix, material);
				}
				break;
			case "crush":
				if (multiplier == 1 || multiplier == 2) {
					return getOreDictCrushItemName(itemOreDictPrefix, material);
				}
		}
		return getOreDictOtherModBlockName(material);
	}
    
    /**
     * Returns an Ore Dictionary name based on the defined recipe 
     * multiplier from the config file. Some mods such as
     * Tinkers' Construct use the "oreNether" and other prefixes
     * prefixes to add additional recipes for 2x/3x output.
     *
     * @return The reassembled mod ore block name
     */
    public String getOreDictRegName() {
    	return getOreDictPrefixedName(recipeMultiplier);
    }
    
    //
    public String getOreDictOtherModBlockName(String material) {
        return getOreDictPrefixedName(1, material);
    }
    
    //
    public String getOreDictCustomRegName(String material) {
    	material = name.replace(getRawOreName(name), material);    	
    	return getOreDictPrefixedName(recipeMultiplier, material);
    }
    
    //
    private String getOreDictPrefixedName(int multiplier) {
    	return getOreDictPrefixedName(multiplier, name);
    }
    
    /**
     * The method that returns the correct OreDict prefix for Netherending Ores.
     * 
     * @param       multiplier The Recipe Multiplier
     * @return      The prefixed OreDict name for Netherending Ores
     */
    private String getOreDictPrefixedName(int multiplier, String material) {
    	String prefix = "";
		switch (multiplier) {
			case 0: prefix = "neo"; break;
			case 1:	prefix = "ore"; material = getRawOreName(material); break;
			case 2:	prefix = "ore"; break;
			case 3: prefix = "oreDense";
		}
		return prefix + StringUtil.upperCamel(material.replace("_ore", ""));
    }
	
    /**
     * Determines which item prefix to use for smelting
     * then adds the ore name to it, blank input equates to "ingot".
     * Anything else other than "dust", "gem" or "crystal" means use the whole
     * string as the ore name.
     *
     * @param       prefix The prefix or full name from the block data table
     * @param       material The ore material that is being dealt with
     * @return      The reassembled other mod item name (often a dust)
     */
    private static String getOreDictSmeltItemName(String prefix, String material) {
    	String ore = CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.UPPER_CAMEL, getRawOreName(material));
    	switch (prefix) {
			case "": prefix = "ingot"; break;
			case "dust": case "gem": case "crystal": break;
			default: ore = "";
    	}
    	return prefix + ore;    	
    }
    
    /**
     * Determines which item prefix to use for grinding machines
     * then adds the ore name to it, blank input equates to "dust".
     * Anything else other than "gem" or "crystal" means use the whole
     * string as the ore name.
     *
     * @param       prefix The prefix or full name from the block data table
     * @param       material The ore material that is being dealt with
     * @return      The reassembled other mod item name (often a dust)
     */
    private static String getOreDictCrushItemName(String prefix, String material) {    	   	
    	String ore = CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.UPPER_CAMEL, getRawOreName(material));
    	switch (prefix) {
			case "": case "dust": prefix = "dust"; break;
			case "gem": case "crystal": break;
			default: ore = "";
    	}
    	return prefix + ore;    	
    }

    //
    public String getOreDictCustomItemName(String prefix, String material) {
    	return prefix + StringUtil.upperCamel(getRawOreName(material));
    }
    
    /**
     * If called within context, it just passes the ore name
     * to the static version to strip the name.
     * 
     * @return      The stripped raw ore name
     */
    public String getRawOreName() {    	
    	return getRawOreName(name);
    }
    
    /**
     * Strips extensions and prefixes from ore enum names
     * 
     * @param       ore The string name to be stripped
     * @return      The base ore name
     */
    private static String getRawOreName(String ore) {
    	String[] words = {"_ore","overworld_","nether_","end_"};    	
    	for(String word : words) {
    		ore = ore.replace(word, "");
    	}
    	return ore;
    }

    
    /*********************\
    *  ItemStack Helpers  *
    \*********************/
    
    
    /**
     * Returns an ItemStack of the requested mod block.
     * 
     * @return      Mod Block ItemStack
     */
    public ItemStack getModBlockItemStack() {
    	return new ItemStack(Block.getBlockFromName(Info.MOD_ID + ":" + blockName), 1, blockMeta);
    }  
	
	/**
	 * 
	 * @param amount
	 * @return
	 */
	public ItemStack getOreDictSmeltItemStack(int amount) {
		return getOreDictOutputItemStack("smelt", amount);
	}
	
	/**
	 * 
	 * @param prefix
	 * @param material
	 * @param amount
	 * @return
	 */
	public ItemStack getOreDictCustomItemStack(String prefix, String material, int amount) {
		String oredictName = getOreDictCustomItemName(prefix, material);
		return getOreDictItemStack(oredictName, amount);
	}

	/**
	 * 
	 * @param type
	 * @param amount
	 * @return
	 */
	private ItemStack getOreDictOutputItemStack(String type, int amount) {
		String oredictName = getOreDictOutputName(type);
		return getOreDictItemStack(oredictName, amount);
	}
	
	/**
	 * 
	 * @param type
	 * @param material
	 * @param amount
	 * @return
	 */
	public ItemStack getOreDictOutputItemStack(String type, String material, int amount) {
		String oredictName = getOreDictOutputName(type, material);
		return getOreDictItemStack(oredictName, amount);
	}
	
	/**
	 * 
	 * @param oredictName
	 * @param amount
	 * @return
	 */
	public ItemStack getOtherModBlockItemStack(String material) {
		for (ItemStack stack : OreDictionary.getOres(getOreDictOtherModBlockName(material), false))
		{
			if (!stack.getItem().getRegistryName().getResourceDomain().equals("netherendingores")) {
				return stack;
			}
		}
		return new ItemStack(Items.AIR);
	}
	
	/**
	 * 
	 * @param oredictName
	 * @param amount
	 * @return
	 */
	public ItemStack getOreDictItemStack(String oredictName, int amount) {
		Item itemIn = OreDictionary.getOres(oredictName, false).get(0).getItem();
		int meta = OreDictionary.getOres(oredictName, false).get(0).getMetadata();
		return new ItemStack(itemIn, amount, meta);
	}
	
}
