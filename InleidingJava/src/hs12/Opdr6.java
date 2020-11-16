package hs12;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdr6 extends Applet {

    TextField vak;
    int [] getal;
    int teller, cijfer, nummer, gezocht;

    public void init() {
        vak = new TextField();
        add(vak);
        vak.addActionListener(new VakListener());


        getal = new int[50];
        cijfer = 1;
        for (teller = 0; teller < getal.length; teller++){
            getal[teller] = cijfer * 2;

            if (teller % 5 == 0){
                cijfer ++;
            }
        }
    }

    public void paint(Graphics g) {
        vak.setSize(50,30);
        vak.setLocation(10,10);

        g.drawString("De waarde is " + gezocht,10,60);
        g.drawString("De waarde komt " + nummer + " voor",10,80);
    }

    class VakListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            nummer = 0;
            String s = vak.getText();
            gezocht = Integer.parseInt(s);

            for (teller = 0; teller < getal.length; teller++){
                    if (gezocht == getal[teller]){
                       nummer++;
                    }
            }
            repaint();
        }

    }
}

