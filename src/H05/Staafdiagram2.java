package H05;

import java.awt.*;
import java.applet.*;


public class Staafdiagram2 extends Applet {
    int Hans;
    int Jeroen;
    int Valerie;


    public void init() {
        Hans = 80;
        Jeroen = 100;
        Valerie = 40;

    }

    public void paint(Graphics g){
        setBackground(Color.white);
        g.setColor(Color.blue);
        g.fillRect(450, 550 - Jeroen * 5, 50, Jeroen * 5); //Jeroen
        g.setColor(Color.RED);
        g.fillRect(300, 550 - Hans * 5, 50, Hans * 5); //Hans
        g.setColor(Color.green);
        g.fillRect(150, 550 - Valerie * 5, 50, Valerie * 5); //Valerie
        g.setColor(Color.black);
        g.drawString("Hans", 300, 570);
        g.drawString("Jeroen", 450, 570);
        g.drawString("Valerie", 150, 570);

    }
}
