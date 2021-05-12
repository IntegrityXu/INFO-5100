/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MusicEcosystem.Network;
import MusicEcosystem.Enterprise.*;
import MusicEcosystem.Organization.Organization;
import MusicEcosystem.Role.MusicPlatFormAdmin;
import MusicEcosystem.Role.RecordCompanyAdmin;
import MusicEcosystem.Role.Role;
import WorkQueue.WorkQueue;
import java.util.ArrayList;

/**
 *
 * @author xutao
 */
public class Network extends Organization{
    
    private EnterpriseDirectory enterpriseDirectory;
    
    public Network(String name){
        super(name);
        enterpriseDirectory = new EnterpriseDirectory();
        enterpriseDirectory.getEnterpaiseList().add(new RecordCompanyEnterprise());
        enterpriseDirectory.getEnterpaiseList().add(new MusicPlatEnterprise());
    }


    public EnterpriseDirectory getEnterpriseDirectory() {
        return enterpriseDirectory;
    }

    public void setEnterpriseDirectory(EnterpriseDirectory enterpriseDirectory) {
        this.enterpriseDirectory = enterpriseDirectory;
    }

    

    @Override
    public ArrayList<Role> getSupportRoles() {
        ArrayList <Role> roles = new ArrayList<>();
        roles.add(new MusicPlatFormAdmin());
        roles.add(new RecordCompanyAdmin());
        return roles;
    }
}
