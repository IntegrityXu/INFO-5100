/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.Administrator;
import Business.*;
import javax.swing.JPanel;
import java.awt.CardLayout;

/**
 *
 * @author xutao
 */
public class ManageJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageJPanel
     */
    
    private TravelAgency travelAgency = new TravelAgency();
    private JPanel container;
    
    public ManageJPanel( TravelAgency travelAgency, JPanel container ) {
        initComponents();
        this.travelAgency = travelAgency;
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
        manageAirlinesBtn = new javax.swing.JButton();
        viewCustomersBtn = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jLabel1.setText("Administrator Area");

        manageAirlinesBtn.setText("Goto Manage Airlines   > >");
        manageAirlinesBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageAirlinesBtnActionPerformed(evt);
            }
        });

        viewCustomersBtn.setText("Goto View Customers > >");
        viewCustomersBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewCustomersBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(169, 169, 169)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(viewCustomersBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(manageAirlinesBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(170, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jLabel1)
                .addGap(113, 113, 113)
                .addComponent(manageAirlinesBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(viewCustomersBtn)
                .addContainerGap(186, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void manageAirlinesBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageAirlinesBtnActionPerformed
        // TODO add your handling code here:
        ManageAirLinesJPanel malJP = new ManageAirLinesJPanel(travelAgency, container);
        container.add("ManageAirLinesJPanel",malJP);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.next(container);
        
    }//GEN-LAST:event_manageAirlinesBtnActionPerformed

    private void viewCustomersBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewCustomersBtnActionPerformed
        // TODO add your handling code here:
        ViewCustomersJPanel mcJP = new ViewCustomersJPanel(travelAgency, container);
        container.add("ManageCustomerJPanel", mcJP);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.next(container);
    }//GEN-LAST:event_viewCustomersBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton manageAirlinesBtn;
    private javax.swing.JButton viewCustomersBtn;
    // End of variables declaration//GEN-END:variables
}