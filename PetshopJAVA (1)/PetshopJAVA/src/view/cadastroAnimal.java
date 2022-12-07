package view;

import controller.ClienteController;
import controller.AnimalController;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.bean.Cliente;
import model.bean.Animal;

public class cadastroAnimal extends javax.swing.JFrame {

    ClienteController clienteController = new ClienteController();
    AnimalController animalController = new AnimalController();

    public cadastroAnimal() {
        initComponents();
        DefaultTableModel tableAnimal = (DefaultTableModel) jTableAnimal.getModel();

    }

    public void ListaClientes() { //ira puxar o cliente para o combobox!!!
        ClienteController clienteController = new ClienteController();

        for (Cliente ce : clienteController.read()) {

            jComboBoxCliente.addItem(ce);
        }

    }

    public void ListaAnimal() {
        DefaultTableModel tableAnimal = (DefaultTableModel) jTableAnimal.getModel();
        tableAnimal.setNumRows(0);

        for (Animal a : animalController.read()) {

            tableAnimal.addRow(new Object[]{
                a.getIdanimal(),
                a.getNome(),
                a.getRaca(),
                a.getIdade(),
                a.getObservacoes(),
                a.getCarteira_vac(),
                a.getCliente().getNome()});
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldNomeAnimal = new javax.swing.JTextField();
        jTextFieldRaca = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldIdadae = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldObs = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jFormattedVac = new javax.swing.JFormattedTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableAnimal = new javax.swing.JTable();
        jComboBoxCliente = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jButtonCadastraAnimal = new javax.swing.JButton();
        jButtonattAnimal = new javax.swing.JButton();
        jButtonremAnimal = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro Animal");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Georgia", 1, 24)); // NOI18N
        jLabel6.setText("Cadstro Animal:");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/forma-da-pata-preta.png"))); // NOI18N

        jLabel2.setText("Nome:");

        jLabel3.setText("Raça::");

        jLabel4.setText("Idade");

        jLabel5.setText("Observações:");

        jLabel7.setText("Carteira de Vacina");

        try {
            jFormattedVac.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jTableAnimal.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "Raça", "Idade", "Observações", "Data Vacina"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableAnimal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableAnimalMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableAnimal);

        jLabel9.setText("Cliente");

