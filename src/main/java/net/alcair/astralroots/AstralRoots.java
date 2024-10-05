package net.alcair.astralroots;

import net.alcair.astralroots.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AstralRoots implements ModInitializer {
	public static final String MOD_ID = "astralroots";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItems.registerModItems();

	}
}