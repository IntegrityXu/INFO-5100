/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MusicEcosystem.Role;

import MusicEcosystem.Ecosystem;
import MusicEcosystem.Enterprise.Enterprise;
import MusicEcosystem.Enterprise.MusicPlatEnterprise;
import MusicEcosystem.Network.Network;
import MusicEcosystem.Organization.Organization;
import MusicEcosystem.UserAccount.UserAccount;
import UserInterface.UserAdmin.OverAllUser;
import javax.swing.JPanel;

/**
 *
 * @author xutao
 */
public class MusicPlatFormAdmin extends Role{

    public MusicPlatFormAdmin() {
        super(Role.RoleType.MusicPlatFormAdmin.getValue());
    }
    

    @Override
    public JPanel createWorkArea(JPanel container, UserAccount account, Organization organization, Enterprise enterprise, Network network, Ecosystem system) {
        return new OverAllUser(container, (MusicPlatEnterprise) enterprise);
    }
    
}
