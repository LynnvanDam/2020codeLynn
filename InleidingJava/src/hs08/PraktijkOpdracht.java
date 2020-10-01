package hs08;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PraktijkOpdracht extends Applet {

    Button plus, min, keer, delen;
    TextField een, twee;
    double getal,getaltwee, uitkomst;
    int breedte, hoogte;


    public void init() {
        breedte = 20;
        hoogte = 20;

        plus = new Button("+");
        min = new Button("-");
        keer = new Button("*");
        delen = new Button("/");
        een = new TextField();
        twee = new TextField();
        add(plus);
        add(min);
        add(keer);
        add(delen);
        add(een);
        add(twee);

        plus.addActionListener(new PlusListener());
        min.addActionListener(new MinListener());
        keer.addActionListener(new KeerListener());
        delen.addActionListener(new DeelListener());
    }

    public void paint(Graphics g) {
        een.setSize(100,25);
        een.setLocation(10,10);
        twee.setSize(100,25);
        twee.setLocation(120,10);

        plus.setSize(breedte,hoogte);
        plus.setLocation(225,10);
        min.setSize(breedte,hoogte);
        min.setLocation(250,10);
        keer.setSize(breedte,hoogte);
        keer.setLocation(275,10);
        delen.setSize(breedte,hoogte);
        delen.setLocation(300,10);

    }

    class PlusListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            String plussom = een.getText();
            String plustwee = twee.getText();
            getal = Double.parseDouble(plussom);
            getaltwee = Double.parseDouble(plustwee);
            uitkomst = getal + getaltwee;
            een.setText("" + uitkomst);
            twee.setText("");
            repaint();
        }
    }

    class MinListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            String minsom = een.getText();
            String mintwee = twee.getText();
            getal = Double.parseDouble(minsom);
            getaltwee = Double.parseDouble(mintwee);
            uitkomst = getal - getaltwee;
            een.setText("" + uitkomst);
            twee.setText("");
            repaint();
        }
    }

    class KeerListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            String keersom = een.getText();
            String keertwee = twee.getText();
            getal = Double.parseDouble(keersom);
            getaltwee = Double.parseDouble(keertwee);
            uitkomst = getal * getaltwee;
            een.setText("" + uitkomst);
            twee.setText("");
            repaint();
        }
    }

    class DeelListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            String deelsom = een.getText();
            String deeltwee = twee.getText();
            getal = Double.parseDouble(deelsom);
            getaltwee = Double.parseDouble(deeltwee);
            uitkomst = getal / getaltwee;
            een.setText("" + uitkomst);
            twee.setText("");
            repaint();
        }
    }
}
