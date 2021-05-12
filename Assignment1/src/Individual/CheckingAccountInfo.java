/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Individual;

/**
 *
 * @author 徐涛
 */
public class CheckingAccountInfo {
    
    private String bankName;
    private String bankRoutingNum;
    private String bankAccountNum;
    private String accountBalance;
    private String accountType;
    
    public void SavingAccountInfo() {
        
        bankName = null;
        bankRoutingNum = null;
        bankAccountNum = null;
        accountBalance = null;
        accountType = null;
        
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getBankRoutingNum() {
        return bankRoutingNum;
    }

    public void setBankRoutingNum(String bankRoutingNum) {
        this.bankRoutingNum = bankRoutingNum;
    }

    public String getBankAccountNum() {
        return bankAccountNum;
    }

    public void setBankAccountNum(String bankAccountNum) {
        this.bankAccountNum = bankAccountNum;
    }

    public String getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(String accountBalance) {
        this.accountBalance = accountBalance;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }
    
    
    
}
