package hs04;

import java.applet.Applet;
import java.awt.*;

public class opdr7 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        g.drawRoundRect(20,20,100,100,30,30);
        g.fillOval(45,45,10,10);
        g.fillOval(85,45,10,10);
        g.fillOval(45,85,10,10);
        g.fillOval(85,85,10,10);
    }
}
