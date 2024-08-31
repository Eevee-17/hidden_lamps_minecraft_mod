package net.eevee.hiddenlamps;

import net.eevee.hiddenlamps.block.ModBlocks;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HiddenLamps implements ModInitializer {
	public static final String MOD_ID = "hiddenlamps";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModBlocks.registerModBlocks();
	}
}
