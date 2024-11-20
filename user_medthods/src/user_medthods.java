
import java.util.Scanner;
import javax.swing.JOptionPane;


public class user_medthods {

   
    public static void numb(int n1, int n2){
        System.out.println(n1+"+"+n2+"="+(n1+n2));
    
    }//end numb
    
    public static void numb(){
        Scanner input = new Scanner(System.in);
        System.out.println("Type in a number");
        
        int number1=input.nextInt();
        System.out.println("Type in a another number");
        int number2=input.nextInt();
        System.out.println(number1+"+"+number2+"="+(number1+number2));
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
   
    Scanner input = new Scanner(System.in);
        System.out.println("Type in a number");
        
        int number1=input.nextInt();
        System.out.println("Type in a another number");
        int number2=input.nextInt();
        
        numb(number1,number2);
        
        numb(5,6);
        
      String numb = JOptionPane.showInputDialog("Type in a number");
    int numbC = Integer.parseInt(numb);
        System.out.println("The number is "+numbC);
    
    }//end main
    
}// end class
