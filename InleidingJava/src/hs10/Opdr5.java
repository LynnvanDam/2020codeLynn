package hs10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdr5 extends Applet {

    TextField tekstvak;
    Button reset, ok;
    int getal;
    double gemiddelde;
    String s, tekst, tekst2;

    public void init() {
        tekstvak = new TextField();
        reset = new Button("reset");
        ok = new Button("ok");
        add(tekstvak);
        add(reset);
        add(ok);


        tekst = "";
        tekst2 = "";
        gemiddelde = 0;

        tekstvak.addActionListener(new TekstListener());
        ok.addActionListener(new OKListener());
        reset.addActionListener(new ResetListener());
    }

    public void paint(Graphics g) {
        tekstvak.setSize(200,50);
        tekstvak.setLocation(10,30);

        reset.setSize(50,20);
        reset.setLocation(220,30);
        ok.setSize(50,20);
        ok.setLocation(220,60);

        g.drawString("Type uw cijfer in en druk op enter. Druk op reset om te resetten en op ok om gemiddelde uit te rekenen",10,20);
        g.drawString("" + tekst,10,100);
        g.drawString("Gemiddelde: " + gemiddelde,10,120);
        g.drawString("" + tekst2,10,140);
    }

    class TekstListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            s = tekstvak.getText();
            getal = Integer.parseInt(s);
            if(getal >= 6){
                tekst = "uw cijfer is voldoende";
            }
            else{
                tekst = "Uw cijfer is onvoldoende";
            }
            repaint();
        }
    }

    class OKListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            s = tekstvak.getText();
            getal = Integer.parseInt(s);
            if(gemiddelde == 0){
                gemiddelde = getal;
            }
            else{
                gemiddelde = (getal + gemiddelde) / 2;

            }
            if(gemiddelde > 5){
                tekst2 = "Uw gemiddelde is voldoende en u bent geslaagd";
            }
            else{
                tekst2 = "Uw gemiddelde is onvoldoende en u bent niet geslaagd";
            }
            repaint();
        }
    }

    class ResetListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            tekst = "";
            tekst2 = "";
            gemiddelde = 0;
            repaint();
        }
    }
}
