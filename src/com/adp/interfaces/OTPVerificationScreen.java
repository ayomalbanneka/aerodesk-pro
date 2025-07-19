package com.adp.interfaces;

import com.adp.mail.OtpSending;
import com.formdev.flatlaf.FlatClientProperties;
import com.formdev.flatlaf.FlatLightLaf;
import java.awt.Image;
import java.awt.Insets;
import javax.swing.ImageIcon;
import javax.swing.UIManager;
import java.sql.ResultSet;

public class OTPVerificationScreen extends javax.swing.JFrame {

    private String generatedOtp;

    public OTPVerificationScreen(String email) {
        initComponents();
        init();
        UIManager.put("Component.arc", 10);
        UIManager.put("ComboBox.padding", new Insets(5, 10, 5, 10));
        dynamicDataLoading(email);

        // Call the OtpSending utility
        generatedOtp = OtpSending.sendOtp(email);

    }

    public static String maskEmail(String email) {
        int atIndex = email.indexOf("@");
        if (atIndex <= 1) {
            return email;
        }
        String namePart = email.substring(0, atIndex);
        String domainPart = email.substring(atIndex);

        int visibleChars = 3;
        int maskLength = namePart.length() - visibleChars;
        String masked = "*".repeat(maskLength) + namePart.substring(maskLength);

        return masked + domainPart;
    }

    private void dynamicDataLoading(String email) {
        String e = "Email send to : " + maskEmail(email);
        jLabel10.setText(e);
    }

    private void init() {

        // Logo load
        ImageIcon logoIcon = new ImageIcon(getClass().getClassLoader().getResource("com/adp/recources/images/Main-Logo.png"));
        Image image1 = logoIcon.getImage().getScaledInstance(LogoLabel.getWidth(), LogoLabel.getHeight(), Image.SCALE_SMOOTH);
        LogoLabel.setIcon(new ImageIcon(image1));

        // Rounded corners config
        verifyBtn.putClientProperty(FlatClientProperties.STYLE, "arc:10");

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        LogoLabel = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        codeField = new javax.swing.JTextField();
        verifyBtn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("OTP Verification");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        LogoLabel.setBackground(new java.awt.Color(255, 255, 255));
        LogoLabel.setForeground(new java.awt.Color(255, 255, 255));

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Inter 24pt SemiBold", 0, 18)); // NOI18N
        jLabel9.setText("<html><b>Enter OTP to Verify Admin Access</b></html>");

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Inter 18pt Medium", 0, 14)); // NOI18N
        jLabel10.setText("<html>Email send to : *********shan@gmail.com</html>");

        jLabel13.setBackground(new java.awt.Color(120, 119, 119));
        jLabel13.setFont(new java.awt.Font("Inter 18pt", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(120, 119, 119));
        jLabel13.setText("<html>A 9-digit verification code has been sent to your email. Enter it below to access the AeroDesk Flight System admin panel securely.</html>");

        codeField.setFont(new java.awt.Font("Inter 18pt Medium", 0, 30)); // NOI18N
        codeField.setForeground(new java.awt.Color(83, 83, 83));
        codeField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        codeField.setText("000-000-000");
        codeField.setMargin(new java.awt.Insets(2, 20, 2, 6));

        verifyBtn.setBackground(new java.awt.Color(0, 0, 0));
        verifyBtn.setFont(new java.awt.Font("Inter 18pt Medium", 0, 14)); // NOI18N
        verifyBtn.setForeground(new java.awt.Color(255, 255, 255));
        verifyBtn.setText("Verify");
        verifyBtn.setBorderPainted(false);
        verifyBtn.setFocusPainted(false);

        jLabel3.setFont(new java.awt.Font("Inter 18pt", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(124, 124, 124));
        jLabel3.setText("© 2025 AeroDesk. All rights reserved. ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(verifyBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, 490, Short.MAX_VALUE)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 439, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 439, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(LogoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(codeField)))
                .addContainerGap(25, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(145, 145, 145))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(LogoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(codeField, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(verifyBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 129, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(16, 16, 16))
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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LogoLabel;
    private javax.swing.JTextField codeField;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton verifyBtn;
    // End of variables declaration//GEN-END:variables
}
