package hs04;

import java.applet.Applet;
import java.awt.*;

public class opdr2 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        g.drawRect(20,50,50,50);
        g.drawRect(70,20,30,80);
        g.drawRect(90,80,10,20);
        g.drawRect(30,60,30,30);
        g.drawLine(20,50,70,20);
        g.drawLine(45,60,45,90);
        g.drawLine(30,75,60,75);
    }
}
