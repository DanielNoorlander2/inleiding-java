package CHALLENGE28SEPTEMBER;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;



public class StaafdiagramCHALLENGE extends Applet {
    int Hans;
    int Jeroen;
    int Valerie;
    TextField valerie2;
    TextField jeroen2;
    TextField hans2;
    Button toon;


    public void init() {
        Hans = 80;
        Jeroen = 100;
        Valerie = 40;

         valerie2 = new TextField("", 10);
         jeroen2  = new TextField("", 10);
         hans2 = new TextField("", 10);
         toon = new Button("Toon");
         toon.addActionListener(new ToonListener());

        add(hans2);
        add(valerie2);
        add(jeroen2);
        add(toon);


    }

    public void paint(Graphics g){
        setBackground(Color.white);
        g.setColor(Color.RED);
        g.fillRect(450, 680 - Jeroen * 5, 50, Jeroen * 5); //Jeroen
        g.setColor(Color.RED);
        g.fillRect(300, 680 - Hans * 5, 50, Hans * 5); //Hans
        g.setColor(Color.RED);
        g.fillRect(150, 680 - Valerie * 5, 50, Valerie * 5); //Valerie
        g.setColor(Color.black);
        g.drawLine(200, 200, 200, 200);
        g.drawString("Hans", 300, 700);
        g.drawString("Jeroen", 450, 700);
        g.drawString("Valerie", 150, 700);

        g.drawString("Valerie", 260, 40);
        g.drawString("Hans", 360, 40);
        g.drawString("Jeroen", 460, 40);


    }

    class ToonListener implements ActionListener {
        public void actionPerformed( ActionEvent e ) {
             valerie2.getText();
             repaint();
        }
    }
}
