package hs08;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdr2 extends Applet {

    Button man;
    Button vrouw;
    Button kindjongen;
    Button kindmeisje;
    int counterman, countervrouw,counterjongen,countermeisje,countertotaal;

    public void init() {
        setBackground(Color.orange);

        man = new Button("Man");
        vrouw = new Button("Vrouw");
        kindjongen = new Button("Jongen");
        kindmeisje = new Button("Meisje");
        add(man);
        add(vrouw);
        add(kindjongen);
        add(kindmeisje);

        counterman = 0;
        countervrouw = 0;
        counterjongen = 0;
        countermeisje = 0;
        countertotaal = 0;

        man.addActionListener(new ManListener());
        vrouw.addActionListener(new VrouwListener());
        kindjongen.addActionListener(new Jongenlistener());
        kindmeisje.addActionListener(new MeisjeListener());
    }

    public void paint(Graphics g) {
        man.setSize(60,20);
        man.setLocation(10,10);
        vrouw.setSize(60,20);
        vrouw.setLocation(10,40);

        kindjongen.setSize(60,20);
        kindjongen.setLocation(80,10);
        kindmeisje.setSize(60,20);
        kindmeisje.setLocation(80,40);

        g.drawString("Mannen: " + counterman,10,100);
        g.drawString("Vrouwen: " + countervrouw,10,120);
        g.drawString("Jongens: " + counterjongen,10,140);
        g.drawString("Meisjes: " + countermeisje,10,160);
        g.drawString("Totaal: " + countertotaal,10,180);
    }

    class ManListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            counterman++;
            countertotaal++;
            repaint();
        }
    }

    class VrouwListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            countervrouw++;
            countertotaal++;
            repaint();
        }
    }

    class Jongenlistener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
           counterjongen++;
            countertotaal++;
           repaint();
        }
    }

    class MeisjeListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            countermeisje++;
            countertotaal++;
            repaint();
        }
    }
}
