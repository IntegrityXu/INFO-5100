/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MusicEcosystem.Enterprise;

import MusicEcosystem.Organization.*;
import Music.*;
import MusicEcosystem.Role.Role;

/**
 *
 * @author xutao
 */
public abstract class Enterprise extends Organization{

    private OrganizationDirectory organizationDirectory;
    

    
    public Enterprise(String name) {
        super(name);
        organizationDirectory = new OrganizationDirectory();
    }
    
    public enum EnterpriseType{
        MusicPlat("MusicPlat"),
        RecordCompany("RecordCompany");
        
        private String value;
        
        private EnterpriseType(String value){
            this.value=value;
        }
        public String getValue() {
            return value;
        }
        @Override
        public String toString(){
            return value;
        }
    }
    
    public abstract Role getSelfRole();


    public OrganizationDirectory getOrganizationDirectory() {
        return organizationDirectory;
    }
}
