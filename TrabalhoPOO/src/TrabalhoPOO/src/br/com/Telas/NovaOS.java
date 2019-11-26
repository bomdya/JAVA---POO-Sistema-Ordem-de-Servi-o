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
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Adriele
 */
public class NovaOS extends javax.swing.JFrame {
  Connection conexao = null;
    PreparedStatement pst = null;
    ResultSet rs = null;

    /**
     * Creates new form NovaOS
     */
    public NovaOS() {
        initComponents();
        
        conexao = Conexao.conector();
    }


    private void emitir_os(){
        String sql = "INSERT INTO `ordemservico`(`nomeprod` as txtProd, `nomecliente` as txtCliente, `resp` as txtResp, `preco` as txtPreco, `pago` as Pago, `data` as txtData, `id` as idos) VALUES (?,?,?,?,?,?,?)";
        PreparedStatement pst = null;
        
    /**
     *
     */
    try {
            pst = conexao.prepareStatement(sql);
            pst.setString(0, txtProd.getText().toString());
            rs = pst.executeQuery();
            pst.setString(1, txtCliente.getText());
            pst.setString(2, txtResp.getText().toString());
            pst.setString(3, txtPreco.getText().toString());
            pst.setString(4, Pago.getSelectedItem().toString());
            pst.setString(5, txtData.getText());
            
        
           
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        
        
        
    }

    /**
     *
     */
    
    
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelNovaOS = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtProd = new javax.swing.JTextField();
        txtCliente = new javax.swing.JTextField();
        txtResp = new javax.swing.JTextField();
        txtPreco = new javax.swing.JTextField();
        btEmitir = new javax.swing.JButton();
        txtData = new javax.swing.JFormattedTextField();
        Pago = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        idos = new javax.swing.JTextField();
        btSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Nova Ordem de Serviço");
        setResizable(false);

        painelNovaOS.setBackground(new java.awt.Color(227, 227, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(136, 136, 225));
        jLabel1.setText("Produto:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(136, 136, 225));
        jLabel2.setText("Cliente:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(136, 136, 225));
        jLabel3.setText("Responsável:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(136, 136, 225));
        jLabel4.setText("Preço:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(136, 136, 225));
        jLabel5.setText("Data de Emissão:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(136, 136, 225));
        jLabel6.setText("Pago ou em Aberto:");

        txtProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtProdActionPerformed(evt);
            }
        });

        btEmitir.setBackground(new java.awt.Color(153, 153, 255));
        btEmitir.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btEmitir.setForeground(new java.awt.Color(255, 255, 255));
        btEmitir.setText("Emitir");
        btEmitir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEmitirActionPerformed(evt);
            }
        });

        txtData.setText("        /     /");

        Pago.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pago", "Aberto" }));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TrabalhoPOO/src/br/com/Img/plus.png"))); // NOI18N

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(136, 136, 225));
        jLabel8.setText("Nova Ordem ");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(136, 136, 225));
        jLabel9.setText("de Serviço");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(136, 136, 225));
        jLabel10.setText("ID:");

        idos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idosActionPerformed(evt);
            }
        });

        btSair.setBackground(new java.awt.Color(153, 153, 255));
        btSair.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btSair.setForeground(new java.awt.Color(255, 255, 255));
        btSair.setText("Sair");
        btSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelNovaOSLayout = new javax.swing.GroupLayout(painelNovaOS);
        painelNovaOS.setLayout(painelNovaOSLayout);
        painelNovaOSLayout.setHorizontalGroup(
            painelNovaOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelNovaOSLayout.createSequentialGroup()
                .addGroup(painelNovaOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelNovaOSLayout.createSequentialGroup()
                        .addGap(224, 224, 224)
                        .addComponent(btEmitir)
                        .addGap(42, 42, 42)
                        .addComponent(btSair))
                    .addGroup(painelNovaOSLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(painelNovaOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(painelNovaOSLayout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtResp, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(painelNovaOSLayout.createSequentialGroup()
                                .addGroup(painelNovaOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2))
                                .addGap(27, 27, 27)
                                .addGroup(painelNovaOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCliente)
                                    .addComponent(txtProd, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(26, 26, 26)
                        .addGroup(painelNovaOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painelNovaOSLayout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Pago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(painelNovaOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, painelNovaOSLayout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel10)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(idos))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, painelNovaOSLayout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(painelNovaOSLayout.createSequentialGroup()
                        .addGap(190, 190, 190)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(painelNovaOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9))))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        painelNovaOSLayout.setVerticalGroup(
            painelNovaOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelNovaOSLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(painelNovaOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addGroup(painelNovaOSLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addGroup(painelNovaOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(Pago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(painelNovaOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel10)
                    .addComponent(idos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(painelNovaOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtResp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(painelNovaOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btEmitir)
                    .addComponent(btSair))
                .addGap(24, 24, 24))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelNovaOS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelNovaOS, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtProdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtProdActionPerformed

    private void btEmitirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEmitirActionPerformed
        emitir_os();
        this.dispose();
    }//GEN-LAST:event_btEmitirActionPerformed

    private void idosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idosActionPerformed

    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairActionPerformed
     this.dispose();
    }//GEN-LAST:event_btSairActionPerformed

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
            java.util.logging.Logger.getLogger(NovaOS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NovaOS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NovaOS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NovaOS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NovaOS().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Pago;
    private javax.swing.JButton btEmitir;
    private javax.swing.JButton btSair;
    private javax.swing.JTextField idos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel painelNovaOS;
    private javax.swing.JTextField txtCliente;
    private javax.swing.JFormattedTextField txtData;
    private javax.swing.JTextField txtPreco;
    private javax.swing.JTextField txtProd;
    private javax.swing.JTextField txtResp;
    // End of variables declaration//GEN-END:variables
}