        jButtonCadastraAnimal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/add.png"))); // NOI18N
        jButtonCadastraAnimal.setText("Cadastrar");
        jButtonCadastraAnimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadastraAnimalActionPerformed(evt);
            }
        });

        jButtonattAnimal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/atualizar.png"))); // NOI18N
        jButtonattAnimal.setText("Atualizar");
        jButtonattAnimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonattAnimalActionPerformed(evt);
            }
        });

        jButtonremAnimal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/delete.png"))); // NOI18N
        jButtonremAnimal.setText("Remover");
        jButtonremAnimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonremAnimalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(jButtonCadastraAnimal)
                .addGap(18, 18, 18)
                .addComponent(jButtonattAnimal)
                .addGap(18, 18, 18)
                .addComponent(jButtonremAnimal)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonCadastraAnimal)
                    .addComponent(jButtonattAnimal)
                    .addComponent(jButtonremAnimal))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel6)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jTextFieldRaca, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jFormattedVac, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                                        .addComponent(jTextFieldObs, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jTextFieldIdadae, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jTextFieldNomeAnimal, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel7))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel9)
                                    .addComponent(jComboBoxCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 498, Short.MAX_VALUE))))
                .addContainerGap(66, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldNomeAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBoxCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldRaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldIdadae, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldObs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jFormattedVac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCadastraAnimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadastraAnimalActionPerformed
        if (jComboBoxCliente.getSelectedItem() != null
                && !jTextFieldNomeAnimal.getText().equals("")//equals - comparando!!!
                && !jTextFieldRaca.getText().equals("")
                && !jTextFieldIdadae.getText().equals("")
                && !jTextFieldObs.getText().equals("")
                && !jFormattedVac.getText().equals("")) {

            Cliente cliente = (Cliente) jComboBoxCliente.getSelectedItem();

            if (animalController.create(jTextFieldNomeAnimal.getText(), jTextFieldRaca.getText(),
                    Integer.parseInt(jTextFieldIdadae.getText()), jTextFieldObs.getText(),
                    jFormattedVac.getText(), cliente)) {
                JOptionPane.showMessageDialog(this, "Animal cadastrado");
                jComboBoxCliente.setSelectedIndex(0);
                limpaCampos();
                ListaAnimal();

            } else {
                JOptionPane.showMessageDialog(this, "Não foi possivel cadastrar o animal", "Erro",
                        JOptionPane.ERROR_MESSAGE);
            }
        }


    }//GEN-LAST:event_jButtonCadastraAnimalActionPerformed

    private void jButtonattAnimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonattAnimalActionPerformed

        if (jTableAnimal.getSelectedRow() != -1 && jComboBoxCliente.getSelectedItem() != null) {
            Cliente cliente = (Cliente) jComboBoxCliente.getSelectedItem();
            animalController.update((int) jTableAnimal.getValueAt(jTableAnimal.getSelectedRow(), 0),
                    jTextFieldNomeAnimal.getText(), jTextFieldRaca.getText(), Integer.parseInt(jTextFieldIdadae.getText()),
                    jTextFieldObs.getText(), jFormattedVac.getText(), cliente);
            
            this.ListaAnimal();
            limpaCampos();

        }
    }//GEN-LAST:event_jButtonattAnimalActionPerformed

    private void jTableAnimalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableAnimalMouseClicked

        if (jTableAnimal.getSelectedRow() != -1) {
            jTextFieldNomeAnimal.setText(jTableAnimal.getValueAt(jTableAnimal.getSelectedRow(), 1).toString());
            jTextFieldRaca.setText(jTableAnimal.getValueAt(jTableAnimal.getSelectedRow(), 2).toString());
            jTextFieldIdadae.setText(jTableAnimal.getValueAt(jTableAnimal.getSelectedRow(), 3).toString());
            jTextFieldObs.setText(jTableAnimal.getValueAt(jTableAnimal.getSelectedRow(), 4).toString());
            jFormattedVac.setText(jTableAnimal.getValueAt(jTableAnimal.getSelectedRow(), 5).toString());

            for (int i = 0; i < jComboBoxCliente.getItemCount(); i++) {
                Cliente cliente = (Cliente) jComboBoxCliente.getItemAt(i);
                if (cliente.getNome().equals(cliente)) {

                    jComboBoxCliente.setSelectedIndex(i);
                }
            }

        }

    }//GEN-LAST:event_jTableAnimalMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        this.ListaAnimal();
        this.ListaClientes();
    }//GEN-LAST:event_formWindowOpened

    private void jButtonremAnimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonremAnimalActionPerformed
        
      if (jTableAnimal.getSelectedRow() != -1) {
            animalController.delete((int) jTableAnimal.getValueAt(jTableAnimal.getSelectedRow(), 0));
            
            limpaCampos();
            ListaAnimal();
        
      } else {
            System.out.println("Selecione um produto para poder excluir");
        }
         
    }//GEN-LAST:event_jButtonremAnimalActionPerformed

    public void lerCombo() {
        jComboBoxCliente.removeAllItems();

        for (Cliente c : clienteController.read()) {
            jComboBoxCliente.addItem(c);
        }
    }

    public void limpaCampos() {
        jTextFieldNomeAnimal.setText("");
        jTextFieldRaca.setText("");
        jTextFieldIdadae.setText("");
        jTextFieldObs.setText("");
        jFormattedVac.setText("");
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
            java.util.logging.Logger.getLogger(cadastroAnimal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(cadastroAnimal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(cadastroAnimal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(cadastroAnimal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new cadastroAnimal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCadastraAnimal;
    private javax.swing.JButton jButtonattAnimal;
    private javax.swing.JButton jButtonremAnimal;
    private javax.swing.JComboBox<Object> jComboBoxCliente;
    private javax.swing.JFormattedTextField jFormattedVac;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableAnimal;
    private javax.swing.JTextField jTextFieldIdadae;
    private javax.swing.JTextField jTextFieldNomeAnimal;
    private javax.swing.JTextField jTextFieldObs;
    private javax.swing.JTextField jTextFieldRaca;
    // End of variables declaration//GEN-END:variables

}
