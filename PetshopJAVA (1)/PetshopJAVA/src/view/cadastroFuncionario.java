package view;

import controller.FuncionarioController;
import javax.swing.JFormattedTextField;
import javax.swing.table.DefaultTableModel;
import model.bean.Funcionario;
import model.bean.Funcionario;

public class cadastroFuncionario extends javax.swing.JFrame {

    FuncionarioController funcionarioController = new FuncionarioController();

    public cadastroFuncionario() {
        initComponents();
        DefaultTableModel tableModelFunc = (DefaultTableModel) jTableFuncionarios.getModel();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel8 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldnomeFunc = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldenderecoFunc = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldCargo = new javax.swing.JTextField();
        jButtonCadFuncionario = new javax.swing.JButton();
        jButtonremFuncionario = new javax.swing.JButton();
        jButtonattFuncionario = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableFuncionarios = new javax.swing.JTable();
        jFormattedcpf = new javax.swing.JFormattedTextField();
        jFormattedTelefone = new javax.swing.JFormattedTextField();

        jLabel8.setText("jLabel8");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Cliente");

        jLabel6.setFont(new java.awt.Font("Georgia", 1, 24)); // NOI18N
        jLabel6.setText("Cadstro Funcionário:");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/carteira-de-identidade.png"))); // NOI18N

        jLabel2.setText("Nome:");

        jLabel3.setText("Telefone:");

        jLabel4.setText("Endereço:");

        jLabel5.setText("CPF:");

        jLabel7.setText("Cargo:");

        jButtonCadFuncionario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/add.png"))); // NOI18N
        jButtonCadFuncionario.setText("Cadastrar");
        jButtonCadFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadFuncionarioActionPerformed(evt);
            }
        });

        jButtonremFuncionario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/delete.png"))); // NOI18N
        jButtonremFuncionario.setText("Remover");
        jButtonremFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonremFuncionarioActionPerformed(evt);
            }
        });

        jButtonattFuncionario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/atualizar.png"))); // NOI18N
        jButtonattFuncionario.setText("Atualizar");
        jButtonattFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonattFuncionarioActionPerformed(evt);
            }
        });

        jTableFuncionarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "Telefone", "Endereço", "CPF", "Cargo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableFuncionarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableFuncionariosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableFuncionarios);

        try {
            jFormattedcpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            jFormattedTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) # ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 123, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7)
                            .addComponent(jTextFieldCargo, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                            .addComponent(jTextFieldenderecoFunc)
                            .addComponent(jTextFieldnomeFunc)
                            .addComponent(jFormattedcpf)
                            .addComponent(jFormattedTelefone))
                        .addGap(211, 211, 211)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(78, 78, 78))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonCadFuncionario)
                .addGap(18, 18, 18)
                .addComponent(jButtonattFuncionario)
                .addGap(18, 18, 18)
                .addComponent(jButtonremFuncionario)
                .addGap(118, 118, 118))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldnomeFunc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(jFormattedTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldenderecoFunc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(jFormattedcpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldCargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonCadFuncionario)
                    .addComponent(jButtonremFuncionario)
                    .addComponent(jButtonattFuncionario))
                .addContainerGap(58, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCadFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadFuncionarioActionPerformed

        funcionarioController.create(jTextFieldnomeFunc.getText(),
                jFormattedTelefone.getText(),
                jTextFieldenderecoFunc.getText(),
                jFormattedcpf.getText(),
                jTextFieldCargo.getText());
        lerFun();
        limpaCampos();
    }//GEN-LAST:event_jButtonCadFuncionarioActionPerformed

    private void jButtonattFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonattFuncionarioActionPerformed
        if (jTableFuncionarios.getSelectedRow() != -1) {
            funcionarioController.update((int) jTableFuncionarios.getValueAt(jTableFuncionarios.getSelectedRow(), 0),
                    jTextFieldnomeFunc.getText(), jFormattedTelefone.getText(), jTextFieldenderecoFunc.getText(),
                    jFormattedcpf.getText(), jTextFieldCargo.getText());

            this.lerFun();
            this.limpaCampos();
        }

    }//GEN-LAST:event_jButtonattFuncionarioActionPerformed

    private void jButtonremFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonremFuncionarioActionPerformed
         if (jTableFuncionarios.getSelectedRow() != -1) {
            funcionarioController.delete((int) jTableFuncionarios.getValueAt(jTableFuncionarios.getSelectedRow(), 0));
            lerFun();
            limpaCampos();
        }
    }//GEN-LAST:event_jButtonremFuncionarioActionPerformed

    private void jTableFuncionariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableFuncionariosMouseClicked
         if (jTableFuncionarios.getSelectedRow() != -1) {
            jTextFieldnomeFunc.setText(jTableFuncionarios.getValueAt(jTableFuncionarios.getSelectedRow(), 1).toString());
            jFormattedTelefone.setText(jTableFuncionarios.getValueAt(jTableFuncionarios.getSelectedRow(), 2).toString());           
            jTextFieldenderecoFunc.setText(jTableFuncionarios.getValueAt(jTableFuncionarios.getSelectedRow(), 3).toString());
            jFormattedcpf.setText(jTableFuncionarios.getValueAt(jTableFuncionarios.getSelectedRow(), 4).toString());
             jTextFieldCargo.setText(jTableFuncionarios.getValueAt(jTableFuncionarios.getSelectedRow(), 5).toString());
        }
    }//GEN-LAST:event_jTableFuncionariosMouseClicked

    public void lerFun() {

        DefaultTableModel tableModelFunc = (DefaultTableModel) jTableFuncionarios.getModel();
        tableModelFunc.setNumRows(0);

        for (Funcionario c : funcionarioController.read()) {

            tableModelFunc.addRow(new Object[]{
                c.getIdfuncionario(),
                c.getNome(),
                c.getTelefone(),
                c.getEndereco(),
                c.getCpf(),
                c.getCargo()

            });
        }
    }

    public void limpaCampos() {

        jTextFieldnomeFunc.setText("");
        jFormattedTelefone.setText("");
        jTextFieldenderecoFunc.setText("");
        jFormattedcpf.setText("");
        jTextFieldCargo.setText("");
    }

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
            java.util.logging.Logger.getLogger(cadastroFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(cadastroFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(cadastroFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(cadastroFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new cadastroFuncionario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCadFuncionario;
    private javax.swing.JButton jButtonattFuncionario;
    private javax.swing.JButton jButtonremFuncionario;
    private javax.swing.JFormattedTextField jFormattedTelefone;
    private javax.swing.JFormattedTextField jFormattedcpf;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableFuncionarios;
    private javax.swing.JTextField jTextFieldCargo;
    private javax.swing.JTextField jTextFieldenderecoFunc;
    private javax.swing.JTextField jTextFieldnomeFunc;
    // End of variables declaration//GEN-END:variables
}
