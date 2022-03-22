package me.senta.tab.entry;

import org.bukkit.entity.Player;

public interface TabElementHandler {


    /**
     * Get  tab element per player
     *
     * @param player the player
     * @return the tab element
     */
    TabElement getElement(Player player);
}
