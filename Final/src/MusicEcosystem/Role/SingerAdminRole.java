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
import MusicEcosystem.Organization.SingerOrganization;
import MusicEcosystem.UserAccount.UserAccount;
import UserInterface.singerAdmin.SingerManagerWorkArea;
import javax.swing.JPanel;
/**
 *
 * @author xutao
 */

public class SingerAdminRole extends Role {

    public SingerAdminRole() {
        super(Role.RoleType.Singer.getValue());
    }
    
 
    @Override
    public JPanel createWorkArea(JPanel container, UserAccount account, Organization organization, Enterprise enterprise, Network network, Ecosystem system) {
        return new SingerManagerWorkArea(container, (SingerOrganization)organization, network, (MusicPlatEnterprise)enterprise);
    
    }
}
