/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import entity.Product;
import java.util.ArrayList;
import java.util.Scanner;
import model.ProductModel;

/**
 *
 * @author MyPC
 */
public class ProductController {
    private ProductModel model =  new ProductModel();
    
    public boolean create10Product(){
        return model.load10Data();
    }
    
    public void printListProduct(){
        ArrayList<Product> list = model.load();
        for(Product p: list){
            System.out.println(p.getProductName());
        }
    }
    
    public void editProduct(){
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập Id sản phẩm cần sửa:");
        String idEdit = input.nextLine();
        Product pr = model.findbyId(idEdit);
        System.out.println("Nhập name mới:");
        String name = input.nextLine();
        pr.setProductName(name);
        System.out.println("Nhập price:");
        int price = input.nextInt();
        input.nextLine();
        pr.setPrice(price);
        
        if(model.update(pr)){
            System.out.println("success");
        } else {
            System.out.println("false");
        }        
    }
}
