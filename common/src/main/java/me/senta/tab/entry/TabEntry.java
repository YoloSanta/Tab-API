package me.senta.tab.entry;

import me.senta.tab.skin.SkinType;

public class TabEntry {

    private final int x;
    private final int y;
    private final String text;
    private final int ping;
    private String[] skinData;

    /**
     * Constructor to make a new tab entry object with provided skin data
     *
     * @param x    the x axis
     * @param y    the y axis
     * @param text the text to display on the slot
     */
    public TabEntry(int x, int y, String text) {
        this(x, y, text, 0, SkinType.QUESTION_MARK.getSkinData());
    }

    /**
     * Constructor to make a new tab entry object with provided skin data
     *
     * @param x    the x axis
     * @param y    the y axis
     * @param text the text to display on the slot
     * @param ping the displayed latency
     */
    public TabEntry(int x, int y, String text, int ping) {
        this(x, y, text, ping, SkinType.QUESTION_MARK.getSkinData());
    }

    /**
     * Constructor to make a new tab entry object with provided skin data
     *
     * @param x        the x axis
     * @param y        the y axis
     * @param text     the text to display on the slot
     * @param ping     the displayed latency
     * @param skinData the data to display in the skin slot
     */
    public TabEntry(int x, int y, String text, int ping, String[] skinData) {
        this.x = x;
        this.y = y;
        this.text = text;
        this.ping = ping;
        this.skinData = skinData;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public String getText() {
        return text;
    }

    public int getPing() {
        return ping;
    }

    public String[] getSkinData() {
        return skinData;
    }

    public void setSkinData(String[] skinData) {
        this.skinData = skinData;
    }
}