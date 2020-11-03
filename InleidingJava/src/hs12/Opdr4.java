package hs12;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdr4 extends Applet {

    TextField tekstvak;
    Button ok;
    int getal, gezocht, teller;
    int getallen[];
    boolean found;

    public void init() {
        tekstvak = new TextField();
        ok = new Button("ok");
        add(tekstvak);
        add(ok);

        ok.addActionListener(new OkListener());

        found = false;
        gezocht = 0;

        getallen = new int[50];
        for (teller = 0; teller < getallen.length;) {
            getallen[teller] = 3 + getal;
            getal ++;

            if (getallen[teller] == gezocht) {
                found = true;
            }
            teller++;
        }
    }

    public void paint(Graphics g) {
        tekstvak.setLocation(10, 10);
        tekstvak.setSize(50, 40);
        ok.setLocation(70, 10);
        ok.setSize(30, 30);

        if (found = true){
            g.drawString("De waarde is gevonden", 10, 70);
        }
        else {
            g.drawString("De waarde is niet gevonden", 10, 70);
        }

    }

    class OkListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String s = tekstvak.getText();
            gezocht = Integer.parseInt(s);
            repaint();
        }
    }
}
