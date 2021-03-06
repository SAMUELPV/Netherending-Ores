package org.icannt.netherendingores.lib;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Created by ICannt on 30/05/18.
 */

public class Log {
	
    public static final Logger LOG = LogManager.getLogger(Info.MOD_NAME);
    
	public static String[] LOG_RECIPE_MSG = { "", "", "" };
	
	public static Boolean isRecipeAddedAlready = false;
	
	public static void trace(String msg) {
		if (Config.advancedDebugging) LOG.trace(msg);
	}
	
	public static void debug(String msg) {
		LOG.debug(msg);
	}

	public static void info(String msg) {
		LOG.info(msg);
	}

	public static void warn(String msg) {
		LOG.warn(msg);
	}
	
	public static void error(String msg) {
		LOG.error(msg);
	}

	public static void fatal(String msg) {
		LOG.fatal(msg);
	}
	
	public static void exception(String msg, Throwable t) {
		LOG.error(msg, t);
	}	
	
	/**
	 * Receives log message data from recipe handlers
	 * 
	 * @param       device The device that the recipe is for e.g. Pulverizer
	 * @param       input Device input from a block in this mod
	 * @param       output Device output could be a block or an item
	 */
	public static void logRecipeMsg(String device, String input, String output) {
		LOG_RECIPE_MSG[0] = device;
		LOG_RECIPE_MSG[1] = input;
		LOG_RECIPE_MSG[2] = output;
	}

	//
    public static void logRecipeSuccess() {
    	if (LOG_RECIPE_MSG[1] != "") {
    		logRecipeSuccess(LOG_RECIPE_MSG[0], LOG_RECIPE_MSG[1], LOG_RECIPE_MSG[2]);
    	} else {    	
    		logRecipeSuccessNoInput(LOG_RECIPE_MSG[0], LOG_RECIPE_MSG[2]);
    	}
    }

    //
    public static void logRecipeFail() {
    	if (LOG_RECIPE_MSG[1] != "") {
    		logRecipeFail(LOG_RECIPE_MSG[0], LOG_RECIPE_MSG[1], LOG_RECIPE_MSG[2]);
    	} else {    	
    		logRecipeFailNoInput(LOG_RECIPE_MSG[0], LOG_RECIPE_MSG[2]);
    	}
    }
    
    //
    public static void logRecipeAlreadyAdded() {
    	logRecipeAlreadyAdded(LOG_RECIPE_MSG[0], LOG_RECIPE_MSG[1], LOG_RECIPE_MSG[2]);
    }
    
    //
    public static void logRecipeSuccess(String device, String input, String output) {
    	trace("Registered " + device + " input for \"" + input + "\", output \"" + output + "\".");
    }

    //
    public static void logRecipeFail(String device, String input, String output) {
    	debug("Unable to register " + device + " input for \"" + input + "\", output \"" + output + "\" not found.");
    }

    //
    public static void logRecipeAlreadyAdded(String device, String input, String output) {
    	debug("Unable to register " + device + " input for \"" + input + "\", output \"" + output + "\" is already added.");
    }
    
    //
    public static void logRecipeSuccessNoInput(String device, String output) {
    	trace("Registered " + device + " output for \"" + output + "\".");
    }

    //
    public static void logRecipeFailNoInput(String device, String output) {
    	debug("Unable to register " + device + " output for \"" + output + "\".");
    }

    //
    public static void logOreDictSuccess(String input, String output) {
    	trace("Ore Dictionary entry for \"" + input + "\" added for " + output);
    }

}
