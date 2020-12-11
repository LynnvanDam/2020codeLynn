package hs13;

import java.applet.Applet;
import java.awt.*;

public class Opdr4 extends Applet {

    public void init() {

    }

    public void paint(Graphics g) {
        tekenBoom(g, 10,30,60,50);
    }

    void tekenBoom (Graphics g, int logWidth, int logHeight, int leavesWidth, int leavesHeight) {
        g.setColor(new Color(130, 67, 0));
        g.fillRect(35,55,logWidth, logHeight);

        g.setColor(Color.GREEN);
        g.fillOval(10,10,leavesWidth,leavesHeight);

    }
}
