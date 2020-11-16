package hs12;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PraktijkOpdracht extends Applet {

    TextField naam, nummer;
    Button ok;

    // array maken -> vullen met elk nummer en naam
    // na 10 regels -> alles laten zien en resetten

    public void init() {
        naam = new TextField();
        nummer = new TextField();
        ok = new Button("ok");
        add(naam);
        add(nummer);
        add(ok);

        ok.addActionListener(new OkListener());
    }

    public void paint(Graphics g) {

    }

    class OkListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {

        }
    }
}
