
public class _08_28_2018_maxmin {

    public static double min(double n1, double n2) {
        if (n1 < n2) {
            return n1;
        } else {
            return n2;
        }//end if 
    }//end min

    public static double min(double n1, double n2, double n3) {
       /* if (n1 <= n2 && n1 <= n3) {
            return n1;
        } else if (n2 <= n1 && n2 <= n3) {
            return n2;
        } else {
            return n3;
        }//end if */
       
      return min(n1,min(n2,n3));
    }//end min

    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(min(12.3, 23.6));

        System.out.println(min(1,2,3));
        System.out.println(min(1,1,3));
        System.out.println(min(1,3,1));
    }//end main

}//end class
