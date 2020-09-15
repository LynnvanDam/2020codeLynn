package hs05;

import java.applet.Applet;
import java.awt.*;

public class variabelen1 extends Applet {

    // Een int is een stukje geheugen voor een gheel getal
    int getal1, getal2, optelsom;

    // Een double is eem stukje geheugen voor een kommagetal
    double factor1, factor2, product;

    // Een boolean is een stukje geheugen voor true or false

    // Recchthoek variabelen
    int breedte, hoogte;
    Color RechthoekKleur = Color.MAGENTA;


    public void init() {
        setBackground(Color.DARK_GRAY);
        getal1 = 35;
        getal2 = 17;
        factor1 = 7.3;
        factor2 = 9.9;
        optelsom = getal1 + getal2;
        product = factor1 * factor2;

        // rechthoek
        breedte = 150;
        hoogte = 50;
    }

    public void paint(Graphics g) {

        g.setColor(Color.white);

        // optelsom
        String OptelsomString = getal1 + " + " + getal2 + " = " + optelsom;
        g.drawString(OptelsomString,50,50);
        // product
        String KeersomString = factor1 + " * " + factor2 + " = " + product;
        g.drawString(KeersomString, 50, 70);

        // rechthoek
        g.setColor(RechthoekKleur);
        g.fillRect(50,80,breedte,hoogte);
    }
}
