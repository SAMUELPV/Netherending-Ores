package org.icannt.netherendingores.integration.common.recipedata;

import org.icannt.netherendingores.NetherendingOres;
import org.icannt.netherendingores.common.registry.BlockRecipeDataRegistry;

import cofh.thermalexpansion.util.managers.machine.PulverizerManager;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IStringSerializable;
import net.minecraftforge.oredict.OreDictionary;

/**
 * Created by ICannt on 11/04/18.
 */
public enum PulvRecipe implements IStringSerializable {

    NETHER_COAL_ORE ("nether_coal_ore", 3200, 5, "netherrack", 15, 8000, 4),
    NETHER_DIAMOND_ORE ("nether_diamond_ore", 3200, 5, "netherrack", 15, 8000, 4),
    NETHER_EMERALD_ORE ("nether_emerald_ore", 3200, 5, "netherrack", 15, 8000, 4),
    NETHER_GOLD_ORE ("nether_gold_ore", 3200, 4, "netherrack", 15, 8000, 4),
    NETHER_IRON_ORE ("nether_iron_ore", 3200, 4, "netherrack", 15, 8000, 4),
    NETHER_LAPIS_ORE ("nether_lapis_ore", 3200, 24, "netherrack", 15, 8000, 4),
    NETHER_REDSTONE_ORE ("nether_redstone_ore", 3200, 21, "netherrack", 15, 8000, 4),
    END_COAL_ORE ("end_coal_ore", 3200, 5, "endstone", 15, 8000, 4),
    END_DIAMOND_ORE ("end_diamond_ore", 3200, 5, "endstone", 15, 8000, 4),
    END_EMERALD_ORE ("end_emerald_ore", 3200, 5, "endstone", 15, 8000, 4),
    END_GOLD_ORE ("end_gold_ore", 3200, 4, "endstone", 15, 8000, 4),
    END_IRON_ORE ("end_iron_ore", 3200, 4, "endstone", 15, 8000, 4),
    END_LAPIS_ORE ("end_lapis_ore", 3200, 24, "endstone", 15, 8000, 4),
    END_REDSTONE_ORE ("end_redstone_ore", 3200, 21, "endstone", 15, 8000, 4),
    NETHER_ALUMINUM_ORE ("nether_aluminum_ore", 3200, 4, "netherrack", 15, 8000, 4),
    NETHER_COPPER_ORE ("nether_copper_ore", 3200, 4, "netherrack", 15, 8000, 4),
    NETHER_IRIDIUM_ORE ("nether_iridium_ore", 3200, 4, "netherrack", 15, 8000, 4),
    NETHER_LEAD_ORE ("nether_lead_ore", 3200, 4, "netherrack", 15, 8000, 4),
    NETHER_MITHRIL_ORE ("nether_mithril_ore", 3200, 4, "netherrack", 15, 8000, 4),
    NETHER_NICKEL_ORE ("nether_nickel_ore", 3200, 4, "netherrack", 15, 8000, 4),
    NETHER_PLATINUM_ORE ("nether_platinum_ore", 3200, 4, "netherrack", 15, 8000, 4),
    NETHER_SILVER_ORE ("nether_silver_ore", 3200, 4, "netherrack", 15, 8000, 4),
    NETHER_TIN_ORE ("nether_tin_ore", 3200, 4, "netherrack", 15, 8000, 4),
    NETHER_CERTUS_QUARTZ_ORE ("nether_certus_quartz_ore", 3200, 4, "netherrack", 15, 8000, 4),
    NETHER_CHARGED_CERTUS_QUARTZ_ORE ("nether_charged_certus_quartz_ore", 3200, 4, "netherrack", 15, 8000, 4),
    NETHER_OSMIUM_ORE ("nether_osmium_ore", 6400, 4, "netherrack", 15, 16000, 4),
    NETHER_URANIUM_ORE ("nether_uranium_ore", 3200, 4, "netherrack", 15, 8000, 4),
    NETHER_YELLORITE_ORE ("nether_yellorite_ore", 3200, 4, "netherrack", 15, 8000, 4),
    END_ALUMINUM_ORE ("end_aluminum_ore", 3200, 4, "endstone", 15, 8000, 4),
    END_COPPER_ORE ("end_copper_ore", 3200, 4, "endstone", 15, 8000, 4),
    END_IRIDIUM_ORE ("end_iridium_ore", 3200, 4, "endstone", 15, 8000, 4),
    END_LEAD_ORE ("end_lead_ore", 3200, 4, "endstone", 15, 8000, 4),
    END_MITHRIL_ORE ("end_mithril_ore", 3200, 4, "endstone", 15, 8000, 4),
    END_NICKEL_ORE ("end_nickel_ore", 3200, 4, "endstone", 15, 8000, 4),
    END_PLATINUM_ORE ("end_platinum_ore", 3200, 4, "endstone", 15, 8000, 4),
    END_SILVER_ORE ("end_silver_ore", 3200, 4, "endstone", 15, 8000, 4),
    END_TIN_ORE ("end_tin_ore", 3200, 4, "endstone", 15, 8000, 4),
    END_CERTUS_QUARTZ_ORE ("end_certus_quartz_ore", 3200, 4, "endstone", 15, 8000, 4),
    END_CHARGED_CERTUS_QUARTZ_ORE ("end_charged_certus_quartz_ore", 3200, 4, "endstone", 15, 8000, 4),
    END_OSMIUM_ORE ("end_osmium_ore", 6400, 4, "endstone", 15, 16000, 4),
    END_URANIUM_ORE ("end_uranium_ore", 3200, 4, "endstone", 15, 8000, 4),
    END_YELLORITE_ORE ("end_yellorite_ore", 3200, 4, "endstone", 15, 8000, 4),
    OVERWORLD_QUARTZ_ORE ("overworld_quartz_ore", 1920, 4, "stone", 15, 4800, 4),
    END_QUARTZ_ORE ("end_quartz_ore", 1920, 4, "endstone", 15, 4800, 4),
    OVERWORLD_ARDITE_ORE ("overworld_ardite_ore", 9600, 4, "stone", 15, 24000, 4),
    END_ARDITE_ORE ("end_ardite_ore", 9600, 4, "endstone", 15, 24000, 4),
    OVERWORLD_COBALT_ORE ("overworld_cobalt_ore", 9600, 4, "stone", 15, 24000, 4),
    END_COBALT_ORE ("end_cobalt_ore", 9600, 4, "endstone", 15, 24000, 4);

