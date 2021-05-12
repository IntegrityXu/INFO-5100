/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;
import Individual.Person;
/**
 *
 * @author 徐涛
 */
public class ViewMedicalRecordJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewMedicalRecordJPanel
     */
    public ViewMedicalRecordJPanel(Person person) {
        initComponents();
        DisplayMedicalRecord(person);
    }
    
    public void DisplayMedicalRecord(Person person) {
        
        medicalRecordNumTextField.setText(person.getMedicalRecord().getMedicalRecordNum());
        alergy1TextField.setText(person.getMedicalRecord().getAlergy1());
        alergy2TextField.setText(person.getMedicalRecord().getAlergy2());
        alergy3TextField.setText(person.getMedicalRecord().getAlergy3());
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        medicalRecordNumTextField = new javax.swing.JTextField();
        alergy1TextField = new javax.swing.JTextField();
        alergy2TextField = new javax.swing.JTextField();
        alergy3TextField = new javax.swing.JTextField();

        jLabel1.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jLabel1.setText("View Medical Record");

        jLabel2.setText("Medical Record Number:");

        jLabel3.setText("Alergy1:");

        jLabel4.setText("Alergy2:");

        jLabel5.setText("Alergy3:");

        medicalRecordNumTextField.setEditable(false);
        medicalRecordNumTextField.setEnabled(false);

        alergy1TextField.setEditable(false);
        alergy1TextField.setEnabled(false);

        alergy2TextField.setEditable(false);
        alergy2TextField.setEnabled(false);

        alergy3TextField.setEditable(false);
        alergy3TextField.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(169, 169, 169)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(medicalRecordNumTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 265, Short.MAX_VALUE)
                            .addComponent(alergy1TextField, javax.swing.GroupLayout.DEFAULT_SIZE, 265, Short.MAX_VALUE)
                            .addComponent(alergy2TextField, javax.swing.GroupLayout.DEFAULT_SIZE, 265, Short.MAX_VALUE)
                            .addComponent(alergy3TextField, javax.swing.GroupLayout.DEFAULT_SIZE, 265, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(medicalRecordNumTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(alergy1TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)
                        .addComponent(alergy2TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)
                        .addComponent(alergy3TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(112, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField alergy1TextField;
    private javax.swing.JTextField alergy2TextField;
    private javax.swing.JTextField alergy3TextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField medicalRecordNumTextField;
    // End of variables declaration//GEN-END:variables
}
