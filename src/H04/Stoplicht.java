package H04;

import java.awt.*;
import java.applet.*;

public class Stoplicht extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.WHITE);
        g.setColor(Color.black);
        g.drawLine(200, 500, 200, 200); //paal
        g.fillRect(175, 200, 50, 100);//bord
        g.setColor(Color.RED);
        g.fillOval(185, 200, 30, 30 );//rode lamp
        g.setColor(Color.ORANGE);
        g.fillOval(185, 230, 30, 30);
        g.setColor(Color.GREEN);
        g.fillOval(185, 260, 30, 30);


    }
}