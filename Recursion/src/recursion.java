/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 278253
 */
public class recursion {

   public static int factorial(int n){
     
      int answer = 1; 
       
       for(int i =n; i>0; i-- ){
        
  
       answer *= i;
       }//end if 
       
       if (n ==0){
           return 0;
       }//end if 
       return answer;
   }//end fact
    
    public static int other(int n){
        int results;
        if(n==1){
        return 1;
        }//end if 
        results = other(n-1) *n;
        return results;
    }
    
    
    
    
    
    public static void main(String[] args) {
        // TODO code application logic here
 
        System.out.println(factorial(31));
    
    
        System.out.println(other(9));
    
    
    
    }//end main
    
}//end class
