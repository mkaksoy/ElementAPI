package io.github.mkaksoy.elementapi;

import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        getLogger().info("ElementAPI has been enabled!");
    }

    @Override
    public void onDisable() {
        getLogger().info("ElementAPI has been disabled!");
    }
}
