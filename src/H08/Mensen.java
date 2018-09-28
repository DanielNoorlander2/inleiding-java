package H08;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Mensen extends Applet {
    Button mannen;
    Button vrouwen;
    Button jongens;
    Button meisjes;
    int man;
    int vrouw;
    int jongen;
    int meisje;

    public void init() {
        man = 0;
        vrouw = 0;
        jongen = 0;
        meisje = 0;
        mannen = new Button("Mannen");
        vrouwen = new Button("Vrouwen");
        jongens = new Button("Jongens");
        meisjes = new Button("Meisjes");
        mannen.addActionListener(new MannenListener());
        vrouwen.addActionListener(new VrouwenListener());
        jongens.addActionListener(new JongensListener());
        meisjes.addActionListener(new MeisjesListener());
        add(mannen);
        add(vrouwen);
        add(jongens);
        add(meisjes);

    }

    public void paint(Graphics g) {
        g.drawString("" +  man,95, 80);
        g.drawString("" + vrouw,160, 80);
        g.drawString("" + jongen,225, 80);
        g.drawString("" + meisje,290, 80);
        g.drawString("Totaal", 100, 140);
        g.drawString((""+ (man + vrouw + jongen + meisje)), 100, 170);
    }


    class MannenListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            man = man + 1;
            repaint();


        }
    }

    class VrouwenListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            vrouw = vrouw + 1;
            repaint();

        }
    }

    class JongensListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            jongen = jongen + 1;
            repaint();

        }
    }

    class MeisjesListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            meisje = meisje + 1;
            repaint();

        }
    }
}