package hs06;

import java.applet.Applet;
import java.awt.*;

public class opdr1 extends Applet {

    double bedrag,deler,uitkomst;

    public void init() {
        bedrag = 113;
        deler = 4;
        uitkomst = bedrag / deler;

        setBackground(Color.gray);
    }

    public void paint(Graphics g) {
        g.setColor(Color.WHITE);
        g.drawString("Ali: " + uitkomst,10,20);
        g.drawString("Jan: " + uitkomst,10,40);
        g.drawString("Jeanette: " + uitkomst,10,60);
        g.drawString("Ik: " + uitkomst,10,80);
    }
}
