package fr.codearth.team.fls78;

import fr.codearth.team.fls78.core.Events;

import javax.swing.*;
import java.awt.*;

public class Launcher {
    public static void main(String[] args) {
        Events.setDev(true);
        System.out.println(Events.getDev());
        JFrame win = new JFrame();
        if(Events.getDev() == true){
            win.setSize(800,600);
            JLabel label_start = new JLabel("Demarrage du Launcher pour Fortnite Saison 7 - Saison 8", SwingConstants.CENTER);
            label_start.setPreferredSize(new Dimension(300,100));
            win.getContentPane().add(label_start, BorderLayout.CENTER);
            win.setVisible(true);
            win.setTitle("Fortnite Launcher for Season 7-8");
        }
        
    }
}
