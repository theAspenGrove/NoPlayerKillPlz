package net.mov51.listeners;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;

public class PlayerKill implements Listener {
    @EventHandler(priority = EventPriority.HIGHEST)
    public void onBreak(PlayerDeathEvent e) {
        if(e.getEntity().getKiller() != null){
            e.setKeepInventory(true);
            e.getDrops().clear();
            System.out.println("keep inventory saved");
        }
    }
}
