/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assingment_4.analytics;
import assignment_4.entities.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.*;

/**
 *
 * @author xutao
 */
public class AnalysisHelper {
    
    
    public void top3PopProduct(){
        //同样的product id 的quantity 加在一起
    
        Map <Integer, Integer> popproduct = new HashMap<> ();
        List<Integer> sum= new ArrayList<>();
        //List<Integer> product = new ArrayList<>();
        
        Map <Integer, Order> orders = DataStore.getInstance().getorders();
        Map <Integer, Product> products = DataStore.getInstance().getProducts();
       Map <Integer, Item> items = DataStore.getInstance().getItems();
         
        for (Order order:orders.values()) {
           int product_total=0;
            if (!popproduct.containsKey((order.getItem().getProductId()))){
                popproduct.put(order.getItem().getProductId(),0);
            }
               product_total= popproduct.get(order.getItem().getProductId());
              product_total += order.getItem().getQuantity();
              popproduct.put(order.getItem().getProductId(),product_total);
        }
          
           
          
        System.out.println("————————————The top3 Popular Products————————————");  
        Map <Integer, Integer> popproduct2 = new HashMap<> ();
        popproduct2= popproduct;
        int max = 0;
        int maxId = 0;
        int i=0;
          while (i < 3){
               max = 0;
                for (int id : popproduct2.keySet()) {

                if ( popproduct2.get(id) > max) {
                    max = popproduct2.get(id);
                    maxId = id;            
                    }              
                }
                popproduct2.remove(maxId);
                
                System.out.println(products.get(maxId)+ "   product total number: " + max  );
            i++;
            }
       
  
      

    }
    
    public void bestCustomer3(){
    //me
        Map <Integer, Order> orders = DataStore.getInstance().getorders();
        Map <Integer, Integer> total = new HashMap<>();
        Map <Integer, Customer> customers = DataStore.getInstance().getCustomers();
        for (Order order : orders.values()) {
            int money = 0;
            if ( total.containsKey(order.getCustomerId()) ) {
                money = total.get(order.getCustomerId());
            }
            money += order.getItem().getSalesPrice() * order.getItem().getQuantity();
            total.put(order.getCustomerId(), money);
        }
        List <Integer> bestCustomer = new ArrayList<> ();
        Map <Integer, Integer> cloneTotal = new HashMap<>();
        cloneTotal.putAll(total);
        int i = 0;
        while (i < 3) {
            int maxIncome = 0;
            int maxKey = 0;
            for ( Integer key : cloneTotal.keySet()) {
                if (cloneTotal.get(key) > maxIncome) {
                    maxIncome = cloneTotal.get(key);
                    maxKey = key;
                }
            }
            bestCustomer.add(maxKey);
            cloneTotal.remove(maxKey);
            
            i++;
        }
        
        System.out.println("The top 3 best customers are : ");
        for (Integer j : bestCustomer) {
            System.out.println(customers.get(j) + ", the total money spent : " + total.get(j));
        }
    }
    
    //Our top 3 best sales people
    public void bestSales3(){
        
        Map <Integer, Order> orders = DataStore.getInstance().getorders();
        Map <Integer, Integer> totalSales = new HashMap<>();
        Map <Integer, SalesPerson> salesPersons = DataStore.getInstance().getSales();
        Map <Integer, Product> products = DataStore.getInstance().getProducts();
        for (Order order : orders.values()) {
            int n = 0;
            if ( totalSales.containsKey(order.getSalesId()) ) {
                n = totalSales.get(order.getSalesId());
            }
            n += (order.getItem().getSalesPrice() - products.get(order.getItem().getProductId()).getMinPrice()) * order.getItem().getQuantity();
            totalSales.put(order.getSalesId(), n);
        }
        List <Integer> bestSalePerson = new ArrayList<> ();
        Map <Integer, Integer> cloneTotalSales = new HashMap<>();
        cloneTotalSales.putAll(totalSales);
        int i = 0;
        while (i < 3) {
            //SalesIncome
            int maxIncome = 0;
            //SalesID
            int maxKey = 0;
            for ( Integer key : cloneTotalSales.keySet()) {
                if (cloneTotalSales.get(key) > maxIncome) {
                    maxIncome = cloneTotalSales.get(key);
                    maxKey = key;
                }
            }
            bestSalePerson.add(maxKey);
            cloneTotalSales.remove(maxKey);
            
            i++;
        }
        
        System.out.println("The top 3 best saler prople are : ");
        for (Integer j : bestSalePerson) {
            System.out.println(salesPersons.get(j) + ", the total income : " + totalSales.get(j));
        }
        
    }
    
    //Our total revenue for the year
    public void totalRevenue(){
        
        Map <Integer, Item> items = DataStore.getInstance().getItems();
        Map <Integer, Product> products = DataStore.getInstance().getProducts();
        Map <Integer, Integer> revenue_per_product = new HashMap<> ();
        int revenue = 0;
        for (Item item : items.values()) {
            revenue += (item.getSalesPrice() - products.get(item.getProductId()).getMinPrice()) * item.getQuantity();
            int n = 0;
            if(revenue_per_product.containsKey(item.getProductId())) {
                n = revenue_per_product.get(item.getProductId());
            }
            n += (item.getSalesPrice() - products.get(item.getProductId()).getMinPrice()) * item.getQuantity();
            revenue_per_product.put(item.getProductId(), n);
        }
        System.out.println("Per product's revenue is :" );
        for (Integer i : revenue_per_product.keySet()) {
            System.out.println("ProductId = " + i + ", revenue : " + revenue_per_product.get(i));
        }
        System.out.println("Our total revenue for the year is : " + revenue);
    }
}
