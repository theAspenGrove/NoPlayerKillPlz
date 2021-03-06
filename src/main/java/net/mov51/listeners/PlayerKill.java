package net.mov51.listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;

import static net.mov51.PlayerHeadHelper.dropPlayerHead;

public class PlayerKill implements Listener {
    //Listen for Player Death event
    @EventHandler(priority = EventPriority.LOWEST)
    public void onBreak(PlayerDeathEvent e) {
        //Get the killer and check if it's null
        //Apparently this only returns players and is null if the killer is not a player.
        if(e.getEntity().getKiller() != null){
            if(e.getEntity().getKiller().getPlayer() != e.getEntity().getPlayer()){
                //Turns on keep inventory for this one event for the killed player
                e.setKeepInventory(true);
                e.setKeepLevel(true);
                //Clears the items for the event because they drop anyway (Yay!)
                e.getDrops().clear();
                e.setDroppedExp(0);
                System.out.println("[NoPlayerKillPLZ] - Player inventory saved after a Player Kill!");
            }
            dropPlayerHead(e.getEntity(), e.getEntity().getLocation());
        }
    }
}
