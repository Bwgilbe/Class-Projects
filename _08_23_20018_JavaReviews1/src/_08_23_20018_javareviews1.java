import java.util.Scanner;
import javax.swing.JOptionPane;


//import javax.swing.*;



/**
 *
 * @author 278253
 */
public class _08_23_20018_javareviews1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
    
      
        System.out.print("Furry cheese ");
      System.out.println("fuzzy pickles");
        System.out.println(2+3*5);
       
        //JOptionPane.showMessageDialog(null,"Chicken Sandwich");
    // Pop up box 
    
    
    //______________________________________________________________
    
    //variables
    
    int number1 = 4; // whole numbers, 8, 100, 
    double number2 = 3.456; //ex. anything with decimals 
    float numbers3 = 3456f; //for smaller files  fiatubg poitn numbers  max 7 
    char letter = 'G';  //ex '4' 's' 'r'
    
   letter ++;
   System.out.println(letter);
          
String word = "Hamburger"; //

System.out.print(word.length());



//boolean true or false 

Boolean check = true; //true or false

long n = 234934820; // super big numbers max 9 numbers 

long time = System.currentTimeMillis();
        System.out.println(time);
        
        
        
        //______________________________________________________________
        
        
        
        //user input
        
Scanner input = new Scanner(System.in);//input can be named anything 
 //System.out.println("Yo, type out your name  ");
//String name = input.nextLine();
//String name1 ="" +input.nextLine();
//System.out.println ("Your name is "+name);
    
    //String b = JOptionPane.showInputDialog("Enter your name!");
    
    //System.out.println ("Your name is "+b);
   //conditional statements 
   
   

//if (check == true), if (check), if(true) 
 
//if (check =! true)
//if (!check)

if(number1 == 4){
       System.out.println("soup day");
   }// end if 
    

int num = 5;
if (num == 1){
    System.out.println("Apples");
}else if(num == 2){
    System.out.println("Pears");
}else if(num == 3){
    System.out.println("peaches");
}else{
    System.out.println("Grapes");
}//end if 
        switch (num) {
            case 1:
                System.out.println("Apples");
                break;
            case 2:
                System.out.println("Pears");
                break;
            case 3:
                System.out.println("peaches");
                break;
            default:
                System.out.println("Grapes");
                break; //end switch
        }//end switch 
//compound and nested ifs

int n1 = 0,n2 = 0;

//nested ifs 
if(n1 == 0){
    if(n2 == 0){
        System.out.println("Nested!!!");
    }//end if 
    
}//end nested if 
if (n1 == 0 && n2 == 0){
    System.out.println("Compound!");
}//end compound if 

//boolean 
//== equals 
//!= not equals 
//> greater then 
// < less then 
// >= greater or equal 
//<= ;ess or equal 
// not 
// && and 
// || or 
String name = "bob";
if (name == "bob");
System.out.println("Inncorrect");
if(name.equals("bob")){
    System.out.println("COrrect");
}//end if 

}//end main
    
}//end class
