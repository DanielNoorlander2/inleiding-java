package H04;

import java.awt.*;
import java.applet.*;

public class Ellips extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.BLUE);
        g.setColor(Color.yellow);
        g.fillArc(300, 300, 400, 200, 240, 360);
    }
}