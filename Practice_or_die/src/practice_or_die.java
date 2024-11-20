//does it return something does it print something 

public class practice_or_die {

    public static int add(int n1, int n2) {
        int total = n1 + n2;

        return total;

    }
    
    
    public static double number(int n1, int n2, int n3, int n4, double n5){
       double total = (n1+n2*n3-n4)*n5;
        return total;
    }

    public static boolean hi(String n1, String n2) {

        if (n1.equals(n2)) {
        } else {
return false;
        }
    
    }
    
    
    
    

/**
 * @param args the command line arguments
 */
public static void main(String[] args) {
        // TODO code application logic here
    
    add(2,5);
    
        System.out.println(add(2,5));
    
    number(5,4,5,5,4);
    
    System.out.println(number(5,4,5,5,4));
    }//end main
    
}//end class
