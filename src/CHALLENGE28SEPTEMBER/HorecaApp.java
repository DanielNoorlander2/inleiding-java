package CHALLENGE28SEPTEMBER;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class HorecaApp extends Applet {
    Button fris;
    Button bier;
    Button wijn;
    Button koffie;
    Button binn;
    Button buit;
    Button nieuw;

    double bestelling;
    double totaal;

    public void init() {
        bestelling = 0;
        totaal = 0;

        fris = new Button("Fris");
        bier = new Button("Bier");
        wijn = new Button("Wijn");
        koffie = new Button("Koffie");
        binn = new Button("Binn gedist.");
        buit = new Button("Buit gedist.");
        nieuw = new Button("Nieuwe Bestelling");

        fris.addActionListener(new FrisListener());
        bier.addActionListener(new BierListener());
        wijn.addActionListener(new WijnListener());
        koffie.addActionListener(new KoffieListener());
        binn.addActionListener(new BinnListener());
        buit.addActionListener(new BuitListener());
        nieuw.addActionListener(new NieuwListener());

        add(fris);
        add(bier);
        add(wijn);
        add(koffie);
        add(binn);
        add(buit);
        add(nieuw);

    }

    public void paint(Graphics g) {
        g.drawString("Totaal dagomzet:", 100, 180);
        g.drawString("Bestelling totaal:", 100, 160);
        g.drawString((""+ bestelling), 200, 160);
        g.drawString((""+ totaal), 200, 180);

    }


    class FrisListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            bestelling = bestelling + 2.25;
            totaal = totaal + 2.25;
            repaint();


        }
    }

    class BierListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            bestelling = bestelling + 2.50;
            totaal = totaal + 2.50;
            repaint();

        }
    }

    class WijnListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            bestelling = bestelling + 2.75;
            totaal = totaal + 2.75;
            repaint();

        }
    }

    class KoffieListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            bestelling = bestelling + 2;
            totaal = totaal + 2;
            repaint();

        }
    }

    class BinnListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            bestelling = bestelling + 3;
            totaal = totaal + 3;
            repaint();

        }
    }

    class BuitListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            bestelling = bestelling + 3.75;
            totaal = totaal + 3.75;
            repaint();

        }
    }

    class NieuwListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            bestelling = 0;
            repaint();


        }
    }
}