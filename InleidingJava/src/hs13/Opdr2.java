package hs13;

import java.applet.Applet;
import java.awt.*;

public class Opdr2 extends Applet {

    public void init() {
        setBackground(Color.red);
    }

    public void paint(Graphics g) {
        tekenBaksteen(g);
    }

    void tekenBaksteen(Graphics g){
        g.setColor(Color.WHITE);
        int i;
        int x1 = 0;
        int x2 = 270;
        int y = 5;
        for (i = 0;i < 20; i++){
            g.drawLine(x1,y,x2,y);
            y += 15;
        }


    }

}
