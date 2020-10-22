package hs11;

import java.applet.Applet;
import java.awt.*;

public class Opdr2 extends Applet  {

    public void init() {

    }

    public void paint(Graphics g) {
        int teller;
        int y = 10;

        for (teller = 20; teller >= 10; teller--){
            y += 20;
            g.drawString("" + teller,10,y);
        }

    }
}
