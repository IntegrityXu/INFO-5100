/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MusicEcosystem.Organization;

import MusicEcosystem.Role.Role;
import MusicEcosystem.Role.SingerAdminRole;
import java.util.ArrayList;

/**
 *
 * @author xutao
 */
public class SingerOrganization extends Organization{
    
    public SingerOrganization() {
        super(Organization.Type.Singer.getValue());
    }

    @Override
    public ArrayList<Role> getSupportRoles() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new SingerAdminRole());
        return roles;
    }
    
    
    
}