	private String name;
	private int pulv2xEnergy;
	private int pulv2xCount;
	private String pulv2xSecondaryOutputItem;
	private int pulv2xSecondaryOutputChance;	
	private int pulv3xEnergy;
	private int pulv3xCount;
	
	private static int debugCounter = 0;
	
	PulvRecipe(String name, int pulv2xEnergy, int pulv2xCount, String pulv2xSecondaryOutputItem, int pulv2xSecondaryOutputChance, int pulv3xEnergy, int pulv3xCount) {		
		this.name = name;
		this.pulv2xEnergy = pulv2xEnergy;
		this.pulv2xCount = pulv2xCount;
		this.pulv2xSecondaryOutputItem = pulv2xSecondaryOutputItem;
		this.pulv2xSecondaryOutputChance = pulv2xSecondaryOutputChance;
		this.pulv3xEnergy = pulv3xEnergy;
		this.pulv3xCount = pulv3xCount;		
	}

	
	@Override
	public String getName() {
		return name;
	}

	
    public static int getEnergy(int index, int multiplier) {
        return PulvRecipe.values()[index].getEnergyValue(multiplier);
    }

    
	public int getEnergyValue(int multiplier) {
		int energy = 0;
		switch (multiplier) {
			case 2:	energy = pulv2xEnergy; break;
			case 3:	energy = pulv3xEnergy;
		}
		return energy;
	}

    
    public static int getCount(int index, int multiplier) {
        return PulvRecipe.values()[index].getCountValue(multiplier);
    }
	
    
	public int getCountValue(int multiplier) {
		int count = 0;
		switch (multiplier) {
			case 2:	count = pulv2xCount; break;
			case 3:	count = pulv3xCount;
		}
		return count;
	}
	
	
	public static ItemStack getPrimaryOutput(int index, int multiplier) {
		Item output = OreDictionary.getOres(BlockRecipeDataRegistry.getItemOreDict(index), false).get(0).getItem();
		int meta = OreDictionary.getOres(BlockRecipeDataRegistry.getItemOreDict(index), false).get(0).getMetadata();
		return new ItemStack(output, getCount(index, multiplier), meta);
	}
	

