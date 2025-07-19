package com.adp.interfaces.panels;

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

public class DashboardPanel extends javax.swing.JPanel {

    public DashboardPanel() {
        initComponents();
        init();
        initTable();
    }

    private void initTable() {
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

    private void init() {
        flightAddBtn.setIcon(new FlatSVGIcon("com/adp/recources/icons/Add.svg", 25, 25));
        flightAddBtn.setHorizontalAlignment(SwingConstants.LEFT);
        flightAddBtn.setIconTextGap(7);
        flightAddBtn.setHorizontalTextPosition(SwingConstants.RIGHT);

        arrivalsPanel.putClientProperty(FlatClientProperties.STYLE, "arc:20");
        departuresPanel.putClientProperty(FlatClientProperties.STYLE, "arc:20");
        delayPanel.putClientProperty(FlatClientProperties.STYLE, "arc:20");
        terminatedFlights.putClientProperty(FlatClientProperties.STYLE, "arc:20");
        flightOperationOverviewPanel.putClientProperty(FlatClientProperties.STYLE, "arc:20");

        operationBtn.putClientProperty(FlatClientProperties.STYLE, "arc:15");
        stafCrewBtn.putClientProperty(FlatClientProperties.STYLE, "arc:15");
        operationBtn.putClientProperty(FlatClientProperties.STYLE, "arc:15");
        operationBtn.putClientProperty(FlatClientProperties.STYLE, "arc:15");

        flightAddBtn.putClientProperty(FlatClientProperties.STYLE, "arc:15; borderColor:#171717; borderWidth:0");

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        flightAddBtn = new javax.swing.JButton();
        flightOperationOverviewPanel = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        flightOperationOverviewTable = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        operationBtn = new javax.swing.JButton();
        stafCrewBtn = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        arrivalsPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        departuresPanel = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        delayPanel = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        terminatedFlights = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setBackground(new java.awt.Color(255, 255, 255));

        flightAddBtn.setBackground(new java.awt.Color(34, 59, 204));
        flightAddBtn.setFont(new java.awt.Font("Inter 18pt Medium", 0, 15)); // NOI18N
        flightAddBtn.setForeground(new java.awt.Color(255, 255, 255));
        flightAddBtn.setText("Flight Registration");

        flightOperationOverviewPanel.setBackground(new java.awt.Color(244, 244, 244));

        jLabel8.setFont(new java.awt.Font("Inter 18pt", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(123, 123, 123));
        jLabel8.setText("Comprehensive list of all scheduled, arrived, and departed flights today.");

        jLabel9.setFont(new java.awt.Font("Inter 18pt Medium", 0, 16)); // NOI18N
        jLabel9.setText("Flight Operations Overview");

        jButton1.setText(".");

        jScrollPane1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(244, 244, 244)));

        flightOperationOverviewTable.setBackground(new java.awt.Color(244, 244, 244));
        flightOperationOverviewTable.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(244, 244, 244)));
        flightOperationOverviewTable.setFont(new java.awt.Font("Inter 18pt Medium", 0, 14)); // NOI18N
        flightOperationOverviewTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Flight ID", "Departure Airport", "Departure Gate", "Departure Status", "Departure Schedule", "Arrival Airport", "Arrival Gate", "Arrival Status", "Arrival Schedule"
            }
        ));
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
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(19, 19, 19))
        );
        flightOperationOverviewPanelLayout.setVerticalGroup(
            flightOperationOverviewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(flightOperationOverviewPanelLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(flightOperationOverviewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(flightOperationOverviewPanelLayout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 443, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new java.awt.GridLayout(1, 4, 15, 0));

        operationBtn.setBackground(new java.awt.Color(21, 21, 21));
        operationBtn.setFont(new java.awt.Font("Inter 18pt Medium", 0, 14)); // NOI18N
        operationBtn.setForeground(new java.awt.Color(255, 255, 255));
        operationBtn.setText("Operation");
        jPanel2.add(operationBtn);

        stafCrewBtn.setBackground(new java.awt.Color(251, 251, 251));
        stafCrewBtn.setFont(new java.awt.Font("Inter 18pt Medium", 0, 14)); // NOI18N
        stafCrewBtn.setForeground(new java.awt.Color(97, 97, 97));
        stafCrewBtn.setText("Staff Crew");
        jPanel2.add(stafCrewBtn);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new java.awt.GridLayout(1, 4, 20, 0));

        arrivalsPanel.setBackground(new java.awt.Color(244, 244, 244));

        jLabel1.setFont(new java.awt.Font("Inter 24pt SemiBold", 0, 48)); // NOI18N
        jLabel1.setText("300");

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Inter 18pt Medium", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(123, 121, 121));
        jLabel3.setText("<html>Total number of flights that successfully arrived at the airport today.</html>");

        jLabel4.setFont(new java.awt.Font("Inter 24pt SemiBold", 0, 30)); // NOI18N
        jLabel4.setText("Arrivals");

        javax.swing.GroupLayout arrivalsPanelLayout = new javax.swing.GroupLayout(arrivalsPanel);
        arrivalsPanel.setLayout(arrivalsPanelLayout);
        arrivalsPanelLayout.setHorizontalGroup(
            arrivalsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(arrivalsPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(arrivalsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        arrivalsPanelLayout.setVerticalGroup(
            arrivalsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(arrivalsPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jPanel3.add(arrivalsPanel);

        departuresPanel.setBackground(new java.awt.Color(244, 244, 244));

        jLabel14.setFont(new java.awt.Font("Inter 24pt SemiBold", 0, 30)); // NOI18N
        jLabel14.setText("Departures");

        jLabel15.setBackground(new java.awt.Color(255, 255, 255));
        jLabel15.setFont(new java.awt.Font("Inter 18pt Medium", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(123, 121, 121));
        jLabel15.setText("<html>Total number of flights that departed from the airport today.</html>");

        jLabel16.setFont(new java.awt.Font("Inter 24pt SemiBold", 0, 48)); // NOI18N
        jLabel16.setText("300");

        javax.swing.GroupLayout departuresPanelLayout = new javax.swing.GroupLayout(departuresPanel);
        departuresPanel.setLayout(departuresPanelLayout);
        departuresPanelLayout.setHorizontalGroup(
            departuresPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(departuresPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(departuresPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        departuresPanelLayout.setVerticalGroup(
            departuresPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(departuresPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        jPanel3.add(departuresPanel);

        delayPanel.setBackground(new java.awt.Color(244, 244, 244));

        jLabel17.setFont(new java.awt.Font("Inter 24pt SemiBold", 0, 30)); // NOI18N
        jLabel17.setText("Delayed Flights");

        jLabel18.setBackground(new java.awt.Color(255, 255, 255));
        jLabel18.setFont(new java.awt.Font("Inter 18pt Medium", 0, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(123, 121, 121));
        jLabel18.setText("<html>Total number of flights delayed beyond their scheduled departure or arrival time.</html>");

        jLabel19.setFont(new java.awt.Font("Inter 24pt SemiBold", 0, 48)); // NOI18N
        jLabel19.setText("300");

        javax.swing.GroupLayout delayPanelLayout = new javax.swing.GroupLayout(delayPanel);
        delayPanel.setLayout(delayPanelLayout);
        delayPanelLayout.setHorizontalGroup(
            delayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(delayPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(delayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19)
                    .addComponent(jLabel17))
                .addContainerGap(91, Short.MAX_VALUE))
        );
        delayPanelLayout.setVerticalGroup(
            delayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(delayPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        jPanel3.add(delayPanel);

        terminatedFlights.setBackground(new java.awt.Color(244, 244, 244));

        jLabel5.setFont(new java.awt.Font("Inter 24pt SemiBold", 0, 30)); // NOI18N
        jLabel5.setText("Terminated Flights");

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Inter 18pt Medium", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(123, 121, 121));
        jLabel6.setText("<html>Total number of flights cancelled or terminated before scheduled completion.</html>");

        jLabel7.setFont(new java.awt.Font("Inter 24pt SemiBold", 0, 48)); // NOI18N
        jLabel7.setText("300");

        javax.swing.GroupLayout terminatedFlightsLayout = new javax.swing.GroupLayout(terminatedFlights);
        terminatedFlights.setLayout(terminatedFlightsLayout);
        terminatedFlightsLayout.setHorizontalGroup(
            terminatedFlightsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(terminatedFlightsLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(terminatedFlightsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        terminatedFlightsLayout.setVerticalGroup(
            terminatedFlightsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(terminatedFlightsLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        jPanel3.add(terminatedFlights);

        jLabel2.setFont(new java.awt.Font("Inter 24pt SemiBold", 0, 24)); // NOI18N
        jLabel2.setText("Dashboard ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(flightOperationOverviewPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(flightAddBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(25, 25, 25))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(flightAddBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(flightOperationOverviewPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(20, 20, 20))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel arrivalsPanel;
    private javax.swing.JPanel delayPanel;
    private javax.swing.JPanel departuresPanel;
    private javax.swing.JButton flightAddBtn;
    private javax.swing.JPanel flightOperationOverviewPanel;
    private javax.swing.JTable flightOperationOverviewTable;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton operationBtn;
    private javax.swing.JButton stafCrewBtn;
    private javax.swing.JPanel terminatedFlights;
    // End of variables declaration//GEN-END:variables
}
