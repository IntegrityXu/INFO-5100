/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MusicEcosystem.Role;

import MusicEcosystem.Ecosystem;
import MusicEcosystem.Enterprise.Enterprise;
import MusicEcosystem.Network.Network;
import MusicEcosystem.Organization.Organization;
import MusicEcosystem.UserAccount.UserAccount;
import javax.swing.JPanel;

/**
 *
 * @author xutao
 */
public abstract class Role {
    public enum RoleType{
        Singer("Singer Manager"),
        Song("Song Manager"),
        Customer("Customer"),
        CompanyAdmin("Record Company Admin"),
        SysAdmin("System Admin"),
        NetworkAdmin("Network Admin"),
        MusicPlatFormAdmin("MusicPlatFormAdmin");
        
        private String value;
        private RoleType(String value){
            this.value = value;
        }
        
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }
    
    private String name;
    
    public Role (String name ) {
        this.name = name;
    }
    
    public abstract JPanel createWorkArea(JPanel userProcessContainer, 
            UserAccount account, 
            Organization organization, 
            Enterprise enterprise,
            Network network,
            Ecosystem system);

    @Override
    public String toString() {
        return this.name;
    }
    
    public boolean equals(Role r) {
        if (this.name.equals(String.valueOf(r)))
            return true;
        return false;
    }
    
}
