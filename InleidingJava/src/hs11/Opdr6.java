package hs11;

import java.applet.Applet;
import java.awt.*;

public class Opdr6 extends Applet {

    public void init() {

    }

    public void paint(Graphics g) {
        int width, length, x = 100, y = 100;
        int cirkels;

        for (cirkels = 0, width = 0, length = 0;cirkels <= 4;cirkels++){
            width += 10;
            length += 10;
            x -= 5;
            y -= 5;
            g.drawOval(x,y,width,length);
        }
    }
}
