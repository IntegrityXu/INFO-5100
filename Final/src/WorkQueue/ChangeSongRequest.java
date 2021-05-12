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
public class ChangeSongRequest extends WorkRequest{
    //private int songID;
    public ChangeSongRequest(UserAccount sender, Organization receiver, String message, int id) {
        
        super(sender, receiver, message,new Date(), WorkRequest.states.Undone.getValue());
        super.setSongID(id);
        
    }

   
    
}
