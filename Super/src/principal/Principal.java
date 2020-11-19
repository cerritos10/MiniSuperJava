/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;


import java.awt.MouseInfo;
import java.awt.Point;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import logica.CambiaPanel;
import logica.sesion;

/**
 *
 * @author RojeruSan
 */
public class Principal extends javax.swing.JFrame {

    int x, y;
    /**
     * Creates new form Principal
     */
    
    public Principal() {
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
        cargarUsuario(lblNameUser);
        new CambiaPanel(pnlPrincipal, new Inicio());
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        pnlMenu = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnCerrarSesion = new rojeru_san.RSButtonRiple();
        btnVentas = new rojeru_san.RSButtonRiple();
        btnUsuarios = new rojeru_san.RSButtonRiple();
        btnClientes = new rojeru_san.RSButtonRiple();
        btnTipoP = new rojeru_san.RSButtonRiple();
        btnProductos = new rojeru_san.RSButtonRiple();
        btnCompra = new rojeru_san.RSButtonRiple();
        btnCompra1 = new rojeru_san.RSButtonRiple();
        btnrRespaldo = new rojeru_san.RSButtonRiple();
        btnrRestauracion = new rojeru_san.RSButtonRiple();
        jPanel2 = new javax.swing.JPanel();
        lblNameUser = new javax.swing.JLabel();
        pnlCentro = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        pnlPrincipal = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(28, 33, 53));
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(28, 33, 53));
        jPanel1.setLayout(new java.awt.GridBagLayout());

        pnlMenu.setBackground(new java.awt.Color(43, 50, 68));
        pnlMenu.setToolTipText("");
        pnlMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(43, 50, 68));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 105, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        pnlMenu.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(153, 0, 105, 50));

        jPanel5.setBackground(new java.awt.Color(28, 33, 53));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 51, Short.MAX_VALUE)
        );

        pnlMenu.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(264, 283, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(128, 128, 131));
        jLabel3.setText("REPORTES Y RESPALDO");
        pnlMenu.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 420, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(128, 128, 131));
        jLabel1.setText("DATOS");
        pnlMenu.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        btnCerrarSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/CS.png"))); // NOI18N
        btnCerrarSesion.setText("          LOG OUT");
        btnCerrarSesion.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarSesionActionPerformed(evt);
            }
        });
        pnlMenu.add(btnCerrarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 650, -1, -1));

        btnVentas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/ventas.png"))); // NOI18N
        btnVentas.setText("          VENTAS");
        btnVentas.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVentasActionPerformed(evt);
            }
        });
        pnlMenu.add(btnVentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, -1));

        btnUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/usuarios.png"))); // NOI18N
        btnUsuarios.setText("          USUARIOS");
        btnUsuarios.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsuariosActionPerformed(evt);
            }
        });
        pnlMenu.add(btnUsuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));

        btnClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/clientes.png"))); // NOI18N
        btnClientes.setText("          CLIENTES");
        btnClientes.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClientesActionPerformed(evt);
            }
        });
        pnlMenu.add(btnClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, -1));

        btnTipoP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/tipo.png"))); // NOI18N
        btnTipoP.setText("          CATEGORIAS");
        btnTipoP.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnTipoP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTipoPActionPerformed(evt);
            }
        });
        pnlMenu.add(btnTipoP, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, -1, -1));

        btnProductos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/procutos.png"))); // NOI18N
        btnProductos.setText("          PRODUCTOS");
        btnProductos.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProductosActionPerformed(evt);
            }
        });
        pnlMenu.add(btnProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, -1, -1));

        btnCompra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/icons8-buying-30.png"))); // NOI18N
        btnCompra.setText("          COMPRA");
        btnCompra.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCompraActionPerformed(evt);
            }
        });
        pnlMenu.add(btnCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, -1, -1));

        btnCompra1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/resportes.png"))); // NOI18N
        btnCompra1.setText("          REPORTES");
        btnCompra1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnCompra1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCompra1ActionPerformed(evt);
            }
        });
        pnlMenu.add(btnCompra1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 460, -1, -1));

        btnrRespaldo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/respaldo.png"))); // NOI18N
        btnrRespaldo.setText("          RESPALDO");
        btnrRespaldo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnrRespaldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnrRespaldoActionPerformed(evt);
            }
        });
        pnlMenu.add(btnrRespaldo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 510, -1, -1));

        btnrRestauracion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/restaurcion.png"))); // NOI18N
        btnrRestauracion.setText("          RESTAURACION");
        btnrRestauracion.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnrRestauracion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnrRestauracionActionPerformed(evt);
            }
        });
        pnlMenu.add(btnrRestauracion, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 560, -1, -1));

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weighty = 8.3;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 1);
        jPanel1.add(pnlMenu, gridBagConstraints);

        jPanel2.setBackground(new java.awt.Color(28, 33, 53));
        jPanel2.setCursor(new java.awt.Cursor(java.awt.Cursor.MOVE_CURSOR));
        jPanel2.setEnabled(false);
        jPanel2.setPreferredSize(new java.awt.Dimension(100, 52));
        jPanel2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel2MouseDragged(evt);
            }
        });
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel2MousePressed(evt);
            }
        });

        lblNameUser.setBackground(new java.awt.Color(255, 255, 255));
        lblNameUser.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblNameUser.setForeground(new java.awt.Color(255, 255, 255));
        lblNameUser.setText("Nombre de Usuario");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(lblNameUser)
                .addGap(366, 366, 366))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblNameUser, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.PAGE_START;
        gridBagConstraints.weightx = 0.2;
        jPanel1.add(jPanel2, gridBagConstraints);

        pnlCentro.setBackground(new java.awt.Color(28, 33, 53));

        jPanel6.setBackground(new java.awt.Color(28, 33, 53));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(128, 128, 131));
        jLabel4.setText("DASHBOARD");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });

        jScrollPane1.setBorder(null);

        pnlPrincipal.setBackground(new java.awt.Color(28, 33, 53));
        pnlPrincipal.setLayout(new javax.swing.BoxLayout(pnlPrincipal, javax.swing.BoxLayout.LINE_AXIS));
        jScrollPane1.setViewportView(pnlPrincipal);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(0, 667, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 652, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnlCentroLayout = new javax.swing.GroupLayout(pnlCentro);
        pnlCentro.setLayout(pnlCentroLayout);
        pnlCentroLayout.setHorizontalGroup(
            pnlCentroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnlCentroLayout.setVerticalGroup(
            pnlCentroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCentroLayout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.4;
        gridBagConstraints.weighty = 0.1;
        jPanel1.add(pnlCentro, gridBagConstraints);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void cargarUsuario(JLabel usuario){
        String nombre = sesion.nombre+"";
        usuario.setText(nombre);
    }
    private void jPanel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MousePressed
        x = evt.getX();
        y = evt.getY();
    }//GEN-LAST:event_jPanel2MousePressed

    private void jPanel2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseDragged
        Point mueve = MouseInfo.getPointerInfo().getLocation();
        this.setLocation(mueve.x - x, mueve.y - y);
    }//GEN-LAST:event_jPanel2MouseDragged
    
    private void btnCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarSesionActionPerformed
        Login login = new Login();
        login.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnCerrarSesionActionPerformed

    private void btnVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVentasActionPerformed
        new CambiaPanel(pnlPrincipal, new Form_Venta());
    }//GEN-LAST:event_btnVentasActionPerformed

    private void btnUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsuariosActionPerformed
        new CambiaPanel(pnlPrincipal, new Users());
    }//GEN-LAST:event_btnUsuariosActionPerformed

    private void btnClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClientesActionPerformed
        new CambiaPanel(pnlPrincipal, new Form_Clientes());
    }//GEN-LAST:event_btnClientesActionPerformed

    private void btnTipoPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTipoPActionPerformed
        new CambiaPanel(pnlPrincipal, new Form_TipoProducto());
    }//GEN-LAST:event_btnTipoPActionPerformed

    private void btnProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProductosActionPerformed
        new CambiaPanel(pnlPrincipal, new Form_Productos());
    }//GEN-LAST:event_btnProductosActionPerformed

    private void btnCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCompraActionPerformed
        new CambiaPanel(pnlPrincipal, new Form_Compra());
    }//GEN-LAST:event_btnCompraActionPerformed

    private void btnCompra1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCompra1ActionPerformed
        new CambiaPanel(pnlPrincipal, new Form_Reportes());
    }//GEN-LAST:event_btnCompra1ActionPerformed

    private void btnrRespaldoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnrRespaldoActionPerformed
        try {
            Runtime.getRuntime().exec("cmd /c start cmd.exe /K \" cd C:\\Users\\cerri\\Desktop\\Ing.Sistemas && expdp system/oracle schemas=miniSuper dumpfile=respaldo2.dmp && exit");
        } catch (IOException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnrRespaldoActionPerformed

    private void btnrRestauracionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnrRestauracionActionPerformed
//        impdp system/oracle@xe remap_schema=miniSuper:prueba dumpfile=RESPALDO2.dmp
                try {
            Runtime.getRuntime().exec("cmd /c start cmd.exe /K \" cd C:\\Users\\cerri\\Desktop\\Ing.Sistemas && impdp system/oracle@xe remap_schema=miniSuper:prueba5 dumpfile=RESPALDO.dmp && exit");
        } catch (IOException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnrRestauracionActionPerformed

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
         new CambiaPanel(pnlPrincipal, new Inicio());
    }//GEN-LAST:event_jLabel4MouseClicked

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                    new Principal().setVisible(true);
                } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
                    Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojeru_san.RSButtonRiple btnCerrarSesion;
    private rojeru_san.RSButtonRiple btnClientes;
    private rojeru_san.RSButtonRiple btnCompra;
    private rojeru_san.RSButtonRiple btnCompra1;
    private rojeru_san.RSButtonRiple btnProductos;
    private rojeru_san.RSButtonRiple btnTipoP;
    private rojeru_san.RSButtonRiple btnUsuarios;
    private rojeru_san.RSButtonRiple btnVentas;
    private rojeru_san.RSButtonRiple btnrRespaldo;
    private rojeru_san.RSButtonRiple btnrRestauracion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblNameUser;
    private javax.swing.JPanel pnlCentro;
    private javax.swing.JPanel pnlMenu;
    private javax.swing.JPanel pnlPrincipal;
    // End of variables declaration//GEN-END:variables
}
