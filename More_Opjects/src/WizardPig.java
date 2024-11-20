
public class WizardPig {
    //attributes
    
   private String name;
    int weight;
    
    
    //contructors 
    //defult constructor 
    
    public WizardPig(){
        this.name ="Porky";
        this.weight = 10;
    }//end defult 
    
    public WizardPig(String name,int weight){
        this.name = name;
        this.weight = weight;
    }//end pig
    
    
    public void setName(String name){
    this.name = name;
    }
    public String getName(){
        return name;
    }
    
    
    public void displayPig(){
        System.out.println("Name: "+name);
        System.out.println("Weight "+weight);
    }
}// end class
