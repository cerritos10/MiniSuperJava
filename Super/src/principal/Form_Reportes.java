/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import javax.swing.JOptionPane;
import logica.CN_Clientes;
import logica.CN_Compra;
import logica.CN_Detalle;
import logica.CN_Productos;
import logica.CN_Ventas;
import logica.listarClientes;
import logica.listarProductos;

/**
 *
 * @author cerri
 */
public class Form_Reportes extends javax.swing.JPanel {

    /**
     * Creates new form Form_Reportes
     */
    CN_Productos cnp = new CN_Productos();
    CN_Detalle cnd = new CN_Detalle(); 
    CN_Ventas cnv = new CN_Ventas();
    CN_Compra cnc = new CN_Compra();
    CN_Clientes cncl = new CN_Clientes();
    public Form_Reportes() {
        initComponents();
        llenarCombo();
        viewClientes("");
        viewProductos("");
        panelMes.setVisible(false);
        pnlCli.setVisible(false);
        panelProducto.setVisible(false);
    }
    private listarClientes lc = new listarClientes();
    private listarProductos lp = new listarProductos();
    
        public void viewClientes(String nombre){
        lc.verClientess(TablaCliente,nombre);
        }
        
        public void viewProductos(String producto){
        lp.verProductos(TablaProducto,producto);
    }

        public void ocultar(){
         panelMes.setVisible(false);
         panelProducto.setVisible(false);
         pnlCli.setVisible(false);
        }
    public void llenarCombo(){
        String datos [] = new String [9];
        datos[0] = "Reporte Productos";
        datos[1] = "Productos mas vendidos";
        datos[2] = "Productos menos vendidos";
        datos[3] = "Total ventas mensuales";
        datos[4] = "Total ventas anuales";
        datos[5] = "Total gastos mensuales";
        datos[6] = "Total gastos anuales";
        datos[7] = "Ventas por cliente";
        datos[8] = "Existencias por producto";
        for (String dato : datos) {
            jComboBox1.addItem(dato);
          }
    }
    public void llenarComboMes(){
        String datos [] = new String [12];
        datos[0] = "Enero";
        datos[1] = "Febrero";
        datos[2] = "Marzo";
        datos[3] = "Abril";
        datos[4] = "Mayo";
        datos[5] = "Junio";
        datos[6] = "Julio";
        datos[7] = "Agosto";
        datos[8] = "Septiembre";
        datos[9] = "Octubre";
        datos[10] = "Noviembre";
        datos[11] = "Diciembre";
        for (String dato : datos) {
            cmbMEs.addItem(dato);
          }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        btnImprimir = new rojeru_san.RSButtonRiple();
        panelMes = new javax.swing.JPanel();
        cmbMEs = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        txtMEs = new javax.swing.JTextField();
        pnlCli = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TablaCliente = new javax.swing.JTable();
        txtBuscarCli = new rojeru_san.RSMTextFull();
        txtCliente = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        panelProducto = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        TablaProducto = new javax.swing.JTable();
        txtBuscarPro = new rojeru_san.RSMTextFull();
        txtProductos = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(28, 33, 53));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Consolas", 0, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("REPORTES");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(452, 19, -1, -1));

