

/**
 *
 * @author wmounger
 */
public class Critter {
    public String name;
    public int happiness;
    public int hunger;
    
    
    public Critter(String name){
        this.name = name;
        happiness = 5;
        hunger = 5;
        System.out.println(name+" is born!");
    }//end Critter
    
    
    public void talk(){
        if(happiness > 8){
            System.out.println(name+ " squeals with excitment");
        }else if(happiness > 5){
            System.out.println(name+ " looks at you and says meh");
        }else if(happiness > 2){
            System.out.println(name+ " glares at you menacingly");
        }else{
            System.out.println(name+ " plants a bomb on your toilet.");
        }//end happiness
        
        if(hunger > 8){
            System.out.println(name+ " plops down and rubs it's belly");
        }else if(hunger > 5){
            System.out.println(name+ " says:  I could eat.");
        }else if(hunger > 2){
            System.out.println(name+ " stares at you and drools.");
        }else{
            System.out.println(name+ " charges your leg with a fork and knife in hand..");
        }//end happiness
        
    }//end talk
    
    public void feed(int f){
        System.out.println(name+ " eats. ");
        hunger += f;
    }//end feed
    
    public void play(int p){
        System.out.println(name+ " plays");
        happiness+= p;
    }//end play
    
}//end main
