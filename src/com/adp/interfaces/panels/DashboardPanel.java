package com.adp.interfaces.panels;

import com.adp.constant.Colors;
import com.adp.interfaces.panels.subpanels.OptionPanel;
import com.adp.interfaces.panels.subpanels.StaffCrewPanel;
import com.formdev.flatlaf.FlatClientProperties;
import com.formdev.flatlaf.extras.FlatSVGIcon;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;

public class DashboardPanel extends javax.swing.JPanel {

    private CardLayout cardLayout;
    private OptionPanel optionPanel;
    private StaffCrewPanel staffCrewPanel;

    public DashboardPanel() {
        initComponents();
        loadPanels();
        initButtons();
        init();
    }

    private void initButtons() {
        Color defaultColor = Colors.BUTTON_WHITE_BACKGROUND;
        Color clickedColor = Colors.BUTTON_DARK_BACKGROUND;

        ArrayList<JButton> btnList = new ArrayList();
        btnList.add(operationBtn);
        btnList.add(stafCrewBtn);

        for (JButton btn : btnList) {
            btn.setBackground(defaultColor);
            btn.setForeground(Color.BLACK);
            btn.setBorder(null);
            btn.setFocusPainted(false);
            btn.setCursor(new Cursor(Cursor.HAND_CURSOR));
//            btn.putClientProperty(FlatClientProperties.STYLE,
//                    "arc:10; borderColor:#171717; borderWidth:0");
        }

        operationBtn.setBackground(clickedColor);
        operationBtn.setForeground(Color.WHITE);

        for (JButton btn : btnList) {
            btn.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    for (JButton b : btnList) {
                        b.setBackground(defaultColor);
                        b.setForeground(Color.BLACK);

                    }

                    btn.setBackground(clickedColor);
                    btn.setForeground(Color.WHITE);
                }
            });
        }

    }

    private void loadPanels() {
        if (cardLayout == null && secondCardPanel.getLayout() instanceof CardLayout) {
            this.cardLayout = (CardLayout) secondCardPanel.getLayout();
        }

        this.optionPanel = new OptionPanel();
        this.staffCrewPanel = new StaffCrewPanel();

        this.secondCardPanel.add(optionPanel, "optionPanel");
        this.secondCardPanel.add(staffCrewPanel, "staffCrewPanel");

        SwingUtilities.updateComponentTreeUI(secondCardPanel);
    }

    private void init() {

        flightAddBtn.setIcon(new FlatSVGIcon("com/adp/recources/icons/Add.svg", 25, 25));
        flightAddBtn.setHorizontalAlignment(SwingConstants.LEFT);
        flightAddBtn.setIconTextGap(7);
        flightAddBtn.setHorizontalTextPosition(SwingConstants.RIGHT);

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
        jPanel2 = new javax.swing.JPanel();
        operationBtn = new javax.swing.JButton();
        stafCrewBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        secondCardPanel = new javax.swing.JPanel();

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

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new java.awt.GridLayout(1, 4, 15, 0));

        operationBtn.setBackground(new java.awt.Color(21, 21, 21));
        operationBtn.setFont(new java.awt.Font("Inter 18pt Medium", 0, 14)); // NOI18N
        operationBtn.setForeground(new java.awt.Color(255, 255, 255));
        operationBtn.setText("Operation");
        operationBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                operationBtnActionPerformed(evt);
            }
        });
        jPanel2.add(operationBtn);

        stafCrewBtn.setBackground(new java.awt.Color(251, 251, 251));
        stafCrewBtn.setFont(new java.awt.Font("Inter 18pt Medium", 0, 14)); // NOI18N
        stafCrewBtn.setForeground(new java.awt.Color(97, 97, 97));
        stafCrewBtn.setText("Staff Crew");
        stafCrewBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stafCrewBtnActionPerformed(evt);
            }
        });
        jPanel2.add(stafCrewBtn);

        jLabel2.setFont(new java.awt.Font("Inter 24pt SemiBold", 0, 24)); // NOI18N
        jLabel2.setText("Dashboard ");

        secondCardPanel.setLayout(new java.awt.CardLayout());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(secondCardPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 999, Short.MAX_VALUE)
                        .addComponent(flightAddBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(secondCardPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 811, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void operationBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_operationBtnActionPerformed
        cardLayout.show(secondCardPanel, "optionPanel");
    }//GEN-LAST:event_operationBtnActionPerformed

    private void stafCrewBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stafCrewBtnActionPerformed
        cardLayout.show(secondCardPanel, "staffCrewPanel");
    }//GEN-LAST:event_stafCrewBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton flightAddBtn;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton operationBtn;
    private javax.swing.JPanel secondCardPanel;
    private javax.swing.JButton stafCrewBtn;
    // End of variables declaration//GEN-END:variables
}
