package com.lagmod;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LagModClient implements ClientModInitializer {
	private static final Logger LOGGER = LoggerFactory.getLogger("lagmod");

	@Override
	public void onInitializeClient() {
		LOGGER.info("LagMod Client initialized!");
		
		ClientTickEvents.END_CLIENT_TICK.register(client -> {
			// Client tick logic here
		});
	}
}
