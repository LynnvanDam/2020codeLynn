package hs12;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PraktijkOpdracht extends Applet {

    TextField naam;
    Button ok;
    String text [];
    String drawstring = "";
    int y = 110;
    int teller = 0;

    // array maken -> vullen met elk nummer en naam
    // na 10 regels -> alles laten zien en resetten

    public void init() {
        naam = new TextField();
        ok = new Button("ok");
        add(naam);
        add(ok);

        ok.addActionListener(new OkListener());

        text = new String[10];
    }

    public void paint(Graphics g) {
        naam.setLocation(10,40);
        naam.setSize(50,30);
        ok.setLocation(70,40);
        ok.setSize(30,30);
        if (teller == text.length){
            for (teller = 0; teller < text.length; teller++){
                drawstring = text[teller];
                g.drawString(drawstring,10,y);
                y += 10;
            }
        }
        g.drawString("Vul hier een nummer en naam in:", 10,20);

    }

    class OkListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            String s = naam.getText();

            text[teller] = s;
            teller++;


            repaint();
        }
    }
}
