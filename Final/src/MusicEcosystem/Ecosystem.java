/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MusicEcosystem;

import java.util.ArrayList;
import MusicEcosystem.Network.*;
import MusicEcosystem.Organization.*;
import MusicEcosystem.Role.*;
import WorkQueue.WorkQueue;

/**
 *
 * @author xutao
 */
public class Ecosystem extends Organization{
    public static Ecosystem musiEcosystem;
    private ArrayList<Network> networkList;
    
    private int songcount;
    private int singercount;
    private int accountNum;
    
    public static Ecosystem getInstance(){
        if(musiEcosystem==null){
            musiEcosystem=new Ecosystem();
        }
        return musiEcosystem;
    }
    
    public Ecosystem() {
        super("SystemAdmin");
        this.networkList = new ArrayList<>();
    }

    public ArrayList<Network> getNetworkList() {
        return networkList;
    }

    public void setNetworkList(ArrayList<Network> networkList) {
        this.networkList = networkList;
    }

    @Override
    public ArrayList<Role> getSupportRoles() {
        ArrayList <Role> roles = new ArrayList<> ();
        roles.add(new MusicPlatFormAdmin());
        return roles;
    }


    public int getSongcount() {
        return songcount;
    }

    public void setSongcount(int songcount) {
        this.songcount = songcount;
    }

    public int getSingercount() {
        return singercount;
    }

    public void setSingercount(int singercount) {
        this.singercount = singercount;
    }

    public int getAccountNum() {
        return accountNum;
    }

    public void setAccountNum(int accountNum) {
        this.accountNum = accountNum;
    }

    
    
}
