package H06;

import java.awt.*;
import java.applet.*;


public class Opdracht3 extends Applet {
    int a,c;
    int uitkomst;


    public void init() {
        a = 2000000000;
        c = 300000000;
        uitkomst = (a + c);
    }

    public void paint(Graphics g) {
        g.drawString(" " + uitkomst, 20, 20);

    }
}
