package fr.codearth.team.fls78;

import fr.codearth.team.fls78.core.Events;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.beans.PropertyChangeListener;

public class Launcher {
    public static void main(String[] args) {
        Events.setDev(true);
        System.out.println(Events.getDev());
        JFrame win = new JFrame();
        if(Events.getDev() == true){
            win.setSize(800,600);
            JLabel label_start = new JLabel("Demarrage du Launcher pour Fortnite Saison 7 - Saison 8", SwingConstants.CENTER);
            JButton download = new JButton("Launch Download");
            label_start.setPreferredSize(new Dimension(300,100));
            win.getContentPane().add(label_start, BorderLayout.CENTER);
            win.getContentPane().add(download, BorderLayout.PAGE_END);
            win.setTitle("Fortnite Launcher for Season 7-8 (En Développement)");
            win.setDefaultCloseOperation(win.DISPOSE_ON_CLOSE);
            download.setBackground(Color.CYAN);
            win.setVisible(true);
        }
        if(Events.getDev() == false){
            win.setSize(800,600);
            JLabel label_start = new JLabel("Demarrage du Launcher pour Fortnite Saison 7 - Saison 8", SwingConstants.CENTER);
            JButton download = new JButton("Launch Download");
            label_start.setPreferredSize(new Dimension(300,100));
            win.getContentPane().add(label_start, BorderLayout.CENTER);
            win.getContentPane().add(download, BorderLayout.PAGE_END);
            win.setTitle("Fortnite Launcher for Season 7-8");
            download.setBackground(Color.CYAN);
            win.setDefaultCloseOperation(win.DISPOSE_ON_CLOSE);
            win.setVisible(true);
        }
    }
}
