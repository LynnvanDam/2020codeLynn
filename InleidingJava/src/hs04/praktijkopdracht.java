package hs04;

import java.applet.Applet;
import java.awt.*;

public class praktijkopdracht extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        g.drawLine(10,10,150,10);
        g.drawString("Lijn",55,30);
        g.drawRect(10,40,150,50);
        g.drawString("Rechthoek",45,110);
        g.drawRoundRect(10,120,150,50,30,30);
        g.drawString("Afgeronde Rechthoek",20,190);

        g.setColor(Color.MAGENTA);
        g.fillRect(170,40,150,50);
        g.fillOval(170,120,150,50);
        g.setColor(Color.BLACK);
        g.drawOval(170,40,150,50);
        g.drawString("Gevulde Rechthoek met Ovaal",160,110);
        g.drawString("Gevulde Ovaal",200,190);

        g.setColor(Color.MAGENTA);
        g.fillArc(330,40,150,50,0,45);
        g.setColor(Color.BLACK);
        g.drawOval(330,40,150,50);
        g.drawString("Taartpunt met Ovaal ",355,110);
        g.drawOval(380,120,50,50);
        g.drawString("Cirkel",390,190);
    }
}
