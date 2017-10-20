/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ChartsViewBackend;

import CrudFoodModel.FoodList;
import CrudMoodModel.MoodList;
import java.util.Date;

/**
 *
 * @author mlh5614
 */
public class ChartsViewBackend extends javax.swing.JFrame {

    /**
     * Creates new form ViewChartsBackend
     */
    public ChartsViewBackend() {
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ChartsViewBackend.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChartsViewBackend.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChartsViewBackend.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChartsViewBackend.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ChartsViewBackend().setVisible(true);
            }
        });
    }

    /**
* Maintain the current version of the view to know when it is out of sync with the model and controller.
*/
private int version;    

    /**
     * Add a Chart to the frame.
     */
    public void createChart(FoodList f, MoodList m, Date start, Date end)
    {
        System.out.println("Test Passed: Chart Created, date = " + start + " to " + end + ", food = " + f + ", mood = " + m);
    }
    
    /**
     * Grab the most recent Chart for the view.
     */    
    public void refreshView()
    {
        System.out.println("Test Passed: Refresh the View");
    }
    
    public void updateChart(FoodList f, MoodList m, Date start, Date end)
    {
        System.out.println("Test Passed: Chart Updated, date = " + start + " to " + end + ", food = " + f + ", mood = " + m);
    }
    
    public void deleteChart(FoodList f, MoodList m, Date start, Date end)
    {
        System.out.println("Test Passed: Chart Deleted, date = " + start + " to " + end + ", food = " + f + ", mood = " + m);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
