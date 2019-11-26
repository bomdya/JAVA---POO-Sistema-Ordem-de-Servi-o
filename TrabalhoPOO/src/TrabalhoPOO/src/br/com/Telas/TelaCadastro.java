/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TrabalhoPOO.src.br.com.Telas;

import TrabalhoPOO.src.br.com.DataAccess.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author Adriele
 */
public class TelaCadastro extends javax.swing.JFrame {
    Connection conexao = null;
    PreparedStatement pst = null;
    ResultSet rs = null;

    /**
     * Creates new form TelaCadastro
     */
    public TelaCadastro() {
        initComponents();
        conexao = Conexao.conector();
        
    }

    private void cadastrar() {
        String sql = "INSERT INTO cadastrofunc (nomefunc as txtNomeCad, email as txtEmail, senha as txtSenhaCad, telefone as txtTelCad) VALUES (?, ?, ?, ?)";
        try {
            pst = conexao.prepareStatement(sql);
            pst.setString(1, txtNomeCad.getText());
            pst.setString(2, txtEmail.getText());
            pst.setString(3, txtSenhaCad.getText());
            pst.setString(3, txtTelCad.getText());
            rs = pst.executeQuery();

            if ((txtNomeCad.getText().isEmpty())
                    || (txtEmail.getText().isEmpty())
                    || (txtSenhaCad.getText().isEmpty())) {
                JOptionPane.showMessageDialog(null, "Preencha os campos obrigatórios");
            } else {

                int adicionar = pst.executeUpdate();

                if (adicionar > 0) {
                    JOptionPane.showMessageDialog(null, "Usuário adicionado com sucesso!");
                    txtNomeCad.setText(null);
                    txtEmail.setText(null);
                    txtSenhaCad.setText(null);
                }
            }

        } catch (Exception e) {
        }
        

    }
   
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelCad = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtNomeCad = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtSenhaCad = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        txtTelCad = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        btCad = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        painelCad.setBackground(new java.awt.Color(227, 227, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(136, 136, 225));
        jLabel1.setText("Nome");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(136, 136, 225));
        jLabel2.setText("E-mail");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(136, 136, 225));
        jLabel3.setText("Senha");

        txtNomeCad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeCadActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(136, 136, 225));
        jLabel4.setText("Telefone");

        txtTelCad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelCadActionPerformed(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TrabalhoPOO/src/br/com/Img/bitmap.png"))); // NOI18N

        btCad.setBackground(new java.awt.Color(153, 153, 255));
        btCad.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btCad.setForeground(new java.awt.Color(255, 255, 255));
        btCad.setText("Cadastrar");
        btCad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelCadLayout = new javax.swing.GroupLayout(painelCad);
        painelCad.setLayout(painelCadLayout);
        painelCadLayout.setHorizontalGroup(
            painelCadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelCadLayout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addGroup(painelCadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(txtNomeCad, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSenhaCad, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(txtTelCad, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(btCad)
                    .addComponent(jLabel1))
                .addContainerGap(74, Short.MAX_VALUE))
        );
        painelCadLayout.setVerticalGroup(
            painelCadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelCadLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNomeCad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(11, 11, 11)
                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtSenhaCad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTelCad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btCad)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(painelCad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelCad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtNomeCadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeCadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeCadActionPerformed

    private void txtTelCadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelCadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelCadActionPerformed

    private void btCadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadActionPerformed
        cadastrar();
        new TelaLogin().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btCadActionPerformed

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
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastro().setVisible(true);
               
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCad;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel painelCad;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNomeCad;
    private javax.swing.JPasswordField txtSenhaCad;
    private javax.swing.JTextField txtTelCad;
    // End of variables declaration//GEN-END:variables
}
