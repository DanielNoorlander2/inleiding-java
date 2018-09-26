package H04;

import java.awt.*;
import java.applet.*;

public class Staafdiagram extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
            setBackground(Color.white);
            g.setColor(Color.blue);
            g.fillRect(700, 150, 50, 400); //Jeroen
            g.setColor(Color.RED);
            g.fillRect(550, 230, 50, 320); //Hans
            g.setColor(Color.green);
            g.fillRect(400, 390, 50, 160); //Valerie
        g.setColor(Color.black);
        g.drawString("Valerie", 410, 570 ); //40 kg
        g.drawString("Jeroen", 710, 570 ); //100 kg
        g.drawString("Hans", 560, 570 ); //80 kg





    }
}

