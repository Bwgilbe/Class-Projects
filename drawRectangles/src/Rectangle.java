
import java.awt.*;
import javax.swing.*;

public class Rectangle extends JPanel {

    private double lenght;
    private double width;
    Color c;
    
    
    public Rectangle(double lenght, double width, Color c){
        this.lenght = lenght;
        this.width = width;
        this.c = c;
   JFrame frame1 = new JFrame("Rectangle");
   frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   frame1.add(this);
   frame1.setSize((int)lenght+50, (int)width+50);
   frame1.setVisible(true);
    
   
   
   public void paintComponent(Graphics g){
      super.paintComponent(g);
      g.setColor(c);
      g.fillRect((int)this.lenght,(int)this.width));
   }
    
    
    
    
}//end class
