package io.github.mkaksoy.elementapi.api.player;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.entity.Player;

public class PlayerUtil {
    public static void sendMessage(String playerName, String message) {
        Player player = Bukkit.getPlayer(playerName);
        if (player != null) {
            player.sendMessage(message);
        }
    }

    public static Location getPlayerLocation(Player player) {
        return player != null ? player.getLocation() : null;
    }
}
