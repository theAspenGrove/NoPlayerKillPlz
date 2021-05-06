package net.mov51;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.SkullMeta;

public class PlayerHeadHelper {
    public static void dropPlayerHead(Player p, Location l){
        //Get the provided player's name
        String playerName = p.getName();
        //Create the item
        ItemStack playerHead = new ItemStack(Material.PLAYER_HEAD, 1);
        //Generate the metadata from the item
        SkullMeta meta = (SkullMeta)playerHead.getItemMeta();
        //Make sure that meta was properly initialized, I guess? Thanks IDE
        if (meta != null) {
            //Add the player's name to the skull
            meta.setDisplayName(playerName + "'s Head");
            //Make it their skull
            meta.setOwningPlayer(p);
            //Add the generated meta to the skull
            playerHead.setItemMeta(meta);
            //And finally, summon the item at the provided location
            p.getWorld().dropItemNaturally(l, playerHead);
        }
    }
}
