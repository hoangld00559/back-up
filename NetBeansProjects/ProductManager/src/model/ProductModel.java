/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import entity.Product;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author MyPC
 */
public class ProductModel {

    public boolean load10Data() {
        ArrayList<Product> list = new ArrayList<>();
        list.add(new Product("ms1", "pro1", 50));
        list.add(new Product("ms2", "pro2", 100));
        list.add(new Product("ms3", "pro3", 150));
        list.add(new Product("ms4", "pro4", 200));
        list.add(new Product("ms5", "pro5", 250));
        list.add(new Product("ms6", "pro6", 300));
        list.add(new Product("ms7", "pro7", 350));
        list.add(new Product("ms8", "pro8", 400));
        list.add(new Product("ms9", "pro9", 450));
        list.add(new Product("ms10", "pro10", 500));

        String sql = "insert into products (id, name, price) values (?,?,?)";
        try {
            PreparedStatement ps = ConnectionHanle.getInstance().getConnection().prepareStatement(sql);
            for (int i = 0; i < 10; i++) {
                ps.setString(1, list.get(i).getProductId());
                ps.setString(2, list.get(i).getProductName());
                ps.setInt(3, list.get(i).getPrice());
                ps.execute();
            }
        } catch (SQLException ex) {
            System.err.println("Lỗi khi làm việc với database, vui lòng thử lại");
            System.err.println(ex.getMessage());
            return false;
        }
        return true;
    }
    
    public ArrayList<Product> load(){
        ArrayList<Product> list =  new ArrayList<>();
        String sql = "select * from products";
        try {
            PreparedStatement ps = ConnectionHanle.getInstance().getConnection().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                Product pd = new Product(rs.getString("id"), rs.getString("name"), rs.getInt("price"));
                list.add(pd);
            }
        } catch (SQLException ex) {
            System.err.println("error");
        }
        return list;
    }

    public Product findbyId(String s) {
        String sql = "select * from products where id = '" + s + "'";
        try {
            PreparedStatement ps = ConnectionHanle.getInstance().getConnection().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                Product pd = new Product(rs.getString("id"), rs.getString("name"), rs.getInt("price"));
                return pd;
            }
        } catch (SQLException ex) {
            System.err.println("Error");
        }
        return null;
    }

    public boolean update(Product p) {
        String sql = "update product set name = ?, price = ? where id = ?";
        PreparedStatement ps;
        try {
            ps = ConnectionHanle.getInstance().getConnection().prepareStatement(sql);
            ps.setString(1, p.getProductName());
            ps.setInt(2, p.getPrice());
            ps.setString(3, p.getProductId());
            ps.execute();
            return true;
        } catch (SQLException ex) {
            System.err.println("Error");
        }
        return false;
    }
}
