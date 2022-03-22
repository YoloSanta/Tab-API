package me.senta.tab.adapters;

import me.senta.tab.TabAdapter;
import org.bukkit.entity.Player;

public class v1_16_R3TabAdapter extends TabAdapter {

    @Override
    public void updateSkin(String[] skinData, int index, Player player) {

    }

    @Override
    public int getMaxElements(Player player) {
        return 0;
    }

    @Override
    public void createProfiles(int index, String text, Player player) {

    }

    @Override
    public TabAdapter sendHeaderFooter(Player player, String header, String footer) {
        return null;
    }

    @Override
    public TabAdapter sendEntryData(Player player, int axis, int ping, String text) {
        return null;
    }

    @Override
    public TabAdapter addFakePlayers(Player player) {
        return null;
    }

    @Override
    public TabAdapter hideRealPlayers(Player player) {
        return null;
    }

    @Override
    public TabAdapter hidePlayer(Player player, Player target) {
        return null;
    }

    @Override
    public TabAdapter showRealPlayers(Player player) {
        return null;
    }

    @Override
    public TabAdapter showPlayer(Player player, Player target) {
        return null;
    }
}
