package hs11;

import java.applet.Applet;
import java.awt.*;

public class Opdr5 extends Applet {

    public void init() {

    }

    public void paint(Graphics g) {
        int x, y;
        g.setColor(Color.DARK_GRAY);

        for (x = 0, y = 0; x < 50;){
            x += 10;
            y += 10;
            g.drawRect(x,y,10,10);
        }
    }
}
