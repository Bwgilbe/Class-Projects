
public class search_array {

    public static int[] array = {5, 2, 3, 4, 5};
/// replace all
    public static void find(int n) {
        boolean found = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == n) {
                System.out.println("Found " + n + " at location " + i);
                found = true;
            }//end if 
        }//end for 
        if (!found) {
            System.out.println("Number not found ");
        }
    }
//replace one
    public static boolean find2(int n) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == n) {
                System.out.println("fount it, leaving method");
                return true;
            }//end if 

        }//end for 
        System.out.println(" didnt find it ");
        return false;
    }

    public static void replaceAll(int n, int replace) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == n) {
                System.out.println("Replacing " + n + " at location " + i + " with" + replace);
                array[i] = replace;
            }
        }

    }

    public static boolean ReplaceOne(int n, int replace) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == n) {
                System.out.println("Replacing " + n + " at location " + i + " with" + replace);
                array[i] = replace;
                return true;
            }//end if 
        }//end for 
        return false;
    }//end replace 

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        replaceAll(5, 90001);

        find2(3);

        find(4000);

        ReplaceOne(3, 1000);
    }

}
