/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

/**
 *
 * @author 徐涛
 */
public class Product {
    
    private String name;
    private double price;
    private int availNum;
    private String description;
    private Supplier supplier;
        
    public Product () {
        name = null;
        price = 0;
        availNum = 0;
        description = null;
        supplier = new Supplier();
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
    }

    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getAvailNum() {
        return availNum;
    }

    public void setAvailNum(int availNum) {
        this.availNum = availNum;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    
    
}
