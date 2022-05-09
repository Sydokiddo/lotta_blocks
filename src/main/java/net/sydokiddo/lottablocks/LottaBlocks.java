package net.sydokiddo.lottablocks;

import net.fabricmc.api.ModInitializer;
import net.sydokiddo.lottablocks.block.ModBlocks;
import net.sydokiddo.lottablocks.sound.ModSoundEvents;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LottaBlocks implements ModInitializer {

	public static final Logger LOGGER = LoggerFactory.getLogger("modid");

	public static final String MOD_ID = "lottablocks";

	@Override
	public void onInitialize() {

		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		ModBlocks.registerModBlocks();
		ModSoundEvents.registerSounds();

		LOGGER.info("Hello Fabric world!");
	}
}
