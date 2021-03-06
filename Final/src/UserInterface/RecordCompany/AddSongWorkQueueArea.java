/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.RecordCompany;

import Music.Singer;
import Music.Song;
import MusicEcosystem.Enterprise.MusicPlatEnterprise;
import MusicEcosystem.Enterprise.RecordCompanyEnterprise;
import MusicEcosystem.Organization.Organization;
import MusicEcosystem.Organization.SingerOrganization;
import MusicEcosystem.Organization.SongOrganization;
import WorkQueue.AddSongRequest;
import WorkQueue.WorkQueue;
import WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author xutao
 */
public class AddSongWorkQueueArea extends javax.swing.JPanel {

    /**
     * Creates new form AddSongWorkQueueArea
     */
    private JPanel container;
    private WorkQueue workQueue;
    private RecordCompanyEnterprise rcEnterprise;
    public AddSongWorkQueueArea(JPanel container, WorkQueue workQueue, RecordCompanyEnterprise rcEnterprise) {
        initComponents();
        this.container = container;
        this.workQueue = workQueue;
        this.rcEnterprise = rcEnterprise;
        this.setSize(630, 511);
        populateTable();
        populateCbx();;
    }
    
    public void populateTable() {
        DefaultTableModel model = (DefaultTableModel) workQueueTbl.getModel();
        int rowCount = workQueueTbl.getRowCount();
        for (int i = rowCount - 1; i >= 0; i --) {
            model.removeRow(i);
        }
        
        for(WorkRequest workRequest : workQueue.getWorkqueue()) {
            if (workRequest.getReceiver() instanceof RecordCompanyEnterprise) {
                Object [] row = new Object[4];
                row[0] = workRequest;
                row[1] = workRequest.getRequestDate();
                row[2] = workRequest.getStatus();
                row[3] = workRequest.getSongID();
                model.addRow(row);
            }
        }
    }

    public void populateCbx() {
        statusCbx.removeAllItems();
        statusCbx.addItem("All");
        statusCbx.addItem(WorkRequest.states.Canceled.getValue());
        statusCbx.addItem(WorkRequest.states.Finish.getValue());
        statusCbx.addItem(WorkRequest.states.Undone.getValue());
        statusCbx.addItem(WorkRequest.states.Reject.getValue());
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
        workQueueTbl = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        statusCbx = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        agreeBtn = new javax.swing.JButton();
        rejectBtn = new javax.swing.JButton();
        searchBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(217, 220, 242));
        setPreferredSize(new java.awt.Dimension(700, 500));

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jLabel1.setText("Work Queue Area");

        workQueueTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Send", "RequestDate", "Status", "Song ID"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(workQueueTbl);

        jLabel2.setText("Select Work request by status :");

