package hs04;

import java.applet.Applet;
import java.awt.*;

public class opdr4 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        g.drawRect(40,40,180,100);
        g.drawString("100",15,45);
        g.drawString("80", 15,65);
        g.drawString("60",15,85);
        g.drawString("40",15,105);
        g.drawString("20",15,125);
        g.drawString("0",15,145);
        g.drawString("Gewicht in kg",15,25);
        g.drawString("Valerie",50,150);
        g.drawString("Jeroen",100,150);
        g.drawString("Hans",150,150);
        g.setColor(Color.GREEN);
        g.fillRect(65,100,10,40);
        g.setColor(Color.RED);
        g.fillRect(115,40,10,100);
        g.setColor(Color.CYAN);
        g.fillRect(160,60,10,80);
        g.setColor(Color.BLACK);
        g.drawRect(65,100,10,40);
        g.drawRect(115,40,10,100);
        g.drawRect(160,60,10,80);
    }
}
