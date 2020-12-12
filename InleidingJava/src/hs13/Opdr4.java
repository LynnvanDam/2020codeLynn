package hs13;

import java.applet.Applet;
import java.awt.*;

public class Opdr4 extends Applet {

    public void init() {

    }

    public void paint(Graphics g) {
        tekenBoom(g, 10,30,60,50);
    }

    void tekenBoom (Graphics g, int logWidth, int logHeight, int leavesWidth, int leavesHeight) {

        int numberOfTreesRow = 5;
        int xLog = 35;
        int yLog = 55;
        int xLeaves = 10;
        int yLeaves = 10;
        for (int i = 0; i < numberOfTreesRow; i++) {
            g.setColor(new Color(130, 67, 0));
            g.fillRect(xLog, yLog, logWidth, logHeight);

            g.setColor(Color.GREEN);
            g.fillOval(xLeaves, yLeaves, leavesWidth, leavesHeight);
            xLog += 80;
            xLeaves += 80;
        }

        xLog = 35;
        yLog += 80;
        xLeaves = 10;
        yLeaves += 80;

        for (int i = 0; i < numberOfTreesRow; i++) {
            g.setColor(new Color(130, 67, 0));
            g.fillRect(xLog, yLog, logWidth, logHeight);

            g.setColor(Color.GREEN);
            g.fillOval(xLeaves, yLeaves, leavesWidth, leavesHeight);
            xLog += 80;
            xLeaves += 80;
        }


    }
}
