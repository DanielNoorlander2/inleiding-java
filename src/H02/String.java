package H02;
import java.awt.*;
import java.applet.*;

public class String extends Applet {

    public void init() {
        setBackground(Color.blue);
    }

    public void paint(Graphics g) {
        g.setColor(Color.yellow);
        g.drawString("Welcome to Daniel's applet!", 50, 60 );
    }
}