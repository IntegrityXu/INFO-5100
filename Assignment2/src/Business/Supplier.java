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
public class Supplier {
    
    private String suppName;
    private String suppAddress;
    
    public Supplier () {
        suppName = null;
        suppAddress = null;
    }

    public String getSuppName() {
        return suppName;
    }

    public void setSuppName(String suppName) {
        this.suppName = suppName;
    }

    public String getSuppAddress() {
        return suppAddress;
    }

    public void setSuppAddress(String suppAddress) {
        this.suppAddress = suppAddress;
    }
    
    
    
}
