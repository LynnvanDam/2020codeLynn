package hs08;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdr1 extends Applet {

    Button ok;
    Button reset;
    TextField textvak;
    TextField textvak2;

    public void init() {
        setBackground(Color.DARK_GRAY);

        ok = new Button("ok");
        reset = new Button("reset");
        textvak = new TextField();
        textvak2 = new TextField();
        add(ok);
        add(reset);
        add(textvak);
        add(textvak2);

        ok.addActionListener(new OkListener());
        reset.addActionListener(new ResetListener());
    }

    public void paint(Graphics g) {
        ok.setLocation(20,75);
        ok.setSize(40,20);
        reset.setLocation(80,75);
        reset.setSize(40,20);

        textvak.setLocation(10,10);
        textvak.setSize(150,50);
        textvak2.setLocation(10,110);
        textvak2.setSize(150,50);

        textvak.setText("...");
        textvak2.setText("...");
    }

    class OkListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {

            String message = textvak.getText();
            textvak2.setText(message);
        }

    }

    class ResetListener implements ActionListener{

        public void actionPerformed(ActionEvent e) {

            textvak.setText("...");
            textvak2.setText("...");

        }
    }

}
