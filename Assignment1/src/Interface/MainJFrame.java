/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;
import Individual.Person;
import Individual.DemoInfo;
import Individual.AddressInfo;
import Individual.SavingAccountInfo;
import Individual.CheckingAccountInfo;
import Individual.DriverLicenseInfo;
import Individual.MedicalRecord;
/**
 *
 * @author 徐涛
 */
public class MainJFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainJFrame
     */
    private Person person;
    
    public MainJFrame() {
        initComponents();
        person = new Person();
        DemoInfo demoInfo = new DemoInfo();;
        AddressInfo addressInfo = new AddressInfo();
        SavingAccountInfo savingAccountInfo = new SavingAccountInfo();
        CheckingAccountInfo checkingAccountInfo = new CheckingAccountInfo();
        DriverLicenseInfo driverLicnes = new DriverLicenseInfo();
        MedicalRecord medicalRecord = new MedicalRecord();
        person.setDemoInfo(demoInfo);
        person.setAddressInfo(addressInfo);
        person.setSavingAccountInfo(savingAccountInfo);
        person.setCheckingAccountInfo(checkingAccountInfo);
        person.setDriverLicenseInfo(driverLicnes);
        person.setMedicalRecord(medicalRecord);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToggleButton3 = new javax.swing.JToggleButton();
        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        createInfoBtn = new javax.swing.JToggleButton();
        createAddressBtn = new javax.swing.JToggleButton();
        createDriverLicenseBtn = new javax.swing.JToggleButton();
        createSavingAccountBtn = new javax.swing.JToggleButton();
        createCheckingAccountBtn = new javax.swing.JToggleButton();
        createMedicalRecordBtn = new javax.swing.JToggleButton();
        viewInformationBtn = new javax.swing.JToggleButton();
        viewAddressBtn = new javax.swing.JToggleButton();
        viewDriverLicenseBtn = new javax.swing.JToggleButton();
        viewSavingAccountBtn = new javax.swing.JToggleButton();
        viewCheckingAccountBtn = new javax.swing.JToggleButton();
        viewMedicalRecordBtn = new javax.swing.JToggleButton();
        reportBtn = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();

        jToggleButton3.setText("jToggleButton3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        createInfoBtn.setText("Create Information");
        createInfoBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        createInfoBtn.setFocusPainted(false);
        createInfoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createInfoBtnActionPerformed(evt);
            }
        });

        createAddressBtn.setText("Create Address");
        createAddressBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createAddressBtnActionPerformed(evt);
            }
        });

        createDriverLicenseBtn.setText("Create Driver License");
        createDriverLicenseBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createDriverLicenseBtnActionPerformed(evt);
            }
        });

        createSavingAccountBtn.setText("Create Saving Account");
        createSavingAccountBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createSavingAccountBtnActionPerformed(evt);
            }
        });

        createCheckingAccountBtn.setText("Create Checking Account");
        createCheckingAccountBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createCheckingAccountBtnActionPerformed(evt);
            }
        });

        createMedicalRecordBtn.setText("Create Medical Record");
        createMedicalRecordBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createMedicalRecordBtnActionPerformed(evt);
            }
        });

        viewInformationBtn.setText("View Information");
        viewInformationBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewInformationBtnActionPerformed(evt);
            }
        });

        viewAddressBtn.setText("View Address");
        viewAddressBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewAddressBtnActionPerformed(evt);
            }
        });

        viewDriverLicenseBtn.setText("View Driver License");
        viewDriverLicenseBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewDriverLicenseBtnActionPerformed(evt);
            }
        });

        viewSavingAccountBtn.setText("View Saving Account");
        viewSavingAccountBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewSavingAccountBtnActionPerformed(evt);
            }
        });

        viewCheckingAccountBtn.setText("View Checking Account");
        viewCheckingAccountBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewCheckingAccountBtnActionPerformed(evt);
            }
        });

        viewMedicalRecordBtn.setText("View Medical Record");
        viewMedicalRecordBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewMedicalRecordBtnActionPerformed(evt);
            }
        });

        reportBtn.setText("Information Report");
        reportBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reportBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(viewMedicalRecordBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(createInfoBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(createAddressBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(createDriverLicenseBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(createSavingAccountBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(createCheckingAccountBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(createMedicalRecordBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(viewInformationBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(viewAddressBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(viewDriverLicenseBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(viewSavingAccountBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(viewCheckingAccountBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(reportBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(createInfoBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(createAddressBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(createDriverLicenseBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(createSavingAccountBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(createCheckingAccountBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(createMedicalRecordBtn)
                .addGap(37, 37, 37)
                .addComponent(viewInformationBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(viewAddressBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(viewDriverLicenseBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(viewSavingAccountBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(viewCheckingAccountBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(viewMedicalRecordBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addComponent(reportBtn)
                .addContainerGap(56, Short.MAX_VALUE))
        );

        jSplitPane1.setLeftComponent(jPanel1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 895, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 668, Short.MAX_VALUE)
        );

        jSplitPane1.setRightComponent(jPanel2);

        getContentPane().add(jSplitPane1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void createDriverLicenseBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createDriverLicenseBtnActionPerformed
        // TODO add your handling code here:
        CreateDriverLicenseJPanel createDriverLicenseJPanel = new CreateDriverLicenseJPanel(person);
        jSplitPane1.setRightComponent(createDriverLicenseJPanel);
    }//GEN-LAST:event_createDriverLicenseBtnActionPerformed

    private void createInfoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createInfoBtnActionPerformed
        // TODO add your handling code here:
        CreateInfoJPanel createInfoJPanel = new CreateInfoJPanel(this.person);
        jSplitPane1.setRightComponent(createInfoJPanel);
    }//GEN-LAST:event_createInfoBtnActionPerformed

    private void viewInformationBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewInformationBtnActionPerformed
        // TODO add your handling code here:
        ViewInfoJPanel viewInfoJPanel = new ViewInfoJPanel(person);
        jSplitPane1.setRightComponent(viewInfoJPanel);
    }//GEN-LAST:event_viewInformationBtnActionPerformed

    private void createAddressBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createAddressBtnActionPerformed
        // TODO add your handling code here:
        CreateAddressJPanel createAddressJPanel = new CreateAddressJPanel(person);
        jSplitPane1.setRightComponent(createAddressJPanel);
    }//GEN-LAST:event_createAddressBtnActionPerformed

    private void viewAddressBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewAddressBtnActionPerformed
        // TODO add your handling code here:
        ViewAddressJPanel viewAddressJPanel = new ViewAddressJPanel(person);
        jSplitPane1.setRightComponent(viewAddressJPanel);
    }//GEN-LAST:event_viewAddressBtnActionPerformed

    private void viewDriverLicenseBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewDriverLicenseBtnActionPerformed
        // TODO add your handling code here:
        ViewDriverLicenseJPanel vDL = new ViewDriverLicenseJPanel(person);
        jSplitPane1.setRightComponent(vDL);
    }//GEN-LAST:event_viewDriverLicenseBtnActionPerformed

    private void createSavingAccountBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createSavingAccountBtnActionPerformed
        // TODO add your handling code here:
        CreateSavingAccountInfoJPanel cSA = new CreateSavingAccountInfoJPanel(person);
        jSplitPane1.setRightComponent(cSA);
    }//GEN-LAST:event_createSavingAccountBtnActionPerformed

    private void viewSavingAccountBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewSavingAccountBtnActionPerformed
        // TODO add your handling code here:
        ViewSavingAccountJPanel vSA = new ViewSavingAccountJPanel(person);
        jSplitPane1.setRightComponent(vSA);
    }//GEN-LAST:event_viewSavingAccountBtnActionPerformed

    private void createCheckingAccountBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createCheckingAccountBtnActionPerformed
        // TODO add your handling code here:
        CreateCheckingAccountJPanel cCA = new CreateCheckingAccountJPanel(person);
        jSplitPane1.setRightComponent(cCA);
    }//GEN-LAST:event_createCheckingAccountBtnActionPerformed

    private void viewCheckingAccountBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewCheckingAccountBtnActionPerformed
        // TODO add your handling code here:
        ViewCheckingAccountJPanel vCA = new ViewCheckingAccountJPanel(person);
        jSplitPane1.setRightComponent(vCA);
    }//GEN-LAST:event_viewCheckingAccountBtnActionPerformed

    private void createMedicalRecordBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createMedicalRecordBtnActionPerformed
        // TODO add your handling code here:
        CreateMedicalRecordJPanel aMR = new CreateMedicalRecordJPanel(person);
        jSplitPane1.setRightComponent(aMR);
    }//GEN-LAST:event_createMedicalRecordBtnActionPerformed

    private void viewMedicalRecordBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewMedicalRecordBtnActionPerformed
        // TODO add your handling code here:
        ViewMedicalRecordJPanel vMR = new ViewMedicalRecordJPanel(person);
        jSplitPane1.setRightComponent(vMR);
    }//GEN-LAST:event_viewMedicalRecordBtnActionPerformed

    private void reportBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reportBtnActionPerformed
        // TODO add your handling code here:
        ReportJPanel rJP = new ReportJPanel(person);
        jSplitPane1.setRightComponent(rJP);
    }//GEN-LAST:event_reportBtnActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton createAddressBtn;
    private javax.swing.JToggleButton createCheckingAccountBtn;
    private javax.swing.JToggleButton createDriverLicenseBtn;
    private javax.swing.JToggleButton createInfoBtn;
    private javax.swing.JToggleButton createMedicalRecordBtn;
    private javax.swing.JToggleButton createSavingAccountBtn;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JToggleButton jToggleButton3;
    private javax.swing.JButton reportBtn;
    private javax.swing.JToggleButton viewAddressBtn;
    private javax.swing.JToggleButton viewCheckingAccountBtn;
    private javax.swing.JToggleButton viewDriverLicenseBtn;
    private javax.swing.JToggleButton viewInformationBtn;
    private javax.swing.JToggleButton viewMedicalRecordBtn;
    private javax.swing.JToggleButton viewSavingAccountBtn;
    // End of variables declaration//GEN-END:variables
}
