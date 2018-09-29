/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test1.controller;

import java.util.ArrayList;
import java.util.Scanner;
import test1.entity.Product;
import test1.model.ProductModel;

/**
 *
 * @author dongvu
 */
public class ProductController {

    private ArrayList<Product> listProduct;
    private ProductModel productModel = new ProductModel();

    public ProductController() {
        listProduct = new ArrayList<>();
        listProduct.add(new Product("A001", "Product-1", 1000));
        listProduct.add(new Product("A002", "Product-2", 2000));
        listProduct.add(new Product("A003", "Product-3", 3000));
        listProduct.add(new Product("A004", "Product-4", 4000));
        listProduct.add(new Product("A005", "Product-5", 5000));
        listProduct.add(new Product("A006", "Product-6", 6000));
        listProduct.add(new Product("A007", "Product-7", 7000));
        listProduct.add(new Product("A008", "Product-8", 8000));
        listProduct.add(new Product("A009", "Product-9", 9000));
        listProduct.add(new Product("A0010", "Product-10", 10000));
    }

    
    
    public boolean saveProduct() {
        if (productModel.save(listProduct)) {
            System.out.println("Save success");
            return true;
        }
        return false;
    }

    public void update() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter Product Id:");
        String id = sc.nextLine();
        Product product = productModel.getProductById(id);
        if (product == null) {
            System.err.println("Product not found !!");
            return;
        }
        System.out.println("-----------------------");
        System.out.println("Product found:");
        System.out.println("Id: " + product.getId());
        System.out.println("Name: " + product.getName());
        System.out.println("Price: " + product.getPrice());
        System.out.println("-----------------------");
        System.out.println("Enter new Product's name;");
        String name = sc.nextLine();
        
        double price = 0;
        
            try {
                System.out.println("Enter new Product's price;");
                price = sc.nextDouble();
            } catch (Exception e) {
                System.err.println("Please enter a number");
            }
        
        product.setName(name);
        product.setPrice(price);

        if (productModel.update(product)) {
            System.out.println("update success");
        } else {
            System.err.println("update error");
        }

    }

}
