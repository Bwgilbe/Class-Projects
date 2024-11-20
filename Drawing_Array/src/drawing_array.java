
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class drawing_array {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   
    JFrame f = new JFrame("My fruit");
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    Peach p = new Peach();
    f.add(p);
    f.setSize(500,270);
    f.setVisible(true);
    }
    
}
