/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 278253
 */
public class sheep {

    private String name;
    private double hp;
    Sword s;

    public sheep(String name, double hp,Sword s) {
        this.name = name;
        this.hp = hp;
        this.s = s;

    }
    public void attack(){
        System.out.println(name+" attakes with "+s.getName());
        System.out.println(name+" does "+s.getDamage()+" damage!");
    }


}
