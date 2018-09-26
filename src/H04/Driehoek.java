package H04;

import java.awt.*;
import java.applet.*;

public class Driehoek extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.white);
        g.setColor(Color.black);
        g.drawLine(150, 150, 120, 210); //diagonale lijn links
        g.drawLine(150, 150, 180, 210); //diagonale lijn rechts
        g.drawLine(180, 210, 120, 210); //onderste lijn links


    }
}
