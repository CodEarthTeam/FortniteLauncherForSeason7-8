package fr.codearth.team.fls78;

import fr.codearth.team.fls78.core.Events;

public class Launcher {
    public static void main(String[] args) {
        Events.setDev(true);
        System.out.println(Events.getDev());
    }
}
