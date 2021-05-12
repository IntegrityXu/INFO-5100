/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment_4.entities;
import java.nio.channels.Pipe;
import java.util.ArrayList;

/**
 *
 * @author harshalneelkamal
 */
public class Product {
    private Integer id;
    private Integer minPrice;
    private Integer maxPrice;
    private Integer targetPrive;
    
    public Product(int id, int minPrice, int maxPrice, int targerPrice) {
        this.id = id;
        this.minPrice = minPrice;
        this.maxPrice = maxPrice;
        this.targetPrive = targerPrice;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getMinPrice() {
        return minPrice;
    }

    public void setMinPrice(Integer minPrice) {
        this.minPrice = minPrice;
    }

    public Integer getMaxPrice() {
        return maxPrice;
    }

    public void setMaxPrice(Integer maxPrice) {
        this.maxPrice = maxPrice;
    }

    public Integer getTargetPrive() {
        return targetPrive;
    }

    public void setTargetPrive(Integer targetPrive) {
        this.targetPrive = targetPrive;
    }
    
    @Override
    public String toString() {
        return "Product : ID = " + id + ", Mix-Prive = " + minPrice + ", Max-Price = " + maxPrice + ", Target-Price = " + targetPrive;
    }
    
}
