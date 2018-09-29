/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zoomanagement;

import java.util.ArrayList;

/**
 *
 * @author MyPC
 */
public class Chuong {

    private int maChuong;
    private ArrayList<Animal> AnimalList = new ArrayList<>();

    void themConVat(Animal a) {
        AnimalList.add(a);
    }

    public Chuong() {
    }

    public Chuong(int maChuong) {
        this.maChuong = maChuong;
    }

    public int getMaChuong() {
        return maChuong;
    }

    public void setMaChuong(int maChuong) {
        this.maChuong = maChuong;
    }

    public ArrayList<Animal> getAnimalList() {
        return AnimalList;
    }

    public void setAnimalList(ArrayList<Animal> AnimalList) {
        this.AnimalList = AnimalList;
    }
    

    public boolean xoaConVat(String ten) {
        for (int i = 0; i < AnimalList.size(); i++) {
            if (AnimalList.get(i).getTen().equalsIgnoreCase(ten)) {
                AnimalList.remove(i);
                return true;
            }
        }
        return false;
    }    
}
