package hs05;

import java.applet.Applet;
import java.awt.*;

public class opdr2 extends Applet {

    // Staafdiagram
    int BreedteV, BreedteJ, BreedteH, hoogte;

    Color Val = Color.GREEN;
    Color Jer = Color.RED;
    Color Han = Color.CYAN;

    public void init() {
        BreedteV = 40;
        BreedteJ = 100;
        BreedteH = 80;
        hoogte = 10;
    }

    public void paint(Graphics g) {

        // Basis

        g.drawRect(80,40,150,100);
        g.drawString("140",220,155);
        g.drawString("120",195,155);
        g.drawString("100",170,155);
        g.drawString("80", 150,155);
        g.drawString("60",130,155);
        g.drawString("40",110,155);
        g.drawString("20",90,155);
        g.drawString("0",75,155);
        g.drawString("Valerie",15,60);
        g.drawString("Jeroen",15,95);
        g.drawString("Hans",15,130);

        // Rechthoeken met kleur

        g.setColor(Color.GREEN);
        g.fillRect(80,50,BreedteV,hoogte);
        g.setColor(Color.RED);
        g.fillRect(80,85,BreedteJ,hoogte);
        g.setColor(Color.CYAN);
        g.fillRect(80,120,BreedteH,hoogte);

        // Lijnen rechthoeken
        g.setColor(Color.BLACK);
        g.drawRect(80,50,BreedteV,hoogte);
        g.drawRect(80,85,BreedteJ,hoogte);
        g.drawRect(80,120,BreedteH,hoogte);

    }
}
