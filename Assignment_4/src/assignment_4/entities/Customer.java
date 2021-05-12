/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment_4.entities;
import java.util.Map;
import java.util.ArrayList;

/**
 *
 * @author harshalneelkamal
 */
public class Customer {
    private Integer id;
    
    public Customer(Integer id) {
        
        this.id = id;
        
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    
    @Override
    public String toString() {
        return "User : UserId = " + id;
    }
    
    
}
