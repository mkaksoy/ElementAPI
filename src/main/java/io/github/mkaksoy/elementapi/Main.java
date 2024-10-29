package io.github.mkaksoy.elementapi;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
    @Override
    public void onEnable() {
        getLogger().info("ElementAPI 0.0.2 has been enabled!");
    }

    @Override
    public void onDisable() {
        getLogger().info("ElementAPI 0.0.2 has been disabled!");
    }
}
