package org.trivait.tutorialmod;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.trivait.tutorialmod.block.ModBlocks;
import org.trivait.tutorialmod.item.ModItemGroups;
import org.trivait.tutorialmod.item.ModItems;

public class TutorialMod implements ModInitializer {
	public static final String MOD_ID = "tutorialmod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.register();

		ModItems.register();
		ModBlocks.register();
	}
}