package hs02;

import java.applet.Applet;
import java.awt.*;

public class hs02 extends Applet {

    public void init() {
        setBackground(Color.white);
    }

    public void paint(Graphics g) {
        g.setColor(Color.BLUE);
        g.drawString("Lynn", 100, 100);
        g.setColor(Color.RED);
        g.drawString("van Dam",100,110);
    }

}