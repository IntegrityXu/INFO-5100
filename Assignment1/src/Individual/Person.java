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
public class Person {

    private DemoInfo demoInfo;
    private AddressInfo addressInfo;
    private SavingAccountInfo savingAccountInfo;
    private CheckingAccountInfo checkingAccountInfo;
    private DriverLicenseInfo driverLicenseInfo;
    private MedicalRecord medicalRecord;
   
    public void Person() {
        
        demoInfo = new DemoInfo();
        addressInfo = new AddressInfo();
        savingAccountInfo = new SavingAccountInfo();
        checkingAccountInfo = new CheckingAccountInfo();
        driverLicenseInfo = new DriverLicenseInfo();
        medicalRecord = new MedicalRecord();
        
        
    }
    
    public DemoInfo getDemoInfo() {
        return demoInfo;
    }

    public void setDemoInfo(DemoInfo demoInfo) {
        this.demoInfo = demoInfo;
    }

    public AddressInfo getAddressInfo() {
        return addressInfo;
    }

    public void setAddressInfo(AddressInfo addressInfo) {
        this.addressInfo = addressInfo;
    }

    public SavingAccountInfo getSavingAccountInfo() {
        return savingAccountInfo;
    }

    public void setSavingAccountInfo(SavingAccountInfo savingAccountInfo) {
        this.savingAccountInfo = savingAccountInfo;
    }

    public CheckingAccountInfo getCheckingAccountInfo() {
        return checkingAccountInfo;
    }

    public void setCheckingAccountInfo(CheckingAccountInfo checkingAccountInfo) {
        this.checkingAccountInfo = checkingAccountInfo;
    }

    public DriverLicenseInfo getDriverLicenseInfo() {
        return driverLicenseInfo;
    }

    public void setDriverLicenseInfo(DriverLicenseInfo driverLicenseInfo) {
        this.driverLicenseInfo = driverLicenseInfo;
    }

    public MedicalRecord getMedicalRecord() {
        return medicalRecord;
    }

    public void setMedicalRecord(MedicalRecord medicalRecord) {
        this.medicalRecord = medicalRecord;
    }
    
    
    /**
     * @param args the command line arguments
     */
    //public static void main(String[] args) {
        // TODO code application logic here
   // }
    
}
