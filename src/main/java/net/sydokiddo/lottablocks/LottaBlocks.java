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

		// Registry:

		ModBlocks.registerModBlocks();
		ModSoundEvents.registerSounds();

		LOGGER.info("Thank you for downloading Lotta Blocks! :)");
	}
}