        statusCbx.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        statusCbx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                statusCbxActionPerformed(evt);
            }
        });

        jButton1.setText("< < back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        agreeBtn.setText("Agree");
        agreeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agreeBtnActionPerformed(evt);
            }
        });

        rejectBtn.setText("Reject");
        rejectBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rejectBtnActionPerformed(evt);
            }
        });

        searchBtn.setText("Search");
        searchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 530, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(statusCbx, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(rejectBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(agreeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(searchBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(219, 219, 219)
                        .addComponent(jLabel1)))
                .addContainerGap(73, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(statusCbx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchBtn))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rejectBtn)
                    .addComponent(agreeBtn))
                .addGap(47, 47, 47)
                .addComponent(jButton1)
                .addGap(37, 37, 37))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        container.remove(this);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.previous(container);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void searchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtnActionPerformed
        // TODO add your handling code here:
        String state = (String) statusCbx.getSelectedItem();
        DefaultTableModel model = (DefaultTableModel) workQueueTbl.getModel();
        int rowCount = workQueueTbl.getRowCount();
        for (int i = rowCount - 1; i >= 0; i--) {
            model.removeRow(i);
        }
        if (state.equals("All")) {
            populateTable();
            return;
        }
        for (WorkRequest workRequest : workQueue.getWorkqueue()) {
            if (workRequest.getReceiver() instanceof RecordCompanyEnterprise && workRequest.getStatus().equals(state)) {
                Object [] row = new Object[4];
                row[0] = workRequest;
                row[1] = workRequest.getRequestDate();
                row[2] = workRequest.getStatus();
                row[3] = workRequest.getSongID();
                model.addRow(row);
            }
        }
    }//GEN-LAST:event_searchBtnActionPerformed

    private void rejectBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rejectBtnActionPerformed
        // TODO add your handling code here:
        int selectRow = workQueueTbl.getSelectedRow();
        if(selectRow < 0 ) {
            JOptionPane.showMessageDialog(null, "Please select one row from the table !!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        WorkRequest workRequest = (AddSongRequest) workQueueTbl.getValueAt(selectRow, 0);
        if ( !workRequest.getStatus().equals(WorkRequest.states.Undone.getValue()) ) {
            JOptionPane.showMessageDialog(null, "Only the request in UNDONE states can be reject !", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        int result = JOptionPane.showConfirmDialog(null, "Are you sure to reject this requset ?","Waringn", JOptionPane.YES_NO_OPTION);
        if(result == JOptionPane.NO_OPTION) {
            return;
        }
        
        workRequest.setStatus(WorkRequest.states.Reject.getValue());
        Date date = new Date();
        workRequest.setResolveDate(date);
        populateTable();
    }//GEN-LAST:event_rejectBtnActionPerformed

    private void agreeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agreeBtnActionPerformed
        // TODO add your handling code here:
        int selectRow = workQueueTbl.getSelectedRow();
        if(selectRow < 0 ) {
            JOptionPane.showMessageDialog(null, "Please select one row from the table !!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        AddSongRequest workRequest = (AddSongRequest) workQueueTbl.getValueAt(selectRow, 0);
        if ( !workRequest.getStatus().equals(WorkRequest.states.Undone.getValue()) ) {
            JOptionPane.showMessageDialog(null, "Only the request in UNDONE states can be Agree !", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        int result = JOptionPane.showConfirmDialog(null, "Are you sure to agree this requset ?","Waringn", JOptionPane.YES_NO_OPTION);
        if(result == JOptionPane.NO_OPTION) {
            return;
        }
        
        Song song = null;
        Singer singer = null;
        for (Organization organization : rcEnterprise.getOrganizationDirectory().getOrganizationList()) {
            song = organization.getSongDirectory().searchSong(workRequest.getSongID());
            
            if ( song != null) {
                singer = organization.getSingerDirectory().searchSinger(song.getSingerid());
                break;
            }
        }
        if ( song == null ) {
            JOptionPane.showMessageDialog(null, "there is no such a Song!!");
            return;
        }
        
        MusicPlatEnterprise enterprise = workRequest.getMusicMusicPlatEnterprise();
        for (Organization og : enterprise.getOrganizationDirectory().getOrganizationList()) {
            if (og instanceof SingerOrganization) {
                og.getSingerDirectory().AddSinger(singer);
            }
            if (og instanceof  SongOrganization) {
                og.getSongDirectory().AddSong(song);
            }
        }
        workRequest.setStatus(WorkRequest.states.Finish.getValue());
        workRequest.setResolveDate(new Date());
        JOptionPane.showMessageDialog(null, "Agree the request Successfully!");
        populateTable();            
        
        
        
    }//GEN-LAST:event_agreeBtnActionPerformed

    private void statusCbxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_statusCbxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_statusCbxActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agreeBtn;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton rejectBtn;
    private javax.swing.JButton searchBtn;
    private javax.swing.JComboBox<String> statusCbx;
    private javax.swing.JTable workQueueTbl;
    // End of variables declaration//GEN-END:variables
}