        jComboBox1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(384, 98, 307, 35));

        btnImprimir.setText("IMPRIMIR");
        btnImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImprimirActionPerformed(evt);
            }
        });
        add(btnImprimir, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 100, 122, -1));

        panelMes.setBackground(new java.awt.Color(28, 33, 53));

        cmbMEs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbMEsActionPerformed(evt);
            }
        });

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Elija un mes para el reporte: ");

        txtMEs.setEditable(false);
        txtMEs.setBackground(new java.awt.Color(28, 33, 53));
        txtMEs.setForeground(new java.awt.Color(28, 33, 53));
        txtMEs.setBorder(null);

        javax.swing.GroupLayout panelMesLayout = new javax.swing.GroupLayout(panelMes);
        panelMes.setLayout(panelMesLayout);
        panelMesLayout.setHorizontalGroup(
            panelMesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMesLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(panelMesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelMesLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addContainerGap(68, Short.MAX_VALUE))
                    .addGroup(panelMesLayout.createSequentialGroup()
                        .addComponent(cmbMEs, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtMEs, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23))))
        );
        panelMesLayout.setVerticalGroup(
            panelMesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(panelMesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cmbMEs, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMEs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        add(panelMes, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 160, 250, -1));

        pnlCli.setBackground(new java.awt.Color(28, 33, 53));

        TablaCliente.setBackground(new java.awt.Color(0, 102, 102));
        TablaCliente.setForeground(new java.awt.Color(255, 255, 255));
        TablaCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        TablaCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaClienteMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(TablaCliente);

        txtBuscarCli.setBackground(new java.awt.Color(28, 33, 53));
        txtBuscarCli.setForeground(new java.awt.Color(255, 255, 255));
        txtBuscarCli.setBordeColorFocus(new java.awt.Color(255, 255, 255));
        txtBuscarCli.setBordeColorNoFocus(new java.awt.Color(255, 255, 255));
        txtBuscarCli.setCaretColor(new java.awt.Color(255, 255, 255));
        txtBuscarCli.setFont(new java.awt.Font("Roboto Bold", 0, 12)); // NOI18N
        txtBuscarCli.setPlaceholder("Buscar...");
        txtBuscarCli.setSelectedTextColor(new java.awt.Color(255, 255, 255));
        txtBuscarCli.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtBuscarCliKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarCliKeyReleased(evt);
            }
        });

        txtCliente.setEditable(false);
        txtCliente.setBackground(new java.awt.Color(28, 33, 53));
        txtCliente.setForeground(new java.awt.Color(28, 33, 53));
        txtCliente.setBorder(null);
        txtCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtClienteActionPerformed(evt);
            }
        });

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Elija un cliente de la tabla: ");

        javax.swing.GroupLayout pnlCliLayout = new javax.swing.GroupLayout(pnlCli);
        pnlCli.setLayout(pnlCliLayout);
        pnlCliLayout.setHorizontalGroup(
            pnlCliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCliLayout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addGroup(pnlCliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCliLayout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCliLayout.createSequentialGroup()
                        .addGroup(pnlCliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(pnlCliLayout.createSequentialGroup()
                                .addComponent(txtCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtBuscarCli, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())))
        );
        pnlCliLayout.setVerticalGroup(
            pnlCliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCliLayout.createSequentialGroup()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(pnlCliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBuscarCli, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        add(pnlCli, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 360, 300));

        panelProducto.setBackground(new java.awt.Color(28, 33, 53));

        TablaProducto.setBackground(new java.awt.Color(0, 102, 102));
        TablaProducto.setForeground(new java.awt.Color(255, 255, 255));
        TablaProducto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        TablaProducto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaProductoMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(TablaProducto);

        txtBuscarPro.setBackground(new java.awt.Color(28, 33, 53));
        txtBuscarPro.setForeground(new java.awt.Color(255, 255, 255));
        txtBuscarPro.setBordeColorFocus(new java.awt.Color(255, 255, 255));
        txtBuscarPro.setBordeColorNoFocus(new java.awt.Color(255, 255, 255));
        txtBuscarPro.setCaretColor(new java.awt.Color(255, 255, 255));
        txtBuscarPro.setFont(new java.awt.Font("Roboto Bold", 0, 12)); // NOI18N
        txtBuscarPro.setPlaceholder("Buscar...");
        txtBuscarPro.setSelectedTextColor(new java.awt.Color(255, 255, 255));
        txtBuscarPro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarProActionPerformed(evt);
            }
        });
        txtBuscarPro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtBuscarProKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarProKeyReleased(evt);
            }
        });

        txtProductos.setEditable(false);
        txtProductos.setBackground(new java.awt.Color(28, 33, 53));
        txtProductos.setForeground(new java.awt.Color(28, 33, 53));
        txtProductos.setBorder(null);
        txtProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtProductosActionPerformed(evt);
            }
        });

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Elija un producto de la tabla: ");

        javax.swing.GroupLayout panelProductoLayout = new javax.swing.GroupLayout(panelProducto);
        panelProducto.setLayout(panelProductoLayout);
        panelProductoLayout.setHorizontalGroup(
            panelProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelProductoLayout.createSequentialGroup()
                .addGroup(panelProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelProductoLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelProductoLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panelProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addGroup(panelProductoLayout.createSequentialGroup()
                                .addComponent(txtProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtBuscarPro, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        panelProductoLayout.setVerticalGroup(
            panelProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelProductoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBuscarPro, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtProductos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(61, Short.MAX_VALUE))
        );

        add(panelProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 160, 340, 330));
    }// </editor-fold>//GEN-END:initComponents

    private void btnImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimirActionPerformed
        if (jComboBox1.getSelectedItem().equals("Reporte Productos")) {
            cnp.reporteProductos();
        }
        else if (jComboBox1.getSelectedItem().equals("Productos mas vendidos")) {
            cnd.reportProductMas();
        }
        else if (jComboBox1.getSelectedItem().equals("Productos menos vendidos")) {
            cnd.reportProductMenos();
        }
        else if (jComboBox1.getSelectedItem().equals("Total ventas mensuales") && !txtMEs.getText().isEmpty()) {
            int vmes = Integer.parseInt(txtMEs.getText()) ;
            cnv.mensualesReporte(vmes);
        }
        else if (jComboBox1.getSelectedItem().equals("Total ventas anuales")) {
            cnv.anualesReporte();
        }
        else if (jComboBox1.getSelectedItem().equals("Total gastos mensuales") && !txtMEs.getText().isEmpty()) {
            int vmes = Integer.parseInt(txtMEs.getText()) ;
            cnc.mensualGastoReporte(vmes);
        }
        else if (jComboBox1.getSelectedItem().equals("Total gastos anuales")) {
            cnc.anualGastoReporte();
        }
        else if (jComboBox1.getSelectedItem().equals("Ventas por cliente")) {
            int cli = Integer.parseInt(txtCliente.getText());
            cncl.ventasXCliente(cli);
        }
        else if (jComboBox1.getSelectedItem().equals("Existencias por producto")) {
            int pro = Integer.parseInt(txtProductos.getText());
            cnp.existenciasXProducto(pro);
        }
         
    }//GEN-LAST:event_btnImprimirActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        if (jComboBox1.getSelectedItem().equals("Total ventas mensuales") || jComboBox1.getSelectedItem().equals("Total gastos mensuales")) {
            panelMes.setVisible(true);
            panelProducto.setVisible(false);
            pnlCli.setVisible(false);
            llenarComboMes();
        }
        else if (jComboBox1.getSelectedItem().equals("Ventas por cliente")) {
            pnlCli.setVisible(true);
            panelMes.setVisible(false);
            panelProducto.setVisible(false);
        }
        else if (jComboBox1.getSelectedItem().equals("Existencias por producto")) {
            panelProducto.setVisible(true);
            panelMes.setVisible(false);
            pnlCli.setVisible(false);
        }
        else if (!jComboBox1.getSelectedItem().equals("Total ventas mensuales") || !jComboBox1.getSelectedItem().equals("Total gastos mensuales")
                || !jComboBox1.getSelectedItem().equals("Ventas por cliente") || !jComboBox1.getSelectedItem().equals("Existencias por producto")) {
            ocultar();
        }
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void cmbMEsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbMEsActionPerformed
        int getMes = cmbMEs.getSelectedIndex()+1;
        txtMEs.setText(Integer.toString(getMes));  
    }//GEN-LAST:event_cmbMEsActionPerformed

    private void TablaClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaClienteMouseClicked
        int seleccionar = TablaCliente.getSelectedRow();
        txtCliente.setText(TablaCliente.getValueAt(seleccionar, 0)+"");
    }//GEN-LAST:event_TablaClienteMouseClicked

    private void txtBuscarCliKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarCliKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscarCliKeyPressed

    private void txtBuscarCliKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarCliKeyReleased
        viewClientes(txtBuscarCli.getText());
    }//GEN-LAST:event_txtBuscarCliKeyReleased

    private void TablaProductoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaProductoMouseClicked
        int seleccionar = TablaProducto.getSelectedRow();
        txtProductos.setText(TablaProducto.getValueAt(seleccionar, 0)+"");
        
    }//GEN-LAST:event_TablaProductoMouseClicked

    private void txtBuscarProActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarProActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscarProActionPerformed

    private void txtBuscarProKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarProKeyPressed

    }//GEN-LAST:event_txtBuscarProKeyPressed

    private void txtBuscarProKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarProKeyReleased
        viewProductos(txtBuscarPro.getText());
    }//GEN-LAST:event_txtBuscarProKeyReleased

    private void txtProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtProductosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtProductosActionPerformed

    private void txtClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtClienteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablaCliente;
    private javax.swing.JTable TablaProducto;
    private rojeru_san.RSButtonRiple btnImprimir;
    private javax.swing.JComboBox<String> cmbMEs;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JPanel panelMes;
    private javax.swing.JPanel panelProducto;
    private javax.swing.JPanel pnlCli;
    private rojeru_san.RSMTextFull txtBuscarCli;
    private rojeru_san.RSMTextFull txtBuscarPro;
    private javax.swing.JTextField txtCliente;
    private javax.swing.JTextField txtMEs;
    private javax.swing.JTextField txtProductos;
    // End of variables declaration//GEN-END:variables
}
