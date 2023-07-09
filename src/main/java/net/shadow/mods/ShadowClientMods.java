package net.shadow.mods;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ShadowClientMods implements ModInitializer {
	public static final String MOD_ID = "sc";
    public static final Logger LOGGER = LoggerFactory.getLogger("shadow-client");

	@Override
	public void onInitialize() {


		LOGGER.info("Hello Fabric world!");
	}
}
