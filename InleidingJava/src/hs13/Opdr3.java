package hs13;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdr3 extends Applet {

    Button baksteen, beton;

    public void init() {
        //baksteen = new Button("baksteen");
       // beton = new Button("beton");
       // add(baksteen);
       // add(beton);

        setBackground(Color.red);
        setSize(500, 500);
    }

    public void paint(Graphics g) {
        tekenMuur(g, 20,10, Color.white );
    }

    void tekenMuur (Graphics g, int width, int height, Color color) {
        g.setColor(color);
        int numberOfBricksRow = 500 / width;
        int numberOfBricksColumn = 500 / height;
        int x = 0;
        int y = 0;
        for (int rows = 0; rows < numberOfBricksColumn; rows++){
            if (rows % 2 == 0){
                for (int column = 0; column < numberOfBricksRow; column++){
                    g.drawRect(x,y,width,height);
                    x += width;
                }
            }  else {
                g.drawRect(0, y, width / 2, height);
                g.drawRect(500 - width / 2, y, width /2 , height);
                x = width / 2;
                for (int column = 0; column < numberOfBricksRow - 1; column++){
                    g.drawRect(x,y,width,height);
                    x += width;
                }
            }

            y += height;
            x = 0;
        }

    }

    void tekenBeton (Graphics g){

    }



}
