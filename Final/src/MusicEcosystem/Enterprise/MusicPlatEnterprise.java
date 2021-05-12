/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MusicEcosystem.Enterprise;

import MusicEcosystem.Organization.CustomerOrganization;
import MusicEcosystem.Organization.SingerOrganization;
import MusicEcosystem.Organization.SongOrganization;
import MusicEcosystem.Role.CustomerRole;
import MusicEcosystem.Role.MusicPlatFormAdmin;
import MusicEcosystem.Role.Role;
import MusicEcosystem.Role.SingerAdminRole;
import MusicEcosystem.Role.SongAdminRole;
import java.util.ArrayList;

/**
 *
 * @author xutao
 */
public class MusicPlatEnterprise extends Enterprise{
    
    public MusicPlatEnterprise() {
        super(EnterpriseType.MusicPlat.getValue());
        SongOrganization songOrganization = new SongOrganization();
        SingerOrganization singerOrganization = new SingerOrganization();
        CustomerOrganization customerOrganization = new CustomerOrganization();
        getOrganizationDirectory().addOrganization(songOrganization);
        getOrganizationDirectory().addOrganization(singerOrganization);
        getOrganizationDirectory().addOrganization(customerOrganization);
    }

    @Override
    public ArrayList<Role> getSupportRoles() {
        ArrayList <Role> roles = new ArrayList<>();
        roles.add(new SingerAdminRole());
        roles.add(new SongAdminRole());
        roles.add(new CustomerRole());
        return roles;
    }

    @Override
    public Role getSelfRole() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return new MusicPlatFormAdmin();
    }
    
}
