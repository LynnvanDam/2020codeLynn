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
        int i, b;
        int x1 = 0;
        int x2 = 270;
        int y = 5;
        for (i = 0;i < 20; i++){
            g.drawLine(x1,y,x2,y);
            y += 15;
        }

        int y1, y2, x3, x4;
        for (y1 = 5, y2 = 20, x3 = 10, x4 = 10, i = 0; i < 10; i++){
            g.drawLine(x3,y1,x4,y2);
            x3 += 30;
            x4 += 30;
            if (i == 9){
                i = 0;
                x3 = 10;
                x4 = 10;
                y1 += 30;
                y2 += 30;
            }
        }



    }
}
