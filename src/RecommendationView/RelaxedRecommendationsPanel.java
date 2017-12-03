/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RecommendationView;

import RecommendationController.RecommendationController;
import java.awt.Desktop;
import java.net.URL;

/**
 *
 * @author akhil
 */
public class RelaxedRecommendationsPanel extends javax.swing.JPanel {
    private RecommendationController instanceOfRecommendationsController;
    private Desktop desktop;

    /**
     * Creates new form FullnSatisfiedRecommendationsPanel
     */
    public RelaxedRecommendationsPanel(RecommendationController recommendationCntrl) {
        this.instanceOfRecommendationsController = recommendationCntrl;
        desktop = Desktop.getDesktop();
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titleLabel = new javax.swing.JLabel();
        notificationsButton = new javax.swing.JButton();
        viewUserButton = new javax.swing.JButton();
        splitterTopFromBottom = new javax.swing.JSeparator();
        footerPanel = new javax.swing.JPanel();
        goToChartButton = new javax.swing.JButton();
        goToFoodMoodButton = new javax.swing.JButton();
        goToRecommButton = new javax.swing.JButton();
        foodContainer1 = new javax.swing.JPanel();
        learnMoreButton1 = new javax.swing.JButton();
        foodNameLabel = new javax.swing.JLabel();
        benefitsLabel1 = new javax.swing.JLabel();
        frequencyLabel1 = new javax.swing.JLabel();
        learnMoreLabel1 = new javax.swing.JButton();
        foodContainer2 = new javax.swing.JPanel();
        learnMoreButton2 = new javax.swing.JButton();
        foodNameLabel1 = new javax.swing.JLabel();
        benefitsLabel2 = new javax.swing.JLabel();
        frequencyLabel2 = new javax.swing.JLabel();
        learnMoreLabel2 = new javax.swing.JButton();
        foodContainer3 = new javax.swing.JPanel();
        learnMoreButton3 = new javax.swing.JButton();
        foodNameLabel2 = new javax.swing.JLabel();
        benefitsLabel3 = new javax.swing.JLabel();
        frequencyLabel3 = new javax.swing.JLabel();
        learnMoreLabel3 = new javax.swing.JButton();
        backButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        titleLabel.setFont(new java.awt.Font("Lucida Sans", 0, 30)); // NOI18N
        titleLabel.setText("FoodMood");

        notificationsButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/alarm.png"))); // NOI18N
        notificationsButton.setPreferredSize(new java.awt.Dimension(30, 38));
        notificationsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                notificationsButtonActionPerformed(evt);
            }
        });

        viewUserButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/crud_user_lines.png"))); // NOI18N

        splitterTopFromBottom.setForeground(new java.awt.Color(51, 51, 51));

        footerPanel.setBackground(new java.awt.Color(102, 102, 102));
        footerPanel.setPreferredSize(new java.awt.Dimension(375, 56));

        goToChartButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/pie-chart.png"))); // NOI18N
        goToChartButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goToChartButtonActionPerformed(evt);
            }
        });

        goToFoodMoodButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/cutlery_1.png"))); // NOI18N
        goToFoodMoodButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goToFoodMoodButtonActionPerformed(evt);
            }
        });

        goToRecommButton.setBackground(new java.awt.Color(204, 204, 204));
        goToRecommButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/recommended.png"))); // NOI18N
        goToRecommButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goToRecommButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout footerPanelLayout = new javax.swing.GroupLayout(footerPanel);
        footerPanel.setLayout(footerPanelLayout);
        footerPanelLayout.setHorizontalGroup(
            footerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(footerPanelLayout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(goToChartButton)
                .addGap(54, 54, 54)
                .addComponent(goToFoodMoodButton)
                .addGap(54, 54, 54)
                .addComponent(goToRecommButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        footerPanelLayout.setVerticalGroup(
            footerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(footerPanelLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(footerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(goToChartButton)
                    .addComponent(goToFoodMoodButton)
                    .addComponent(goToRecommButton))
                .addContainerGap(10, Short.MAX_VALUE))
        );

        learnMoreButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/steak.png"))); // NOI18N

        foodNameLabel.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        foodNameLabel.setText("Steak");

        benefitsLabel1.setText("Benefits:");

        frequencyLabel1.setText("Frequency:");

        learnMoreLabel1.setText("Learn");
        learnMoreLabel1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                learnMoreLabel1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout foodContainer1Layout = new javax.swing.GroupLayout(foodContainer1);
        foodContainer1.setLayout(foodContainer1Layout);
        foodContainer1Layout.setHorizontalGroup(
            foodContainer1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(foodContainer1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(learnMoreButton1)
                .addGroup(foodContainer1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(foodContainer1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(foodContainer1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(foodNameLabel)
                            .addComponent(benefitsLabel1)
                            .addComponent(frequencyLabel1))
                        .addContainerGap(100, Short.MAX_VALUE))
                    .addGroup(foodContainer1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(learnMoreLabel1)
                        .addContainerGap())))
        );
        foodContainer1Layout.setVerticalGroup(
            foodContainer1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(foodContainer1Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(foodNameLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(benefitsLabel1)
                .addGap(18, 18, 18)
                .addComponent(frequencyLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(learnMoreLabel1)
                .addGap(17, 17, 17))
            .addGroup(foodContainer1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(learnMoreButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        learnMoreButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/rice.png"))); // NOI18N

        foodNameLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        foodNameLabel1.setText("Rice");

        benefitsLabel2.setText("Benefits:");

        frequencyLabel2.setText("Frequency:");

        learnMoreLabel2.setText("Learn");
        learnMoreLabel2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                learnMoreLabel2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout foodContainer2Layout = new javax.swing.GroupLayout(foodContainer2);
        foodContainer2.setLayout(foodContainer2Layout);
        foodContainer2Layout.setHorizontalGroup(
            foodContainer2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(foodContainer2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(learnMoreButton2)
                .addGroup(foodContainer2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(foodContainer2Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(foodContainer2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(foodNameLabel1)
                            .addComponent(benefitsLabel2)
                            .addComponent(frequencyLabel2))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(foodContainer2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(learnMoreLabel2)
                        .addContainerGap())))
        );
        foodContainer2Layout.setVerticalGroup(
            foodContainer2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(foodContainer2Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(foodNameLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(benefitsLabel2)
                .addGap(18, 18, 18)
                .addComponent(frequencyLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(learnMoreLabel2)
                .addGap(17, 17, 17))
            .addGroup(foodContainer2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(learnMoreButton2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        learnMoreButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/beans.png"))); // NOI18N

        foodNameLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        foodNameLabel2.setText("Beans");

        benefitsLabel3.setText("Benefits:");

        frequencyLabel3.setText("Frequency:");

        learnMoreLabel3.setText("Learn");
        learnMoreLabel3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                learnMoreLabel3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout foodContainer3Layout = new javax.swing.GroupLayout(foodContainer3);
        foodContainer3.setLayout(foodContainer3Layout);
        foodContainer3Layout.setHorizontalGroup(
            foodContainer3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(foodContainer3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(learnMoreButton3)
                .addGroup(foodContainer3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(foodContainer3Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(foodContainer3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(foodNameLabel2)
                            .addComponent(benefitsLabel3)
                            .addComponent(frequencyLabel3))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(foodContainer3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(learnMoreLabel3)
                        .addContainerGap())))
        );
        foodContainer3Layout.setVerticalGroup(
            foodContainer3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(foodContainer3Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(foodNameLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(benefitsLabel3)
                .addGap(18, 18, 18)
                .addComponent(frequencyLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(learnMoreLabel3)
                .addGap(17, 17, 17))
            .addGroup(foodContainer3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(learnMoreButton3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(footerPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 379, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(viewUserButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(74, 74, 74)
                        .addComponent(titleLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(notificationsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(foodContainer3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(foodContainer2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(foodContainer1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(backButton))
                        .addGap(0, 8, Short.MAX_VALUE)))
                .addContainerGap())
            .addComponent(splitterTopFromBottom)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(viewUserButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(titleLabel)
                    .addComponent(notificationsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(splitterTopFromBottom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(backButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(foodContainer1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(foodContainer2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(foodContainer3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(footerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void notificationsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_notificationsButtonActionPerformed
        instanceOfRecommendationsController.toNotificationCntrl();
        instanceOfRecommendationsController.getRecommendationUI().setVisible(false);
        instanceOfRecommendationsController.getContainerForPanels().setVisible(false);
        this.setVisible(false);
    }//GEN-LAST:event_notificationsButtonActionPerformed

    private void goToChartButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goToChartButtonActionPerformed
        instanceOfRecommendationsController.toStatsCntrl();
        instanceOfRecommendationsController.getRecommendationUI().setVisible(false);
        instanceOfRecommendationsController.getContainerForPanels().setVisible(false);
        this.setVisible(false);
    }//GEN-LAST:event_goToChartButtonActionPerformed

    private void goToFoodMoodButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goToFoodMoodButtonActionPerformed
        instanceOfRecommendationsController.getRecommendationUI().setVisible(false);
        instanceOfRecommendationsController.getContainerForPanels().setVisible(false);
        this.setVisible(false);
    }//GEN-LAST:event_goToFoodMoodButtonActionPerformed

    private void goToRecommButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goToRecommButtonActionPerformed
        instanceOfRecommendationsController.getContainerForPanels().setVisible(false);
        this.setVisible(false);
    }//GEN-LAST:event_goToRecommButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        instanceOfRecommendationsController.getContainerForPanels().setVisible(false);
        this.setVisible(false);
    }//GEN-LAST:event_backButtonActionPerformed

    private void learnMoreLabel3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_learnMoreLabel3ActionPerformed
        try {
            desktop.browse(new URL("https://www.google.com/search?q=beans").toURI());
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_learnMoreLabel3ActionPerformed

    private void learnMoreLabel2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_learnMoreLabel2ActionPerformed
        try {
            desktop.browse(new URL("https://www.google.com/search?q=rice").toURI());
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_learnMoreLabel2ActionPerformed

    private void learnMoreLabel1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_learnMoreLabel1ActionPerformed
        try {
            desktop.browse(new URL("https://www.google.com/search?q=steak").toURI());
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_learnMoreLabel1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JLabel benefitsLabel1;
    private javax.swing.JLabel benefitsLabel2;
    private javax.swing.JLabel benefitsLabel3;
    private javax.swing.JPanel foodContainer1;
    private javax.swing.JPanel foodContainer2;
    private javax.swing.JPanel foodContainer3;
    private javax.swing.JLabel foodNameLabel;
    private javax.swing.JLabel foodNameLabel1;
    private javax.swing.JLabel foodNameLabel2;
    private javax.swing.JPanel footerPanel;
    private javax.swing.JLabel frequencyLabel1;
    private javax.swing.JLabel frequencyLabel2;
    private javax.swing.JLabel frequencyLabel3;
    private javax.swing.JButton goToChartButton;
    private javax.swing.JButton goToFoodMoodButton;
    private javax.swing.JButton goToRecommButton;
    private javax.swing.JButton learnMoreButton1;
    private javax.swing.JButton learnMoreButton2;
    private javax.swing.JButton learnMoreButton3;
    private javax.swing.JButton learnMoreLabel1;
    private javax.swing.JButton learnMoreLabel2;
    private javax.swing.JButton learnMoreLabel3;
    private javax.swing.JButton notificationsButton;
    private javax.swing.JSeparator splitterTopFromBottom;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JButton viewUserButton;
    // End of variables declaration//GEN-END:variables
}
