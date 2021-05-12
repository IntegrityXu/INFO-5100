/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MusicEcosystem.Role;

import Music.SongDirectory;
import MusicEcosystem.Ecosystem;
import MusicEcosystem.Enterprise.Enterprise;
import MusicEcosystem.Enterprise.MusicPlatEnterprise;
import MusicEcosystem.Network.Network;
import MusicEcosystem.Organization.CustomerOrganization;
import MusicEcosystem.Organization.Organization;
import MusicEcosystem.UserAccount.CustomerAccount;
import MusicEcosystem.UserAccount.UserAccount;
import UserInterface.CustomerArea.CustomerMainArea;
import java.util.ArrayList;
import javax.swing.JPanel;

/**
 *
 * @author xutao
 */
public class CustomerRole extends Role {
    
  private ArrayList <SongDirectory> songDirectoryList;

    public CustomerRole() {
        super(Role.RoleType.Customer.getValue());
        songDirectoryList = new ArrayList<>();
    }

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise,Network network, Ecosystem system) {
        return new CustomerMainArea(userProcessContainer, (CustomerAccount)account, (MusicPlatEnterprise) enterprise);
    }

    public ArrayList<SongDirectory> getSongDirectoryList() {
        return songDirectoryList;
    }
   
}
