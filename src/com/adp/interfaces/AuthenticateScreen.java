package com.adp.interfaces;

import com.formdev.flatlaf.FlatClientProperties;
import com.formdev.flatlaf.FlatLightLaf;
import java.awt.Image;
import javax.swing.ImageIcon;

public class AuthenticateScreen extends javax.swing.JFrame {

    public AuthenticateScreen() {
        initComponents();
        init();
    }

    private void init() {
        // Logo load
        ImageIcon logoIcon = new ImageIcon(getClass().getClassLoader().getResource("com/adp/recources/images/Main-Logo.png"));
        Image image1 = logoIcon.getImage().getScaledInstance(LogoLabel.getWidth(), LogoLabel.getHeight(), Image.SCALE_SMOOTH);
        LogoLabel.setIcon(new ImageIcon(image1));
        LogoLabel.putClientProperty(FlatClientProperties.STYLE, "arc:40");

        // Rounded Corners config
        emailField.putClientProperty(FlatClientProperties.STYLE, "arc:10");
        passwordField.putClientProperty(FlatClientProperties.STYLE, "arc:10");
        authBtn.putClientProperty(FlatClientProperties.STYLE, "arc:10");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        LogoLabel = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        emailField = new javax.swing.JTextField();
        authBtn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        passwordField = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Authenticate");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        LogoLabel.setBackground(new java.awt.Color(255, 255, 255));
        LogoLabel.setForeground(new java.awt.Color(255, 255, 255));

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Inter 24pt SemiBold", 0, 18)); // NOI18N
        jLabel9.setText("<html><b>AeroDesk Pro – Flight Management Dashboard</b></html>");

        jLabel12.setBackground(new java.awt.Color(120, 119, 119));
        jLabel12.setFont(new java.awt.Font("Inter 18pt", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(120, 119, 119));
        jLabel12.setText("<html> Welcome, Administrator! Please log in with your credentials to access the AeroDesk Pro management dashboard.  Here, you can monitor flight schedules, manage terminal operations, oversee ground services, and handle user access with ease.</html>");

        emailField.setBackground(new java.awt.Color(234, 234, 234));
        emailField.setFont(new java.awt.Font("Inter 18pt Medium", 0, 14)); // NOI18N
        emailField.setForeground(new java.awt.Color(83, 83, 83));
        emailField.setText("Email Address");
        emailField.setMargin(new java.awt.Insets(2, 20, 2, 6));

        authBtn.setBackground(new java.awt.Color(0, 0, 0));
        authBtn.setFont(new java.awt.Font("Inter 18pt Medium", 0, 14)); // NOI18N
        authBtn.setForeground(new java.awt.Color(255, 255, 255));
        authBtn.setText("Authenticate");

        jLabel3.setFont(new java.awt.Font("Inter 18pt", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(124, 124, 124));
        jLabel3.setText("© 2025 AeroDesk. All rights reserved. ");

        passwordField.setBackground(new java.awt.Color(234, 234, 234));
        passwordField.setFont(new java.awt.Font("Inter 18pt Medium", 0, 14)); // NOI18N
        passwordField.setText("jPasswordField1");
        passwordField.setMargin(new java.awt.Insets(2, 20, 2, 6));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(LogoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 439, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(emailField, javax.swing.GroupLayout.DEFAULT_SIZE, 492, Short.MAX_VALUE)
                            .addComponent(authBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(passwordField)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(144, 144, 144)
                        .addComponent(jLabel3)))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(LogoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(emailField, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(authBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(17, 17, 17))
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
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        FlatLightLaf.setup();
        java.awt.EventQueue.invokeLater(() -> new AuthenticateScreen().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LogoLabel;
    private javax.swing.JButton authBtn;
    private javax.swing.JTextField emailField;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField passwordField;
    // End of variables declaration//GEN-END:variables
}
