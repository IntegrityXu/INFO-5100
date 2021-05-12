/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MusicEcosystem.Organization;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author xutao
 */
public class OrganizationDirectory {
    List <Organization> organizationList;
    public OrganizationDirectory () {
        this.organizationList = new ArrayList<>();
    }

    public List<Organization> getOrganizationList() {
        return organizationList;
    }

    public void setOrganizationList(List<Organization> organizationList) {
        this.organizationList = organizationList;
    }
    
    public boolean ContiansOrganization(Organization organization) {
        for (Organization og : this.organizationList) {
            if (og.getId() == organization.getId() || og.getName().equals(organization.getName()))
                return true;
        }
        return false;
    }
    
    public int addOrganization(Organization organization) {
        if (!ContiansOrganization(organization)) {
            this.organizationList.add(organization);
            return 1;
        }
        return 0;
    }
    
    public int removeOrganization(Organization organization) {
        if (ContiansOrganization(organization)) {
            this.organizationList.remove(organization);
            return 1;
        }
        return 0;
    }
    
    
}
