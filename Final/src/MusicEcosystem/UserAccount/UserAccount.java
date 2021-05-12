/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MusicEcosystem.UserAccount;
import MusicEcosystem.Role.Role;
import WorkQueue.WorkQueue;
/**
 *
 * @author xutao
 */
public class UserAccount {
    private String  userName;
    private String  userPwd;
    private Role role;
    int id ;
    public static int count = 0;

    
    public UserAccount(String name, String pwd, Role role){
        this.userName = name;
        this.userPwd = pwd;
        this.role = role;
        id = count;
        count ++;
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }


    public String getUserPwd() {
        return userPwd;
    }

    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    @Override 
    public String toString() {
        return this.userName;
    }
            
}
