package hs08;

import java.applet.Applet;
import java.awt.*;

public class Opdr1 extends Applet {

    Button ok;

    public void init() {
        setBackground(Color.DARK_GRAY);
        ok = new Button("ok");
        add(ok);

    }

    public void paint(Graphics g) {
        ok.setLocation(20,75);
    }

}
