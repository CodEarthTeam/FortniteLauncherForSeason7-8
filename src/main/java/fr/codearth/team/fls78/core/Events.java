package fr.codearth.team.fls78.core;


public class Events {
    public static Events EVENTS;
    public Boolean isDev;
    public String platform;
    public String args;
    public Events(Boolean isDev, String platform, String args) {
        EVENTS = this;
        this.isDev = isDev;
        this.platform = platform;
        this.args = args;
    }

    public void setDev(Boolean dev) {
        isDev = dev;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public void setArgs(String args) {
        this.args = args;
    }

    public Boolean getDev() {
        return isDev;
    }

    public String getPlatform() {
        return platform;
    }

    public String getArgs() {
        return args;
    }
}
