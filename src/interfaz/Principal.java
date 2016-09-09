/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import clases.DenominadorCeroException;
import clases.Fraccionario;
import javax.swing.JOptionPane;

/**
 *
 * @author Jesus
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
        
        initComponents();
        cmdMixto.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        try {
            jPanel2 =(javax.swing.JPanel)java.beans.Beans.instantiate(getClass().getClassLoader(), "interfaz.Principal_jPanel2");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
        jLabel1 = new javax.swing.JLabel();
        txtDenominador2 = new javax.swing.JTextField();
        txtNumerador2 = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        cmbOperaciones = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        txtNumerador = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        txtDenominador = new javax.swing.JTextField();
        txtNumerador1 = new javax.swing.JTextField();
        jSeparator7 = new javax.swing.JSeparator();
        txtDenominador1 = new javax.swing.JTextField();
        txtDenominador3 = new javax.swing.JTextField();
        jSeparator8 = new javax.swing.JSeparator();
        txtNumerador3 = new javax.swing.JTextField();
        txtEntero = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        cmdMixto = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 24)); // NOI18N
        jLabel1.setText("Operaciones con Fracciones ");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, -1, -1));

        txtDenominador2.setEditable(false);
        jPanel2.add(txtDenominador2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 130, 60, -1));

        txtNumerador2.setEditable(false);
        jPanel2.add(txtNumerador2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 90, 60, -1));
        jPanel2.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 120, 80, 10));

        cmbOperaciones.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cmbOperaciones.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "+", "-", "x", "/", " " }));
        jPanel2.add(cmbOperaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 110, 50, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("=");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 110, -1, -1));

        txtNumerador.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNumeradorKeyTyped(evt);
            }
        });
        jPanel2.add(txtNumerador, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 60, -1));
        jPanel2.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 80, 10));

        txtDenominador.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDenominadorKeyTyped(evt);
            }
        });
        jPanel2.add(txtDenominador, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 60, -1));

        txtNumerador1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNumerador1KeyTyped(evt);
            }
        });
        jPanel2.add(txtNumerador1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 90, 60, -1));
        jPanel2.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 120, 80, 10));

        txtDenominador1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDenominador1KeyTyped(evt);
            }
        });
        jPanel2.add(txtDenominador1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 130, 60, -1));

        txtDenominador3.setEditable(false);
        jPanel2.add(txtDenominador3, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 130, 60, -1));
        jPanel2.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 120, 80, 10));

        txtNumerador3.setEditable(false);
        jPanel2.add(txtNumerador3, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 90, 60, -1));

        txtEntero.setEditable(false);
        txtEntero.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel2.add(txtEntero, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 90, 40, 60));

        jButton1.setForeground(new java.awt.Color(0, 153, 0));
        jButton1.setText("Calcular");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 190, -1, -1));

        jButton2.setForeground(new java.awt.Color(102, 0, 0));
        jButton2.setText("Borrar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 210, -1, -1));

        cmdMixto.setForeground(new java.awt.Color(0, 153, 0));
        cmdMixto.setText("Mixto");
        cmdMixto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdMixtoActionPerformed(evt);
            }
        });
        jPanel2.add(cmdMixto, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 110, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("=");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 110, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 794, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 239, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(810, 277));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int op = 0, n1,n2,d1,d2;
        Fraccionario f1 = null,f2 = null,f3=null ;
        if (txtNumerador.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(this, "Digite numerador de la fracción número 1", "Error", JOptionPane.ERROR_MESSAGE);
            txtNumerador.requestFocusInWindow();
        }else if (txtDenominador.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Digite denominador de la fracción número 1", "Error", JOptionPane.ERROR_MESSAGE);
            txtDenominador.requestFocusInWindow();
        }
        else if (txtNumerador1.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Digite numerador de la fracción número 2", "Error", JOptionPane.ERROR_MESSAGE);
            txtNumerador1.requestFocusInWindow();
        } else if (txtDenominador1.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Digite denominador de la fracción número 2", "Error", JOptionPane.ERROR_MESSAGE);
            txtDenominador1.requestFocusInWindow();
        }else{
            op = cmbOperaciones.getSelectedIndex();
                n1 = Integer.parseInt(txtNumerador.getText());
                d1 = Integer.parseInt(txtDenominador.getText());
                n2 = Integer.parseInt(txtNumerador1.getText());
                d2 = Integer.parseInt(txtDenominador1.getText());
                try {
                    f1 = new Fraccionario(n1, d1);
                    f2 = new Fraccionario(n2, d2);

                    switch (op) {
                        case 0:
                            f3 = f1.sumar(f2);
                            break;
                        case 1:
                            f3 = f1.restar(f2);
                            break;
                        case 2:
                            f3 = f1.multiplicar(f2);
                            break;
                        case 3:
                            f3 = f1.dividir(f2);
                            break;
                    }
                    txtNumerador2.setText("" + f3.getNumerador());
                    txtDenominador2.setText("" + f3.getDenominador());
                    cmdMixto.setEnabled(true);  
                }catch (DenominadorCeroException e) {
                    JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }  
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void cmdMixtoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdMixtoActionPerformed
        int  numerador, denominador,entero,d4,n4;
        n4 = Integer.parseInt(txtNumerador2.getText());
        d4 = Integer.parseInt(txtDenominador2.getText());
        entero = n4 / d4;
        numerador = n4 % d4;
        denominador = d4;
        txtEntero.setText("" + entero);
        txtNumerador3.setText("" + numerador);
        txtDenominador3.setText("" + denominador);
        
    }//GEN-LAST:event_cmdMixtoActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        txtNumerador.setText("");
        txtNumerador1.setText("");
        txtNumerador2.setText("");
        txtNumerador3.setText("");
        txtDenominador.setText("");
        txtDenominador1.setText("");
        txtDenominador2.setText("");
        txtDenominador3.setText("");
        txtEntero.setText("");
         txtNumerador.requestFocusInWindow();
        cmdMixto.setEnabled(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtNumeradorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumeradorKeyTyped
          char c=evt.getKeyChar();
             
         
          if(!Character.isDigit(evt.getKeyChar())) { 
              getToolkit().beep(); 
               
              evt.consume(); 
          }
    }//GEN-LAST:event_txtNumeradorKeyTyped

    private void txtDenominadorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDenominadorKeyTyped
        char c=evt.getKeyChar();
             
         
          if(!Character.isDigit(evt.getKeyChar())) { 
              getToolkit().beep(); 
               
              evt.consume(); 
          }
    }//GEN-LAST:event_txtDenominadorKeyTyped

    private void txtNumerador1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumerador1KeyTyped
        char c=evt.getKeyChar();
             
         
          if(!Character.isDigit(evt.getKeyChar())) { 
              getToolkit().beep(); 
               
              evt.consume(); 
          }
    }//GEN-LAST:event_txtNumerador1KeyTyped

    private void txtDenominador1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDenominador1KeyTyped
        char c=evt.getKeyChar();
             
         
          if(!Character.isDigit(evt.getKeyChar())) { 
              getToolkit().beep(); 
               
              evt.consume(); 
          }
    }//GEN-LAST:event_txtDenominador1KeyTyped

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cmbOperaciones;
    private javax.swing.JButton cmdMixto;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JTextField txtDenominador;
    private javax.swing.JTextField txtDenominador1;
    private javax.swing.JTextField txtDenominador2;
    private javax.swing.JTextField txtDenominador3;
    private javax.swing.JTextField txtEntero;
    private javax.swing.JTextField txtNumerador;
    private javax.swing.JTextField txtNumerador1;
    private javax.swing.JTextField txtNumerador2;
    private javax.swing.JTextField txtNumerador3;
    // End of variables declaration//GEN-END:variables
}
