/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MusicEcosystem.Enterprise;

import MusicEcosystem.Organization.Organization;
import MusicEcosystem.Organization.OrganizationDirectory;
import MusicEcosystem.Organization.RecordCompanyOrganization;
import MusicEcosystem.Role.RecordCompanyAdmin;
import MusicEcosystem.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author xutao
 */
public class RecordCompanyEnterprise extends Enterprise{
    
    public RecordCompanyEnterprise() {
        super(EnterpriseType.RecordCompany.getValue());
    }

    @Override
    public ArrayList<Role> getSupportRoles() {
        return null;
    }

    @Override
    public Role getSelfRole() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return new RecordCompanyAdmin();
    }

    
}
