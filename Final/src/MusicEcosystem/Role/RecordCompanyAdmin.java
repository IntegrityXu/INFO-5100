/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MusicEcosystem.Role;

import MusicEcosystem.Ecosystem;
import MusicEcosystem.Enterprise.Enterprise;
import MusicEcosystem.Enterprise.RecordCompanyEnterprise;
import MusicEcosystem.Network.Network;
import MusicEcosystem.Organization.Organization;
import MusicEcosystem.UserAccount.UserAccount;
import UserInterface.RecordCompany.RecordCompanyWorkArea;
import javax.swing.JPanel;

/**
 *
 * @author xutao
 */
public class RecordCompanyAdmin extends Role {

    public RecordCompanyAdmin() {
        super(Role.RoleType.CompanyAdmin.getValue());
    }

    @Override
    public JPanel createWorkArea(JPanel Container, UserAccount account, Organization organization, Enterprise enterprise, Network network, Ecosystem system) {
        return new RecordCompanyWorkArea(Container, (RecordCompanyEnterprise)enterprise, account, network);
    }
    
}
