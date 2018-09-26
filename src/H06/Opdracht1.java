package H06;

import java.awt.*;
import java.applet.*;


public class Opdracht1 extends Applet {
    double a,c;
    double uitkomst;


    public void init() {
        a = 113;
        c = 4;
        uitkomst = (a / c);
    }

    public void paint(Graphics g) {
        g.drawString("De uitkomst is: " + uitkomst, 20, 20);
        g.drawString("Jan: $ " + uitkomst,20, 40);
        g.drawString("Jeanette: $ " + uitkomst,20, 60);
        g.drawString("Ali: $ " + uitkomst,20, 80);
        g.drawString("Daniël: $ " + uitkomst,20, 100);

    }


}
