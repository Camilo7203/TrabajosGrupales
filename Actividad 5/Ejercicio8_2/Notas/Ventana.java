package Notas;

public class Ventana extends javax.swing.JFrame {

    public Ventana() {
        initComponents();
    }

    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblNota1 = new javax.swing.JLabel();
        lblNota2 = new javax.swing.JLabel();
        lblNota3 = new javax.swing.JLabel();
        lblNota4 = new javax.swing.JLabel();
        lblNota5 = new javax.swing.JLabel();
        txtNota1 = new javax.swing.JTextField();
        txtNota2 = new javax.swing.JTextField();
        txtNota3 = new javax.swing.JTextField();
        txtNota4 = new javax.swing.JTextField();
        txtNota5 = new javax.swing.JTextField();
        btnCalcular = new javax.swing.JButton();
        btnBorrar = new javax.swing.JButton();
        btnCerrar = new javax.swing.JButton();
        lblPromedio = new javax.swing.JLabel();
        lblDesviacionestandar = new javax.swing.JLabel();
        lblMayor = new javax.swing.JLabel();
        lblMenor = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblNota1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblNota1.setText("Nota 1:");

        lblNota2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblNota2.setText("Nota 2:");

        lblNota3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblNota3.setText("Nota 3:");

        lblNota4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblNota4.setText("Nota 4:");

        lblNota5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblNota5.setText("Nota 5:");

        btnCalcular.setText("Calcular");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });

        btnBorrar.setText("Borrar");
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });

        btnCerrar.setText("Cerrar");
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });

        lblPromedio.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        lblDesviacionestandar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        lblMayor.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        lblMenor.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblNota2)
                                    .addComponent(lblNota1)
                                    .addComponent(lblNota3)
                                    .addComponent(lblNota4)
                                    .addComponent(lblNota5))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtNota1)
                                    .addComponent(txtNota2)
                                    .addComponent(txtNota3)
                                    .addComponent(txtNota4)
                                    .addComponent(txtNota5, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(lblDesviacionestandar)
                            .addComponent(lblPromedio)
                            .addComponent(lblMayor)
                            .addComponent(lblMenor)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(btnCalcular)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnBorrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCerrar)))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNota1)
                    .addComponent(txtNota1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNota2)
                    .addComponent(txtNota2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNota3)
                    .addComponent(txtNota3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNota4)
                    .addComponent(txtNota4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNota5)
                    .addComponent(txtNota5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCalcular)
                    .addComponent(btnBorrar)
                    .addComponent(btnCerrar))
                .addGap(18, 18, 18)
                .addComponent(lblPromedio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblDesviacionestandar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblMayor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblMenor)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        Notas Not = new Notas();
        Not.notas[0] = Double.parseDouble(txtNota1.getText());
        Not.notas[1] = Double.parseDouble(txtNota2.getText());
        Not.notas[2] = Double.parseDouble(txtNota3.getText());
        Not.notas[3] = Double.parseDouble(txtNota4.getText());
        Not.notas[4] = Double.parseDouble(txtNota5.getText());
        lblPromedio.setText("Promedio = " + Not.promedio());
        lblDesviacionestandar.setText("Desviación estándar = " + Not.desviacion());
        lblMayor.setText("Valor mayor = " + Not.mayor());
        lblMenor.setText("Valor menor = " + Not.menor());
        setSize(330,400);
    }//GEN-LAST:event_btnCalcularActionPerformed

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
        setSize(330,300);
        lblPromedio.setText("");
        lblDesviacionestandar.setText("");
        lblMayor.setText("");
        lblMenor.setText("");
        txtNota1.setText("");
        txtNota2.setText("");
        txtNota3.setText("");
        txtNota4.setText("");
        txtNota5.setText("");
    }//GEN-LAST:event_btnBorrarActionPerformed

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        dispose();
    }//GEN-LAST:event_btnCerrarActionPerformed

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
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JLabel lblDesviacionestandar;
    private javax.swing.JLabel lblMayor;
    private javax.swing.JLabel lblMenor;
    private javax.swing.JLabel lblNota1;
    private javax.swing.JLabel lblNota2;
    private javax.swing.JLabel lblNota3;
    private javax.swing.JLabel lblNota4;
    private javax.swing.JLabel lblNota5;
    private javax.swing.JLabel lblPromedio;
    private javax.swing.JTextField txtNota1;
    private javax.swing.JTextField txtNota2;
    private javax.swing.JTextField txtNota3;
    private javax.swing.JTextField txtNota4;
    private javax.swing.JTextField txtNota5;
    // End of variables declaration//GEN-END:variables
}
