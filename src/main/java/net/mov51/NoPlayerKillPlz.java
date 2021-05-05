package net.mov51;

import net.mov51.listeners.PlayerKill;
import org.bukkit.plugin.java.JavaPlugin;

public final class NoPlayerKillPlz extends JavaPlugin {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new PlayerKill(), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
