package hs11;

import java.applet.Applet;
import java.awt.*;

public class Opdr9 extends Applet {

    public void init() {

    }

    public void paint(Graphics g) {
        int x = 10, y = 10;
        int breedte = 10, hoogte = 10;

        for (int kolom = 0; kolom < 8; kolom++){
            g.drawRect(x, y, breedte, hoogte);

            if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6){
                g.setColor(Color.BLACK);
                g.fillRect(x,y,breedte,hoogte);
            }
            else {
                g.setColor(Color.WHITE);
                g.fillRect(x,y,breedte,hoogte);
            }
            x += breedte;
        }

        x = 10;
        y += hoogte;

        for (int kolom = 0; kolom < 8; kolom++){
            g.drawRect(x, y, breedte, hoogte);

            if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6){
                g.setColor(Color.white);
                g.fillRect(x,y,breedte,hoogte);
            }
            else {
                g.setColor(Color.BLACK);
                g.fillRect(x,y,breedte,hoogte);
            }
            x += breedte;
        }

        x = 10;
        y += hoogte;

        for (int kolom = 0; kolom < 8; kolom++){
            g.drawRect(x, y, breedte, hoogte);

            if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6){
                g.setColor(Color.BLACK);
                g.fillRect(x,y,breedte,hoogte);
            }
            else {
                g.setColor(Color.WHITE);
                g.fillRect(x,y,breedte,hoogte);
            }
            x += breedte;
        }

        x = 10;
        y += hoogte;

        for (int kolom = 0; kolom < 8; kolom++){
            g.drawRect(x, y, breedte, hoogte);

            if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6){
                g.setColor(Color.white);
                g.fillRect(x,y,breedte,hoogte);
            }
            else {
                g.setColor(Color.BLACK);
                g.fillRect(x,y,breedte,hoogte);
            }
            x += breedte;
        }

        x = 10;
        y += hoogte;

        for (int kolom = 0; kolom < 8; kolom++){
            g.drawRect(x, y, breedte, hoogte);

            if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6){
                g.setColor(Color.BLACK);
                g.fillRect(x,y,breedte,hoogte);
            }
            else {
                g.setColor(Color.WHITE);
                g.fillRect(x,y,breedte,hoogte);
            }
            x += breedte;
        }

        x = 10;
        y += hoogte;

        for (int kolom = 0; kolom < 8; kolom++){
            g.drawRect(x, y, breedte, hoogte);

            if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6){
                g.setColor(Color.white);
                g.fillRect(x,y,breedte,hoogte);
            }
            else {
                g.setColor(Color.BLACK);
                g.fillRect(x,y,breedte,hoogte);
            }
            x += breedte;
        }

        x = 10;
        y += hoogte;

        for (int kolom = 0; kolom < 8; kolom++){
            g.drawRect(x, y, breedte, hoogte);

            if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6){
                g.setColor(Color.BLACK);
                g.fillRect(x,y,breedte,hoogte);
            }
            else {
                g.setColor(Color.WHITE);
                g.fillRect(x,y,breedte,hoogte);
            }
            x += breedte;
        }

        x = 10;
        y += hoogte;

        for (int kolom = 0; kolom < 8; kolom++){
            g.drawRect(x, y, breedte, hoogte);

            if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6){
                g.setColor(Color.white);
                g.fillRect(x,y,breedte,hoogte);
            }
            else {
                g.setColor(Color.BLACK);
                g.fillRect(x,y,breedte,hoogte);
            }
            x += breedte;
        }

        g.drawRect(10,10,80,80);
    }
}
