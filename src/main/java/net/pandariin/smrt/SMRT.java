package net.pandariin.smrt;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.pandariin.smrt.block.ModBlocks;
import net.pandariin.smrt.component.ModDataComponentTypes;
import net.pandariin.smrt.item.ModItemGroups;
import net.pandariin.smrt.item.ModItems;
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
		ModDataComponentTypes.registerDataComponentType();

		FuelRegistry.INSTANCE.add(ModItems.STARLIGHT_ASHES, 600);
		LOGGER.info("Hello Fabric world!");
	}
}