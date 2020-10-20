package hs10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PraktijkOpdr extends Applet {

    TextField tekstvak;
    String s, tekst;
    int cijfer;

    public void init() {
        tekstvak = new TextField();
        tekst = "";
        add(tekstvak);

        tekstvak.addActionListener(new TekstListener());
    }

    public void paint(Graphics g) {
        tekstvak.setSize(200,50);
        tekstvak.setLocation(10,30);

        g.drawString("Type hier uw cijfer in:",10,20);
        g.drawString("" + tekst,10,100);
    }

    class TekstListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            s = tekstvak.getText();
            cijfer = Integer.parseInt(s);
            switch (cijfer){
                case 1:
                    tekst = "U heeft een slecht cijfer";
                    break;
                case 2:
                    tekst = "U heeft een slecht cijfer";
                    break;
                case 3:
                    tekst = "U heeft een slecht cijfer";
                    break;
                case 4:
                    tekst = "U heeft een onvoldoende cijfer";
                    break;
                case 5:
                    tekst = "U heeft een matig cijfer";
                    break;
                case 6:
                    tekst = "U heeft een voldoende cijfer";
                    break;
                case 7:
                    tekst = "U heeft een voldoende cijfer";
                    break;
                case 8:
                    tekst = "U heeft een goed cijfer";
                    break;
                case 9:
                    tekst = "U heeft een goed cijfer";
                    break;
                case 10:
                    tekst = "U heeft een goed cijfer";
                    break;
                default:
                    tekst = "U heeft een verkeerd cijfer ingevoerd";
                    break;
            }
            repaint();
        }
    }
}
