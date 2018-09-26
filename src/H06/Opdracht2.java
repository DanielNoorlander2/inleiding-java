package H06;

import java.awt.*;
import java.applet.*;


public class Opdracht2 extends Applet {
    double a, b, c, d;
    double dag;
    double uur;
    double jaar;


    public void init() {
        a = 60;
        b = 60;
        c = 24;
        d = 365;
        uur = (a * b);
        dag = (a * b * c);
        jaar = (a * b * c * d);
    }

    public void paint(Graphics g) {
        g.drawString("Aantal seconden in een uur: " + uur, 20, 20);
        g.drawString("Aantal seconden in een dag: " + dag, 20, 40);
        g.drawString("Aantal seconden in een jaar: " + jaar, 20, 60);

    }
}