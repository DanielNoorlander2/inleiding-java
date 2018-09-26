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
        mannen = new Button("Mannen");
        vrouwen = new Button("Vrouwen");
        jongens = new Button("Jongens");
        meisjes = new Button("Meisjes");
        mannen.addActionListener(new MannenListener());
        add(mannen);
        add(vrouwen);
        add(jongens);
        add(meisjes);
    }
    class MannenListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            repaint();


        }

    }
}