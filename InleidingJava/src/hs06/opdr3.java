package hs06;

import java.applet.Applet;
import java.awt.*;

public class opdr3 extends Applet {

    int plus1,plus2,uitkomst;

    public void init() {
        setBackground(Color.DARK_GRAY);
        plus1 = 1582000000;
        plus2 = 1682000789;
        uitkomst = plus1 + plus2;
    }

    public void paint(Graphics g) {
        g.setColor(Color.WHITE);
        g.drawString("-" + plus1 + "+" + plus2 + "=" + uitkomst,50,50);
    }
}
