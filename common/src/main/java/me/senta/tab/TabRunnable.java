package me.senta.tab;

import org.bukkit.Bukkit;
import org.bukkit.scheduler.BukkitRunnable;

public class TabRunnable extends BukkitRunnable {

    private final TabHandler handler;

    /**
     * Constructor to make a new TabThread
     *
     * @param handler the handler to register it to
     */
    public TabRunnable(TabHandler handler) {
        this.handler = handler;
    }

    @Override
    public void run() {
        Bukkit.getOnlinePlayers().forEach(handler::sendUpdate);
    }
}