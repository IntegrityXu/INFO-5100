/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment_4;
import assignment_4.entities.*;
import assingment_4.analytics.*;
import java.util.Map;
import java.util.ArrayList;

import java.io.IOException;
import java.sql.DriverManager;

/**
 *
 * @author harshalneelkamal
 */
public class GateWay {
    
    DataReader orderReader;
    DataReader productReader;
    AnalysisHelper helper;
    
    public GateWay() throws IOException{
        DataGenerator generator = DataGenerator.getInstance();
        
        orderReader = new DataReader(generator.getOrderFilePath());
        productReader = new DataReader(generator.getProductCataloguePath());
        helper = new AnalysisHelper();
        
    }
    
    public static void main(String args[]) throws IOException{
        GateWay gateway = new GateWay();
        gateway.readDate();
    }
    
    private void readDate() throws IOException{
        String[] orderRow;
        String[] productRow;
        while ( (productRow = productReader.getNextRow()) != null ) {
            generateProduct(productRow);
        }
        
        while ( (orderRow = orderReader.getNextRow()) != null ) {
            generateCustomer(orderRow);
            Item item = generateItem(orderRow);
            generateOrder(orderRow, item);
            generateSales(orderRow);
            
        }
        runAnalysis();
        
    }
    
    private void generateCustomer(String[] row){
        DataStore.getInstance().getCustomers().put(Integer.parseInt(row[5]), new Customer(Integer.parseInt(row[5])));
    }
    
    private Item generateItem(String[] row) {
        int productId = Integer.parseInt(row[2]);
        int salesPrice = Integer.parseInt(row[6]);
        int quantity = Integer.parseInt(row[3]);
        Item item = new Item(productId, salesPrice, quantity);
        
        DataStore.getInstance().getItems().put(Integer.parseInt(row[1]), item);
        return item;
    }
    
    private void generateOrder(String[] row, Item item) {
        int orderId = Integer.parseInt(row[0]);
        int salesId = Integer.parseInt(row[4]);
        int customerId = Integer.parseInt(row[5]);
        Order order = new Order(orderId, salesId, customerId, item);
        DataStore.getInstance().getorders().put(orderId, order);
    }
    
    private void generateSales(String[] row) {
        DataStore.getInstance().getSales().put(Integer.parseInt(row[4]), new SalesPerson(Integer.parseInt(row[4])));
    }
    
    private void generateProduct(String[] row) {
        Product product = new Product(Integer.parseInt(row[0]), Integer.parseInt(row[1]), Integer.parseInt(row[2]), Integer.parseInt(row[3]));
        DataStore.getInstance().getProducts().put(Integer.parseInt(row[0]), product);
    }
    
    
    public void runAnalysis() {
       helper.top3PopProduct();
       helper.totalRevenue();
       helper.bestSales3();
       helper.bestCustomer3();
       
    }
    
}
