package hs02;

import java.applet.Applet;
import java.awt.*;

public class hs02 extends Applet {

    public void init() {
        setBackground(Color.BLUE);
    }

    public void paint(Graphics g) {
        g.setColor(Color.YELLOW);
        g.drawString("Lynn", 100, 100);
    }

}