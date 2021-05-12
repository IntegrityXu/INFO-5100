/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MusicEcosystem.UserAccount;

import Music.AlbumDirectory;
import MusicEcosystem.Role.Role;

/**
 *
 * @author xutao
 */
public class CustomerAccount extends UserAccount {
    
    private AlbumDirectory albumDirectory;
    private boolean vip;
    public CustomerAccount(String name, String pwd, Role role) {
        super(name, pwd, role);
        vip = false;
        albumDirectory = new AlbumDirectory();
    }

    public boolean isVip() {
        return vip;
    }

    public void setVip(boolean vip) {
        this.vip = vip;
    }
    
    

    public AlbumDirectory getAlbumDirectory() {
        return albumDirectory;
    }

    public void setAlbumDirectory(AlbumDirectory albumDirectory) {
        this.albumDirectory = albumDirectory;
    }
    
    
    
}
