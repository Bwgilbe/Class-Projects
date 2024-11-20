
import java.util.Scanner;

public class _08_30_2018_more_methods {

    public static int age = 55;

   public static String formula(int num1, int num2){
      
       int total = num1 + num2;
       
      String answer = num1+" + "+num2+" = "+total; //
       return answer;
       
       //return can just replace string answer
       
       
   }//end formula
    
    
    
    
    public static void display(String n, int age) {

        age = 2000;
        System.out.println("Hello " + n + ". You are " + age + " years old");

    }//end 

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);

        System.out.println(" Enter your name person");
        String name = input.nextLine();

        int age = 21;

        display(name, age);
        System.out.println("Hello " + name + ". You are " + age + " years old");

  
    formula(9000,1);
        System.out.println(formula(9000,1));
    
    }//end main

}// end class
