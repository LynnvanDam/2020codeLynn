package hs11;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Praktijkpt2 extends Applet {

    Button ok;
    int getal;
    int y = 50;

    public void init() {
        ok = new Button("ok");
        add(ok);
        ok.addActionListener(new OkListener());
    }

    public void paint(Graphics g) {
        ok.setSize(40,30);
        ok.setLocation(10,10);

        int keer = 1;
        int som;

        for (getal = 1; keer < 11; keer++){
            som = getal * keer;
            g.drawString("" + getal + " * " + keer + " = " + som,10,y);
            y += 20;
        }
    }

    class OkListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            if (getal < 10){
                getal ++;
            }
            else {
                getal = 1;
            }
            repaint();
        }
    }
}
