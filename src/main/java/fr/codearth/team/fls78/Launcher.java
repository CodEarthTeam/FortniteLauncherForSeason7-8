package fr.codearth.team.fls78;

import fr.codearth.team.fls78.core.Events;

public class Launcher {
    public static void main(String[] args) {
        Events.EVENTS.setDev(true);
        System.out.println(Events.EVENTS.getDev());
    }
}
