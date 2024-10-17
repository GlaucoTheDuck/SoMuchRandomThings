package net.pandariin.smrt;

import net.fabricmc.api.ModInitializer;

import net.pandariin.smrt.block.ModBlocks;
import net.pandariin.smrt.items.ModItemGroups;
import net.pandariin.smrt.items.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SMRT implements ModInitializer {
	public static final String MOD_ID = "smrt";


	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerModItemGroups();

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		LOGGER.info("Hello Fabric world!");
	}
}