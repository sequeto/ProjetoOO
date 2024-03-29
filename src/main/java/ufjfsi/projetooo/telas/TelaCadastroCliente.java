/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufjfsi.projetooo.telas;

import classes.ClienteFisico;
import classes.ClienteJuridico;
import static classes.utils.clientesFis;
import javax.swing.JFrame;

/**
 * Grupo: Nome - Matrícula: 
 * Milles Joseph Magalhães - 20177626 
 * Joan Gustavo Melo Fortes – 201435005 
 * Guilherme Soares Frias – 201535042 
 * João Pedro Sequeto Nascimento – 201776022
 */
public class TelaCadastroCliente extends javax.swing.JFrame {

    /**
     * Creates new form TelaCadastroCliente
     */
    public TelaCadastroCliente() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldNomeC = new javax.swing.JTextField();
        jTextFieldTelefoneC = new javax.swing.JTextField();
        jTextFieldCpfCnpj = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jComboBoxTipoPessoa = new javax.swing.JComboBox<>();
        jButtonCadastra = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Nome:");

        jLabel2.setText("Telefone:");

        jLabel3.setText("CPF/CNPJ:");

        jTextFieldNomeC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextFieldNomeCMouseClicked(evt);
            }
        });
        jTextFieldNomeC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNomeCActionPerformed(evt);
            }
        });

        jTextFieldTelefoneC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextFieldTelefoneCMouseClicked(evt);
            }
        });
        jTextFieldTelefoneC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldTelefoneCActionPerformed(evt);
            }
        });

        jTextFieldCpfCnpj.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextFieldCpfCnpjMouseClicked(evt);
            }
        });
        jTextFieldCpfCnpj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCpfCnpjActionPerformed(evt);
            }
        });

        jLabel4.setText("Tipo de Pessoa:");

        jComboBoxTipoPessoa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pessoa Física", "Pessoa Juridica" }));
        jComboBoxTipoPessoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxTipoPessoaActionPerformed(evt);
            }
        });

        jButtonCadastra.setText("Cadastrar");
        jButtonCadastra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadastraActionPerformed(evt);
            }
        });

        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });

        jLabel5.setText("Preencha os dados cadastrais:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(34, 34, 34)
                            .addComponent(jLabel3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jTextFieldCpfCnpj, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(40, 40, 40)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel1)
                                .addComponent(jLabel2))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jTextFieldNomeC)
                                .addComponent(jTextFieldTelefoneC, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jButtonCancelar)
                                .addComponent(jLabel4))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jComboBoxTipoPessoa, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(0, 0, Short.MAX_VALUE)
                                    .addComponent(jButtonCadastra)))))
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(74, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextFieldNomeC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldTelefoneC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextFieldCpfCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jComboBoxTipoPessoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonCancelar)
                    .addComponent(jButtonCadastra))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jTextFieldNomeCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNomeCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNomeCActionPerformed

    private void jComboBoxTipoPessoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxTipoPessoaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxTipoPessoaActionPerformed

    private void jButtonCadastraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadastraActionPerformed
        // TODO add your handling code here:
        if (((String) jComboBoxTipoPessoa.getSelectedItem()).equals("Pessoa Física")) {
            ClienteFisico cliente = new ClienteFisico();
            cliente.setNome(jTextFieldNomeC.getText());
            cliente.setTelefone(jTextFieldTelefoneC.getText());
            cliente.setCPF(jTextFieldCpfCnpj.getText());
            clientesFis.add(cliente);
            TelalistaClientes telaC = new TelalistaClientes();
            telaC.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            telaC.setVisible(true);
            dispose();
        } else {
            ClienteJuridico cliente = new ClienteJuridico();

            cliente.setNome(jTextFieldNomeC.getText());
            cliente.setTelefone(jTextFieldTelefoneC.getText());
            cliente.setCNPJ(jTextFieldCpfCnpj.getText());

            dispose();
        }


    }//GEN-LAST:event_jButtonCadastraActionPerformed

    private void jTextFieldTelefoneCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldTelefoneCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldTelefoneCActionPerformed

    private void jTextFieldCpfCnpjActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCpfCnpjActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCpfCnpjActionPerformed

    private void jTextFieldNomeCMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextFieldNomeCMouseClicked
    
    }//GEN-LAST:event_jTextFieldNomeCMouseClicked

    private void jTextFieldTelefoneCMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextFieldTelefoneCMouseClicked
      
    }//GEN-LAST:event_jTextFieldTelefoneCMouseClicked

    private void jTextFieldCpfCnpjMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextFieldCpfCnpjMouseClicked
       
    }//GEN-LAST:event_jTextFieldCpfCnpjMouseClicked

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
            java.util.logging.Logger.getLogger(TelaCadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastroCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCadastra;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JComboBox<String> jComboBoxTipoPessoa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField jTextFieldCpfCnpj;
    private javax.swing.JTextField jTextFieldNomeC;
    private javax.swing.JTextField jTextFieldTelefoneC;
    // End of variables declaration//GEN-END:variables
}
