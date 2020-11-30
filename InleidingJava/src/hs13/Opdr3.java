package hs13;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdr3 extends Applet {

    int nummer;
    Button baksteen, beton;

    public void init() {
        baksteen = new Button("baksteen");
        beton = new Button("beton");
        add(baksteen);
        add(beton);

        baksteen.addActionListener(new BaksteenListener());
        beton.addActionListener(new BetonListener());
    }

    public void paint(Graphics g) {
        if (nummer == 1) {
            tekenBaksteen(g);
        }
    }

    void tekenBaksteen(Graphics g){
        setBackground(Color.red);
        g.setColor(Color.WHITE);
        int i;
        int length = 10;
        int x1 = 0;
        int x2 = 300;
        int y = 35;
        for (i = 0;i < 20; i++){
            g.drawLine(x1,y,x2,y);
            y += 15;
        }

        int y1 = 35; int b1 = 50;
        int y2 = 50; int b2 = 65;
        int x3 = 10; int z1 = 25;
        int x4 = 10; int z2 = 25;
        for (i = 0; i <= length; i++){
            g.drawLine(x3,y1,x4,y2);
            g.drawLine(z1,b1,z2,b2);
            x3 += 30;
            x4 += 30;
            z1 += 30;
            z2 += 30;
            if (i == length){
                i = 0;
                x3 = 10;
                x4 = 10;
                z1 = 25;
                z2 = 25;
                y1 += 30;
                y2 += 30;
                b1 += 30;
                b2 += 30;
            }
        }

    }

    class BaksteenListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            nummer = 1;
            repaint();
        }
    }

    class BetonListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            nummer = 2;
        }
    }


}
