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
        panelMes.setVisible(false);
        pnlCli.setVisible(false);
    }
    private listarClientes lc = new listarClientes();
    
        public void viewClientes(String nombre){
        lc.verClientess(TablaCliente,nombre);
        }

    public void llenarCombo(){
        String datos [] = new String [8];
        datos[0] = "Reporte Productos";
        datos[1] = "Productos mas vendidos";
        datos[2] = "Productos menos vendidos";
        datos[3] = "Total ventas mensuales";
        datos[4] = "Total ventas anuales";
        datos[5] = "Total gastos mensuales";
        datos[6] = "Total gastos anuales";
        datos[7] = "Ventas por cliente";
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
                    .addComponent(jLabel1)
                    .addGroup(panelMesLayout.createSequentialGroup()
                        .addComponent(cmbMEs, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(txtMEs, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(30, Short.MAX_VALUE))
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

        add(panelMes, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 160, 260, -1));

        pnlCli.setBackground(new java.awt.Color(28, 33, 53));

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

        txtCliente.setBackground(new java.awt.Color(28, 33, 53));
        txtCliente.setForeground(new java.awt.Color(28, 33, 53));
        txtCliente.setBorder(null);

        javax.swing.GroupLayout pnlCliLayout = new javax.swing.GroupLayout(pnlCli);
        pnlCli.setLayout(pnlCliLayout);
        pnlCliLayout.setHorizontalGroup(
            pnlCliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCliLayout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addGroup(pnlCliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtBuscarCli, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCliLayout.createSequentialGroup()
                        .addComponent(txtCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        pnlCliLayout.setVerticalGroup(
            pnlCliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCliLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtBuscarCli, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlCliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 28, Short.MAX_VALUE))
        );

        add(pnlCli, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 280, 400, 250));
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
         panelMes.setVisible(false);
    }//GEN-LAST:event_btnImprimirActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        if (jComboBox1.getSelectedItem().equals("Total ventas mensuales") || jComboBox1.getSelectedItem().equals("Total gastos mensuales")) {
            panelMes.setVisible(true);
            llenarComboMes();
        }
        else if (jComboBox1.getSelectedItem().equals("Ventas por cliente")) {
            pnlCli.setVisible(true);
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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablaCliente;
    private rojeru_san.RSButtonRiple btnImprimir;
    private javax.swing.JComboBox<String> cmbMEs;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel panelMes;
    private javax.swing.JPanel pnlCli;
    private rojeru_san.RSMTextFull txtBuscarCli;
    private javax.swing.JTextField txtCliente;
    private javax.swing.JTextField txtMEs;
    // End of variables declaration//GEN-END:variables
}
