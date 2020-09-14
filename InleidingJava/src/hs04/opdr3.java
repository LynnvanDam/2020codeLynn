package hs04;

import java.applet.Applet;
import java.awt.*;

public class opdr3 extends Applet {

    public void init() {
    }


    public void paint(Graphics g) {
        g.setColor(Color.ORANGE);
        g.fillRect(10,10,5,80);
        g.setColor(Color.RED);
        g.fillRect(15,10,50,10);
        g.setColor(Color.WHITE);
        g.fillRect(15,20,50,10);
        g.setColor(Color.BLUE);
        g.fillRect(15,30,50,10);
        g.drawRect(15,10,50,30);
        g.drawRect(10,10,5,80);
    }
}
