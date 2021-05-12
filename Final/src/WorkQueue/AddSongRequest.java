/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WorkQueue;

import MusicEcosystem.Enterprise.MusicPlatEnterprise;
import MusicEcosystem.Organization.Organization;
import MusicEcosystem.Organization.SongOrganization;
import MusicEcosystem.UserAccount.UserAccount;
import java.util.Date;


/**
 *
 * @author xutao
 */
public class AddSongRequest extends WorkRequest {
    //int songID;
    private MusicPlatEnterprise musicMusicPlatEnterprise;
    public AddSongRequest(MusicPlatEnterprise musicMusicPlatEnterprise, UserAccount sender, Organization receiver, String message, int id) {
        
        super(sender, receiver, message,new Date(), WorkRequest.states.Undone.getValue());
        super.setSongID(id);
        this.musicMusicPlatEnterprise = musicMusicPlatEnterprise;
        
    }

    public MusicPlatEnterprise getMusicMusicPlatEnterprise() {
        return musicMusicPlatEnterprise;
    }

    public void setMusicMusicPlatEnterprise(MusicPlatEnterprise musicMusicPlatEnterprise) {
        this.musicMusicPlatEnterprise = musicMusicPlatEnterprise;
    }

    
    
    
    
}
