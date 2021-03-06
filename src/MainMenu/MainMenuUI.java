package MainMenu;

import RecommendationController.RecommendationController;
import javax.swing.JTable;

public class MainMenuUI extends javax.swing.JFrame {
    RecommendationController recommend = new RecommendationController();
    
    MainMenuController mmc;

    /**
     * Creates new form MainMenuUI
     */
    public MainMenuUI(MainMenuController mmc) {
    
        this.mmc = mmc;
        initComponents();
        changeRecommendation();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        jMenu1 = new javax.swing.JMenu();
        mainMenuPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        print_data = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        titleLabel = new javax.swing.JLabel();
        notificationsButton = new javax.swing.JButton();
        viewUserButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        show_data = new javax.swing.JButton();
        add_row = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        goToChartButton = new javax.swing.JButton();
        goToFoodMoodButton = new javax.swing.JButton();
        goToRecommButton = new javax.swing.JButton();
        foodEnterField = new javax.swing.JTextField();
        moodEnterField = new javax.swing.JTextField();
        enterFoodMoodButton = new javax.swing.JButton();

        jMenuItem1.setText("jMenuItem1");

        jMenuItem2.setText("jMenuItem2");

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("FoodMood - Main Menu");
        setResizable(false);

        mainMenuPanel.setBackground(new java.awt.Color(255, 255, 255));
        mainMenuPanel.setPreferredSize(new java.awt.Dimension(375, 667));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Food", "Mood"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        print_data.setText("Print data");
        print_data.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                print_dataActionPerformed(evt);
            }
        });

        jLabel1.setText("Your new recommendation");

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

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/line.png"))); // NOI18N

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/foodmood_button.png"))); // NOI18N
        jButton2.setBorderPainted(false);

        show_data.setText("Show data");
        show_data.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                show_dataActionPerformed(evt);
            }
        });

        add_row.setText("Add row");
        add_row.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_rowActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setPreferredSize(new java.awt.Dimension(375, 56));

        goToChartButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/pie-chart.png"))); // NOI18N

        goToFoodMoodButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/cutlery_1.png"))); // NOI18N
        goToFoodMoodButton.setLocation(new java.awt.Point(-32649, -32050));

        goToRecommButton.setBackground(new java.awt.Color(204, 204, 204));
        goToRecommButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/recommended.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(goToChartButton)
                .addGap(60, 60, 60)
                .addComponent(goToFoodMoodButton)
                .addGap(60, 60, 60)
                .addComponent(goToRecommButton)
                .addContainerGap(58, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(goToRecommButton)
                    .addComponent(goToFoodMoodButton)
                    .addComponent(goToChartButton))
                .addContainerGap())
        );

        foodEnterField.setBackground(new java.awt.Color(204, 204, 204));
        foodEnterField.setText("Capture Food");
        foodEnterField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                foodEnterFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                foodEnterFieldFocusLost(evt);
            }
        });

        moodEnterField.setBackground(new java.awt.Color(204, 204, 204));
        moodEnterField.setText("Capture Mood");
        moodEnterField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                moodEnterFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                moodEnterFieldFocusLost(evt);
            }
        });

        enterFoodMoodButton.setText("Enter");

        javax.swing.GroupLayout mainMenuPanelLayout = new javax.swing.GroupLayout(mainMenuPanel);
        mainMenuPanel.setLayout(mainMenuPanelLayout);
        mainMenuPanelLayout.setHorizontalGroup(
            mainMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(mainMenuPanelLayout.createSequentialGroup()
                .addGroup(mainMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainMenuPanelLayout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(show_data)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(add_row, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(print_data))
                    .addGroup(mainMenuPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(mainMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(mainMenuPanelLayout.createSequentialGroup()
                                .addComponent(viewUserButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(titleLabel)
                                .addGap(63, 63, 63)
                                .addComponent(notificationsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                    .addGroup(mainMenuPanelLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(mainMenuPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(118, 118, 118))
            .addGroup(mainMenuPanelLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(mainMenuPanelLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(mainMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(enterFoodMoodButton)
                    .addGroup(mainMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(moodEnterField, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(foodEnterField, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        mainMenuPanelLayout.setVerticalGroup(
            mainMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainMenuPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mainMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(notificationsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(viewUserButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(titleLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(30, 30, 30)
                .addComponent(foodEnterField, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(moodEnterField, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(enterFoodMoodButton)
                .addGap(117, 117, 117)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(mainMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(print_data)
                    .addComponent(show_data)
                    .addComponent(add_row))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(296, 296, 296))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainMenuPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainMenuPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 750, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void print_dataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_print_dataActionPerformed
        mmc.getJTableData();
    }//GEN-LAST:event_print_dataActionPerformed

    private void notificationsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_notificationsButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_notificationsButtonActionPerformed

    private void show_dataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_show_dataActionPerformed
        mmc.populateTableFromFile();
    }//GEN-LAST:event_show_dataActionPerformed

    private void add_rowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_rowActionPerformed
        mmc.addRowToTable();
    }//GEN-LAST:event_add_rowActionPerformed

    private void foodEnterFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_foodEnterFieldFocusGained
        if(foodEnterField.getText().equals("Capture Food"))
        {
            foodEnterField.setText("");
        }
    }//GEN-LAST:event_foodEnterFieldFocusGained

    private void foodEnterFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_foodEnterFieldFocusLost
        if(foodEnterField.getText().isEmpty())
        {
            foodEnterField.setText("Capture Food");
        }
    }//GEN-LAST:event_foodEnterFieldFocusLost

    private void moodEnterFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_moodEnterFieldFocusGained
        if(moodEnterField.getText().equals("Capture Mood"))
        {
            moodEnterField.setText("");
        }
    }//GEN-LAST:event_moodEnterFieldFocusGained

    private void moodEnterFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_moodEnterFieldFocusLost
        if(moodEnterField.getText().isEmpty())
        {
            moodEnterField.setText("Capture Mood");
        }
    }//GEN-LAST:event_moodEnterFieldFocusLost

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add_row;
    private javax.swing.JButton enterFoodMoodButton;
    private javax.swing.JTextField foodEnterField;
    private javax.swing.JButton goToChartButton;
    private javax.swing.JButton goToFoodMoodButton;
    private javax.swing.JButton goToRecommButton;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JPanel mainMenuPanel;
    private javax.swing.JTextField moodEnterField;
    private javax.swing.JButton notificationsButton;
    private javax.swing.JButton print_data;
    private javax.swing.JButton show_data;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JButton viewUserButton;
    // End of variables declaration//GEN-END:variables

    private void changeRecommendation(){
        jLabel1.setText("Your new recommendation is: " + 
                recommend.GetRecommendation());
    }
    
    public JTable getTable()
    {
        return jTable1;
    }
}
