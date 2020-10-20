package hs10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdr4 extends Applet {
    TextField tekstvak;
    String s, tekst, tekst2;
    int getal;

    public void init() {
        tekstvak = new TextField();
        tekst = "U heeft geen geldig jaarnummer ingevoerd";
        tekst2 = "";
        add(tekstvak);

        tekstvak.addActionListener(new TekstListener());
    }

    public void paint(Graphics g) {
        setBackground(Color.lightGray);
        tekstvak.setSize(200,50);
        tekstvak.setLocation(10,30);

        g.drawString("type een jaarnummer en druk op enter:",10,20);
        g.drawString("" + tekst,10,100);
        g.drawString("" + tekst2,10,120);
    }

    class TekstListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = tekstvak.getText();
            getal = Integer.parseInt(s);
            if ( (getal % 4 == 0 && !(getal % 100 == 0)) ||
                    getal % 400 == 0 ) {
                tekst = "" + getal + " is een schrikkeljaar";
                tekst2 = "Februari heeft 29 dagen";
            }
            else {
                tekst = "" + getal + " is geen schrikkeljaar";
                tekst2 = "Februari heeft 28 dagen";
            }
            repaint();
        }
    }
}

