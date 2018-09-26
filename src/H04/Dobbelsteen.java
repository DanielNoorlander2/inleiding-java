package H04;

import java.awt.*;
import java.applet.*;

public class Dobbelsteen extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.white);
        g.drawRoundRect(300,300,300, 300, 200, 200);
        g.fillOval(350, 350, 50, 50);
        g.fillOval(350, 500, 50, 50);
        g.fillOval(500, 350, 50, 50);
        g.fillOval(500, 500, 50, 50);

    }

    }
