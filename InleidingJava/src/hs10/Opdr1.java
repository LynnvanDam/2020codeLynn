package hs10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdr1 extends Applet {

    TextField tekstvak;
    Label label;
    String tekst, tekst2;
    int getal;

    public void init() {
        tekstvak = new TextField();
        tekstvak.addActionListener(new TekstListener());

        tekst = "";
        tekst2 = "";

        add(tekstvak);
    }

    public void paint(Graphics g) {
        tekstvak.setLocation(10,10);
        tekstvak.setSize(150,50);
    }

    class TekstListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {

        }
    }
}
