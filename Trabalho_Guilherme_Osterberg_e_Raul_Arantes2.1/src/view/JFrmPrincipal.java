/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

/**
 *
 * @author u09464273135
 */
public class JFrmPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form jFrmPrincipal
     */
    public JFrmPrincipal() {
        initComponents();
        setTitle("Tela Principal");
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jImgBanner = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMnuPrincipal = new javax.swing.JMenu();
        jMnuClientes = new javax.swing.JMenuItem();
        jMnuJogos = new javax.swing.JMenuItem();
        jMnuPatrocinadores = new javax.swing.JMenuItem();
        jMnuPlataforma = new javax.swing.JMenuItem();
        jMnuUsuarios = new javax.swing.JMenuItem();
        jMnuVendedor = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMnuSair = new javax.swing.JMenuItem();
        jMnuMovimentos = new javax.swing.JMenu();
        jMnuVendas = new javax.swing.JMenuItem();
        jMnuCompras = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jImgBanner.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/BannerInicio.png"))); // NOI18N

        jMnuPrincipal.setMnemonic('C');
        jMnuPrincipal.setText("Cadastros");
        jMnuPrincipal.addMenuKeyListener(new javax.swing.event.MenuKeyListener() {
            public void menuKeyPressed(javax.swing.event.MenuKeyEvent evt) {
                jMnuPrincipalMenuKeyPressed(evt);
            }
            public void menuKeyReleased(javax.swing.event.MenuKeyEvent evt) {
            }
            public void menuKeyTyped(javax.swing.event.MenuKeyEvent evt) {
            }
        });

        jMnuClientes.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        jMnuClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/UsersIcon.png"))); // NOI18N
        jMnuClientes.setMnemonic('C');
        jMnuClientes.setText("Clientes");
        jMnuClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMnuClientesActionPerformed(evt);
            }
        });
        jMnuPrincipal.add(jMnuClientes);

        jMnuJogos.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_J, java.awt.event.InputEvent.CTRL_MASK));
        jMnuJogos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ControlerIcon.png"))); // NOI18N
        jMnuJogos.setMnemonic('J');
        jMnuJogos.setText("Jogos");
        jMnuJogos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMnuJogosActionPerformed(evt);
            }
        });
        jMnuPrincipal.add(jMnuJogos);

        jMnuPatrocinadores.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        jMnuPatrocinadores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/SponsorIcon.png"))); // NOI18N
        jMnuPatrocinadores.setMnemonic('s');
        jMnuPatrocinadores.setText("Patrocinadores");
        jMnuPatrocinadores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMnuPatrocinadoresActionPerformed(evt);
            }
        });
        jMnuPrincipal.add(jMnuPatrocinadores);

        jMnuPlataforma.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        jMnuPlataforma.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/GamingConsoleIcon.png"))); // NOI18N
        jMnuPlataforma.setMnemonic('P');
        jMnuPlataforma.setText("Plataforma");
        jMnuPlataforma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMnuPlataformaActionPerformed(evt);
            }
        });
        jMnuPrincipal.add(jMnuPlataforma);

        jMnuUsuarios.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.CTRL_MASK));
        jMnuUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/UsersIcon.png"))); // NOI18N
        jMnuUsuarios.setMnemonic('U');
        jMnuUsuarios.setText("Usuários");
        jMnuUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMnuUsuariosActionPerformed(evt);
            }
        });
        jMnuUsuarios.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jMnuUsuariosKeyPressed(evt);
            }
        });
        jMnuPrincipal.add(jMnuUsuarios);

        jMnuVendedor.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.CTRL_MASK));
        jMnuVendedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/UsersIcon.png"))); // NOI18N
        jMnuVendedor.setMnemonic('V');
        jMnuVendedor.setText("Vendedor");
        jMnuVendedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMnuVendedorActionPerformed(evt);
            }
        });
        jMnuPrincipal.add(jMnuVendedor);
        jMnuPrincipal.add(jSeparator1);

        jMnuSair.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_MASK));
        jMnuSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/LeavingDoorIcon.png"))); // NOI18N
        jMnuSair.setText("Sair");
        jMnuSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMnuSairActionPerformed(evt);
            }
        });
        jMnuPrincipal.add(jMnuSair);

        jMenuBar1.add(jMnuPrincipal);

        jMnuMovimentos.setMnemonic('M');
        jMnuMovimentos.setText("Movimentos");

        jMnuVendas.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMnuVendas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/SaleIcon.png"))); // NOI18N
        jMnuVendas.setMnemonic('V');
        jMnuVendas.setText("Vendas");
        jMnuVendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMnuVendasActionPerformed(evt);
            }
        });
        jMnuMovimentos.add(jMnuVendas);

        jMnuCompras.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMnuCompras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ShoppingIcon.png"))); // NOI18N
        jMnuCompras.setMnemonic('C');
        jMnuCompras.setText("Compras");
        jMnuCompras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMnuComprasActionPerformed(evt);
            }
        });
        jMnuMovimentos.add(jMnuCompras);

        jMenuBar1.add(jMnuMovimentos);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jImgBanner)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jImgBanner)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMnuVendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMnuVendasActionPerformed
        // TODO add your handling code here:   
        JDlgVendas jDlgVendas = new JDlgVendas(null, true);
        jDlgVendas.setVisible(true);
    }//GEN-LAST:event_jMnuVendasActionPerformed

    private void jMnuClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMnuClientesActionPerformed
        // TODO add your handling code here:
        JDlgCliente jDlgCliente = new JDlgCliente(null, true);
        jDlgCliente.setVisible(true);


    }//GEN-LAST:event_jMnuClientesActionPerformed

    private void jMnuUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMnuUsuariosActionPerformed
        JDlgUsuarios jDlgUsuarios = new JDlgUsuarios(null, true);
        jDlgUsuarios.setVisible(true);
