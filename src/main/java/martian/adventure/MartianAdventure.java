package martian.adventure;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MartianAdventure implements ModInitializer {
	public static final String MOD_ID = "martian.adventure";

	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	private static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		LOGGER.info("-------------- MESSAGE INCOMING --------------");
		LOGGER.warn("IGNITION IN....");
		LOGGER.warn("3");
		LOGGER.warn("2");
		LOGGER.warn("1");
		LOGGER.warn("AND LIFTOFF!");
		LOGGER.info("T-0.01ms until landing....");
		LOGGER.info("Welcome to Mars!");
		LOGGER.info("-------------- MESSAGE COMPLETE --------------");
	}
}

