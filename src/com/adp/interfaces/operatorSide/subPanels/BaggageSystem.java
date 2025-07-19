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

public class BaggageSystem extends javax.swing.JPanel {

    public BaggageSystem() {
        initComponents();
        initTable();
    }

    private void initTable() {

        reloadBtn.setIcon(new FlatSVGIcon("com/adp/recources/icons/Reload.svg", 25, 25));
        reloadBtn.putClientProperty(FlatClientProperties.STYLE, "arc:100");

        JTableHeader header = baggageRecordTable.getTableHeader();
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
        baggageRecordTable = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 255, 255));

        flightOperationOverviewPanel.setBackground(new java.awt.Color(244, 244, 244));

        jLabel8.setFont(new java.awt.Font("Inter 18pt", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(123, 123, 123));
        jLabel8.setText("Displays all registered passenger baggage details for current and upcoming flights.");

        jLabel9.setFont(new java.awt.Font("Inter 18pt Medium", 0, 16)); // NOI18N
        jLabel9.setText("Baggage Records ");

        reloadBtn.setFocusPainted(false);

        jScrollPane1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(244, 244, 244)));

        baggageRecordTable.setBackground(new java.awt.Color(244, 244, 244));
        baggageRecordTable.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(244, 244, 244)));
        baggageRecordTable.setFont(new java.awt.Font("Inter 18pt Medium", 0, 14)); // NOI18N
        baggageRecordTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Bag Tag", "Passenger", "	Flight No	Flight No", "	Type	Type", "	Weight	Weight", "Status", "Action"
            }
        ));
        jScrollPane1.setViewportView(baggageRecordTable);

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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 720, Short.MAX_VALUE)
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
                .addContainerGap(55, Short.MAX_VALUE))
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
    private javax.swing.JTable baggageRecordTable;
    private javax.swing.JPanel flightOperationOverviewPanel;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton reloadBtn;
    // End of variables declaration//GEN-END:variables
}
