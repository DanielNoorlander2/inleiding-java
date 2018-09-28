package H08;


import java.applet.*;
import java.awt.*;
import java.awt.event.*;


public class BTW extends Applet {
    Button knop;
    TextField tekstvak;
    Label label;


    public void init() {
        tekstvak = new TextField("", 30);
        knop = new Button("Ok");
        label = new Label("Type een bedrag");
        add(knop);
        add(tekstvak);
        add(label);

}



}
