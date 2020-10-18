package hs10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdr3 extends Applet {

    TextField tekstvak;
    String s, tekst, tekst2;
    int maand;

    public void init() {
        tekstvak = new TextField();
        tekst = "U heeft een verkeerd nummer ingevoerd";
        tekst2 = "0";
        add(tekstvak);

        tekstvak.addActionListener(new TekstListener());
    }

    public void paint(Graphics g) {
        setBackground(Color.lightGray);
        tekstvak.setSize(200,50);
        tekstvak.setLocation(10,30);

        g.drawString("type het maandnummer en druk op enter:",10,20);
        g.drawString("Maand: " + tekst,10,100);
        g.drawString("Dagen: " + tekst2,10,120);
    }

    class TekstListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
           s = tekstvak.getText();
           maand = Integer.parseInt(s);
           switch (maand){
               case 1:
                   tekst = "Januari";
                   tekst2 = "31";
                   break;
               case 2:
                   tekst = "Februari";
                   tekst2 = "28";
                   break;
               case 3:
                   tekst = "Maart";
                   tekst2 = "31";
                   break;
               case 4:
                   tekst = "April";
                   tekst2 = "30";
                   break;
               case 5:
                   tekst = "Mei";
                   tekst2 = "31";
                   break;
               case 6:
                   tekst = "Juni";
                   tekst2 = "30";
                   break;
               case 7:
                   tekst = "Juli";
                   tekst2 ="31";
                   break;
               case 8:
                   tekst = "Augustus";
                   tekst2 = "31";
                   break;
               case 9:
                   tekst = "September";
                   tekst2 = "30";
                   break;
               case 10:
                   tekst = "Oktober";
                   tekst2 = "31";
                   break;
               case 11:
                   tekst = "November";
                   tekst2 = "30";
                   break;
               case 12:
                   tekst = "December";
                   tekst2 = "31";
                   break;
               default:
                   tekst = "U heeft een verkeerd maandnummer ingetikt";
                   tekst2 = "0";
                   break;
           }
           repaint();
        }
    }
}
