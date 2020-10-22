package hs11;

import java.applet.Applet;
import java.awt.*;

public class Opdr3 extends Applet {

    public void init() {
        setBackground(Color.LIGHT_GRAY);
    }

    public void paint(Graphics g) {
        int teller, getal;
        int y = 0, cijfer = 0;

        for (teller = 1; teller >= 0;){
            y += 20;
            getal = cijfer + teller;
            g.drawString("" + getal,10,y);
            cijfer = teller;
            teller = getal;
        }
    }
}
