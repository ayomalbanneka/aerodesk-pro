package com.adp.interfaces;

import com.adp.interfaces.operatorSide.panel.BaggageHandlingPanel;
import com.adp.interfaces.operatorSide.panel.OperatorDashboardPanel;
import com.adp.interfaces.panels.DashboardPanel;
import com.formdev.flatlaf.FlatClientProperties;
import com.formdev.flatlaf.FlatLightLaf;
import com.formdev.flatlaf.extras.FlatSVGIcon;
import java.awt.CardLayout;
import java.awt.Image;
import java.awt.Insets;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

public class MainScreen extends javax.swing.JFrame {

    private CardLayout cardLayout;
    //private DashboardPanel dashboard;
//    private OperatorDashboardPanel operatorPanel;
    private BaggageHandlingPanel baggageHandling;

    public MainScreen() {
        initComponents();
        initMain();
        init();
        UIManager.put("Component.arc", 10);
        UIManager.put("ComboBox.padding", new Insets(5, 10, 5, 10));
    }

    private void initMain() {

        if (cardLayout == null && CardPanel.getLayout() instanceof CardLayout) {
            this.cardLayout = (CardLayout) CardPanel.getLayout();
        }

        //this.dashboard = new DashboardPanel();
//        this.operatorPanel = new OperatorDashboardPanel();
        this.baggageHandling = new BaggageHandlingPanel();

        //dashboard.putClientProperty(FlatClientProperties.STYLE, "arc:50");
        baggageHandling.putClientProperty(FlatClientProperties.STYLE, "arc:50");

        //this.CardPanel.add(dashboard, "dashboard");
        this.CardPanel.add(baggageHandling, "baggageHandling");

        SwingUtilities.updateComponentTreeUI(CardPanel);

    }

    private void init() {
        ImageIcon icon1 = new ImageIcon(getClass().getClassLoader().getResource("com/adp/recources/images/Dark-Main-Logo.png"));
        Image image1 = icon1.getImage().getScaledInstance(logoLabel.getWidth(), logoLabel.getHeight(), Image.SCALE_SMOOTH);
        logoLabel.setIcon(new ImageIcon(image1));
        mainPanel.putClientProperty(FlatClientProperties.STYLE, "arc:50");

        dashboardBtn.setIcon(new FlatSVGIcon("com/adp/recources/icons/Dashboard.svg", 25, 25));
        dashboardBtn.setHorizontalAlignment(SwingConstants.LEFT);
        dashboardBtn.setIconTextGap(7);
        dashboardBtn.setHorizontalTextPosition(SwingConstants.RIGHT);
        dashboardBtn.putClientProperty(FlatClientProperties.STYLE,
                "arc:10; borderColor:#171717; borderWidth:0");

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        logoLabel = new javax.swing.JLabel();
        dashboardBtn = new javax.swing.JButton();
        mainPanel = new javax.swing.JPanel();
        CardPanel = new javax.swing.JPanel();
        dashboardBtn1 = new javax.swing.JButton();
        dashboardBtn2 = new javax.swing.JButton();
        dashboardBtn3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(21, 21, 21));

        dashboardBtn.setBackground(new java.awt.Color(34, 34, 34));
        dashboardBtn.setFont(new java.awt.Font("Inter 18pt Medium", 0, 14)); // NOI18N
        dashboardBtn.setForeground(new java.awt.Color(255, 255, 255));
        dashboardBtn.setText("Dashboard");
        dashboardBtn.setBorder(null);
        dashboardBtn.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        dashboardBtn.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        dashboardBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dashboardBtnActionPerformed(evt);
            }
        });

        mainPanel.setBackground(new java.awt.Color(255, 255, 255));

        CardPanel.setBackground(new java.awt.Color(255, 255, 255));
        CardPanel.setLayout(new java.awt.CardLayout());

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(CardPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 1371, Short.MAX_VALUE)
                .addGap(10, 10, 10))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(CardPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 825, Short.MAX_VALUE)
                .addGap(10, 10, 10))
        );

        dashboardBtn1.setBackground(new java.awt.Color(21, 21, 21));
        dashboardBtn1.setFont(new java.awt.Font("Inter 18pt Medium", 0, 14)); // NOI18N
        dashboardBtn1.setForeground(new java.awt.Color(255, 255, 255));
        dashboardBtn1.setText("Baggage Handling");
        dashboardBtn1.setBorder(null);
        dashboardBtn1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        dashboardBtn1.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        dashboardBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dashboardBtn1ActionPerformed(evt);
            }
        });

        dashboardBtn2.setBackground(new java.awt.Color(21, 21, 21));
        dashboardBtn2.setFont(new java.awt.Font("Inter 18pt Medium", 0, 14)); // NOI18N
        dashboardBtn2.setForeground(new java.awt.Color(255, 255, 255));
        dashboardBtn2.setText("Passanger Check");
        dashboardBtn2.setBorder(null);
        dashboardBtn2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        dashboardBtn2.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        dashboardBtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dashboardBtn2ActionPerformed(evt);
            }
        });

        dashboardBtn3.setBackground(new java.awt.Color(21, 21, 21));
        dashboardBtn3.setFont(new java.awt.Font("Inter 18pt Medium", 0, 14)); // NOI18N
        dashboardBtn3.setForeground(new java.awt.Color(255, 255, 255));
        dashboardBtn3.setText("Passanger Support");
        dashboardBtn3.setBorder(null);
        dashboardBtn3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        dashboardBtn3.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        dashboardBtn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dashboardBtn3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dashboardBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(logoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dashboardBtn1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dashboardBtn3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dashboardBtn2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)))
                .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(10, 10, 10))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(logoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(dashboardBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)
                        .addComponent(dashboardBtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)
                        .addComponent(dashboardBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)
                        .addComponent(dashboardBtn3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(10, 10, 10))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }//GEN-LAST:event_formWindowOpened

    private void dashboardBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dashboardBtnActionPerformed
//        cardLayout.show(mainPanel, "dashboard");
        cardLayout.show(mainPanel, "baggageHandling");
    }//GEN-LAST:event_dashboardBtnActionPerformed

    private void dashboardBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dashboardBtn1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dashboardBtn1ActionPerformed

    private void dashboardBtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dashboardBtn2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dashboardBtn2ActionPerformed

    private void dashboardBtn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dashboardBtn3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dashboardBtn3ActionPerformed

    public static void main(String args[]) {
        FlatLightLaf.setup();
        java.awt.EventQueue.invokeLater(() -> new MainScreen().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel CardPanel;
    private javax.swing.JButton dashboardBtn;
    private javax.swing.JButton dashboardBtn1;
    private javax.swing.JButton dashboardBtn2;
    private javax.swing.JButton dashboardBtn3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel logoLabel;
    private javax.swing.JPanel mainPanel;
    // End of variables declaration//GEN-END:variables
}
