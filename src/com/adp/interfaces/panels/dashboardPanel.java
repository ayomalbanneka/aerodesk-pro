
package com.adp.interfaces.panels;

import com.formdev.flatlaf.FlatClientProperties;

public class dashboardPanel extends javax.swing.JPanel {

    public dashboardPanel() {
        initComponents();
        init();
    }
    
    private void init(){
        DashboardArea.putClientProperty(FlatClientProperties.STYLE,"arc:999");
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        NavigationBar = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        DashboardBtn = new javax.swing.JButton();
        PassengersBtn = new javax.swing.JButton();
        BaggadgesBtn = new javax.swing.JButton();
        TerminalBtn = new javax.swing.JButton();
        DashboardArea = new javax.swing.JPanel();

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        NavigationBar.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setBackground(new java.awt.Color(0, 255, 255));
        jLabel1.setOpaque(true);

        jLabel2.setFont(new java.awt.Font("Inter 18pt", 1, 22)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("AeroDesk");

        jLabel3.setFont(new java.awt.Font("Inter 18pt", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Pro");

        DashboardBtn.setFont(new java.awt.Font("Inter 18pt", 1, 14)); // NOI18N
        DashboardBtn.setForeground(new java.awt.Color(255, 255, 255));
        DashboardBtn.setText("Dashboard");

        PassengersBtn.setFont(new java.awt.Font("Inter 18pt", 1, 14)); // NOI18N
        PassengersBtn.setForeground(new java.awt.Color(255, 255, 255));
        PassengersBtn.setText("Passengers");

        BaggadgesBtn.setFont(new java.awt.Font("Inter 18pt", 1, 14)); // NOI18N
        BaggadgesBtn.setForeground(new java.awt.Color(255, 255, 255));
        BaggadgesBtn.setText("Baggadges");

        TerminalBtn.setFont(new java.awt.Font("Inter 18pt", 1, 14)); // NOI18N
        TerminalBtn.setForeground(new java.awt.Color(255, 255, 255));
        TerminalBtn.setText("Terminal");

        javax.swing.GroupLayout NavigationBarLayout = new javax.swing.GroupLayout(NavigationBar);
        NavigationBar.setLayout(NavigationBarLayout);
        NavigationBarLayout.setHorizontalGroup(
            NavigationBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NavigationBarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(NavigationBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(NavigationBarLayout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3))
                    .addComponent(DashboardBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PassengersBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BaggadgesBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TerminalBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(12, Short.MAX_VALUE))
        );
        NavigationBarLayout.setVerticalGroup(
            NavigationBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NavigationBarLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(NavigationBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(NavigationBarLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(NavigationBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))))
                .addGap(47, 47, 47)
                .addComponent(DashboardBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(PassengersBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BaggadgesBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(TerminalBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(238, Short.MAX_VALUE))
        );

        DashboardArea.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout DashboardAreaLayout = new javax.swing.GroupLayout(DashboardArea);
        DashboardArea.setLayout(DashboardAreaLayout);
        DashboardAreaLayout.setHorizontalGroup(
            DashboardAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 748, Short.MAX_VALUE)
        );
        DashboardAreaLayout.setVerticalGroup(
            DashboardAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(NavigationBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(DashboardArea, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(NavigationBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(DashboardArea, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BaggadgesBtn;
    private javax.swing.JPanel DashboardArea;
    private javax.swing.JButton DashboardBtn;
    private javax.swing.JPanel NavigationBar;
    private javax.swing.JButton PassengersBtn;
    private javax.swing.JButton TerminalBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