	public static ItemStack getSecondaryOutput(int index, int multiplier) {
		Item output = OreDictionary.getOres(PulvRecipe.values()[index].getSecondaryOutputItem(multiplier), false).get(0).getItem();
		int meta = OreDictionary.getOres(PulvRecipe.values()[index].getSecondaryOutputItem(multiplier), false).get(0).getMetadata();
		return new ItemStack(output, 1, meta);
	}
	
	
	public String getSecondaryOutputItem(int multiplier) {
		return pulv2xSecondaryOutputItem;
	}
	
	
    public static int getSecondaryOutputChance(int index, int multiplier) {
        return PulvRecipe.values()[index].getSecondaryOutputChanceValue(multiplier);
    }
    
    
	public int getSecondaryOutputChanceValue(int multiplier) {
		return pulv2xSecondaryOutputChance;
	}
	
	// TODO: is there a way to avoid ThermaL Expansion automatically doing a reverse oredict lookup on the input?
	public static void getPulvRecipe(int index) {
		int multiplier = BlockRecipeDataRegistry.values()[index].getRecipeMultiplier();
		// recipeDebugger(index, multiplier);
		switch (multiplier) {
			case 2: PulverizerManager.addRecipe(getEnergy(index, multiplier), BlockRecipeDataRegistry.getItemStack(index),
					getPrimaryOutput(index, multiplier), getSecondaryOutput(index, multiplier), getSecondaryOutputChance(index, multiplier)); break;
			case 3: PulverizerManager.addRecipe(getEnergy(index, multiplier), BlockRecipeDataRegistry.getItemStack(index), getPrimaryOutput(index, multiplier));
		}
	}

	@SuppressWarnings("unused")
	private static void recipeDebugger(int index, int multiplier) {
		debugCounter ++;
		String blockName = BlockRecipeDataRegistry.values()[index].getName();
		String log1 = "-- Pulv Recipe Debug " + debugCounter + "-- Block Name: " + blockName + " | Index: " + index + " | Recipe Multiplier: " + multiplier;
		String log2 = "";
		String log3 = "OreDict List: " + OreDictionary.getOres(BlockRecipeDataRegistry.getItemOreDict(index), false) + " | OreDict First Entry: " +
					OreDictionary.getOres(BlockRecipeDataRegistry.getItemOreDict(index), false).get(0) +
					" | OreDict Item: " + OreDictionary.getOres(BlockRecipeDataRegistry.getItemOreDict(index), false).get(0).getItem();
		switch (multiplier) {
			case 2: log2 = "Energy: " + getEnergy(index, multiplier) + " | Input: " + BlockRecipeDataRegistry.getItemStack(index) +
					" | Primary Output: " + getPrimaryOutput(index, multiplier) + " | Secondary Output: " + getSecondaryOutput(index, multiplier) +
					" | Secondary Output Chance: " + getSecondaryOutputChance(index, multiplier) + "%"; break;
			case 3: log2 = "Energy: " + getEnergy(index, multiplier) + " | Input: " + BlockRecipeDataRegistry.getItemStack(index) +
					" | Primary Output: " + getPrimaryOutput(index, multiplier);
		}
		
		NetherendingOres.LOGGER.info(log1);
		NetherendingOres.LOGGER.info(log2);
		NetherendingOres.LOGGER.info(log3);
		NetherendingOres.LOGGER.info("");
	}
	
}
