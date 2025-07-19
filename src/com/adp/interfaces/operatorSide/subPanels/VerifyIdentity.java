package com.adp.interfaces.operatorSide.subPanels;

import com.adp.constant.Colors;
import com.formdev.flatlaf.FlatClientProperties;
import com.formdev.flatlaf.extras.FlatSVGIcon;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.border.MatteBorder;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.JTableHeader;

public class VerifyIdentity extends javax.swing.JPanel {

    public VerifyIdentity() {
        initComponents();
        initTable();
    }

    private void initTable() {

        reloadBtn.setIcon(new FlatSVGIcon("com/adp/recources/icons/Reload.svg", 25, 25));
        reloadBtn.putClientProperty(FlatClientProperties.STYLE, "arc:100");

        JTableHeader header = passangerTable.getTableHeader();
        DefaultTableCellRenderer renderer = new DefaultTableCellRenderer();
        renderer.setPreferredSize(new Dimension(header.getWidth(), 50));
        renderer.setForeground(Color.BLACK);
        renderer.setBackground(Colors.PRIMARAY);
        header.setDefaultRenderer(renderer);
        header.setBorder(new MatteBorder(0, 0, 1, 0, Colors.BORDER));

        header.setFont(new Font("Inter 18pt Medium", Font.PLAIN, 16));

        DefaultTableCellRenderer leftRenderer = (DefaultTableCellRenderer) header.getDefaultRenderer();
        leftRenderer.setHorizontalAlignment(SwingConstants.LEFT);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        flightOperationOverviewPanel = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        reloadBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        passangerTable = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 255, 255));

        flightOperationOverviewPanel.setBackground(new java.awt.Color(244, 244, 244));

        jLabel8.setFont(new java.awt.Font("Inter 18pt", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(123, 123, 123));
        jLabel8.setText("List of passengers with identity verification status before boarding issuance.");

        jLabel9.setFont(new java.awt.Font("Inter 18pt Medium", 0, 16)); // NOI18N
        jLabel9.setText("Passenger Verification Records");

        reloadBtn.setFocusPainted(false);

        jScrollPane1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(244, 244, 244)));

        passangerTable.setBackground(new java.awt.Color(244, 244, 244));
        passangerTable.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(244, 244, 244)));
        passangerTable.setFont(new java.awt.Font("Inter 18pt Medium", 0, 14)); // NOI18N
        passangerTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Passenger ID", "Full name", "Gender", "Date of Birth", "Nationality", "Created At"
            }
        ));
        jScrollPane1.setViewportView(passangerTable);

        javax.swing.GroupLayout flightOperationOverviewPanelLayout = new javax.swing.GroupLayout(flightOperationOverviewPanel);
        flightOperationOverviewPanel.setLayout(flightOperationOverviewPanelLayout);
        flightOperationOverviewPanelLayout.setHorizontalGroup(
            flightOperationOverviewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, flightOperationOverviewPanelLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(flightOperationOverviewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1)
                    .addGroup(flightOperationOverviewPanelLayout.createSequentialGroup()
                        .addGroup(flightOperationOverviewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 772, Short.MAX_VALUE)
                        .addComponent(reloadBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(19, 19, 19))
        );
        flightOperationOverviewPanelLayout.setVerticalGroup(
            flightOperationOverviewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(flightOperationOverviewPanelLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(flightOperationOverviewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(reloadBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(flightOperationOverviewPanelLayout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 645, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(58, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(flightOperationOverviewPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(flightOperationOverviewPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel flightOperationOverviewPanel;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable passangerTable;
    private javax.swing.JButton reloadBtn;
    // End of variables declaration//GEN-END:variables
}
