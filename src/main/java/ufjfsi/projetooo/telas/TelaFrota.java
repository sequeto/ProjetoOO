/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufjfsi.projetooo.telas;

import static classes.utils.frota;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 * Grupo: Nome - Matrícula: 
 * Milles Joseph Magalhães - 20177626 
 * Joan Gustavo Melo Fortes – 201435005 
 * Guilherme Soares Frias – 201535042 
 * João Pedro Sequeto Nascimento – 201776022
 */
public class TelaFrota extends javax.swing.JFrame {

    /**
     * Creates new form TelaFrota
     */
    public TelaFrota() {
        initComponents();
        DefaultListModel lista = new DefaultListModel();
        DefaultListModel lista2 = new DefaultListModel();
        for (int i = 0; i < frota.size(); i++) {
            lista.addElement(frota.get(i).getModelo());
            lista2.addElement(i);

        }
        jListListaVeic.setModel(lista);
        jListID.setModel(lista2);
        if (frota.isEmpty()) {
            jButtonExcluirVeic.setEnabled(false);

        } else {
            jButtonExcluirVeic.setEnabled(true);
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

        jPanelListVeic = new javax.swing.JPanel();
        jScrollPaneListaDeCarros = new javax.swing.JScrollPane();
        jListListaVeic = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        jPanelAcoesVeic = new javax.swing.JPanel();
        jButtonCadastrarVeic = new javax.swing.JButton();
        jButtonExcluirVeic = new javax.swing.JButton();
        jButtonVoltarFrota = new javax.swing.JButton();
        jButtonVerCarro = new javax.swing.JButton();
        label2 = new java.awt.Label();
        jScrollPane2 = new javax.swing.JScrollPane();
        jListID = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jListListaVeic.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPaneListaDeCarros.setViewportView(jListListaVeic);

        jLabel1.setText("Carros:");

        javax.swing.GroupLayout jPanelListVeicLayout = new javax.swing.GroupLayout(jPanelListVeic);
        jPanelListVeic.setLayout(jPanelListVeicLayout);
        jPanelListVeicLayout.setHorizontalGroup(
            jPanelListVeicLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelListVeicLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelListVeicLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPaneListaDeCarros, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelListVeicLayout.setVerticalGroup(
            jPanelListVeicLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelListVeicLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPaneListaDeCarros, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jButtonCadastrarVeic.setText("Cadastrar");
        jButtonCadastrarVeic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadastrarVeicActionPerformed(evt);
            }
        });

        jButtonExcluirVeic.setText("Excluir");
        jButtonExcluirVeic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirVeicActionPerformed(evt);
            }
        });

        jButtonVoltarFrota.setText("Voltar");
        jButtonVoltarFrota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVoltarFrotaActionPerformed(evt);
            }
        });

        jButtonVerCarro.setText("Ver Carro");
        jButtonVerCarro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVerCarroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelAcoesVeicLayout = new javax.swing.GroupLayout(jPanelAcoesVeic);
        jPanelAcoesVeic.setLayout(jPanelAcoesVeicLayout);
        jPanelAcoesVeicLayout.setHorizontalGroup(
            jPanelAcoesVeicLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanelAcoesVeicLayout.createSequentialGroup()
                .addGap(0, 18, Short.MAX_VALUE)
                .addGroup(jPanelAcoesVeicLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelAcoesVeicLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jButtonExcluirVeic, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonCadastrarVeic, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE))
                    .addComponent(jButtonVoltarFrota, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonVerCarro, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanelAcoesVeicLayout.setVerticalGroup(
            jPanelAcoesVeicLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAcoesVeicLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonCadastrarVeic, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonExcluirVeic)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonVerCarro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonVoltarFrota)
                .addGap(25, 25, 25))
        );

        label2.setText("ID");

        jListID.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(jListID);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelListVeic, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(jPanelAcoesVeic, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanelListVeic, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelAcoesVeic, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCadastrarVeicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadastrarVeicActionPerformed
        TelaCadastroVeiculo telaCadV = new TelaCadastroVeiculo();
        telaCadV.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        telaCadV.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonCadastrarVeicActionPerformed

    private void jButtonExcluirVeicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirVeicActionPerformed
        frota.remove(Integer.parseInt(JOptionPane.showInputDialog(null, "digite o ID do Veículo a ser removido: ")));
        TelaFrota telaF = new TelaFrota();
        telaF.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        telaF.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonExcluirVeicActionPerformed

    private void jButtonVoltarFrotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoltarFrotaActionPerformed
        TelaAdmin t = new TelaAdmin();
        t.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        t.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonVoltarFrotaActionPerformed

    private void jButtonVerCarroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVerCarroActionPerformed

        TelaVerVeiculo telaCadV = new TelaVerVeiculo();
        telaCadV.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        telaCadV.setVisible(true);

        dispose();
    }//GEN-LAST:event_jButtonVerCarroActionPerformed

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
            java.util.logging.Logger.getLogger(TelaFrota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaFrota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaFrota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaFrota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaFrota().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCadastrarVeic;
    private javax.swing.JButton jButtonExcluirVeic;
    private javax.swing.JButton jButtonVerCarro;
    private javax.swing.JButton jButtonVoltarFrota;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JList<String> jListID;
    private javax.swing.JList<String> jListListaVeic;
    private javax.swing.JPanel jPanelAcoesVeic;
    private javax.swing.JPanel jPanelListVeic;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPaneListaDeCarros;
    private java.awt.Label label2;
    // End of variables declaration//GEN-END:variables
}
