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
        int length = 10;
        int x1 = 0;
        int x2 = 300;
        int y = 5;
        for (i = 0;i < 20; i++){
            g.drawLine(x1,y,x2,y);
            y += 15;
        }

        int y1 = 5; int b1 = 20;
        int y2 = 20; int b2 = 35;
        int x3 = 10; int z1 = 25;
        int x4 = 10; int z2 = 25;
        for (i = 0; i <= length; i++){
            g.drawLine(x3,y1,x4,y2);
            g.drawLine(z1,b1,z2,b2);
            x3 += 30;
            x4 += 30;
            z1 += 30;
            z2 += 30;
            if (i == length){
                i = 0;
                x3 = 10;
                x4 = 10;
                z1 = 25;
                z2 = 25;
                y1 += 30;
                y2 += 30;
                b1 += 30;
                b2 += 30;
            }
        }

    }

}
