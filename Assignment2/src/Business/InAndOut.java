/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
Assignment 2
INFO 5100 Fall 2018
Programming Assignment 2
This assignment is due Wednesday 9/26 at 11:59 pm
 

The objective of this assignment is to get you to understand the difference between java code and the swing/ forms based application.
Your job is to take the lab project(create, view & update a product) you implemented in the lab and converting it to a command line based application with no UI.
Convert the data creation screen into java statements. Your data is assigned to the objects and attributes as java assignment statements.
Print the initialized data in step one on the command line using print statements.
The update function will now be the modification of the data objects into some updated values.
Print the results of the changes/updates to the command line one more time.
 
This application does not require a jframe nor jpanels.
 
Useful Link:
3 ways of reading input from the user in the console:
https://www.codejava.net/java-se/file-io/3-ways-for-reading-input-from-the-user-in-the-console
*/
package Business;
import java.io.*;
import java.util.*;
/**
 *
 * @author 徐涛
 */
public class InAndOut {

    /**
     * @param args the command line arguments
     */
    private Product product = new Product();
    
    private void Create () {
        Scanner input = new Scanner(System.in);
        System.out.print ("Input the product's name: ");
        this.product.setName(input.nextLine());
        System.out.print ("Input the product's price($): ");
        this.product.setPrice(Double.parseDouble(input.nextLine()));
        System.out.print ("Input the producat's avaliable number: ");
        Integer  integer = new Integer(input.nextLine());
        this.product.setAvailNum(integer);
        System.out.print("Input the product's description: ");
        this.product.setDescription(input.nextLine());
        
        
        Supplier supplier = new Supplier();
        System.out.print("Input the supplier's name: ");
        supplier.setSuppName(input.nextLine());
        System.out.print("Input the supplier's address: ");
        supplier.setSuppAddress(input.nextLine());
        product.setSupplier(supplier);      
        
        System.out.println("Create Successfully");
    }
    
    private void Update (char method) {
        Scanner input = new Scanner(System.in);
        if (method == 'a') {
            System.out.println("Plz input the item you want to change and input the information:");
            System.out.println("(use the format like (productname = XXX), and use \",\" to partition different part)");
            System.out.println("(ues \"productname, price, number, description, suppliername, address\" to describe the atrribute)");
            String change = input.nextLine();
            String[] part = change.split(",");
            String[] def = { "productname", "price", "number", "description", "suppliername", "address"};
            for (String part1 : part) {
                for (int j = 0; j < 6; j++) {
                    String[] tmp = part1.split("=");
                    if(tmp[0].equals(def[j])) {
                        switch (j) {
                            case 0:
                                product.setName(tmp[1]);
                                break;
                            case 1:
                                product.setPrice(Double.parseDouble(tmp[1]));
                                break;
                            case 2:
                                Integer integer = new Integer(tmp[1]);
                                product.setAvailNum(integer);
                                break;
                            case 3:
                                product.setDescription(tmp[1]);
                                break;
                            case 4:
                                product.getSupplier().setSuppName(tmp[1]);
                                break;
                            case 5:
                                product.getSupplier().setSuppAddress(tmp[1]);
                                break;
                        }
                        break;
                    }
                }
        }
       
        }
        else {
            String tmp = null;
            System.out.println("(\"no\" for no change!)");
            
            System.out.print("Product name: ");
            tmp = input.nextLine();
            if (!"no".equals(tmp)) {
                product.setName(tmp);
            }
            
            System.out.print("Product price: ");
            tmp = input.nextLine();
            if (!"no".equals(tmp)) {
                product.setPrice(Double.parseDouble(tmp));
            }
            
            System.out.print("Product number: ");
            tmp = input.nextLine();
            if (!"no".equals(tmp)) {
                Integer integer = new Integer(tmp);
                product.setAvailNum(integer);
            }
            
            System.out.print("Dsecription: ");
            tmp = input.nextLine();
            if (!"no".equals(tmp)) {
                product.setDescription(tmp);
            }
            
            System.out.print("Supplier name: ");
            tmp = input.nextLine();
            if (!"no".equals(tmp)) {
                product.getSupplier().setSuppName(tmp);
            }
            
            System.out.print("Product address: ");
            tmp = input.nextLine();
            if (!"no".equals(tmp)) {
                product.getSupplier().setSuppAddress(tmp);
            }
            
        }
        View();
        System.out.println("Update Successful!");
        
    }
    
    private void View() {
        System.out.println("product name: " + product.getName());
        System.out.println("product price: $" + product.getPrice());
        System.out.println("avaliable number: " + product.getAvailNum());
        System.out.println("description: " + product.getDescription());
        System.out.println("supplier name: " + product.getSupplier().getSuppName());
        System.out.println("supplier address: " + product.getSupplier().getSuppAddress());
        
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
       InAndOut ido = new InAndOut();
       Scanner input = new Scanner(System.in);     
       while (true) {
            System.out.println ("Please choose your operation: ");
            System.out.println("(c.create; u.update; v.view; e.exit)");
            char choose = input.next().charAt(0);  
            switch ( choose ) {
                case 'c' :
                     ido.Create ();
                    break;
                case 'u' :
                    ido.View();
                    System.out.println("Choose the update method you want to use:");
                    System.out.println("a.input by yourself  b.input by guide");
                    char method = input.next().charAt(0);
                    ido.Update(method);
                    break;
                case 'v':
                    ido.View();
                    break;
                case 'e' :
                    System.out.println("Exit!");
                    return;
                             
            }
        }
    }
        
    
}
