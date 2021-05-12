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
import UserInterface.SysAdmin.SysAdmin;

/**
 *
 * @author xutao
 */
public class SystemAdmin extends Role{

    public SystemAdmin() {
        super(Role.RoleType.SysAdmin.getValue());
    }

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, Network network, Ecosystem system) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return new SysAdmin(userProcessContainer, system);
    }
    
}
