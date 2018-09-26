package H04;

import java.awt.*;
import java.applet.*;

public class Vlag extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.GRAY);
        g.setColor(Color.black);
        g.drawLine(300,600,300,100);
        g.setColor(Color.RED);
        g.fillRect(300, 100, 140, 40);
        g.setColor(Color.WHITE);
        g.fillRect(300, 140, 140, 40);
        g.setColor(Color.blue);
        g.fillRect(300, 180, 140, 40);

    }
}