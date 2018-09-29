/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap3;

/**
 *
 * @author MyPC
 */
public class HinhTamGiac {
    private int ma;
    private int mb;
    private int mc;
    
    HinhTamGiac(){
        ma = mb = mc = 0;
    }
    
    HinhTamGiac(int a, int b, int c){
        if(a <= 0){
            this.ma = 0;
            System.out.println("Canh tam giac khong the la so am");
        }
        if(b <= 0){
            this.mb = 0;
            System.out.println("Canh tam giac khong the la so am");
        }
        if(c <= 0){
            this.mc = 0;
            System.out.println("Canh tam giac khong the la so am");
        }
        if(a+b <=c || a+c <=b || b+c <=a ){
            System.out.println("Khong phai hinh tam giac");
            this.ma = this.mb = this.mc = 0;
        }
        ma= a;
        mb = b;
        mc = c;
    }
    
    public void setCanhA(int v){
        this.ma = v;
    }
    public int getCanhA(){
        return this.ma;
    }
    public void setCanhB(int v){
        this.mb = v;
    }
    public int getCanhB(){
        return this.mb;
    }
    public void setCanhC(int v){
        this.mc = v;
    }
    public int getCanhC(){
        return this.mc;
    }
    
    public boolean laTamGiac(){
        return !(this.ma+this.mb <=this.mc || this.ma+this.mc <=this.mb || this.mb+this.mc <=this.ma);
    }
    
    public boolean laTamGiac(int a, int b, int c){
        return !(a+b <=c || a+c <=b || b+c <=a);
    }
    
    public int getChuVi(){
        return this.ma + this.mb + this.mc;
    }
    
    
}
