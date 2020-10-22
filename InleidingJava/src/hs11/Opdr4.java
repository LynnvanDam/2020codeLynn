package hs11;

import java.applet.Applet;
import java.awt.*;

public class Opdr4 extends Applet {

    public void init() {

    }

    public void paint(Graphics g) {
        int teller;
        int y = 10;
        int uitkomst = 0;

        for (teller = 0; uitkomst <= 27;teller++) {
            y += 20;
            uitkomst = teller * 3;
            g.drawString("" + uitkomst,10,y);
        }
        g.drawString("De tafel van 3:",10,10);
    }
}
