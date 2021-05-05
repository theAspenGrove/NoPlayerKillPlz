package net.mov51;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.SkullMeta;

public class PlayerHeadHelper {
    public static void dropPlayerHead(Player p, Location l){
        //get the provided player's name
        String playerName = p.getName();
        //create the item
        ItemStack playerHead = new ItemStack(Material.PLAYER_HEAD, 1);
        //generate the metadata from the item
        SkullMeta meta = (SkullMeta)playerHead.getItemMeta();
        //make sure that meta was properly initialized, I guess? Thanks IDE
        if (meta != null) {
            //ad their name to the skull
            meta.setDisplayName(playerName + "'s Head");
            //make it their skull
            meta.setOwningPlayer(p);
            //add the generated meta to the skull
            playerHead.setItemMeta(meta);
            //and finally, summon the item
            p.getWorld().dropItemNaturally(l, playerHead);
        }
    }
}
