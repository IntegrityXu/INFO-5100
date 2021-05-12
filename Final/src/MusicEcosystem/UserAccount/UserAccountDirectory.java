/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MusicEcosystem.UserAccount;

import java.util.ArrayList;


/**
 *
 * @author xutao
 */
public class UserAccountDirectory {
     private ArrayList<UserAccount> userAccountList; 
     
     public UserAccountDirectory() {
         userAccountList = new ArrayList<>();
     }
     
    public ArrayList<UserAccount> getUserAccountList() {
        return userAccountList;
    }

    public int AddUserAccount(UserAccount ua) {
        if (!this.ContainUserAccount(ua)) {
            this.userAccountList.add(ua);
            return 1;
        }
        return 0;
    }
    
    
    public boolean ContainUserAccount( UserAccount ua ) {
        for (UserAccount u : this.userAccountList) {
            if (u.getUserName().equals( ua.getUserName())) {
                return true;
            }
        }
        return false;
    }
    
    public int RemoveUserAccount (UserAccount us) {
      if (this.ContainUserAccount(us)) {
          this.userAccountList.remove(us);
          return 1;
      }
      return 0;
    }

  
   public UserAccount checkUserNamePwd( String userName, String passWord ){
       for (UserAccount ua : this.userAccountList) {
           if ( ua.getUserName().equals(userName) && ua.getUserPwd().equals(passWord))
               return ua;
       }
       return null;
   }
}
