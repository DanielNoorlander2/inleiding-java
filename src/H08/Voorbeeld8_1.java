package H08;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;


public class Voorbeeld8_1 extends Applet {
    Button knop;
    String schermtekst;

    public void init() {
        schermtekst = "Hallo";
        knop = new Button();
        KnopListener kl = new KnopListener();
        knop.addActionListener( kl);
        add(knop);
    }

    public void paint(Graphics g) {
        g.drawString(schermtekst, 50, 60 );
    }
    class KnopListener implements ActionListener {
        public void actionPerformed ( ActionEvent e){
            schermtekst = "Hey  " ;
            repaint();
        }

    }
}