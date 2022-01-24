package com.upgrad.fsd;

public class Player {

    private static double maxPlayerNumber;

    public final double playedId;
    private String name;

    private String country;
    private int age;

    private int kills;
    private int deaths;
    private double killDeathRatio;
    private String playerLeague;

    public Player() {
        this.playedId = generatePlayerId();

        this.killDeathRatio = 0.0;
        this.kills = 0;
        this.deaths = 0;
        this.playerLeague = "Bronze III";
    }

    public Player(String name, int age) {
        this();
        this.name = name;
        this.age = age;
    }

    public Player(String name, int age, String country) {
        this(name, age);
        this.country = country;
    }

    private double generatePlayerId() {
        maxPlayerNumber++;
        return maxPlayerNumber;
    }

    public void showStatistics() {
        System.out.println("Name: " + this.name);
        System.out.println("K/D Ratio: " + this.killDeathRatio);
        System.out.println("Player league: " + this.playerLeague);
    }

    public void updateKDRatio(int kills, int deaths) {
        this.deaths += deaths;
        this.kills += kills;
        this.killDeathRatio = kills / deaths;
    }
}
