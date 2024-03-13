package cz.engeto.scifi.controller;

public class Settings {
    private static final String HISTORIC = "resources/historic.txt";
    private static final String ROMANTIC = "resources/omantic.txt";
    private static final String SCIFI = "resources/scifi.txt";

    public static String getHistoric() {
        return HISTORIC;
    }

    public static String getScifi() {
        return SCIFI;
    }

    public static String getRomantic() {
        return ROMANTIC;
    }
}
