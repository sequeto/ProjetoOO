/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufjfsi.projetooo.telas;

/**
 * Grupo: 
    * Nome - Matrícula:
    * Milles Joseph Magalhães - 20177626
    * Joan Gustavo Melo Fortes – 201435005
    * Guilherme Soares Frias – 201535042
    * João Pedro Sequeto Nascimento – 201776022
 */
public class TelaCadastroFuncionario extends javax.swing.JFrame {
    QuadroFuncionario quadrof = new QuadroFuncionario();

    /**
     * Creates new form TelaCadastroFuncionário
     */
    public TelaCadastroFuncionario() {
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

        jTextFieldNomeF = new javax.swing.JTextField();
        jTextFieldCpfF = new javax.swing.JTextField();
        jTextFieldLoginF = new javax.swing.JTextField();
        jTextFieldSenhaF = new javax.swing.JTextField();
        jTextFieldConfirmSenha = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldIdF = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jButtonCadastraF = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jComboBoxAdmF = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextFieldNomeF.setText("Digite seu nome");
        jTextFieldNomeF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNomeFActionPerformed(evt);
            }
        });

        jTextFieldCpfF.setText("Digite seu CPF");
        jTextFieldCpfF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCpfFActionPerformed(evt);
            }
        });

        jTextFieldLoginF.setText("Digite seu Login");
        jTextFieldLoginF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldLoginFActionPerformed(evt);
            }
        });

        jTextFieldSenhaF.setText("Digite sua senha");
        jTextFieldSenhaF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldSenhaFActionPerformed(evt);
            }
        });

        jTextFieldConfirmSenha.setText("Confirme a senha acima");

        jLabel1.setText("Nome:");

        jLabel2.setText("CPF:");

        jLabel4.setText("Senha:");

        jLabel3.setText("Login:");

        jLabel5.setText("Confirmar Senha:");

        jLabel6.setText("Tipo:");

        jLabel7.setText("Identificação");

        jTextFieldIdF.setText("Digite sua Identificação");

        jLabel8.setText("Preencha os dados cadastrais:");

        jButtonCadastraF.setText("Adicionar");
        jButtonCadastraF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadastraFActionPerformed(evt);
            }
        });

        jButton2.setText("Cancelar");

        jComboBoxAdmF.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin", "Funcionario" }));
        jComboBoxAdmF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxAdmFActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextFieldCpfF)
                    .addComponent(jTextFieldLoginF)
                    .addComponent(jTextFieldSenhaF)
                    .addComponent(jTextFieldConfirmSenha, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                    .addComponent(jComboBoxAdmF, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextFieldNomeF)
                    .addComponent(jTextFieldIdF))
                .addContainerGap(67, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addGap(90, 90, 90))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonCadastraF)
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextFieldNomeF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldCpfF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldLoginF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldSenhaF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldConfirmSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jComboBoxAdmF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldIdF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonCadastraF)
                    .addComponent(jButton2))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldNomeFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNomeFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNomeFActionPerformed

    private void jButtonCadastraFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadastraFActionPerformed
        // TODO add your handling code here:
        if (((String)jComboBoxTipoPessoa.getSelectedItem()).equals("Admin"))
        {
            if(jTextFieldSenhaF.getText().equals(jTextFieldConfirmSenha.getText()))
            {
                Administrador admin = new Administrador();
                admin.setNome(jTextFieldNomeF.getText());
                admin.setCPF(jTextFieldCpfF.getText());
                admin.setLogin(jTextFieldLoginF.getText());
                admin.setSenha(jTextFieldSenhaF.getText());
                admin.setId(jTextFieldIdF.getText());
                quadrof.cadastraAdmin(admin);
            }
            
        }
        
        else
        {
            if(jTextFieldSenhaF.getText().equals(jTextFieldConfirmSenha.getText()))
            {
                Funcionario funcionario = new Funcionario();
                funcionario.setNome(jTextFieldNomeF.getText());
                funcionario.setCPF(jTextFieldCpfF.getText());
                funcionario.setLogin(jTextFieldLoginF.getText());
                funcionario.setSenha(jTextFieldSenhaF.getText());
                funcionario.setId(jTextFieldIdF.getText());
                quadrof.cadastraFuncionario(funcionario);
            }
        }
        
    }//GEN-LAST:event_jButtonCadastraFActionPerformed

    private void jTextFieldSenhaFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldSenhaFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldSenhaFActionPerformed

    private void jComboBoxAdmFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxAdmFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxAdmFActionPerformed

    private void jTextFieldCpfFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCpfFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCpfFActionPerformed

    private void jTextFieldLoginFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldLoginFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldLoginFActionPerformed

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
            java.util.logging.Logger.getLogger(TelaCadastroFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastroFuncionario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButtonCadastraF;
    private javax.swing.JComboBox<String> jComboBoxAdmF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField jTextFieldConfirmSenha;
    private javax.swing.JTextField jTextFieldCpfF;
    private javax.swing.JTextField jTextFieldIdF;
    private javax.swing.JTextField jTextFieldLoginF;
    private javax.swing.JTextField jTextFieldNomeF;
    private javax.swing.JTextField jTextFieldSenhaF;
    // End of variables declaration//GEN-END:variables
}
