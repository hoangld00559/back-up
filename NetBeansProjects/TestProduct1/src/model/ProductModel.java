/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test1.model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import test1.entity.Product;

/**
 *
 * @author dongvu
 */
public class ProductModel {

    public boolean save(ArrayList<Product> listProduct) {
        try {
            for (Product product : listProduct) {
                String query = "INSERT INTO product VALUES (?,?,?);";
                PreparedStatement ps = ConnectionHelper.getInstance().getConnection().prepareStatement(query);
                ps.setString(1, product.getId());
                ps.setString(2, product.getName());
                ps.setDouble(3, product.getPrice());
                ps.execute();
            }
            return true;
        } catch (SQLException ex) {
            System.err.println("Insert false");
        }
        return false;
    }

    public Product getProductById(String id) {
        Product product = new Product();
        try {
            String query = "SELECT * FROM product WHERE id = ?";
            PreparedStatement ps = ConnectionHelper.getInstance().getConnection().prepareStatement(query);
            ps.setString(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                product.setId(id);
                product.setName(rs.getString("name"));
                product.setPrice(rs.getDouble("price"));
                return product;
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProductModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public boolean update(Product product) {
        try {
            String query = "UPDATE product SET name = ?,price = ? WHERE id = ?";
            PreparedStatement ps = ConnectionHelper.getInstance().getConnection().prepareStatement(query);
            ps.setString(1, product.getName());
            ps.setDouble(2, product.getPrice());
            ps.setString(3, product.getId());
            if (ps.executeUpdate() > 0) {
                return true;
            }

        } catch (SQLException ex) {
            Logger.getLogger(ProductModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
}
