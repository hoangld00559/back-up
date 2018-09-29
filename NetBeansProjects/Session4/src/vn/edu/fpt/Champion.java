/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vn.edu.fpt;

/**
 *
 * @author MyPC
 */
public class Champion {
    String name;
    int hp;
    int mana;
    int damage;
    
    Champion(){
    
    }
    
    Champion(String name, int hp, int damage, int mana){
        this.name = name;
        this.hp = hp;
        this.damage = damage;
        this.mana = mana;
    }
    void attach(Champion otherPlayer){
        
    }
}
