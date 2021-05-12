/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WorkQueue;

import MusicEcosystem.Organization.Organization;
import MusicEcosystem.UserAccount.UserAccount;
import java.util.Date;

/**
 *
 * @author xutao
 */
public class DeleteSongRequest extends WorkRequest{
    int songID;
    public DeleteSongRequest(UserAccount sender, Organization receiver, String message, int id) {
        
        super(sender, receiver, message,new Date(), WorkRequest.states.Undone.getValue());
        this.songID = id;
        
    }

    public int getSongID() {
        return songID;
    }

    public void setSongID(int songID) {
        this.songID = songID;
    }
    
    
}
