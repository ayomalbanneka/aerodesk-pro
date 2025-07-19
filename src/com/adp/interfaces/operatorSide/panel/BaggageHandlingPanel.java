package com.adp.interfaces.operatorSide.panel;

import com.adp.interfaces.operatorSide.subPanels.BaggageSystem;
import com.formdev.flatlaf.FlatClientProperties;
import java.awt.CardLayout;
import javax.swing.SwingUtilities;

public class BaggageHandlingPanel extends javax.swing.JPanel {

    private CardLayout cardLayout;
    private BaggageSystem baggageSystem;

    public BaggageHandlingPanel() {
        initComponents();
        init();
        initMain();
    }

    private void initMain() {

        if (cardLayout == null && secondCardPanel.getLayout() instanceof CardLayout) {
            this.cardLayout = (CardLayout) secondCardPanel.getLayout();
        }

        //this.dashboard = new DashboardPanel();
        this.baggageSystem = new BaggageSystem();

        //dashboard.putClientProperty(FlatClientProperties.STYLE, "arc:50");
        baggageSystem.putClientProperty(FlatClientProperties.STYLE, "arc:50");

        //this.CardPanel.add(dashboard, "dashboard");
        this.secondCardPanel.add(baggageSystem, "baggageSystem");

        SwingUtilities.updateComponentTreeUI(secondCardPanel);

    }

    private void init() {
        secondCardPanel.putClientProperty(FlatClientProperties.STYLE, "arc:20");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        operationBtn2 = new javax.swing.JButton();
        stafCrewBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        secondCardPanel = new javax.swing.JPanel();

        setBackground(new java.awt.Color(255, 255, 255));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new java.awt.GridLayout(1, 4, 15, 0));

        operationBtn2.setBackground(new java.awt.Color(21, 21, 21));
        operationBtn2.setFont(new java.awt.Font("Inter 18pt Medium", 0, 14)); // NOI18N
        operationBtn2.setForeground(new java.awt.Color(255, 255, 255));
        operationBtn2.setText("Weight");
        operationBtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                operationBtn2ActionPerformed(evt);
            }
        });
        jPanel4.add(operationBtn2);

        stafCrewBtn.setBackground(new java.awt.Color(251, 251, 251));
        stafCrewBtn.setFont(new java.awt.Font("Inter 18pt Medium", 0, 14)); // NOI18N
        stafCrewBtn.setForeground(new java.awt.Color(97, 97, 97));
        stafCrewBtn.setText("System");
        stafCrewBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stafCrewBtnActionPerformed(evt);
            }
        });
        jPanel4.add(stafCrewBtn);

        jLabel2.setFont(new java.awt.Font("Inter 24pt SemiBold", 0, 24)); // NOI18N
        jLabel2.setText("Baggage Handling");

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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 1063, Short.MAX_VALUE)))
                .addGap(25, 25, 25))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(secondCardPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 799, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void operationBtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_operationBtn2ActionPerformed
        cardLayout.show(secondCardPanel, "baggageSystem");
    }//GEN-LAST:event_operationBtn2ActionPerformed

    private void stafCrewBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stafCrewBtnActionPerformed

    }//GEN-LAST:event_stafCrewBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JButton operationBtn2;
    private javax.swing.JPanel secondCardPanel;
    private javax.swing.JButton stafCrewBtn;
    // End of variables declaration//GEN-END:variables
}
