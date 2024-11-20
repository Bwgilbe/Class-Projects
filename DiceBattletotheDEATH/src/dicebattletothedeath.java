
import java.util.Scanner;







public class dicebattletothedeath {

    
    public static int roll(){
         int rand = (int) (Math.random() * 11) + 2;
        return rand;

    }
    public static void battle(){
        Scanner input = new Scanner(System.in);
        String n1;
        System.out.println("Whats your name?");
        n1 = input.nextLine();
        System.out.println("Okay "+n1+", Let the games begin");
        System.out.println(n1+" rolls "+roll());
        System.out.println("Computer rolls "+roll());
    
    }
    
    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
  
    
  battle();
    
    
    
    
    
    
    
    
    }
    
}
