package H08;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Tekstknop extends Applet {
    TextField tekstvak;
    Button knop;
    Button knop2;
    String s;

    public void init() {
        tekstvak = new TextField("", 30);
        knop = new Button("Ok");
        knop2 = new Button("Reset");
        knop.addActionListener (new Knoplistener());
        knop2.addActionListener(new ResetListener());
        add(tekstvak);
        add(knop);
        add(knop2);
    }

    public void paint(Graphics g) {
        g.drawString(s, 50, 60);
}

    class Knoplistener implements ActionListener {
        public void actionPerformed( ActionEvent e ) {
            s = tekstvak.getText();
            repaint();
        }}



    class ResetListener implements ActionListener	{
        public void actionPerformed( ActionEvent e ) {
            tekstvak.setText("");
            repaint();
        }
    }}



