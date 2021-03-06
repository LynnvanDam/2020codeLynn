package hs10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdr2 extends Applet {

    TextField tekstvak;
    int getal, tekst, tekst2;

    public void init() {
        tekstvak = new TextField();
        tekstvak.addActionListener(new TekstListener());

        tekst = 0;
        tekst2 = 0;

        add(tekstvak);
    }

    public void paint(Graphics g) {
        tekstvak.setLocation(10,10);
        tekstvak.setSize(150,50);

        g.drawString("Hoogste getal: " + tekst, 10,75);
        g.drawString("Laagste getal: " + tekst2, 10, 90);
    }

    class TekstListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            String s = tekstvak.getText();
            getal = Integer.parseInt(s);
            if (getal > tekst){
                tekst = getal;
                repaint();
            }
            if (getal < tekst2){
                tekst2 = getal;
                repaint();
            }
        }
    }
}
