/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vn.fpt;

/**
 *
 * @author MyPC
 */
public class Students {
    private int id;
    private String name;
    private boolean gender;
    
    public Students(){
        this.id = -1;
        this.name = "noname";
        this.gender = true;
        
    }
    
    public Students(int id, String name, boolean gender){
        this.id = id;
        this.name = name;
        this.gender = gender;
    }
    
    public int getId(){
        return this.id;
    }
    
    public void setId(int value){
        this.id = value;
    }
    
    public String getName(){
        return this.name;
    }
    
    public void setName(String value){
        this.name = value;
    }
    
    public boolean isMale(){
        return this.gender;
    }
    
    public void setMale(boolean value){
        this.gender = value;
    }
    
    public void printInfo(){
        System.out.println("----------------------------------------");
        System.out.println("| ID |          Name           | Male |");
        System.out.printf("| %d |     %s |         %b | \n",this.id, this.name, this.gender);
    }
    
}
