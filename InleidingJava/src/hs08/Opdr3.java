package hs08;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdr3 extends Applet {

    Button ok;
    TextField textfield;
    double uitkomst, text;


    public void init() {
        textfield = new TextField();
        ok = new Button("ok");
        add(textfield);
        add(ok);

        ok.addActionListener(new OkListener());
    }

    public void paint(Graphics g) {
        textfield.setSize(100,50);
        textfield.setLocation(10,10);
        ok.setSize(40,20);
        ok.setLocation(40,70);

        g.drawString("De uitkomst is:  " + uitkomst, 10,120);
    }

    class OkListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            String getal = textfield.getText();
            text = Double.parseDouble(getal);
            uitkomst = ((text / 100) * 21) + text;
        repaint();
        }
    }
}
