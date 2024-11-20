
public class randomnumb {

    public static void random1() {
        //o-9
        int rand = (int) (Math.random() * 10);
        System.out.println(rand);

    }//end random

    public static void random2() {
        //o-50
        int rand = (int) (Math.random() * 51); //changes the amount of whats being gen'd
        System.out.println(rand);

    }//end random

    public static void random3() {
        //10-100 // out side to make 0 10 and make 101 111 so subtract 10 to 101 and get 91
        int rand = (int) (Math.random() * 91) + 10;
        System.out.println(rand);

    }//end random

    public static int random4(){
        //o-9
        int rand = (int)(Math.random()*10);
        
        
        
        //System.out.println(rand);
        return rand;
    }//end random
    
    public static void main(String[] args) {
        // TODO code application logic here
        random1();
        random2();

        random3();
        
        int r = random4();

    }//end main

}// end class
