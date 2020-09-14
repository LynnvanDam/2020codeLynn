package hs04;

import java.applet.Applet;
import java.awt.*;

public class opdr6 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.CYAN);
        g.fillRect(20,20,40,100);
        g.setColor(Color.RED);
        g.drawOval(30,30,20,20);
        g.setColor(Color.ORANGE);
        g.drawOval(30,60,20,20);
        g.setColor(Color.GREEN);
        g.fillOval(30,90,20,20);
        g.setColor(Color.BLACK);
        g.fillRect(35,120,10,40);
        g.setColor(Color.WHITE);
        g.drawRect(20,20,40,100);
        g.drawRect(35,120,10,40);
    }
}
