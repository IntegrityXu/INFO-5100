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
import MusicEcosystem.Organization.SongOrganization;
import MusicEcosystem.UserAccount.UserAccount;
import UserInterface.songAdmin.SongManagerWorkArea;
import javax.swing.JPanel;
/**
 *
 * @author xutao
 */

public class SongAdminRole extends Role{

    public SongAdminRole() {
        super(Role.RoleType.Song.getValue());
    }
    
  
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, Network network, Ecosystem system) {
        return new SongManagerWorkArea(userProcessContainer, (SongOrganization)organization, enterprise, account, network);
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    

}
