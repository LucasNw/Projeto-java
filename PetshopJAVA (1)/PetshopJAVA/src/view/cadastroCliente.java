package view;

import controller.ClienteController;
import javax.swing.table.DefaultTableModel;
import model.bean.Cliente;

public class cadastroCliente extends javax.swing.JFrame {

    ClienteController clienteController = new ClienteController();

    public cadastroCliente() {
        initComponents();
        DefaultTableModel tableClientes = (DefaultTableModel) jTablecadCliente.getModel();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldNomCliente = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldEnderecoCliente = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldEmail = new javax.swing.JTextField();
        jFormattedTelefone = new javax.swing.JFormattedTextField();
        jButtonCadCliente = new javax.swing.JButton();
        jButtonremCliente = new javax.swing.JButton();
        jButtonattCliente = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablecadCliente = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jFormattedcpf = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Funcionario");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Georgia", 1, 24)); // NOI18N
        jLabel6.setText("Cadstro cliente:");

        jLabel1.setText("Nome:");

        jLabel2.setText("Telefone:");

        jLabel3.setText("Endereço:");

        jLabel4.setText("E-mail");

        try {
            jFormattedTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jButtonCadCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/add.png"))); // NOI18N
        jButtonCadCliente.setText("Cadastrar");
        jButtonCadCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadClienteActionPerformed(evt);
            }
        });

        jButtonremCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/delete.png"))); // NOI18N
        jButtonremCliente.setText("Remover");
        jButtonremCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonremClienteActionPerformed(evt);
            }
        });

        jButtonattCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/atualizar.png"))); // NOI18N
        jButtonattCliente.setText("Atualizar");
        jButtonattCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonattClienteActionPerformed(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cliente.png"))); // NOI18N

        jTablecadCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "Telefone", "E-mail", "Endereço", "CPF"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTablecadCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTablecadClienteMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTablecadCliente);

        jLabel7.setText("CPF:");

        try {
            jFormattedcpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
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
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel1)
                            .addComponent(jLabel5)
                            .addComponent(jLabel3))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel2)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jFormattedTelefone, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                                .addComponent(jTextFieldEmail, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTextFieldEnderecoCliente, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTextFieldNomCliente, javax.swing.GroupLayout.Alignment.LEADING))
                            .addComponent(jLabel4)
                            .addComponent(jFormattedcpf, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 306, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButtonCadCliente)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonattCliente)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonremCliente))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(66, 66, 66))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextFieldNomCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jFormattedTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addGap(11, 11, 11)
                        .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldEnderecoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(jFormattedcpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonattCliente)
                            .addComponent(jButtonremCliente)
                            .addComponent(jButtonCadCliente))))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCadClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadClienteActionPerformed

        clienteController.create(jTextFieldNomCliente.getText(),
                jFormattedTelefone.getText(),
                jTextFieldEmail.getText(),
                jTextFieldEnderecoCliente.getText(),
                jFormattedcpf.getText());

        lerClientes();
        limpaCampos();

    }//GEN-LAST:event_jButtonCadClienteActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        this.lerClientes();
    }//GEN-LAST:event_formWindowOpened

    private void jButtonattClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonattClienteActionPerformed

        if (jTablecadCliente.getSelectedRow() != -1) {
            clienteController.update((int) jTablecadCliente.getValueAt(jTablecadCliente.getSelectedRow(), 0),
                    jTextFieldNomCliente.getText(), jFormattedTelefone.getText(), jTextFieldEmail.getText(), jTextFieldEnderecoCliente.getText(),
                    jFormattedcpf.getText());

            this.lerClientes();
            this.limpaCampos();
        }


    }//GEN-LAST:event_jButtonattClienteActionPerformed

    private void jTablecadClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTablecadClienteMouseClicked
        if (jTablecadCliente.getSelectedRow() != -1) {
            jTextFieldNomCliente.setText(jTablecadCliente.getValueAt(jTablecadCliente.getSelectedRow(), 1).toString());
            jFormattedTelefone.setText(jTablecadCliente.getValueAt(jTablecadCliente.getSelectedRow(), 2).toString());
            jTextFieldEmail.setText(jTablecadCliente.getValueAt(jTablecadCliente.getSelectedRow(), 3).toString());
            jTextFieldEnderecoCliente.setText(jTablecadCliente.getValueAt(jTablecadCliente.getSelectedRow(), 4).toString());
            jFormattedcpf.setText(jTablecadCliente.getValueAt(jTablecadCliente.getSelectedRow(), 5).toString());
        }
    }//GEN-LAST:event_jTablecadClienteMouseClicked

    private void jButtonremClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonremClienteActionPerformed
        if (jTablecadCliente.getSelectedRow() != -1) {
            clienteController.delete((int) jTablecadCliente.getValueAt(jTablecadCliente.getSelectedRow(), 0));
            lerClientes();
            limpaCampos();
        }
    }//GEN-LAST:event_jButtonremClienteActionPerformed

    public void lerClientes() {

        DefaultTableModel tableClientes = (DefaultTableModel) jTablecadCliente.getModel();
        tableClientes.setNumRows(0);

        for (Cliente c : clienteController.read()) {

            tableClientes.addRow(new Object[]{
                c.getIdcliente(),
                c.getNome(),
                c.getTelefone(),
                c.getEmail(),
                c.getEndereco(),
                c.getCpf()

            });
        }
    }

    public void limpaCampos() {

        jTextFieldNomCliente.setText("");
        jFormattedTelefone.setText("");
        jTextFieldEnderecoCliente.setText("");
        jTextFieldEmail.setText("");
        jFormattedcpf.setText("");
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
            java.util.logging.Logger.getLogger(cadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(cadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(cadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(cadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new cadastroCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCadCliente;
    private javax.swing.JButton jButtonattCliente;
    private javax.swing.JButton jButtonremCliente;
    private javax.swing.JFormattedTextField jFormattedTelefone;
    private javax.swing.JFormattedTextField jFormattedcpf;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTablecadCliente;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldEnderecoCliente;
    private javax.swing.JTextField jTextFieldNomCliente;
    // End of variables declaration//GEN-END:variables
}
