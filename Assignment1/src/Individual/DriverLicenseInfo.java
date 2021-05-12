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
public class DriverLicenseInfo {
    
    private String licenseNum;
    private String issueDate;
    private String dateOfExpiration;
    private String bloodType;
    private String pictureAdd;
    
    public void DriverLicenseInfo() {
        
        licenseNum = null;
        issueDate = null;
        dateOfExpiration = null;
        bloodType = null;
        pictureAdd = null;
        
        
    }

    public String getLicenseNum() {
        return licenseNum;
    }

    public void setLicenseNum(String licenseNum) {
        this.licenseNum = licenseNum;
    }

    public String getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(String issueDate) {
        this.issueDate = issueDate;
    }

    public String getDateOfExpiration() {
        return dateOfExpiration;
    }

    public void setDateOfExpiration(String dateOfExpiration) {
        this.dateOfExpiration = dateOfExpiration;
    }

    public String getBloodType() {
        return bloodType;
    }

    public void setBloodType(String bloodType) {
        this.bloodType = bloodType;
    }

    public String getPictureAdd() {
        return pictureAdd;
    }

    public void setPictureAdd(String pictureAdd) {
        this.pictureAdd = pictureAdd;
    }
    
    
    
}
