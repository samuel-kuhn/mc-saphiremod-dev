package sapphiremod;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import sapphiremod.block.ModBlocks;
import sapphiremod.item.ModItemGroups;

public class SapphireMod implements ModInitializer {
	public static final String MOD_ID = "sapphiremod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	public static void logInfo(String message) {
		LOGGER.info(message);
	}

	@Override
	public void onInitialize() {
		logInfo("Initializing: " + MOD_ID);

		ModBlocks.init();
		ModItemGroups.init();
	}
}