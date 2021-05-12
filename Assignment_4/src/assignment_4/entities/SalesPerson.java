/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment_4.entities;
import java.util.ArrayList;

/**
 *
 * @author harshalneelkamal
 */
public class SalesPerson {
    private Integer salesId ;
    
    public SalesPerson(int salesId) {
        this.salesId = salesId;
    }

    public Integer getSalesId() {
        return salesId;
    }

    public void setSalesId(Integer salesId) {
        this.salesId = salesId;
    }
    
    @Override 
    public String toString() {
        return "SalesPerson : Sales-Id = " + salesId;
    }
    
}
