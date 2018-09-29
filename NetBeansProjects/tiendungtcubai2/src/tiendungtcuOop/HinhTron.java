/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiendungtcuOop;

/**
 *
 * @author MyPC
 */
public class HinhTron {
    private float bankinh;
    private static final float PI = 3.14159f;
    
    public HinhTron(float rad){
        this.bankinh = rad;
    }
    
    public float getRadius(){
        return bankinh;
    }
    
    public double getDienTich (){
        return PI*this.bankinh*this.bankinh;
    }
    
    public double getChuVi (){
        return 2*PI*this.bankinh;
    }
}
