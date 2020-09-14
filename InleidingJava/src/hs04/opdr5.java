package hs04;

import java.applet.Applet;
import java.awt.*;

public class opdr5 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.BLUE);
        g.setColor(Color.YELLOW);
        g.fillOval(10,10,200,100);
        g.setColor(Color.MAGENTA);
        g.drawOval(10,10,200,100);

        g.setColor(Color.YELLOW);
        g.fillArc(10,130,200,100,90,300);
        g.fillArc(10,130,200,100,300,90);
        g.setColor(Color.MAGENTA);
        g.drawArc(10,130,200,100,90,360);
    }


}
