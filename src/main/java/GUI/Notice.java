/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.Cursor;
import javax.swing.ImageIcon;
import GuiInitialize.ComponentsInit;
/**
 *
 * @author JeongEun Bae <byg0922@naver.com>
 */
public class Notice extends javax.swing.JFrame {

    /**
     * Creates new form Notice
     */
    int mousePX;
    int mousePY;
    
    public Notice() {
        initComponents();
        ComponentsInit.initTable(jTable1);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MovePanel = new javax.swing.JPanel();
        BackGroundPanel = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        OK = new javax.swing.JLabel();
        BackGroundLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        MovePanel.setBackground(new java.awt.Color(255, 255, 255));
        MovePanel.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                MovePanelMouseDragged(evt);
            }
        });
        MovePanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                MovePanelMousePressed(evt);
            }
        });

        javax.swing.GroupLayout MovePanelLayout = new javax.swing.GroupLayout(MovePanel);
        MovePanel.setLayout(MovePanelLayout);
        MovePanelLayout.setHorizontalGroup(
            MovePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 460, Short.MAX_VALUE)
        );
        MovePanelLayout.setVerticalGroup(
            MovePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        getContentPane().add(MovePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(3, 4, 460, 30));

        BackGroundPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(138, 190, 255)));
        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane2.setAutoscrolls(true);
        jScrollPane2.addMouseWheelListener(new java.awt.event.MouseWheelListener() {
            public void mouseWheelMoved(java.awt.event.MouseWheelEvent evt) {
                jScrollPane2MouseWheelMoved(evt);
            }
        });

        jTable1.setBackground(new java.awt.Color(255, 255, 255));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.setFocusable(false);
        jTable1.setIntercellSpacing(new java.awt.Dimension(0, 0));
        jTable1.setRowHeight(40);
        jTable1.setSelectionBackground(new java.awt.Color(138, 190, 255));
        jTable1.setShowVerticalLines(false);
        jTable1.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(jTable1);

        BackGroundPanel.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, 350, 440));

        OK.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MainPageImage/OK.png"))); // NOI18N
        OK.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                OKMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                OKMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                OKMouseExited(evt);
            }
        });
        BackGroundPanel.add(OK, new org.netbeans.lib.awtextra.AbsoluteConstraints(184, 550, 100, 40));

        BackGroundLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MainPageImage/Notice.png"))); // NOI18N
        BackGroundPanel.add(BackGroundLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 466, 605));

        getContentPane().add(BackGroundPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 466, 605));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void OKMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OKMouseEntered
        // TODO add your handling code here:
        OK.setCursor(new Cursor(HAND_CURSOR));
        OK.setIcon(new ImageIcon(getClass().getResource("/MainPageImage/OK_Entered.png")));
    }//GEN-LAST:event_OKMouseEntered

    private void OKMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OKMouseExited
        // TODO add your handling code here:
        OK.setIcon(new ImageIcon(getClass().getResource("/MainPageImage/OK.png")));
    }//GEN-LAST:event_OKMouseExited

    private void OKMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OKMouseClicked
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_OKMouseClicked

    private void jScrollPane2MouseWheelMoved(java.awt.event.MouseWheelEvent evt) {//GEN-FIRST:event_jScrollPane2MouseWheelMoved
        // TODO add your handling code here:
        ComponentsInit.TableMouseWheelMovedEvt(jScrollPane2, jTable1, evt);
    }//GEN-LAST:event_jScrollPane2MouseWheelMoved

    private void MovePanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MovePanelMousePressed
        // TODO add your handling code here:
        mousePX = evt.getX();
        mousePY = evt.getY();
    }//GEN-LAST:event_MovePanelMousePressed

    private void MovePanelMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MovePanelMouseDragged
        // TODO add your handling code here:
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        
        this.setLocation(x - mousePX, y - mousePY);
    }//GEN-LAST:event_MovePanelMouseDragged

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
            java.util.logging.Logger.getLogger(Notice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Notice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Notice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Notice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Notice().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BackGroundLabel;
    private javax.swing.JPanel BackGroundPanel;
    private javax.swing.JPanel MovePanel;
    private javax.swing.JLabel OK;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
