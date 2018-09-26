package H04;

import H02.String;

import java.awt.*;
import java.applet.*;

public class Praktijkopdracht extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.white);
        g.drawLine(100, 100, 100, 100);
        g.drawString("Lijn", 190, 320);
        g.drawRect(100, 330, 200, 100);
        g.drawString("Rechthoek", 170, 450);
        g.drawRoundRect(100, 460, 200, 100, 30,30);
        g.drawString("Afgeronde rechthoek", 140, 580);
        g.setColor(Color.magenta);
        g.fillRect(330, 330, 200, 100);
        g.setColor(Color.black);
        g.drawOval(330,330, 200, 100);
        g.drawString("Gevulde rechthoek met ovaal", 350, 450);
        g.setColor(Color.magenta);
        g.fillOval(330,460, 200, 100);
        g.setColor(Color.black);
        g.drawString("Gevulde ovaal", 380, 580);
        g.drawOval(600, 460, 100, 100);
        g.drawString("Cirkel", 635, 580);
        g.drawOval(550,330, 200, 100);
        g.setColor(Color.magenta);
        g.fillArc(550, 330, 200,100, 0, 45);
        g.setColor(Color.black);
        g.drawString("Taartpunt met ovaal eromheen", 565, 450);


    }
}
