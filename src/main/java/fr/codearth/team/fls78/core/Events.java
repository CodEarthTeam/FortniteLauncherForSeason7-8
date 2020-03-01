package fr.codearth.team.fls78.core;


public class Events {
    public static Events EVENTS;
    public static Boolean isDev;
    public static String platform;
    public static String args;
    public Events(Boolean isDev, String platform, String args) {
        EVENTS = this;
        Events.isDev = isDev;
        Events.platform = platform;
        Events.args = args;
    }

    public static void setDev(Boolean dev) {
        Events.isDev = dev;
    }

    public void setPlatform(String platform) {
        Events.platform = platform;
    }

    public void setArgs(String args) {
        Events.args = args;
    }

    public static Boolean getDev() {
        return isDev;
    }

    public static String getPlatform() {
        return platform;
    }

    public static String getArgs() {
        return args;
    }
}
