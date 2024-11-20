import java.util.Scanner;

/**
 *
 * @author wmounger
 */
public class _11_13_2018_critter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        boolean end = false;
        
        Critter morty = new Critter("Morty");
        
        while(!end){
            System.out.println("Choose an action:");
            System.out.println("1. Talk");
            System.out.println("2. Feed");
            System.out.println("3. Play");
            System.out.println("4. Get info");
            System.out.println("5. Squish");
            int c = input.nextInt();
            
            
            if(c == 1){
                morty.talk();
            }else if(c == 2){
                System.out.println("You have some "+morty.name+" snacks!");
                System.out.println("How many will you give it?");
                int n = input.nextInt();
                System.out.println("You give "+morty.name+" "+n+" snacks");
                morty.feed(n);
            }else if(c == 3){
                System.out.println("You choose to play with "+morty.name);
                System.out.println("How many minutes will you play?");
                int n = input.nextInt();
                System.out.println("You play with "+morty.name+" "+n+" minutes");
                morty.play(n);
            }else if(c == 4){
                System.out.println("Critter name: "+morty.name);
                System.out.println("Happiness: "+morty.happiness);
                System.out.println("Hunger: "+morty.hunger);
            }else if(c == 5){
                end = true;
                System.out.println("You squish poor "+morty.name);
                System.out.println("You monster!");
            }else{
                System.out.println(morty.name+" stares at you weirdly.");
            }//end if
            
            //decrease happiness and hunger by 2
            morty.hunger -= 2;
            morty.happiness -= 2;
            
            
            
        }//end while
        
    }//end main
    
}//end class
