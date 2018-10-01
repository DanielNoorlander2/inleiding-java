package H06;

import java.awt.*;
import java.applet.*;


public class PraktijkopdrachtH6 extends Applet {
    float a,b,c,d,deler;
    float uitkomst;
    float conversie;


    public void init() {
        a = 59;
        b = 63;
        c = 69;
        d = 10;
        deler = 3;
        uitkomst = ((a + b + c) / deler);
        conversie = (uitkomst / d);




    }

    public void paint(Graphics g) {
        g.drawString("Het gemiddelde van 5,9:6,3:6,9 is: " + conversie, 20, 20);

    }
}

