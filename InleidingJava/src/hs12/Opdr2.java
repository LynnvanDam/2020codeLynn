package hs12;

import java.applet.Applet;
import java.awt.*;

public class Opdr2 extends Applet {

    int[] knop;
    int teller;

    public void init() {
        knop = new int [25];
        for (teller = 0; teller < knop.length; teller++) {
            Button ok;
            ok = new Button("ok" + teller);
            add(ok);
        }
    }

    public void paint(Graphics g) {

    }
}
