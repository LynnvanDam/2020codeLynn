package hs06;

import java.applet.Applet;
import java.awt.*;

public class hs06Praktijkopdracht extends Applet {

    double c1,c2,c3,optel,ant1,ant2,ant3,gemiddelde;
    int deler;

    public void init() {
        setBackground(Color.DARK_GRAY);
        c1 = 5.9;
        c2 = 6.3;
        c3 = 6.9;
        deler = 3;
        optel = c1 + c2 + c3;
        ant1 = optel * 10;
        ant2 = ant1 / deler;
        ant3 = (int) ant2;
        gemiddelde = ant3 / 10;
    }

    public void paint(Graphics g) {
        g.setColor(Color.WHITE);
        g.drawString("Het gemiddelde is: " + gemiddelde,20,20);
    }
}
