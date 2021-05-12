/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.customer;
import Business.*;
import javax.swing.JPanel;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
       

/**
 *
 * @author xutao
 */
public class MeetConditionJPanel extends javax.swing.JPanel {

    /**
     * Creates new form MeetConditionJPanel
     */
    
    private TravelAgency travelagency = new TravelAgency();
    private JPanel container = new JPanel();
    private ArrayList <Flight> searchResult = new ArrayList <> ();
    public MeetConditionJPanel( TravelAgency travelagency, JPanel container, ArrayList <Flight> searchResult) {
        initComponents();
        this.travelagency = travelagency;
        this.container = container;
        this.searchResult =searchResult;
        PopulateTable();
    }

    public void PopulateTable () {
        
        DefaultTableModel dtm = (DefaultTableModel) flightTbl.getModel();
        dtm.setRowCount(0);
        for (Flight fl : searchResult) {
            Object [] row = new Object [4];
            row[0] = fl;
            row[1] = fl.getDeparture();
            row[2] = fl.getDestination();
            int date = fl.getDepTime();
            String timeString = null;
            String zeroString = "0";
            int hh = date / 100;
            if (hh / 10 == 0)
                timeString = zeroString + String.valueOf(hh);
            else
                timeString = String.valueOf(hh);
            int mm = date - hh * 100;
            if (mm / 10 == 0)
                timeString = timeString + ":" + zeroString + String.valueOf(mm);
            else
                timeString = timeString + ":" + String.valueOf(mm);
            row[3] = timeString;
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

        jScrollPane1 = new javax.swing.JScrollPane();
        flightTbl = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        viewDetailBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();

        flightTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Departure", "Destination", "Dep Time"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(flightTbl);

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jLabel1.setText("the Appropriate Flight");

        viewDetailBtn.setText("View Details");
        viewDetailBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewDetailBtnActionPerformed(evt);
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(viewDetailBtn)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(150, 150, 150)
                            .addComponent(jLabel1))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(backBtn)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 528, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel1)
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(viewDetailBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(backBtn)
                .addGap(43, 43, 43))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        container.remove(this);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.previous(container);
    }//GEN-LAST:event_backBtnActionPerformed

    private void viewDetailBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewDetailBtnActionPerformed
        // TODO add your handling code here:
        int selectedRow = flightTbl.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please Select a row from the table!");
            return;
        }
        else {
            Flight fl = (Flight) flightTbl.getValueAt(selectedRow, 0);
            FlightDetailsJPanel fsJP = new FlightDetailsJPanel(travelagency, container, fl);
            container.add("FlightDetailsJPanel", fsJP);
            CardLayout layout = (CardLayout) container.getLayout();
            layout.next(container);
        }
        
    }//GEN-LAST:event_viewDetailBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JTable flightTbl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton viewDetailBtn;
    // End of variables declaration//GEN-END:variables
}
