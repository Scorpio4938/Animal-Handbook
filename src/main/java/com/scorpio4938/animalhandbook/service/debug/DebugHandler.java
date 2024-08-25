package com.scorpio4938.animalhandbook.service.debug;

import com.scorpio4938.animalhandbook.AnimalHandbook;
import com.scorpio4938.animalhandbook.config.Configs;
import net.minecraft.client.MinecraftClient;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.text.Text;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DebugHandler {
    public static final Logger LOGGER = LoggerFactory.getLogger(AnimalHandbook.MOD_ID);

    public static void printDebug(String args) {
        if (Configs.DO_DEBUG_CONSOLE) {
            LOGGER.info(args);
        }
    }

    public static void printDebug(String key, Object... args) {
        if (Configs.DO_DEBUG_CONSOLE) {
            LOGGER.info(key, args);
        }
    }

    // Method to send a message to a single player (client-side)
    public static void printClientMessage(String message) {
        if (Configs.DO_INGAME_DEBUG_CONSOLE) {
            MinecraftClient.getInstance().player.sendMessage(Text.literal(message), false);
        }
    }

    // Method to broadcast a message to all players (server-side)
    public static void broadcastMessage(MinecraftServer server, String message) {
        if (Configs.DO_INGAME_SERVER_DEBUG_CONSOLE) {
            for (ServerPlayerEntity player : server.getPlayerManager().getPlayerList()) {
                player.sendMessage(Text.literal(message), false);
            }
        }
    }
}
