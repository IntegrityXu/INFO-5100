/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MusicEcosystem.Enterprise;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author xutao
 */
public class EnterpriseDirectory {
    private List <Enterprise> enterpaiseList;
    
    public EnterpriseDirectory() {
        enterpaiseList = new ArrayList<>();
        
    }

    public List<Enterprise> getEnterpaiseList() {
        return enterpaiseList;
    }

    public void setEnterpaiseList(List<Enterprise> enterpaiseList) {
        this.enterpaiseList = enterpaiseList;
    }
    
    
}
