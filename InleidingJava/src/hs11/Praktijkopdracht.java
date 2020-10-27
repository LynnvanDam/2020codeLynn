package hs11;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Praktijkopdracht extends Applet {

    TextField textvak;
    Button ok, reset;
    int y = 40;
    int getal;
    String s;
    String string = "";

    public void init() {
        textvak = new TextField();
        ok = new Button("ok");
        reset = new Button("Reset");
        add(textvak);
        add(ok);
        add(reset);

        ok.addActionListener(new OkListener());
        reset.addActionListener(new ResetListener());
    }

    public void paint(Graphics g) {
        textvak.setSize(75,40);
        textvak.setLocation(10,10);
        ok.setSize(40,30);
        ok.setLocation(90,10);
        reset.setSize(40,30);
        reset.setLocation(140,10);

    }

    class OkListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            s = textvak.getText();
            getal = Integer.parseInt(s);
            int tafel, som;

            for (tafel = 0; tafel < 11; tafel++){
                som = getal * tafel;
                y += 20;
                string = "" + tafel + " * " + getal + " = " + som;
                getGraphics().drawString(string,10,y);
            }
        }
    }

    class ResetListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            string = "";
            y = 40;
            repaint();
        }
    }
}

