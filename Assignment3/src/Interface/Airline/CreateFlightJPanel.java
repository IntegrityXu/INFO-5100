/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.Airline;
import Business.* ;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.JOptionPane;
import java.awt.Component;

/**
 *
 * @author xutao
 */
public class CreateFlightJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CreateFlightJPanel
     */
    AirLine airline = new AirLine();
    JPanel container = new JPanel();
    public CreateFlightJPanel( AirLine airline, JPanel container) {
        initComponents();
        this.airline = airline;
        this.container = container;
        
        
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
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        serialNumTextField = new javax.swing.JTextField();
        depTimeTextField = new javax.swing.JTextField();
        depDateTextField = new javax.swing.JTextField();
        destinationTextField = new javax.swing.JTextField();
        departureTextField = new javax.swing.JTextField();
        idTextField = new javax.swing.JTextField();
        saveBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jLabel1.setText("Add A New Flight");

        jLabel2.setText("ID Number :");

        jLabel3.setText("Departure :");

        jLabel4.setText("Destination :");

        jLabel5.setText("Departure Date :");

        jLabel6.setText("Departure Time :");

        jLabel7.setText("Plane Serial NUmber :");

        depTimeTextField.setText("hhmm");

        depDateTextField.setText("yymmdd");

        saveBtn.setText("Save");
        saveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBtnActionPerformed(evt);
            }
        });

        backBtn.setText("< < back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(165, 165, 165)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(backBtn))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(idTextField)
                            .addComponent(departureTextField)
                            .addComponent(destinationTextField)
                            .addComponent(depDateTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 297, Short.MAX_VALUE)
                            .addComponent(depTimeTextField)
                            .addComponent(serialNumTextField)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(saveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(49, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabel1)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(idTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(departureTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(destinationTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(depDateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(depTimeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(serialNumTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(saveBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(backBtn)
                .addContainerGap(16, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        container.remove(this);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.previous(container);
        
        Component[] component = container.getComponents();
        for ( Component c : component ) {
            if ( c instanceof ManageFlightJPanel) {
                ManageFlightJPanel mgJP = (ManageFlightJPanel) c;
                mgJP.PopulateTable();
            }
        }
        
    }//GEN-LAST:event_backBtnActionPerformed

    private void saveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtnActionPerformed
        // TODO add your handling code here:
        if ( idTextField.getText().isEmpty() || departureTextField.getText().isEmpty() || destinationTextField.getText().isEmpty() ||
                depDateTextField.getText().isEmpty() || depTimeTextField.getText().isEmpty() || serialNumTextField.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please enter every field!","Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        try {
            Integer.parseInt(idTextField.getText());
            Integer.parseInt(depDateTextField.getText());
            Integer.parseInt(depTimeTextField.getText());
            Integer.parseInt(serialNumTextField.getText());
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Please enter valid data!!","Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if ( depDateTextField.getText().length() != 6 || depTimeTextField.getText().length() != 4 ){
            JOptionPane.showMessageDialog(null, "Please enter right time format!!","Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if (airline.searchFlight(Integer.parseInt(idTextField.getText())) != null) {
            JOptionPane.showMessageDialog(null, "this flight has existed!","Warning",JOptionPane.WARNING_MESSAGE);
            return;
        }
        else {
            Flight fl = airline.AddFlight();
            fl.setIdNumber(Integer.parseInt(idTextField.getText()));
            fl.setDeparture(departureTextField.getText());
            fl.setDestination(destinationTextField.getText());
            fl.setDepDate(Integer.parseInt(depDateTextField.getText()));
            fl.setDepTime(Integer.parseInt(depTimeTextField.getText()));
            if (airline.SearchAirplane(Integer.parseInt(serialNumTextField.getText())) == null) {
                JOptionPane.showMessageDialog(null, "No such an airplane! Please add airplane first.","Warning",JOptionPane.WARNING_MESSAGE);
                return;
            }
            else {
                fl.setAirplane(airline.SearchAirplane(Integer.parseInt(serialNumTextField.getText())));
            }
            
            JOptionPane.showMessageDialog(null, "Add flight successfully!");
        }
        
        
        
    }//GEN-LAST:event_saveBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JTextField depDateTextField;
    private javax.swing.JTextField depTimeTextField;
    private javax.swing.JTextField departureTextField;
    private javax.swing.JTextField destinationTextField;
    private javax.swing.JTextField idTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JButton saveBtn;
    private javax.swing.JTextField serialNumTextField;
    // End of variables declaration//GEN-END:variables
}
