
public class array_random {

    public static void fillarray(int[] array) {

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10);
          //  System.out.println("Inserting " + array[i] + " into slot " + i);
        }//end for 

    }//end farry 
public static void printarray(int[] array){
    
    for(int i = 0; i<array.length; i++){
        array[i ] =(int)(Math.random()*10);
        System.out.println("slot "+i+": "+array[i]);
    }// end for 
}//end parray 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      int[] array = new int[50];
 /* 
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10);
            System.out.println("Inserting " + array[i] + " into slot " + i);
        }
*/
        fillarray(array);
        printarray(array);
    }//end main 

}//end class
