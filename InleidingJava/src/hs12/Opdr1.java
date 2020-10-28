package hs12;

import java.applet.Applet;
import java.awt.*;
import java.util.*;

public class Opdr1 extends Applet {

    double[] getal;
    double gemiddelde, getal2, getal3;

    public void init() {
        getal = new double[10];
        for (int teller = 0; teller < 10; teller++){
            getal[teller] = 3 * (teller + 4);
        }
    }

    public void paint(Graphics g) {
        int teller;
        for (teller = 0; teller < getal.length; teller++){
            g.drawString("" + getal[teller], 10, 20 * teller + 20);
            getal2 = getal2 + getal[teller];
        }
        gemiddelde = getal2/ 10;
        g.drawString("" + gemiddelde,50,20);

    }
}