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
public class Rectangle {
    private int width;
    private int heigh;
    
    Rectangle(){
    
    }

    public int getWidth() {
        return width;
    }

    public int getHeigh() {
        return heigh;
    }
    public void setWidth(int width){
        this.width = width;
    }
    
     public void setHeigh(int heigh) {
        this.heigh = heigh;
    }

    Rectangle(int a, int b){
        this.width = a;
        this.heigh = b;
    
   

    }
    void display() {
        for(int i = 0; i<=this.width; i++){
            for(int j = 0; j<this.heigh; j++){
                System.out.print("#");
            }
            System.out.println();
        }
    }
}
