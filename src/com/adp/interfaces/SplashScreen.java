package com.adp.interfaces;

import com.adp.interfaces.AuthenticateScreen;
import com.formdev.flatlaf.FlatClientProperties;
import com.formdev.flatlaf.themes.FlatMacLightLaf;
import java.awt.Image;
import java.awt.geom.RoundRectangle2D;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;

public class SplashScreen extends javax.swing.JFrame {
    
    private static SplashScreen SplashScreen;

    public SplashScreen() {
        initComponents();
        init();
        loadingAnimation();
    }

    private void init() {
        
        setShape(new RoundRectangle2D.Double(0, 0, getWidth(), getHeight(), 40, 40));

        ImageIcon icon1 = new ImageIcon(getClass().getClassLoader().getResource("com/adp/recources/images/Main-Logo.png"));
        Image image1 = icon1.getImage().getScaledInstance(LogoLabel.getWidth(), LogoLabel.getHeight(), Image.SCALE_SMOOTH);
        LogoLabel.setIcon(new ImageIcon(image1));
        imagePanel.putClientProperty(FlatClientProperties.STYLE, "arc:40");

        ImageIcon icon = new ImageIcon(getClass().getClassLoader().getResource("com/adp/recources/images/Flight-Image.png"));
        Image image = icon.getImage().getScaledInstance(ImageLabel.getWidth(), ImageLabel.getHeight(), Image.SCALE_SMOOTH);
        ImageLabel.setIcon(new ImageIcon(image));

    }

    
    private void loadingAnimation(){
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i <= 100; i++) {
                    loader.setValue(i);
                    
                    if (i < 30) {
                        loaderLabel.setText("Starting Modules");
                        loadCountShowLabel.setText(i + "%");
                    } else if (i > 30 && i < 35) {
                        loaderLabel.setText("Database connection established...");
                        loadCountShowLabel.setText(i + "%");
                        try {
                            Thread.sleep(2000);
                        } catch (InterruptedException ex) {
                            Logger.getLogger(SplashScreen.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    } else if (i > 35) {
                        loaderLabel.setText("Setting things up...");
                        loadCountShowLabel.setText(i + "%");
                    } else if (i == 100) {
                        loaderLabel.setText("Done");
                        loadCountShowLabel.setText("Done " + i + "%");
                    }
                    
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException ex) {
                        System.out.println(ex);
                    }
                }
                
                //Login Screen
                
                new AuthenticateScreen().setVisible(true);
                SplashScreen.dispose();
            }
        });
        
        t.start();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        imagePanel = new javax.swing.JPanel();
        ImageLabel = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        loaderLabel = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        LogoLabel = new javax.swing.JLabel();
        loader = new javax.swing.JProgressBar();
        loadCountShowLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        background.setBackground(new java.awt.Color(255, 255, 255));

        imagePanel.setBackground(new java.awt.Color(21, 21, 21));

        ImageLabel.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout imagePanelLayout = new javax.swing.GroupLayout(imagePanel);
        imagePanel.setLayout(imagePanelLayout);
        imagePanelLayout.setHorizontalGroup(
            imagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ImageLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 392, Short.MAX_VALUE)
        );
        imagePanelLayout.setVerticalGroup(
            imagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ImageLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Inter 24pt SemiBold", 0, 18)); // NOI18N
        jLabel9.setText("<html><b>Welcome to AeroDesk Pro – Streamlining Airport Operations for a Smarter Tomorrow</b></html>");

        loaderLabel.setFont(new java.awt.Font("Inter 18pt", 0, 14)); // NOI18N
        loaderLabel.setText("<html> <b>Loading....</b> </html>");

        jLabel11.setFont(new java.awt.Font("Inter 18pt", 0, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(124, 123, 123));
        jLabel11.setText("<html> <div> Version 1.0.0 <br />  Your journey starts here. <br /> </div> </html>");
        jLabel11.setToolTipText("");

        jLabel12.setBackground(new java.awt.Color(120, 119, 119));
        jLabel12.setFont(new java.awt.Font("Inter 18pt", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(120, 119, 119));
        jLabel12.setText("<html> Welcome to <b>AeroDesk Pro </b>– your intelligent solution for secure and efficient airport operations.  Seamlessly manage flights, terminals, and services with real-time insights and precision.</html>");

        loader.setForeground(new java.awt.Color(0, 0, 0));

        loadCountShowLabel.setFont(new java.awt.Font("Inter 18pt Medium", 0, 14)); // NOI18N
        loadCountShowLabel.setText("0%");

        jLabel1.setFont(new java.awt.Font("Inter 18pt", 0, 12)); // NOI18N
        jLabel1.setText("© 2025 AeroDesk . All rights reserved. ");

        javax.swing.GroupLayout backgroundLayout = new javax.swing.GroupLayout(background);
        background.setLayout(backgroundLayout);
        backgroundLayout.setHorizontalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addGroup(backgroundLayout.createSequentialGroup()
                                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(backgroundLayout.createSequentialGroup()
                                            .addComponent(loaderLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(loadCountShowLabel))
                                        .addComponent(loader, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(LogoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(51, 51, 51))
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(imagePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );
        backgroundLayout.setVerticalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(imagePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(LogoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(loadCountShowLabel)
                            .addComponent(loaderLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(loader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel1)
                        .addGap(22, 22, 22)))
                .addGap(15, 15, 15))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        FlatMacLightLaf.setup();
        java.awt.EventQueue.invokeLater(() -> {
        SplashScreen.SplashScreen = new SplashScreen();
        SplashScreen.SplashScreen.setVisible(true);
    });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ImageLabel;
    private javax.swing.JLabel LogoLabel;
    private javax.swing.JPanel background;
    private javax.swing.JPanel imagePanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel loadCountShowLabel;
    private javax.swing.JProgressBar loader;
    private javax.swing.JLabel loaderLabel;
    // End of variables declaration//GEN-END:variables
}
