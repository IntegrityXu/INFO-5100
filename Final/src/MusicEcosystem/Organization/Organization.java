/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MusicEcosystem.Organization;

import Music.SingerDirectory;
import Music.SongDirectory;
import MusicEcosystem.Role.Role;
import MusicEcosystem.UserAccount.UserAccountDirectory;
import WorkQueue.WorkQueue;
import java.util.ArrayList;

/**
 *
 * @author xutao
 */
public abstract class Organization {
    private String name;
    private int id;
    public static int counter;
    private UserAccountDirectory userAccountDirectory;
    private SongDirectory songDirectory;
    private SingerDirectory singerDirectory;
    private WorkQueue workQueue;
    
    public Organization (String name) {
        this.name = name;
        userAccountDirectory = new UserAccountDirectory();
        songDirectory = new SongDirectory();
        singerDirectory = new SingerDirectory();
        workQueue = new WorkQueue();
        id = counter;
        counter ++;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }

    
    
    public SongDirectory getSongDirectory() {
        return songDirectory;
    }

    public SingerDirectory getSingerDirectory() {
        return singerDirectory;
    }
    
    
    
    public abstract ArrayList <Role> getSupportRoles() ;
    //public abstract String getType();
    
    public enum Type{
        Admin("Admin Organization"), Singer("Singer Organization"), Song("Song Organization"),
        Customer("Customer Organization"), RecordCompany("Record Company");
        private String value;
        private Type(String value) {
            this.value = value;
        }
        public String getValue() {
            return value;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    

    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public void setUserAccountDirectory(UserAccountDirectory userAccountList) {
        this.userAccountDirectory = userAccountList;
    }
    

    @Override
    public String toString() {
        return this.name;
    }
    
}
