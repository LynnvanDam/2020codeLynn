package hs12;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;

public class Opdr3 extends Applet {

    TextField [] vak;
    Button ok;

    public void init() {
        vak = new TextField[5];
        int teller;
        for (teller = 0; teller < vak.length; teller++){
            vak[teller] = new TextField();
            add(vak[teller]);
        }

        ok = new Button("ok");
        add(ok);
        ok.addActionListener(new OkListener());
    }

    public void paint(Graphics g) {

    }

    class OkListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            int[] s = new int[5];
            int i;
            for (i = 0; i < vak.length; i++){
               s[i] = Integer.parseInt(vak[i].getText());
            }
            Arrays.sort(s);

            for (i = 0; i < vak.length; i++){
                vak[i].setText(s[i] + "");
            }

        }
    }
}
