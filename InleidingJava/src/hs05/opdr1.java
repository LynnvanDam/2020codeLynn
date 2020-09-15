package hs05;

import java.applet.Applet;
import java.awt.*;

public class opdr1 extends Applet {
    // Variablen voor rechthoek
    int breedte, hoogte;
    Color Rechthoek = Color.MAGENTA;

    public void init() {
        breedte = 150;
        hoogte = 50;
    }

    public void paint(Graphics g) {
        // Lijn
        g.drawLine(10,10,160,10);
        g.drawString("Lijn",70,30);

        // Lege rechthoeken
        g.drawRect(10,40,breedte,hoogte);
        g.drawString("Rechthoek",55,110);
        g.drawRoundRect(10,120,breedte,hoogte,30,30);
        g.drawString("Afgeronde Rechthoek",25,190);

        // Gevulde rechthoeken
        g.setColor(Rechthoek);
        g.fillRect(170,40,breedte,hoogte);
        g.fillOval(170,120,breedte,hoogte);
        g.setColor(Color.BLACK);
        g.drawOval(170,40,breedte,hoogte);
        g.drawString("Gevulde Rechthoek met Ovaal",160,110);
        g.drawString("Gevulde Ovaal",200,190);

        // Overig
        g.drawOval(330,40,breedte,hoogte);
        g.drawString("Taartpunt met Ovaal ",355,110);
        g.drawOval(380,120,50,50);
        g.drawString("Cirkel",390,190);
        g.setColor(Rechthoek);
        g.fillArc(330,40,breedte,hoogte,0,45);
    }
}