// TODO add your handling code here:
    }//GEN-LAST:event_jMnuUsuariosActionPerformed

    private void jMnuUsuariosKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jMnuUsuariosKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMnuUsuariosKeyPressed

    private void jMnuPrincipalMenuKeyPressed(javax.swing.event.MenuKeyEvent evt) {//GEN-FIRST:event_jMnuPrincipalMenuKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMnuPrincipalMenuKeyPressed

    private void jMnuSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMnuSairActionPerformed

        System.exit(0);

        // TODO add your handling code here:
    }//GEN-LAST:event_jMnuSairActionPerformed

    private void jMnuVendedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMnuVendedorActionPerformed
        // TODO add your handling code here:

        JDlgVendedor jDlgVendedor = new JDlgVendedor(null, true);
        jDlgVendedor.setVisible(true);

    }//GEN-LAST:event_jMnuVendedorActionPerformed

    private void jMnuJogosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMnuJogosActionPerformed
        // TODO add your handling code here:

        JDlgJogos jDlgJogos = new JDlgJogos(null, true);
        jDlgJogos.setVisible(true);

    }//GEN-LAST:event_jMnuJogosActionPerformed

    private void jMnuPatrocinadoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMnuPatrocinadoresActionPerformed
        // TODO add your handling code here:

        JDlgPatrocinadores jDlgPatrocinadores = new JDlgPatrocinadores(null, true);
        jDlgPatrocinadores.setVisible(true);

    }//GEN-LAST:event_jMnuPatrocinadoresActionPerformed

    private void jMnuPlataformaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMnuPlataformaActionPerformed
        // TODO add your handling code here:

        JDlgPlataforma jDlgPlataforma = new JDlgPlataforma(null, true);
        jDlgPlataforma.setVisible(true);

    }//GEN-LAST:event_jMnuPlataformaActionPerformed

    private void jMnuComprasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMnuComprasActionPerformed
        // TODO add your handling code here:   
        JDlgCompras jDlgCompras = new JDlgCompras(null, true);
        jDlgCompras.setVisible(true);
    }//GEN-LAST:event_jMnuComprasActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(JFrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(JFrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(JFrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(JFrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrmPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jImgBanner;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMnuClientes;
    private javax.swing.JMenuItem jMnuCompras;
    private javax.swing.JMenuItem jMnuJogos;
    private javax.swing.JMenu jMnuMovimentos;
    private javax.swing.JMenuItem jMnuPatrocinadores;
    private javax.swing.JMenuItem jMnuPlataforma;
    private javax.swing.JMenu jMnuPrincipal;
    private javax.swing.JMenuItem jMnuSair;
    private javax.swing.JMenuItem jMnuUsuarios;
    private javax.swing.JMenuItem jMnuVendas;
    private javax.swing.JMenuItem jMnuVendedor;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
