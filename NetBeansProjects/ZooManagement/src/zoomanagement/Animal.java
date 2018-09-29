/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zoomanagement;

/**
 *
 * @author MyPC
 */
public abstract class Animal {
    private String ten;
    private int tuoi;
    private String moTa;

    public Animal() {
    }

    public Animal(String ten) {
        this.ten = ten;
    }

    public Animal(String ten, int tuoi) {
        this.ten = ten;
        this.tuoi = tuoi;
    }

    public Animal(String ten, int tuoi, String moTa) {
        this.ten = ten;
        this.tuoi = tuoi;
        this.moTa = moTa;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }
    
    
    void xemThongTin(){
        System.out.println(ten + tuoi + moTa);
    }
    abstract void tiengKeu();
    
}
