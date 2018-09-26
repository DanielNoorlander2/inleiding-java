package H04;

import java.awt.*;
import java.applet.*;

public class Huisje extends Applet {

    public void init() {
    }

   public void paint (Graphics g)  {
        setBackground(Color.white);
        g.setColor(Color.black);
        g.drawLine(300, 300, 240, 420); //diagonale lijn links
        g.drawLine(300, 300, 360, 420); //diagonale lijn rechts
        g.drawLine(360, 420, 240, 420); //onderste lijn links
        g.drawRect(240, 420, 120, 150);//huisje
        g.drawRect(270 ,520, 30 , 50);
        g.drawRect(315, 440, 25, 25);
   }
}
