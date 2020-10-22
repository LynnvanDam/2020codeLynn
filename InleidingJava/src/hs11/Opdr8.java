package hs11;

import java.applet.Applet;
import java.awt.*;

public class Opdr8 extends Applet {

    public void init() {

    }

    public void paint(Graphics g) {
        int width, length;
        int cirkels;

        for (cirkels = 0, width = 0, length = 0;cirkels <= 99;cirkels++){
            width += 10;
            length += 10;
            g.drawOval(10,10,width,length);
        }
    }
}
