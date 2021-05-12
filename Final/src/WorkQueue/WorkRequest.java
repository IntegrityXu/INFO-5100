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
public abstract class WorkRequest {
    private UserAccount sender;
    private Organization receiver;
    private String massage;
    private Date requestDate;
    private Date resolveDate;
    private String status;
    private int songID;
    
    public WorkRequest(UserAccount sender, Organization receiver, String message, Date requestDate, String status) {
        this.sender = sender;
        this.receiver = receiver;
        this.massage = message;
        this.requestDate = requestDate;
        this.resolveDate = null;
        this.status = status;
        songID = -1;
    }

    public int getSongID() {
        return songID;
    }

    public void setSongID(int songID) {
        this.songID = songID;
    }
    
    
    
    public enum states {
        
        Finish("Finish"),
        Undone("Undone"),
        Canceled("Canceled"),
        Reject("Reject");
        
        private String value;
        private states(String value){
            this.value = value;
        }
        
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }
    
    public WorkRequest() {
        this.requestDate = new Date();
    }

    public UserAccount getSender() {
        return sender;
    }

    public void setSender(UserAccount sender) {
        this.sender = sender;
    }

    public Organization getReceiver() {
        return receiver;
    }

    public void setReceiver(Organization receiver) {
        this.receiver = receiver;
    }

    public String getMassage() {
        return massage;
    }

    public void setMassage(String massage) {
        this.massage = massage;
    }

    public Date getRequestDate() {
        return requestDate;
    }

    public void setRequestDate(Date requestDate) {
        this.requestDate = requestDate;
    }

    public Date getResolveDate() {
        return resolveDate;
    }

    public void setResolveDate(Date resolveDate) {
        this.resolveDate = resolveDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    @Override
    public String toString() {
        return this.sender.getUserName();
    }
    
}
