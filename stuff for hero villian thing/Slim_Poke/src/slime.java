/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 278253
 */
public class slime {

    String name;

    int pokeCount = 0;
    boolean SuperPoke = true;

    public slime(String name) {
        this.name = name;
    }

    public int poke() {
        System.out.println(name + " initiated a poke a gives 1 poke");
        return 1;
    }

    public void getPoke(int p) {
        System.out.println(name + " got poked and gets " + p + " pokes");
        pokeCount += p;
    }

    public int SuperPoke() {
        if (SuperPoke) {

            System.out.println(name + "SUPERPOKES! for 5");
            SuperPoke = false;
            return 5;
        } else {
            System.out.println(name + "'SUPERPOKE is exhausted. . .");
            return 0;
        } 

   
    

    public void status(){
        System.out.println("Name: " + name);
        System.out.println("Number of time poked: " + pokeCount);
        System.out.println("");

    }

}//end slime
