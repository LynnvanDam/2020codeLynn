package hs06;

import java.applet.Applet;
import java.awt.*;

public class opdr2 extends Applet {

    int minuut,uur,dag,jaar,uurproduct,dagproduct,jaarproduct;

    public void init() {
        minuut = 60;
        uur = 60;
        dag= 24;
        jaar = 365;
        uurproduct = minuut * uur;
        dagproduct = minuut * uur * dag;
        jaarproduct = minuut * uur * dag * jaar;

        setBackground(Color.DARK_GRAY);
    }

    public void paint(Graphics g) {
        g.setColor(Color.WHITE);
        g.drawString("uur: " + uurproduct + " seconden",20,20);
        g.drawString("dag: " + dagproduct + " seconden",20,40);
        g.drawString("jaar: " + jaarproduct + " seconden",20,60);
    }
}
