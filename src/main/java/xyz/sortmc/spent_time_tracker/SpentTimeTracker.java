package xyz.sortmc.spent_time_tracker;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import xyz.sortmc.spent_time_tracker.UuidToName;

public class SpentTimeTracker implements ModInitializer {
    public static final String MOD_ID = "SpentTimeTracker";

    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        LOGGER.info("Thanks for using SpentTimeTracker!");
    }
}