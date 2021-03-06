/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import DBServer.CommentSearch;
import java.awt.Cursor;
import java.time.*;
import javax.swing.ImageIcon;
import javax.swing.plaf.basic.BasicScrollPaneUI;
import GuiInitialize.ComponentsInit;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author JeongEun Bae <byg0922@naver.com>
 */
public class PostView extends javax.swing.JFrame {

    /**
     * Creates new form PostView
     */
    int mousePX;
    int mousePY;
    LocalDateTime nowDate;
    boolean click = false;
    Vector<String> vec;
    Vector<String> comments;
    DefaultTableModel commentTableModel;
    public PostView() {
        initComponents();
        ComponentsInit.initTable(jTable6);
        jScrollPane1.setOpaque(false);
        jScrollPane1.getViewport().setOpaque(false);
        DeleteLabel.requestFocus();
    }

    public PostView(Vector<String> vec) {
        
        initComponents();
        ComponentsInit.initTable(jTable6);
        jScrollPane1.setOpaque(false);
        jScrollPane1.getViewport().setOpaque(false);
        DeleteLabel.requestFocus();
        this.vec = vec;
        
        PostNumField.setText(vec.get(0));
        TitleField.setText(vec.get(1));
        WriterField.setText(vec.get(2));
        DateField.setText(vec.get(4));
        FileNameField.setText(vec.get(5));
        ContentsField.setText(vec.get(6));
        ViewField.setText(vec.get(8));
        
        comments = new CommentSearch(vec.get(0)).informationSearch();
        commentTableModel = (DefaultTableModel)jTable6.getModel();
        int size = comments.size();
        commentTableModel.setRowCount(0);
        
        for (int i = 0; i < size / 5; i++) {
            commentTableModel.insertRow(commentTableModel.getRowCount(), new Object[]{comments.get(0 + (i * 5)), comments.get(1 + (i * 5)), comments.get(2 + (i * 5)), comments.get(3 + (i * 5))});            
        }
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Exit = new javax.swing.JLabel();
        MovePanel = new javax.swing.JPanel();
        BackGroundPanel = new javax.swing.JPanel();
        Like = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTable6 = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        ContentsField = new javax.swing.JTextArea();
        ModifyLabel = new javax.swing.JLabel();
        DeleteLabel = new javax.swing.JLabel();
        CommentsField = new javax.swing.JTextField();
        FileNameField = new javax.swing.JTextField();
        TitleField = new javax.swing.JTextField();
        DateField = new javax.swing.JTextField();
        WriterField = new javax.swing.JTextField();
        ViewField = new javax.swing.JTextField();
        PostNumField = new javax.swing.JTextField();
        BackGorundImage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SignUpImage/icons8_multiply_45px.png"))); // NOI18N
        Exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ExitMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ExitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ExitMouseExited(evt);
            }
        });
        getContentPane().add(Exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(1180, 10, 40, 40));

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
        MovePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(MovePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(3, 3, 1160, 40));

        BackGroundPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Like.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PostViewImage/icons8_heart_outline_30px.png"))); // NOI18N
        Like.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LikeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                LikeMouseEntered(evt);
            }
        });
        BackGroundPanel.add(Like, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 170, -1, 30));

        jScrollPane6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(138, 190, 255)));
        jScrollPane6.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane6.addMouseWheelListener(new java.awt.event.MouseWheelListener() {
            public void mouseWheelMoved(java.awt.event.MouseWheelEvent evt) {
                jScrollPane6MouseWheelMoved(evt);
            }
        });

        jTable6.setBackground(new java.awt.Color(255, 255, 255));
        jTable6.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jTable6.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, "", null},
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
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable6.setRowHeight(40);
        jTable6.setSelectionBackground(new java.awt.Color(138, 190, 255));
        jTable6.setShowGrid(false);
        jScrollPane6.setViewportView(jTable6);
        jTable6.getTableHeader().setReorderingAllowed(false);

        BackGroundPanel.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 150, 550, 530));

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255, 0)
        );
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane1.setOpaque(false);
        jScrollPane1.setUI(new BasicScrollPaneUI());
        jScrollPane1.addMouseWheelListener(new java.awt.event.MouseWheelListener() {
            public void mouseWheelMoved(java.awt.event.MouseWheelEvent evt) {
                jScrollPane1MouseWheelMoved(evt);
            }
        });

        ContentsField.setBackground(new java.awt.Color(255, 255, 255, 0)
        );
        ContentsField.setColumns(20);
        ContentsField.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        ContentsField.setForeground(new java.awt.Color(204, 204, 204));
        ContentsField.setLineWrap(true);
        ContentsField.setRows(5);
        ContentsField.setText("Contents");
        ContentsField.setBorder(null);
        ContentsField.setEnabled(false);
        ContentsField.setSelectionColor(new java.awt.Color(75, 184, 243));
        jScrollPane1.setViewportView(ContentsField);

        BackGroundPanel.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(94, 270, 458, 368));

        ModifyLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PostViewImage/ModifyPost.png"))); // NOI18N
        ModifyLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ModifyLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ModifyLabelMouseExited(evt);
            }
        });
        BackGroundPanel.add(ModifyLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(345, 660, 100, 30));

        DeleteLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PostViewImage/DeletePost.png"))); // NOI18N
        DeleteLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                DeleteLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                DeleteLabelMouseExited(evt);
            }
        });
        BackGroundPanel.add(DeleteLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(459, 660, 100, 30));

        CommentsField.setBackground(new java.awt.Color(255, 255, 255,0));
        CommentsField.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        CommentsField.setForeground(new java.awt.Color(204, 204, 204));
        CommentsField.setText("Comment Count");
        CommentsField.setBorder(null);
        CommentsField.setEnabled(false);
        BackGroundPanel.add(CommentsField, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 108, 100, 20));

        FileNameField.setBackground(new java.awt.Color(255, 255, 255,0));
        FileNameField.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        FileNameField.setForeground(new java.awt.Color(204, 204, 204));
        FileNameField.setText("File Name");
        FileNameField.setBorder(null);
        FileNameField.setEnabled(false);
        BackGroundPanel.add(FileNameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 220, 190, 27));

        TitleField.setBackground(new java.awt.Color(255, 255, 255,0));
        TitleField.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        TitleField.setForeground(new java.awt.Color(204, 204, 204));
        TitleField.setText("Title");
        TitleField.setBorder(null);
        TitleField.setEnabled(false);
        BackGroundPanel.add(TitleField, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 172, 410, 31));

        DateField.setBackground(new java.awt.Color(255, 255, 255,0));
        DateField.setFont(new java.awt.Font("?????? ??????", 0, 12)); // NOI18N
        DateField.setForeground(new java.awt.Color(204, 204, 204));
        DateField.setText("Date");
        DateField.setBorder(null);
        DateField.setEnabled(false);
        BackGroundPanel.add(DateField, new org.netbeans.lib.awtextra.AbsoluteConstraints(395, 138, 160, 20));

        WriterField.setBackground(new java.awt.Color(255, 255, 255,0));
        WriterField.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        WriterField.setForeground(new java.awt.Color(204, 204, 204));
        WriterField.setText("Writer");
        WriterField.setBorder(null);
        WriterField.setEnabled(false);
        BackGroundPanel.add(WriterField, new org.netbeans.lib.awtextra.AbsoluteConstraints(452, 110, 100, 20));

        ViewField.setBackground(new java.awt.Color(255, 255, 255,0));
        ViewField.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        ViewField.setForeground(new java.awt.Color(204, 204, 204));
        ViewField.setText("View Count");
        ViewField.setBorder(null);
        ViewField.setEnabled(false);
        BackGroundPanel.add(ViewField, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, 100, 20));

        PostNumField.setBackground(new java.awt.Color(255, 255, 255,0));
        PostNumField.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        PostNumField.setForeground(new java.awt.Color(204, 204, 204));
        PostNumField.setText("Post Number");
        PostNumField.setBorder(null);
        PostNumField.setEnabled(false);
        BackGroundPanel.add(PostNumField, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, 100, 20));

        BackGorundImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PostViewImage/PostView.png"))); // NOI18N
        BackGroundPanel.add(BackGorundImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1235, 743));

        getContentPane().add(BackGroundPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1235, 743));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jScrollPane1MouseWheelMoved(java.awt.event.MouseWheelEvent evt) {//GEN-FIRST:event_jScrollPane1MouseWheelMoved
        // TODO add your handling code here:
        ComponentsInit.ScrollPaneMouseWheelMovedEvt(jScrollPane1, evt);
    }//GEN-LAST:event_jScrollPane1MouseWheelMoved

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

    private void ExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitMouseClicked
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_ExitMouseClicked

    private void ExitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitMouseEntered
        // TODO add your handling code here:
        Exit.setCursor(new Cursor(HAND_CURSOR));
        Exit.setIcon(new ImageIcon(getClass().getResource("/SignUpImage/icons8_multiply_45px_1.png")));
    }//GEN-LAST:event_ExitMouseEntered

    private void ExitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitMouseExited
        // TODO add your handling code here:
        Exit.setIcon(new ImageIcon(getClass().getResource("/SignUpImage/icons8_multiply_45px.png")));
    }//GEN-LAST:event_ExitMouseExited

    private void ModifyLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ModifyLabelMouseEntered
        // TODO add your handling code here:
        ModifyLabel.setCursor(new Cursor(HAND_CURSOR));
        ModifyLabel.setIcon(new ImageIcon(getClass().getResource("/PostViewImage/ModifyPost_Entered.png")));
    }//GEN-LAST:event_ModifyLabelMouseEntered

    private void ModifyLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ModifyLabelMouseExited
        // TODO add your handling code here:
        ModifyLabel.setIcon(new ImageIcon(getClass().getResource("/PostViewImage/ModifyPost.png")));
    }//GEN-LAST:event_ModifyLabelMouseExited

    private void DeleteLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeleteLabelMouseEntered
        // TODO add your handling code here:
        DeleteLabel.setCursor(new Cursor(HAND_CURSOR));
        DeleteLabel.setIcon(new ImageIcon(getClass().getResource("/PostViewImage/DeletePost_Entered.png")));
    }//GEN-LAST:event_DeleteLabelMouseEntered

    private void DeleteLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeleteLabelMouseExited
        // TODO add your handling code here:
        DeleteLabel.setIcon(new ImageIcon(getClass().getResource("/PostViewImage/DeletePost.png")));
    }//GEN-LAST:event_DeleteLabelMouseExited

    private void jScrollPane6MouseWheelMoved(java.awt.event.MouseWheelEvent evt) {//GEN-FIRST:event_jScrollPane6MouseWheelMoved
        // TODO add your handling code here:
        ComponentsInit.TableMouseWheelMovedEvt(jScrollPane6, jTable6, evt);
    }//GEN-LAST:event_jScrollPane6MouseWheelMoved

    private void LikeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LikeMouseEntered
        // TODO add your handling code here:
        Like.setCursor(new Cursor(HAND_CURSOR));
    }//GEN-LAST:event_LikeMouseEntered

    private void LikeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LikeMouseClicked
        // TODO add your handling code here:
        click = !click;
        if (click)
            Like.setIcon(new ImageIcon(getClass().getResource("/PostViewImage/icons8_heart_outline_30px_2.png")));
        else
            Like.setIcon(new ImageIcon(getClass().getResource("/PostViewImage/icons8_heart_outline_30px.png")));
    }//GEN-LAST:event_LikeMouseClicked

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
            java.util.logging.Logger.getLogger(PostView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PostView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PostView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PostView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new PostView().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BackGorundImage;
    private javax.swing.JPanel BackGroundPanel;
    private javax.swing.JTextField CommentsField;
    private javax.swing.JTextArea ContentsField;
    private javax.swing.JTextField DateField;
    private javax.swing.JLabel DeleteLabel;
    private javax.swing.JLabel Exit;
    private javax.swing.JTextField FileNameField;
    private javax.swing.JLabel Like;
    private javax.swing.JLabel ModifyLabel;
    private javax.swing.JPanel MovePanel;
    private javax.swing.JTextField PostNumField;
    private javax.swing.JTextField TitleField;
    private javax.swing.JTextField ViewField;
    private javax.swing.JTextField WriterField;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTable jTable6;
    // End of variables declaration//GEN-END:variables
}
