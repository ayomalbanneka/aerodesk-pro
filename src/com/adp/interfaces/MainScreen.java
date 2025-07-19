package com.adp.interfaces;

import com.adp.constant.Colors;
import com.adp.interfaces.operatorSide.panel.BaggageHandlingPanel;
import com.adp.interfaces.operatorSide.panel.OperatorDashboardPanel;
import com.adp.interfaces.panels.DashboardPanel;
import com.formdev.flatlaf.FlatClientProperties;
import com.formdev.flatlaf.FlatLightLaf;
import com.formdev.flatlaf.extras.FlatSVGIcon;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Image;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JButton;

public class MainScreen extends javax.swing.JFrame {

    private CardLayout cardLayout;
    private DashboardPanel dashboard;
    private OperatorDashboardPanel operatorPanel;
    private BaggageHandlingPanel baggageHandling;

    private String role = null;

    ResultSet rs;

    public MainScreen(ResultSet result) {
        initComponents();
        this.rs = result;
        initMain();
        init();
        initButtons();
        UIManager.put("Component.arc", 10);
        UIManager.put("ComboBox.padding", new Insets(5, 10, 5, 10));
    }

    private void initButtons() {

//        Color defaultColor = Colors.BUTTON_WHITE_BACKGROUND;
        Color clickedColor = Colors.DASH_BUTTON_DARK_BACKGROUND;

//        dashboardBtn.setBackground(clickedColor);
//        dashboardBtn.setForeground(Color.WHITE);

        ArrayList<JButton> btnList = new ArrayList();
        btnList.add(dashboardBtn);
        btnList.add(passangerCheckBtn);
        btnList.add(baggageHandlingBtn);
        btnList.add(supportBtn);

        for (JButton btn : btnList) {
            btn.setBackground(null);
            btn.setForeground(Color.WHITE);
            btn.setBorder(null);
            btn.setFocusPainted(false);
            btn.setCursor(new Cursor(Cursor.HAND_CURSOR));
            btn.putClientProperty(FlatClientProperties.STYLE,
                    "arc:10; borderColor:#171717; borderWidth:0");
        }

        for (JButton btn : btnList) {
            btn.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    for (JButton b : btnList) {
                        b.setBackground(null);
                        b.setForeground(Color.WHITE);

                    }

                    btn.setBackground(clickedColor);
                    btn.setForeground(Color.WHITE);
                }
            });
        }

    }

    private void initMain() {

        try {
            role = rs.getString("employee_role");

        } catch (SQLException e) {
            System.out.println(e);
        }

        if (cardLayout == null && CardPanel.getLayout() instanceof CardLayout) {
            this.cardLayout = (CardLayout) CardPanel.getLayout();
        }

        switch (role) {
            case "Admin":
                this.dashboard = new DashboardPanel();
                dashboard.putClientProperty(FlatClientProperties.STYLE, "arc:50");
                this.CardPanel.add(dashboard, "dashboard");
                break;

            case "Staff":
                this.operatorPanel = new OperatorDashboardPanel();
                operatorPanel.putClientProperty(FlatClientProperties.STYLE, "arc:50");
                this.CardPanel.add(operatorPanel, "operatorPanel");
                break;
        }

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

        passangerCheckBtn.setIcon(new FlatSVGIcon("com/adp/recources/icons/Users.svg", 25, 25));
        passangerCheckBtn.setHorizontalAlignment(SwingConstants.LEFT);
        passangerCheckBtn.setIconTextGap(7);
        passangerCheckBtn.setHorizontalTextPosition(SwingConstants.RIGHT);

        baggageHandlingBtn.setIcon(new FlatSVGIcon("com/adp/recources/icons/Baggage.svg", 25, 25));
        baggageHandlingBtn.setHorizontalAlignment(SwingConstants.LEFT);
        baggageHandlingBtn.setIconTextGap(7);
        baggageHandlingBtn.setHorizontalTextPosition(SwingConstants.RIGHT);

        supportBtn.setIcon(new FlatSVGIcon("com/adp/recources/icons/Support.svg", 25, 25));
        supportBtn.setHorizontalAlignment(SwingConstants.LEFT);
        supportBtn.setIconTextGap(7);
        supportBtn.setHorizontalTextPosition(SwingConstants.RIGHT);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        logoLabel = new javax.swing.JLabel();
        dashboardBtn = new javax.swing.JButton();
        mainPanel = new javax.swing.JPanel();
        CardPanel = new javax.swing.JPanel();
        baggageHandlingBtn = new javax.swing.JButton();
        passangerCheckBtn = new javax.swing.JButton();
        supportBtn = new javax.swing.JButton();

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

        baggageHandlingBtn.setBackground(new java.awt.Color(21, 21, 21));
        baggageHandlingBtn.setFont(new java.awt.Font("Inter 18pt Medium", 0, 14)); // NOI18N
        baggageHandlingBtn.setForeground(new java.awt.Color(255, 255, 255));
        baggageHandlingBtn.setText("Baggage Handling");
        baggageHandlingBtn.setBorder(null);
        baggageHandlingBtn.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        baggageHandlingBtn.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        baggageHandlingBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                baggageHandlingBtnActionPerformed(evt);
            }
        });

        passangerCheckBtn.setBackground(new java.awt.Color(21, 21, 21));
        passangerCheckBtn.setFont(new java.awt.Font("Inter 18pt Medium", 0, 14)); // NOI18N
        passangerCheckBtn.setForeground(new java.awt.Color(255, 255, 255));
        passangerCheckBtn.setText("Passanger Check");
        passangerCheckBtn.setBorder(null);
        passangerCheckBtn.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        passangerCheckBtn.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        passangerCheckBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passangerCheckBtnActionPerformed(evt);
            }
        });

        supportBtn.setBackground(new java.awt.Color(21, 21, 21));
        supportBtn.setFont(new java.awt.Font("Inter 18pt Medium", 0, 14)); // NOI18N
        supportBtn.setForeground(new java.awt.Color(255, 255, 255));
        supportBtn.setText("Passanger Support");
        supportBtn.setBorder(null);
        supportBtn.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        supportBtn.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        supportBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                supportBtnActionPerformed(evt);
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
                            .addComponent(baggageHandlingBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(supportBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(passangerCheckBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                        .addComponent(passangerCheckBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)
                        .addComponent(baggageHandlingBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)
                        .addComponent(supportBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
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
//        cardLayout.show(mainPanel, "baggageHandling");
    }//GEN-LAST:event_dashboardBtnActionPerformed

    private void baggageHandlingBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_baggageHandlingBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_baggageHandlingBtnActionPerformed

    private void passangerCheckBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passangerCheckBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passangerCheckBtnActionPerformed

    private void supportBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_supportBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_supportBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel CardPanel;
    private javax.swing.JButton baggageHandlingBtn;
    private javax.swing.JButton dashboardBtn;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel logoLabel;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JButton passangerCheckBtn;
    private javax.swing.JButton supportBtn;
    // End of variables declaration//GEN-END:variables
}
