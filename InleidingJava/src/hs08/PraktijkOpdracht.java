package hs08;

import java.applet.Applet;
import java.awt.*;

public class PraktijkOpdracht extends Applet {

    Button plus, min, keer, delen;
    TextField een, twee;
    double getal, uitkomst;
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
}
