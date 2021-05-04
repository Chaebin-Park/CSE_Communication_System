/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import CSE_Client.ClientSocket;
import java.awt.Color;
import java.awt.Cursor;
import javax.swing.ImageIcon;
import UserManagement.UserInformation;
import javax.swing.JOptionPane;
import GuiInitialize.ComponentsInit;

/**
 *
 * @author JeongEun Bae <byg0922@naver.com>
 */
import UserManagement.*;

public class SignUp extends javax.swing.JFrame {

    /**
     * Creates new form SignUp
     */
    int mousePX;
    int mousePY;

    public SignUp() {   // 패스워드 필드로 교체 필요
        initComponents();

        BackGroundPanel.setBackground(new Color(255, 255, 255, 0));
        BackGroundPanel.setOpaque(false);
        MovePanel.setBackground(new Color(255, 255, 255, 0));
        MovePanel.setOpaque(false);
        SignUpBtn.requestFocus();

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
        PWCheckField = new javax.swing.JPasswordField();
        PWCheckLabel = new javax.swing.JLabel();
        PWField = new javax.swing.JPasswordField();
        PWLabel = new javax.swing.JLabel();
        EMailField = new javax.swing.JTextField();
        PhoneNumberField = new javax.swing.JTextField();
        StudentNumberFIeld = new javax.swing.JTextField();
        GradeField = new javax.swing.JTextField();
        MajorField = new javax.swing.JTextField();
        PWAnswerField = new javax.swing.JTextField();
        PWQuestionField = new javax.swing.JComboBox<>();
        NameField = new javax.swing.JTextField();
        IDField = new javax.swing.JTextField();
        SignUpBtn = new javax.swing.JLabel();
        BackGroundLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(60, 63, 255));
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
        getContentPane().add(Exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 10, 40, 40));

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
        getContentPane().add(MovePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, 50));

        BackGroundPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PWCheckField.setBackground(new java.awt.Color(255, 255, 255,0));
        PWCheckField.setBorder(null);
        BackGroundPanel.add(PWCheckField, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 180, 160, 30));

        PWCheckLabel.setBackground(new java.awt.Color(255, 255, 255,0));
        PWCheckLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        PWCheckLabel.setText("PASSWORD CHECK");
        PWCheckLabel.setOpaque(true);
        BackGroundPanel.add(PWCheckLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 180, 160, 30));
        PWCheckLabel.setForeground(new Color(204,204,204));

        PWField.setBackground(new java.awt.Color(255, 255, 255,0));
        PWField.setToolTipText("");
        PWField.setBorder(null);
        PWField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                PWFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                PWFieldFocusLost(evt);
            }
        });
        PWField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PWFieldMouseClicked(evt);
            }
        });
        PWField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PWFieldActionPerformed(evt);
            }
        });
        BackGroundPanel.add(PWField, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, 160, 30));

        PWLabel.setBackground(new java.awt.Color(255, 255, 255,0));
        PWLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        PWLabel.setText("PASSWORD");
        PWLabel.setOpaque(true);
        BackGroundPanel.add(PWLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, 160, 30));
        PWLabel.setForeground(new Color(204,204,204));

        EMailField.setBackground(new java.awt.Color(255, 255, 255,0));
        EMailField.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        EMailField.setForeground(new java.awt.Color(204, 204, 204));
        EMailField.setText(" E-MAIL");
        EMailField.setToolTipText("");
        EMailField.setBorder(null);
        EMailField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                EMailFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                EMailFieldFocusLost(evt);
            }
        });
        BackGroundPanel.add(EMailField, new org.netbeans.lib.awtextra.AbsoluteConstraints(67, 482, 380, 30));

        PhoneNumberField.setBackground(new java.awt.Color(255, 255, 255,0));
        PhoneNumberField.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        PhoneNumberField.setForeground(new java.awt.Color(204, 204, 204));
        PhoneNumberField.setText(" PHONE NUMBER");
        PhoneNumberField.setToolTipText("");
        PhoneNumberField.setBorder(null);
        PhoneNumberField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                PhoneNumberFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                PhoneNumberFieldFocusLost(evt);
            }
        });
        BackGroundPanel.add(PhoneNumberField, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 425, 200, 30));

        StudentNumberFIeld.setBackground(new java.awt.Color(255, 255, 255,0));
        StudentNumberFIeld.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        StudentNumberFIeld.setForeground(new java.awt.Color(204, 204, 204));
        StudentNumberFIeld.setText(" STUDENT NUMBER");
        StudentNumberFIeld.setToolTipText("");
        StudentNumberFIeld.setBorder(null);
        StudentNumberFIeld.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                StudentNumberFIeldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                StudentNumberFIeldFocusLost(evt);
            }
        });
        BackGroundPanel.add(StudentNumberFIeld, new org.netbeans.lib.awtextra.AbsoluteConstraints(67, 425, 140, 30));

        GradeField.setBackground(new java.awt.Color(255, 255, 255,0));
        GradeField.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        GradeField.setForeground(new java.awt.Color(204, 204, 204));
        GradeField.setText(" GRADE");
        GradeField.setToolTipText("");
        GradeField.setBorder(null);
        GradeField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                GradeFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                GradeFieldFocusLost(evt);
            }
        });
        BackGroundPanel.add(GradeField, new org.netbeans.lib.awtextra.AbsoluteConstraints(366, 364, 80, 30));

        MajorField.setBackground(new java.awt.Color(255, 255, 255,0));
        MajorField.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        MajorField.setForeground(new java.awt.Color(204, 204, 204));
        MajorField.setText(" MAJOR");
        MajorField.setToolTipText("");
        MajorField.setBorder(null);
        MajorField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                MajorFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                MajorFieldFocusLost(evt);
            }
        });
        BackGroundPanel.add(MajorField, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 364, 250, 30));

        PWAnswerField.setBackground(new java.awt.Color(255, 255, 255,0));
        PWAnswerField.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        PWAnswerField.setForeground(new java.awt.Color(204, 204, 204));
        PWAnswerField.setText(" ANSWER");
        PWAnswerField.setBorder(null);
        PWAnswerField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                PWAnswerFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                PWAnswerFieldFocusLost(evt);
            }
        });
        BackGroundPanel.add(PWAnswerField, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 299, 380, 30));

        PWQuestionField.setBackground(new java.awt.Color(255, 255, 255,0));
        PWQuestionField.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        PWQuestionField.setForeground(new java.awt.Color(204, 204, 204));
        PWQuestionField.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1. 내가 나온 초등학교는?", "2. 나의 보물 1호는?", "3. 나의 첫사랑은?ㅋ", "4. 가장 기억에 남는 교수님은?", "5. 내가 태어난 지역은?" }));
        PWQuestionField.setToolTipText("");
        PWQuestionField.setBorder(null);
        PWQuestionField.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        PWQuestionField.setOpaque(false);
        PWQuestionField.setForeground(new Color(204,204,204));
        BackGroundPanel.add(PWQuestionField, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 241, 370, 30));

        NameField.setBackground(new java.awt.Color(255, 255, 255,0));
        NameField.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        NameField.setForeground(new java.awt.Color(204, 204, 204));
        NameField.setText("NAME");
        NameField.setBorder(null);
        NameField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                NameFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                NameFieldFocusLost(evt);
            }
        });
        BackGroundPanel.add(NameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(355, 125, 90, 30));

        IDField.setBackground(new java.awt.Color(255, 255, 255,0));
        IDField.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        IDField.setForeground(new java.awt.Color(204, 204, 204));
        IDField.setText(" ID");
        IDField.setBorder(null);
        IDField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                IDFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                IDFieldFocusLost(evt);
            }
        });
        BackGroundPanel.add(IDField, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 125, 180, 30));

        SignUpBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SignUpImage/SignUp_Btn.png"))); // NOI18N
        SignUpBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SignUpBtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                SignUpBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                SignUpBtnMouseExited(evt);
            }
        });
        BackGroundPanel.add(SignUpBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 560, 170, 50));

        BackGroundLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SignUpImage/SignUp_BG.png"))); // NOI18N
        BackGroundPanel.add(BackGroundLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 503, 650));

        getContentPane().add(BackGroundPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 503, 650));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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

    private void SignUpBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SignUpBtnMouseEntered
        // TODO add your handling code here:
        SignUpBtn.setCursor(new Cursor(HAND_CURSOR));
        SignUpBtn.setIcon(new ImageIcon(getClass().getResource("/SignUpImage/SignUp_Btn_Entered.png")));
    }//GEN-LAST:event_SignUpBtnMouseEntered

    private void SignUpBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SignUpBtnMouseExited
        // TODO add your handling code here:
        SignUpBtn.setIcon(new ImageIcon(getClass().getResource("/SignUpImage/SignUp_Btn.png")));
    }//GEN-LAST:event_SignUpBtnMouseExited

    private void IDFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_IDFieldFocusGained
        // TODO add your handling code here:
        ComponentsInit.TextFieldGained(IDField, " ID");
    }//GEN-LAST:event_IDFieldFocusGained

    private void IDFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_IDFieldFocusLost
        // TODO add your handling code here:
        //IDField.setText(" ID");
        ComponentsInit.TextFieldLost(IDField, " ID");
    }//GEN-LAST:event_IDFieldFocusLost

    private void NameFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_NameFieldFocusGained
        // TODO add your handling code here:
        ComponentsInit.TextFieldGained(NameField, "NAME");
    }//GEN-LAST:event_NameFieldFocusGained

    private void NameFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_NameFieldFocusLost
        // TODO add your handling code here:
        ComponentsInit.TextFieldLost(NameField, " NAME");
    }//GEN-LAST:event_NameFieldFocusLost

    private void PWAnswerFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_PWAnswerFieldFocusGained
        // TODO add your handling code here:
        ComponentsInit.TextFieldGained(PWAnswerField, " ANSWER");
    }//GEN-LAST:event_PWAnswerFieldFocusGained

    private void PWAnswerFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_PWAnswerFieldFocusLost
        // TODO add your handling code here:
        ComponentsInit.TextFieldLost(PWAnswerField, " ANSWER");
    }//GEN-LAST:event_PWAnswerFieldFocusLost

    private void MajorFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_MajorFieldFocusGained
        // TODO add your handling code here:
        ComponentsInit.TextFieldGained(MajorField, " MAJOR");
    }//GEN-LAST:event_MajorFieldFocusGained

    private void MajorFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_MajorFieldFocusLost
        // TODO add your handling code here:
        ComponentsInit.TextFieldLost(MajorField, " MAJOR");
    }//GEN-LAST:event_MajorFieldFocusLost

    private void GradeFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_GradeFieldFocusGained
        // TODO add your handling code here:
        ComponentsInit.TextFieldGained(GradeField, " GRADE");
    }//GEN-LAST:event_GradeFieldFocusGained

    private void GradeFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_GradeFieldFocusLost
        // TODO add your handling code here:
        ComponentsInit.TextFieldLost(GradeField, " GRADE");
    }//GEN-LAST:event_GradeFieldFocusLost

    private void StudentNumberFIeldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_StudentNumberFIeldFocusGained
        // TODO add your handling code here:
        ComponentsInit.TextFieldGained(StudentNumberFIeld, " STUDENT NUMBER");
    }//GEN-LAST:event_StudentNumberFIeldFocusGained

    private void StudentNumberFIeldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_StudentNumberFIeldFocusLost
        // TODO add your handling code here:
        ComponentsInit.TextFieldLost(StudentNumberFIeld, " STUDENT NUMBER");
    }//GEN-LAST:event_StudentNumberFIeldFocusLost

    private void PhoneNumberFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_PhoneNumberFieldFocusGained
        // TODO add your handling code here:
        ComponentsInit.TextFieldGained(PhoneNumberField, " PHONE NUMBER");
    }//GEN-LAST:event_PhoneNumberFieldFocusGained

    private void PhoneNumberFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_PhoneNumberFieldFocusLost
        // TODO add your handling code here:
        ComponentsInit.TextFieldLost(PhoneNumberField, " PHONE NUMBER");
    }//GEN-LAST:event_PhoneNumberFieldFocusLost

    private void EMailFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_EMailFieldFocusGained
        // TODO add your handling code here:
        ComponentsInit.TextFieldGained(EMailField, " E-MAIL");
    }//GEN-LAST:event_EMailFieldFocusGained

    private void EMailFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_EMailFieldFocusLost
        // TODO add your handling code here:
        ComponentsInit.TextFieldLost(EMailField, " E-MAIL");
    }//GEN-LAST:event_EMailFieldFocusLost

    private void ExitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitMouseEntered
        // TODO add your handling code here:
        Exit.setCursor(new Cursor(HAND_CURSOR));
        Exit.setIcon(new ImageIcon(getClass().getResource("/SignUpImage/icons8_multiply_45px_1.png")));
    }//GEN-LAST:event_ExitMouseEntered

    private void ExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitMouseClicked
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_ExitMouseClicked

    private void ExitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitMouseExited
        // TODO add your handling code here:
        Exit.setIcon(new ImageIcon(getClass().getResource("/SignUpImage/icons8_multiply_45px.png")));
    }//GEN-LAST:event_ExitMouseExited

    private void PWFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PWFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PWFieldActionPerformed

    private void PWFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_PWFieldFocusGained
        // TODO add your handling code here:
        ComponentsInit.TextFieldGained(PWLabel, PWField, "PASSWORD");
    }//GEN-LAST:event_PWFieldFocusGained

    private void PWFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_PWFieldFocusLost
        // TODO add your handling code here:
        ComponentsInit.TextFieldLost(PWLabel, PWField, "PASSWORD");
    }//GEN-LAST:event_PWFieldFocusLost

    private void PWFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PWFieldMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_PWFieldMouseClicked

    private void SignUpBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SignUpBtnMouseClicked
        // TODO add your handling code here:
        String PW = PWField.getText();
        String PW_Check = NameField.getText();

        if (!PW.equals(PW_Check))
            JOptionPane.showInternalMessageDialog(null, "멍청한 자식 다시 치도록 해");
        else {
            UserInformation.Builder builder = new UserInformation.Builder(IDField.getText(), PWField.getText(), NameField.getText(), StudentNumberFIeld.getText(), MajorField.getText(), GradeField.getText(), PWQuestionField.getSelectedIndex() + "", PWAnswerField.getText());
            builder.phoneNumber(PhoneNumberField.getText());
            builder.email(EMailField.getText());

            UserInformation userInfo = builder.build();

            Login.SignUp signUpRef = new Login.SignUp(userInfo);
            boolean result = signUpRef.SignUpResult();
//        //ClientSocket csr = ClientSocketRef.getInstance();
//        boolean result = signUpRef.SignUpResult();

            if (result) {
                JOptionPane.showInternalMessageDialog(null, "회원가입을 완료~ 했습니다~~");
            } else {
                JOptionPane.showInternalMessageDialog(null, "회원가입이 오류~ 났습니다~~~ ㅠㅠ 다음 기회에 도전하세요!!");
            }
        }
    }//GEN-LAST:event_SignUpBtnMouseClicked

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new SignUp().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BackGroundLabel;
    private javax.swing.JPanel BackGroundPanel;
    private javax.swing.JTextField EMailField;
    private javax.swing.JLabel Exit;
    private javax.swing.JTextField GradeField;
    private javax.swing.JTextField IDField;
    private javax.swing.JTextField MajorField;
    private javax.swing.JPanel MovePanel;
    private javax.swing.JTextField NameField;
    private javax.swing.JTextField PWAnswerField;
    private javax.swing.JPasswordField PWCheckField;
    private javax.swing.JLabel PWCheckLabel;
    private javax.swing.JPasswordField PWField;
    private javax.swing.JLabel PWLabel;
    private javax.swing.JComboBox<String> PWQuestionField;
    private javax.swing.JTextField PhoneNumberField;
    private javax.swing.JLabel SignUpBtn;
    private javax.swing.JTextField StudentNumberFIeld;
    // End of variables declaration//GEN-END:variables
}
