package hs11;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Praktijkpt2 extends Applet {

    Button ok;
    int getal;
    int y = 50;
    int keer = 1;
    int som;

    public void init() {
        ok = new Button("ok");
        add(ok);
        ok.addActionListener(new OkListener());
    }

    public void paint(Graphics g) {
        ok.setSize(40,30);
        ok.setLocation(10,10);

        for (keer = 1; keer < 11; keer++){
            som = getal * keer;
            y += 20;
            String string = "" + keer + " * " + getal + " = " + som;
            g.drawString(string,10,y);
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
            y = 50;
            repaint();
        }
    }
}
