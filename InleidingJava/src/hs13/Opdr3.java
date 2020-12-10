package hs13;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdr3 extends Applet {

    Button baksteen, beton;
    int width = 0;
    int heigth = 0;
    Color color;
    int widthScreen; int heigthScreen;

    public void init() {

        widthScreen = 1000; heigthScreen = 1000;
        setSize(widthScreen, heigthScreen);
        baksteen = new Button("baksteen");
        beton = new Button("beton");
        add(baksteen);
        add(beton);

        baksteen.addActionListener(new BaksteenClass());
        beton.addActionListener(new BetonClass());
        setBackground(Color.red);
    }

    public void paint(Graphics g) {
        if (width != 0 && heigth != 0) tekenMuur(g, width,heigth, color );
    }

    void tekenMuur (Graphics g, int width, int height, Color color) {
        g.setColor(color);
        int numberOfBricksRow = widthScreen / width;
        int numberOfBricksColumn = heigthScreen / height;
        int x = 0;
        int y = 0;
        for (int rows = 0; rows < numberOfBricksColumn; rows++){
            if (rows % 2 == 0){
                x = this.drawRowOfBricks(numberOfBricksRow, g, x, y, width, height);
            }  else {
                g.drawRect(0, y, width / 2, height);
                g.drawRect(widthScreen - width / 2, y, width /2 , height);
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
    private int drawRowOfBricks (int numberOfBricksRow, Graphics g, int x , int y, int width, int height){
        for (int column = 0; column < numberOfBricksRow; column++){
            g.drawRect(x,y,width,height);
            x += width;
        }
        return x;
    }
    class BaksteenClass implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            width = 20; heigth = 10; color = Color.WHITE;
            setBackground(Color.red);
            repaint();
        }
    }

    class BetonClass implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            width = 50; heigth = 20; color = Color.WHITE;
            setBackground(Color.gray);
            repaint();
        }
    }

}
