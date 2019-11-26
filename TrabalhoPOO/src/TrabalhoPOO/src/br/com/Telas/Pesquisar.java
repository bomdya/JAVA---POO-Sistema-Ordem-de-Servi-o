/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TrabalhoPOO.src.br.com.Telas;

import TrabalhoPOO.src.br.com.DataAccess.Conexao;
import java.awt.Rectangle;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author Adrielle
 */
public class Pesquisar extends javax.swing.JFrame {
      Connection conexao = null;
    PreparedStatement pst = null;
    ResultSet rs = null;

    /**
     * Creates new form TelaPequisar
     */
    public Pesquisar() {
        initComponents();
        conexao = Conexao.conector();
    }

    
      
    
     private void pesquisar_os() {
        String sql = "SELECT * FROM ordemservico where nomeprod=?";
        try {
            pst = conexao.prepareStatement(sql);
            pst.setString(1, txtPesquisar.getText());
            rs = pst.executeQuery();
            if (rs.next()) {
                txtProd.setText(rs.getString(1));
                txtCliente.setText(rs.getString(2));
                txtResp.setText(rs.getString(3));
                txtPreco.setText(rs.getString(4));
                Pago.setSelectedItem(rs.getString(5));
                txtData.setText(rs.getString(5));
                txtPesquisar.setText(rs.getString(5));
            } else {
                JOptionPane.showMessageDialog(null, "Usuário não encontrado");
                txtProd.setText(null);
                txtCliente.setText(null);
                txtResp.setText(null);
                txtPreco.setText(null);
                Pago.setSelectedItem(null);
                txtData.setText(null);
                txtPesquisar.setText(null);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    
        private void setar_campos(){    
        int setar = table.getSelectedRow();
        String sql = "SELECT * FROM ordemservico where nomeprod=?";
        
        txtProd.setText(table.getModel().getValueAt(setar, 0).toString());
        txtCliente.setText(table.getModel().getValueAt(setar, 1).toString());
        txtResp.setText(table.getModel().getValueAt(setar, 2).toString());
        txtPreco.setText(table.getModel().getValueAt(setar, 3).toString());
        Pago.setSelectedItem(table.getModel().getValueAt(setar, 4).toString());
        idos.setText(table.getModel().getValueAt(setar, 5).toString());
     
    }
        
  private void editar(){
             String sql = "UPDATE ordemservico SET nomeprod=?, nomecliente=?, resp=?, preco=?, pago=?, data=? WHERE id=?";
        
        try{
            pst= conexao.prepareStatement(sql);
            pst.setString(1, txtProd.getText().toString());
            pst.setString(2, txtCliente.getText().toString());
            pst.setString(3,txtResp.getText());
            pst.setString(4,txtPreco.getText());
            pst.setString(5, Pago.getSelectedItem().toString());
            pst.setString(6, txtData.getText());
            pst.setString(7, txtPesquisar.getText());
            rs = pst.executeQuery();
            
              
                int atualizado = pst.executeUpdate();
                if (atualizado > 0 ){
                    JOptionPane.showMessageDialog(null, "Dados da Ordem de Serviço alterados com sucesso!");
                     txtProd.getText().toString();
                     txtCliente.getText().toString();
                     txtResp.setText(null);
                     txtPreco.setText(null);
                     Pago.getSelectedItem().toString();
                     txtData.getText().toString();
                     
                }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
   }     
      
      
       private void excluir(){
        int confirmar = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja remover esta Ordem de Serviço", "Atenção", JOptionPane.YES_NO_OPTION);
       if (confirmar == JOptionPane.YES_OPTION) {
           String sql = "DELETE FROM ordemservico WHERE id=?";
           try{
        pst = conexao.prepareStatement(sql);
        pst.setString(1, idos.getText());
        int apagado = pst.executeUpdate();
        
        if(apagado > 0) {
            JOptionPane.showMessageDialog(null, "Ordem de Serviço removida com sucesso!");
            txtProd.getText().toString();
            txtCliente.getText().toString();
            txtResp.setText(null);
            txtPreco.setText(null);
            Pago.getSelectedItem().toString();
            txtData.getText().toString();
        }
     }catch (Exception e){
         JOptionPane.showMessageDialog(null, e);
         
    }
           
       }
       }
       
       
       
       
       
       
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btEditar1 = new javax.swing.JButton();
        pesquisa = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        btPesquisa = new javax.swing.JButton();
        btEditar = new javax.swing.JButton();
        lblresponsavel = new javax.swing.JLabel();
        txtPreco = new javax.swing.JTextField();
        txtResp = new javax.swing.JTextField();
        lblpag = new javax.swing.JLabel();
        lbldata = new javax.swing.JLabel();
        lblprod = new javax.swing.JLabel();
        txtData = new javax.swing.JTextField();
        txtProd = new javax.swing.JTextField();
        lblcliente = new javax.swing.JLabel();
        txtCliente = new javax.swing.JTextField();
        lblpreco = new javax.swing.JLabel();
        Pago = new javax.swing.JComboBox<>();
        btFechar = new javax.swing.JButton();
        btExcluir = new javax.swing.JButton();
        lblid = new javax.swing.JLabel();
        idos = new javax.swing.JTextField();
        txtPesquisar = new javax.swing.JTextField();
        btAtualizar = new javax.swing.JButton();

        btEditar1.setBackground(new java.awt.Color(180, 255, 153));
        btEditar1.setText("Editar");
        btEditar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEditar1ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        pesquisa.setBackground(new java.awt.Color(227, 227, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(136, 136, 225));
        jLabel1.setText("Nome da OS");

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null,  new Boolean(false), null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Produto", "Cliente", "Responsável", "Preço", "Pagamento", "Data"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class, java.lang.String.class, java.lang.Integer.class, java.lang.Boolean.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                true, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tableMouseEntered(evt);
            }
        });
        jScrollPane1.setViewportView(table);

        btPesquisa.setBackground(new java.awt.Color(153, 153, 255));
        btPesquisa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TrabalhoPOO/src/br/com/Img/search.png"))); // NOI18N
        btPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPesquisaActionPerformed(evt);
            }
        });

        btEditar.setBackground(new java.awt.Color(180, 255, 153));
        btEditar.setText("Editar");
        btEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEditarActionPerformed(evt);
            }
        });

        lblresponsavel.setText("Responsável:");

        lblpag.setText("Pagamento:");

        lbldata.setText("Data:");

        lblprod.setText("Produto:");

        txtProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtProdActionPerformed(evt);
            }
        });

        lblcliente.setText("Cliente:");

        lblpreco.setText("Preço:");

        Pago.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pago", "Aberto" }));

        btFechar.setBackground(new java.awt.Color(255, 187, 153));
        btFechar.setText("Fechar");
        btFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btFecharActionPerformed(evt);
            }
        });

        btExcluir.setBackground(new java.awt.Color(255, 153, 153));
        btExcluir.setText("Excluir");
        btExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirActionPerformed(evt);
            }
        });

        lblid.setText("id:");

        idos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idosActionPerformed(evt);
            }
        });

        txtPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPesquisarActionPerformed(evt);
            }
        });

        btAtualizar.setBackground(new java.awt.Color(153, 173, 255));
        btAtualizar.setText("Atualizar");
        btAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAtualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pesquisaLayout = new javax.swing.GroupLayout(pesquisa);
        pesquisa.setLayout(pesquisaLayout);
        pesquisaLayout.setHorizontalGroup(
            pesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pesquisaLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(pesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pesquisaLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(pesquisaLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtPesquisar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(idos, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblid)))
                    .addGroup(pesquisaLayout.createSequentialGroup()
                        .addGroup(pesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblprod)
                            .addComponent(txtProd, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(pesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblpag)
                            .addComponent(Pago, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pesquisaLayout.createSequentialGroup()
                        .addGroup(pesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblcliente, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pesquisaLayout.createSequentialGroup()
                                .addComponent(btExcluir)
                                .addGap(39, 39, 39)
                                .addComponent(btAtualizar)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(pesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pesquisaLayout.createSequentialGroup()
                                .addComponent(btEditar)
                                .addGap(47, 47, 47)
                                .addComponent(btFechar))
                            .addComponent(lbldata, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(pesquisaLayout.createSequentialGroup()
                        .addGroup(pesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtCliente)
                            .addComponent(txtResp, javax.swing.GroupLayout.DEFAULT_SIZE, 255, Short.MAX_VALUE)
                            .addComponent(lblresponsavel, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(33, 33, 33)
                        .addGroup(pesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblpreco)
                                .addComponent(txtPreco))
                            .addComponent(txtData, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(69, 69, 69))
        );
        pesquisaLayout.setVerticalGroup(
            pesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pesquisaLayout.createSequentialGroup()
                .addGroup(pesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pesquisaLayout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(pesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pesquisaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btPesquisa)
                            .addGroup(pesquisaLayout.createSequentialGroup()
                                .addComponent(lblid)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(idos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)))
                .addGroup(pesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pesquisaLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblprod)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pesquisaLayout.createSequentialGroup()
                        .addComponent(lblpag)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Pago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblcliente)
                    .addComponent(lbldata, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblresponsavel)
                    .addComponent(lblpreco))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtResp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(pesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btEditar)
                    .addComponent(btExcluir)
                    .addComponent(btAtualizar)
                    .addComponent(btFechar))
                .addGap(48, 48, 48))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pesquisa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pesquisa, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
     
    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        setar_campos();
    }//GEN-LAST:event_tableMouseClicked

    private void tableMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseEntered

    }//GEN-LAST:event_tableMouseEntered

    private void btPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPesquisaActionPerformed

    }//GEN-LAST:event_btPesquisaActionPerformed

    private void btEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditarActionPerformed
        editar();
       
        
    }//GEN-LAST:event_btEditarActionPerformed

    private void txtProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtProdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtProdActionPerformed

    private void btFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btFecharActionPerformed
        int confirmar = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja sair?", "Atenção", JOptionPane.YES_NO_OPTION);
        this.dispose();
    }//GEN-LAST:event_btFecharActionPerformed

    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirActionPerformed
        excluir();
    }//GEN-LAST:event_btExcluirActionPerformed

    private void idosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idosActionPerformed

    private void txtPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPesquisarActionPerformed
        pesquisar_os();
    }//GEN-LAST:event_txtPesquisarActionPerformed

    private void btEditar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btEditar1ActionPerformed

    private void btAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAtualizarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btAtualizarActionPerformed

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
            java.util.logging.Logger.getLogger(Pesquisar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pesquisar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pesquisar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pesquisar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pesquisar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Pago;
    private javax.swing.JButton btAtualizar;
    private javax.swing.JButton btEditar;
    private javax.swing.JButton btEditar1;
    private javax.swing.JButton btExcluir;
    private javax.swing.JButton btFechar;
    private javax.swing.JButton btPesquisa;
    private javax.swing.JTextField idos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblcliente;
    private javax.swing.JLabel lbldata;
    private javax.swing.JLabel lblid;
    private javax.swing.JLabel lblpag;
    private javax.swing.JLabel lblpreco;
    private javax.swing.JLabel lblprod;
    private javax.swing.JLabel lblresponsavel;
    private javax.swing.JPanel pesquisa;
    private javax.swing.JTable table;
    private javax.swing.JTextField txtCliente;
    private javax.swing.JTextField txtData;
    private javax.swing.JTextField txtPesquisar;
    private javax.swing.JTextField txtPreco;
    private javax.swing.JTextField txtProd;
    private javax.swing.JTextField txtResp;
    // End of variables declaration//GEN-END:variables

    
}
