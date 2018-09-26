package H05;

import java.applet.Applet;
import java.awt.*;

public class Praktijk extends Applet {
    Color opvulkleur;
    Color lijnkleur;
    int breedte;
    int hoogte;

    public void init() {
        opvulkleur = Color.MAGENTA;
        lijnkleur = Color.BLACK;
        breedte = 200;
        hoogte = 100;
    }

    public void paint(Graphics g) {
        g.drawLine(300, 50, 100, 50);
        g.drawRect(100, 100, breedte, hoogte);
        g.drawRoundRect(100, 225, breedte, hoogte, 30, 30);
        g.setColor(opvulkleur);
        g.fillRect(315, 100, breedte, hoogte);
        g.setColor(lijnkleur);
        g.drawOval(315, 100, breedte, hoogte);
        g.setColor(opvulkleur);
        g.fillOval(315, 225, breedte, hoogte);
        g.setColor(lijnkleur);
        g.drawOval(600, 225, 100, 100);
        g.drawOval(550, 100, 200, 100);
        g.setColor(opvulkleur);
        g.fillArc(550, 100, 200,100, 0, 45);
        g.setColor(lijnkleur);
        g.drawString("Lijn", 190, 75);
        g.drawString("Rechthoek", 170, 215);
        g.drawString("Afgeronde rechthoek", 145, 340);
        g.drawString("Gevulde rechthoek met ovaal", 340, 215);
        g.drawString("Gevulde ovaal", 375, 340);
        g.drawString("Taartpunt met ovaal eromheen", 560, 215);
        g.drawString("Cirkel", 635, 340);






    }
}

