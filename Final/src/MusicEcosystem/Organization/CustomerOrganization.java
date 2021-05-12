/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MusicEcosystem.Organization;

import MusicEcosystem.Role.CustomerRole;
import MusicEcosystem.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author xutao
 */
public class CustomerOrganization extends Organization {

    public CustomerOrganization() {
        super(Organization.Type.Customer.getValue());
    }

    @Override
    public ArrayList<Role> getSupportRoles() {
        ArrayList <Role> roles = new ArrayList<>();
        roles.add(new CustomerRole());
        return roles;
    }
    
}
