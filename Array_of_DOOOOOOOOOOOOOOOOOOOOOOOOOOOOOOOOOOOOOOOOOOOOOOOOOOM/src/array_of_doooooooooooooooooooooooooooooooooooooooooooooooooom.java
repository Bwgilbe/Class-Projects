
public class array_of_doooooooooooooooooooooooooooooooooooooooooooooooooom {

    public static void fillarray(int[] array) {

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10);
            //  System.out.println("Inserting " + array[i] + " into slot " + i);
        }//end for 

    }//end farry 

    public static void printarray(int[] array) {

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10);
            System.out.println("slot " + i + ": " + array[i]);
        }// end for 
    }//end parray 

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] array = new int[200];

        int[] arrayN = new int[5];
        arrayN[0] = 3;
        arrayN[1] = 5;
        arrayN[2] = 6;
        arrayN[3] = 2;
        arrayN[4] = 8;
        //char[] arrayC = new char[] = {'T', 'E', 'A', 'C', 'H', 'E', 'R', 'I', 'S', 'G',' R', 'E', 'A', 'T','!'};
        
       
        
        fillarray(array);
        printarray(array);
        printarray(arrayN);

    }

}


//3, 5, 6, 2, 8
