/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.Color;
import GuiInitialize.ComponentsInit;
/**
 *
 * @author JeongEun Bae <byg0922@naver.com>
 */
public class MakeChat extends javax.swing.JFrame {

    /**
     * Creates new form MakeChat
     */
    public MakeChat() {
        initComponents();
        
        /**
         *  Componants initialize
         */
        
        ChatNameField.setBackground(new Color(255,255,255,0));
        ChatPasswordField.setBackground(new Color(255,255,255,0));
        ChatInformField.setBackground(new Color(255,255,255,0));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BackGroundPanel = new javax.swing.JPanel();
        ChatNameField = new javax.swing.JTextField();
        ChatPasswordField = new javax.swing.JPasswordField();
        ChatInformField = new javax.swing.JTextField();
        BackGroundLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BackGroundPanel.setBackground(new java.awt.Color(255, 255, 255));
        BackGroundPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ChatNameField.setFont(new java.awt.Font("맑은 고딕", 0, 12)); // NOI18N
        ChatNameField.setBorder(null);
        BackGroundPanel.add(ChatNameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 140, 190, 30));

        ChatPasswordField.setText("jPasswordField1");
        ChatPasswordField.setBorder(null);
        BackGroundPanel.add(ChatPasswordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 190, 110, 30));

        ChatInformField.setBorder(null);
        BackGroundPanel.add(ChatInformField, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 270, 400, 80));

        BackGroundLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MakeChattingImage/MakeChatting.png"))); // NOI18N
        BackGroundPanel.add(BackGroundLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 450));

        getContentPane().add(BackGroundPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 450));

        pack();
        setLocationRelativeTo(null);
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
            java.util.logging.Logger.getLogger(MakeChat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MakeChat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MakeChat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MakeChat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new MakeChat().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BackGroundLabel;
    private javax.swing.JPanel BackGroundPanel;
    private javax.swing.JTextField ChatInformField;
    private javax.swing.JTextField ChatNameField;
    private javax.swing.JPasswordField ChatPasswordField;
    // End of variables declaration//GEN-END:variables
}
