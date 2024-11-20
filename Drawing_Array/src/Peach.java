
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Peach extends JPanel {

    public void paintComponent(Graphics g) {

        super.paintComponent(g);

        Color[] c = new Color[5];

        c[0] = Color.BLUE;
        c[1] = Color.RED;
        c[2] = Color.GREEN;
        c[3] = Color.GRAY;
        c[4] = Color.ORANGE;
        
        this.setBackground(c[3]);
        g.setColor(c[0]);
        g.drawRect(10, 55, 100, 30);
        
        g.setColor(c[4]);
        g.fillOval(10, 95, 100, 30);
        
        g.setColor(c[1]);
        g.fill3DRect(10, 160, 100, 30, true);
    }// end paints 

}
