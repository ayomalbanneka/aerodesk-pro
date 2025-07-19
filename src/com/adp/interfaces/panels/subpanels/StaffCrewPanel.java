package com.adp.interfaces.panels.subpanels;

import com.formdev.flatlaf.FlatClientProperties;

public class StaffCrewPanel extends javax.swing.JPanel {

    public StaffCrewPanel() {
        initComponents();
        init();
    }

    private void init() {
        availableCrewPanel.putClientProperty(FlatClientProperties.STYLE, "arc:20");
        suspendPanel.putClientProperty(FlatClientProperties.STYLE, "arc:20");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        availableCrewPanel = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        suspendPanel = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new java.awt.GridLayout(1, 2, 10, 0));

        availableCrewPanel.setBackground(new java.awt.Color(244, 244, 244));

        jLabel4.setFont(new java.awt.Font("Inter 24pt SemiBold", 0, 30)); // NOI18N
        jLabel4.setText("Available Crew");

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Inter 18pt Medium", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(123, 121, 121));
        jLabel3.setText("<html>Total number of crew members currently available for flight assignments.</html>");

        jLabel1.setFont(new java.awt.Font("Inter 24pt SemiBold", 0, 48)); // NOI18N
        jLabel1.setText("300");

        javax.swing.GroupLayout availableCrewPanelLayout = new javax.swing.GroupLayout(availableCrewPanel);
        availableCrewPanel.setLayout(availableCrewPanelLayout);
        availableCrewPanelLayout.setHorizontalGroup(
            availableCrewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(availableCrewPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(availableCrewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 79, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(25, 25, 25))
        );
        availableCrewPanelLayout.setVerticalGroup(
            availableCrewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(availableCrewPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addGap(20, 20, 20))
            .addGroup(availableCrewPanelLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        jPanel1.add(availableCrewPanel);

        suspendPanel.setBackground(new java.awt.Color(244, 244, 244));

        jLabel5.setFont(new java.awt.Font("Inter 24pt SemiBold", 0, 30)); // NOI18N
        jLabel5.setText("Suspended Crew");

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Inter 18pt Medium", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(123, 121, 121));
        jLabel6.setText("<html>Total number of crew members currently suspended from active duty.</html>");

        jLabel2.setFont(new java.awt.Font("Inter 24pt SemiBold", 0, 48)); // NOI18N
        jLabel2.setText("300");

        javax.swing.GroupLayout suspendPanelLayout = new javax.swing.GroupLayout(suspendPanel);
        suspendPanel.setLayout(suspendPanelLayout);
        suspendPanelLayout.setHorizontalGroup(
            suspendPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(suspendPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(suspendPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 79, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(25, 25, 25))
        );
        suspendPanelLayout.setVerticalGroup(
            suspendPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(suspendPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addGap(20, 20, 20))
            .addGroup(suspendPanelLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(suspendPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1293, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(658, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel availableCrewPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel suspendPanel;
    // End of variables declaration//GEN-END:variables
}
