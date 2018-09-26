package H02;

import java.awt.*;
import java.applet.*;

public class String2 extends Applet {

    public void init() {
        setBackground(Color.white);
    }

    public void paint(Graphics g) {
        g.setColor(Color.blue);
        g.drawString("Daniel", 50, 30 );
        g.setColor(Color.red);
        g.drawString("Noorlander", 50, 60 );
    }
}