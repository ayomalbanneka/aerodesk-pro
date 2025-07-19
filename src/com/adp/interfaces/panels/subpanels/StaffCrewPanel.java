package com.adp.interfaces.panels.subpanels;

import com.adp.constant.Colors;
import com.adp.customRenderComponent.ActionButtonRender;
import com.formdev.flatlaf.FlatClientProperties;
import com.formdev.flatlaf.extras.FlatSVGIcon;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Frame;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.border.MatteBorder;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumn;

public class StaffCrewPanel extends javax.swing.JPanel {

    public StaffCrewPanel() {
        initComponents();
        initTable();
        init();
    }

    private void init() {
        availableCrewPanel.putClientProperty(FlatClientProperties.STYLE, "arc:20");
        suspendPanel.putClientProperty(FlatClientProperties.STYLE, "arc:20");
    }

    private void initTable() {

        Frame parent = (Frame) SwingUtilities.getWindowAncestor(StaffCrewPanel.this);
        TableColumn actionColumn = flightOperationOverviewTable.getColumn("Action");
        ActionButtonRender actionBtn = new ActionButtonRender();

        actionBtn.actionButton(actionColumn, flightOperationOverviewTable, "crewModel", parent);

        reloadBtn.setIcon(new FlatSVGIcon("com/adp/recources/icons/Reload.svg", 25, 25));
        reloadBtn.putClientProperty(FlatClientProperties.STYLE, "arc:100");

        JTableHeader header = flightOperationOverviewTable.getTableHeader();
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

        jPanel1 = new javax.swing.JPanel();
        availableCrewPanel = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        suspendPanel = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        flightOperationOverviewPanel = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        reloadBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        flightOperationOverviewTable = new javax.swing.JTable();

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

        flightOperationOverviewPanel.setBackground(new java.awt.Color(244, 244, 244));

        jLabel8.setFont(new java.awt.Font("Inter 18pt", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(123, 123, 123));
        jLabel8.setText("View and manage pilot and cabin crew assignments for scheduled flights.");

        jLabel9.setFont(new java.awt.Font("Inter 18pt Medium", 0, 16)); // NOI18N
        jLabel9.setText("Flight Crew Management");

        reloadBtn.setFocusPainted(false);

        jScrollPane1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(244, 244, 244)));

        flightOperationOverviewTable.setBackground(new java.awt.Color(244, 244, 244));
        flightOperationOverviewTable.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(244, 244, 244)));
        flightOperationOverviewTable.setFont(new java.awt.Font("Inter 18pt Medium", 0, 14)); // NOI18N
        flightOperationOverviewTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"#CID_1", "Chamod Dilshan", "Male", "Sinhala", "English", "Null", "Active", "", ""}
            },
            new String [] {
                "Crew ID", "Crew Name", "Gender", "Nationality", "Languages", "Job Tittle", "Status", "Flight Assign", "Action"
            }
        ));
        flightOperationOverviewTable.setRowHeight(50);
        flightOperationOverviewTable.setRowSelectionAllowed(false);
        jScrollPane1.setViewportView(flightOperationOverviewTable);

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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                        .addComponent(jLabel8)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 539, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1293, Short.MAX_VALUE)
                    .addComponent(flightOperationOverviewPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(flightOperationOverviewPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel availableCrewPanel;
    private javax.swing.JPanel flightOperationOverviewPanel;
    private javax.swing.JTable flightOperationOverviewTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton reloadBtn;
    private javax.swing.JPanel suspendPanel;
    // End of variables declaration//GEN-END:variables
}
