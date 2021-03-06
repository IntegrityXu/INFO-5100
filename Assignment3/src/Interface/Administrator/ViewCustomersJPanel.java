/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.Administrator;
import java.awt.CardLayout;
import javax.swing.JPanel;
import Business.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author xutao
 */
public class ViewCustomersJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewCustomersJPanel
     */
    private TravelAgency travelAgency = new TravelAgency();
    private JPanel container = new JPanel();
    public ViewCustomersJPanel( TravelAgency travelAgency, JPanel container ) {
        initComponents();
        this.travelAgency = travelAgency;
        this.container = container;
        /*
        Customer cs = travelAgency.AddCostumer();
        cs.setName("xx");
        cs.setUserID(123456);
        Flight fl = new Flight();
        fl.setIdNumber(1234);
        fl.setDepDate(180901);
        fl.setDepTime(1809);
        fl.setSeatLocation(1, 2);
        cs.setFlight(fl);
        int[] a = new int[]{1,2};
        cs.setSeat(a);
        */
        PopulateTable();
    }
    
    public void PopulateTable() {
        DefaultTableModel dtm = (DefaultTableModel) customerTbl.getModel();
        dtm.setRowCount(0);
        for (Customer c : travelAgency.getCustomerList()) {
            Object [] row = new Object[4];
            row[0] = c;
            row[1] = c.getUserID();
            row[2] = c.getFlight();
            String s;
            s = String.valueOf("[" + c.getSeat()[0]) + "," + String.valueOf(c.getSeat()[1] + "]");
            row[3] = s;
            dtm.addRow(row);
        }
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
        jScrollPane1 = new javax.swing.JScrollPane();
        customerTbl = new javax.swing.JTable();
        backBtn = new javax.swing.JButton();
        viewFlightDetailsBtn = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jLabel1.setText("View Customers");

        customerTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "userID", "Flight Number", "Seat"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(customerTbl);

        backBtn.setText("< < back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        viewFlightDetailsBtn.setText("View flight Details");
        viewFlightDetailsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewFlightDetailsBtnActionPerformed(evt);
            }
        });

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
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(viewFlightDetailsBtn)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(backBtn)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 486, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(viewFlightDetailsBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addComponent(backBtn)
                .addGap(49, 49, 49))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        container.remove(this);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.previous(container);
    }//GEN-LAST:event_backBtnActionPerformed

    private void viewFlightDetailsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewFlightDetailsBtnActionPerformed
        // TODO add your handling code here:
        int selectedRow = customerTbl.getSelectedRow();
        if( selectedRow < 0 ) {
            JOptionPane.showMessageDialog(null, "Please select a row from the table!");
        }
        else {
            Flight fl = (Flight) customerTbl.getValueAt(selectedRow, 2);
            Customer cs = (Customer) customerTbl.getValueAt(selectedRow, 0);
            ViewFlightJPanel vlJP = new ViewFlightJPanel(fl, container, cs);
            container.add("ViewFlightJPanel", vlJP);
            CardLayout layout = (CardLayout) container.getLayout();
            layout.next(container);
            
        }
    }//GEN-LAST:event_viewFlightDetailsBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JTable customerTbl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton viewFlightDetailsBtn;
    // End of variables declaration//GEN-END:variables
}
