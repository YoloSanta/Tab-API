package me.senta.tab.shared.client;

import com.viaversion.viaversion.api.Via;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.plugin.PluginManager;

public class ClientVersionUtil {

    public static int getPlayerProtocolVersion(Player player) {
        final PluginManager pm = Bukkit.getPluginManager();
        if (pm.isPluginEnabled("ViaVersion")) return Via.getAPI().getPlayerVersion(player.getUniqueId());
        return -1;
    }
}
