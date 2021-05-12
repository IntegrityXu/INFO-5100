/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assingment_4.analytics;
import java.util.*;
import assignment_4.entities.*;
import sun.security.jca.GetInstance;

/**
 *
 * @author xutao
 */
public class DataStore {
    
    private static DataStore dataStore;
    
    private Map <Integer, Order> orders;
    private Map <Integer, Customer> customers;
    private Map <Integer, SalesPerson> sales;
    private Map <Integer, Product> products;
    private Map <Integer, Item> items;
    
    private DataStore() {
        orders = new HashMap<>();
        customers = new HashMap<> ();
        sales = new HashMap<> ();
        products = new HashMap<> ();
        items = new HashMap<> ();
    }
    
    public static DataStore getInstance() {
        if (dataStore == null ) {
            dataStore = new DataStore();
        }
        return dataStore;
    }
    
    public static DataStore getDataStore() {
        return dataStore;
    }
    
    public Map <Integer, Order> getorders() {
        return orders;
    }
    
    public void setOrders(Map <Integer, Order> orders) {
        this.orders = orders;
    }

    public Map<Integer, Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(Map<Integer, Customer> customers) {
        this.customers = customers;
    }

    public Map<Integer, SalesPerson> getSales() {
        return sales;
    }

    public void setSales(Map<Integer, SalesPerson> sales) {
        this.sales = sales;
    }

    public Map<Integer, Product> getProducts() {
        return products;
    }

    public void setProducts(Map<Integer, Product> products) {
        this.products = products;
    }

    public Map<Integer, Item> getItems() {
        return items;
    }

    public void setItems(Map<Integer, Item> items) {
        this.items = items;
    }
    
    
    
}
