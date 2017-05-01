
package calculadora;

import javax.swing.JOptionPane;

public class CalculadoraView extends javax.swing.JDialog {

    private Calculadora calculadora;
    
    public CalculadoraView(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        
        calculadora = new Calculadora();
        
        initComponents();
                
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpnPrincipal = new javax.swing.JPanel();
        jlbTitulo = new javax.swing.JLabel();
        jtxNum1 = new javax.swing.JTextField();
        jtxNum2 = new javax.swing.JTextField();
        jlbNum1 = new javax.swing.JLabel();
        jlbNum2 = new javax.swing.JLabel();
        jcbOperacao = new javax.swing.JComboBox<>();
        jbtExecutar = new javax.swing.JButton();
        jbtLimpar = new javax.swing.JButton();
        jbtSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jpnPrincipal.setBackground(new java.awt.Color(204, 204, 255));

        jlbTitulo.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jlbTitulo.setText("Calculadora");

        jlbNum1.setText("Número 1");

        jlbNum2.setText("Número 2");

        jcbOperacao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Soma", "Subtração", "Divisão", "Multiplicação" }));

        jbtExecutar.setText("Executar");
        jbtExecutar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtExecutarActionPerformed(evt);
            }
        });

        jbtLimpar.setText("Limpar");
        jbtLimpar.setMaximumSize(new java.awt.Dimension(75, 23));
        jbtLimpar.setMinimumSize(new java.awt.Dimension(75, 23));
        jbtLimpar.setPreferredSize(new java.awt.Dimension(75, 23));
        jbtLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtLimparActionPerformed(evt);
            }
        });

        jbtSair.setText("Sair");
        jbtSair.setPreferredSize(new java.awt.Dimension(75, 23));
        jbtSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpnPrincipalLayout = new javax.swing.GroupLayout(jpnPrincipal);
        jpnPrincipal.setLayout(jpnPrincipalLayout);
        jpnPrincipalLayout.setHorizontalGroup(
            jpnPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnPrincipalLayout.createSequentialGroup()
                .addGap(125, 125, 125)
                .addComponent(jcbOperacao, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jpnPrincipalLayout.createSequentialGroup()
                .addGroup(jpnPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpnPrincipalLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jbtExecutar)
                        .addGap(54, 54, 54)
                        .addComponent(jbtLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(jbtSair, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpnPrincipalLayout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addGroup(jpnPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jpnPrincipalLayout.createSequentialGroup()
                                .addComponent(jtxNum1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(45, 45, 45))
                            .addGroup(jpnPrincipalLayout.createSequentialGroup()
                                .addComponent(jlbNum1)
                                .addGap(75, 75, 75)))
                        .addGroup(jpnPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtxNum2, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jpnPrincipalLayout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(jlbNum2))))
                    .addGroup(jpnPrincipalLayout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(jlbTitulo)))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jpnPrincipalLayout.setVerticalGroup(
            jpnPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbTitulo)
                .addGap(18, 18, 18)
                .addGroup(jpnPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbNum1)
                    .addComponent(jlbNum2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpnPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxNum2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxNum1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addComponent(jcbOperacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 158, Short.MAX_VALUE)
                .addGroup(jpnPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtExecutar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtSair, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpnPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpnPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jbtExecutarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtExecutarActionPerformed
    
        double resultado;
        String item; 
        item = (String) jcbOperacao.getSelectedItem();
        
        double num1 = Double.parseDouble(jtxNum1.getText());
        double num2 = Double.parseDouble(jtxNum2.getText());
        
        if (item == "Soma"){
            resultado = calculadora.soma(num1, num2);
            JOptionPane.showMessageDialog(null, "O resultada soma é " + resultado, "Mensagem", JOptionPane.OK_OPTION);
        } else if (item == "Subtração"){
            resultado = calculadora.subtracao(num1, num2);
            JOptionPane.showMessageDialog(null, "O resultado da subtração é " + resultado, "Mensagem", JOptionPane.OK_OPTION);
        } else if (item == "Multiplicação"){
            resultado = calculadora.multiplicacao(num1, num2);
            JOptionPane.showMessageDialog(null, "O resultado da multiplicação é " + resultado, "Mensagem", JOptionPane.OK_OPTION);
        } else {
            resultado = calculadora.divisao(num1, num2);
            JOptionPane.showMessageDialog(null, "O resultado da divisão é " + resultado, "Mensagem", JOptionPane.OK_OPTION);
        }
                
    }//GEN-LAST:event_jbtExecutarActionPerformed

    private void jbtLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtLimparActionPerformed
        
        jtxNum1.setText("");
        jtxNum2.setText("");
        jtxNum1.requestFocus();
        
    }//GEN-LAST:event_jbtLimparActionPerformed

    private void jbtSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtSairActionPerformed
        
        this.dispose();
        
    }//GEN-LAST:event_jbtSairActionPerformed

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
            java.util.logging.Logger.getLogger(CalculadoraView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CalculadoraView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CalculadoraView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CalculadoraView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                CalculadoraView dialog = new CalculadoraView(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jbtExecutar;
    private javax.swing.JButton jbtLimpar;
    private javax.swing.JButton jbtSair;
    private javax.swing.JComboBox<String> jcbOperacao;
    private javax.swing.JLabel jlbNum1;
    private javax.swing.JLabel jlbNum2;
    private javax.swing.JLabel jlbTitulo;
    private javax.swing.JPanel jpnPrincipal;
    private javax.swing.JTextField jtxNum1;
    private javax.swing.JTextField jtxNum2;
    // End of variables declaration//GEN-END:variables
}
