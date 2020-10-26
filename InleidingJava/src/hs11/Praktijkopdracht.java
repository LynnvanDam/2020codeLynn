package hs11;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Praktijkopdracht extends Applet {

    TextField textvak;
    Button ok;
    int getal, stuff, begin, som;
    int y = 60;
    String s;

    public void init() {
        textvak = new TextField();
        ok = new Button("ok");
        add(textvak);
        add(ok);

        ok.addActionListener(new OkListener());
    }

    public void paint(Graphics g) {
        textvak.setSize(75,40);
        textvak.setLocation(10,10);
        ok.setSize(40,30);
        ok.setLocation(90,10);

        for (begin = 0; stuff < 9; begin++) {
            som = begin * getal;
            y += 20;
            g.drawString("" + begin + " * " + getal + " = " + som, 10, y);
        }
    }

    class OkListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            s = textvak.getText();
            getal = Integer.parseInt(s);
            stuff = getal;
            repaint();
        }
    }
}
