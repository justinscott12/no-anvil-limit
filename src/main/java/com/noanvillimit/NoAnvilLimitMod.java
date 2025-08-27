package com.noanvillimit;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NoAnvilLimitMod implements ModInitializer {
    public static final String MOD_ID = "unlimited-anvil";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        LOGGER.info("Unlimited Anvil mod initialized! Anvil level limit has been removed.");
    }
}
