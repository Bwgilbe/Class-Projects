

// public/private one everyone can use other is only this project 


//static can only be 1 

//void nothing doesnt give a result 

//void can be int, double, ect. 


public class _08_28_18_meathods {
//basic print method 
    public static void display (){
        System.out.println("I need stuff!");
    }//end display 
    
   
    public static void print(String s){
        System.out.println(s);
    }//end print
    
    //n1 and n2 dont have to be ints, double, string ect.
    public static int add(int n1, int n2){
        
       int total = n1 + n2;
       return total;
       
       //return n1+n2;
        
        
    }//end add
    
    
    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { //this main is a methold 
        // TODO code application logic here
    
        
    display();
    
    
    print("yo momma so fat, she her own gravitational pull");
    print("56");
    
    
    // this works but doesnt dispaly 
    
    //display in print 
    
    // save to variable 
    
    add(10, 25);
    
        System.out.println(add(10,25));
    //save 
    int save = add(10,25);
    
    
    
    }//end main;
    
}//end class
