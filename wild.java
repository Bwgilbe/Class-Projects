import java.util.ArrayList;




public class wild {

    public static double sum(ArrayList<? extends Number>list){
       double total = 0;
    for(Number element: list){
    total += element.doubleValue();
    }//end for

    return total;
    
    
    }
    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   
    // create, initialize, and output arraylist of intgers, then  dipsplay total of elements
    Integer[] integers = {1,2,3,4,5,};
    ArrayList <Integer> integerList = new ArrayList();
    
    for(Integer element: integers){
        integerList.add(element);
        
    }// end for 
    
   System.out.printf("IntegerList contains: %s%n", integerList);
   System.out.printf("total of the elements in integersList: %.of%n%n",sum(integerList));
 
Double[] doubles = {1.1,3.3, 5.5}; 
ArrayList <Double> doubleList = new ArrayList<>();

for (Double element: doubles){
    doubleList.add(element);
}// end for 

System.out.printf("DoubleList contains: %s%n", doubleList);
System.out.printf("total of the elements in doubleList: %.of%n%n",sum(integerList));
   
    Number[] numbers = {1,2.4,3,4.1}; 
    
    ArrayList<Number> numberList = new ArrayList<>();
    
    for(Number element: numbers)
        numberList.add(element);
    
    System.out.printf("Numberlist contains: %s%n", numberList);
    System.out.printf("total of the elements in numberList: %.1f%n",sum(numberList));
    
   
    
    
    }//end main 
    
 
}//end class
