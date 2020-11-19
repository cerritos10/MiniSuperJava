/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import logica.CN_Compra;
import logica.listarProductos;

/**
 *
 * @author cerri
 */
public class Form_Compra extends javax.swing.JPanel {

    CN_Compra cnc = new CN_Compra();
    listarProductos lp = new listarProductos();
    public Form_Compra() {
        initComponents();
        sumID();
        viewProductos("");
        Calendar calendar = new GregorianCalendar();
        int año,mes,dia;
        año = calendar.get(Calendar.YEAR);
        mes = calendar.get(Calendar.MONTH)+1;
        dia = calendar.get(Calendar.DAY_OF_MONTH);
        txtFecha.setText(dia+"/"+mes+"/"+año);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel9 = new javax.swing.JLabel();
        txtCosto = new rojeru_san.RSMTextFull();
        btnGuardar = new rojeru_san.RSButtonRiple();
        txtPoveedor = new rojeru_san.RSMTextFull();
        txtProducto = new rojeru_san.RSMTextFull();
        txtBuscar = new rojeru_san.RSMTextFull();
        txtDescripcion = new rojeru_san.RSMTextFull();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaCompra = new javax.swing.JTable();
        txtCant = new rojeru_san.RSMTextFull();
        txtPrecio = new rojeru_san.RSMTextFull();
        txtID = new javax.swing.JTextField();
        txtFecha = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        TablaProducto = new javax.swing.JTable();
        btnAgregar = new rojeru_san.RSButtonRiple();
        txtNameProduct = new javax.swing.JTextField();

        setBackground(new java.awt.Color(28, 33, 53));

        jLabel9.setFont(new java.awt.Font("Consolas", 0, 36)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("COMPRAS");

        txtCosto.setBackground(new java.awt.Color(28, 33, 53));
        txtCosto.setForeground(new java.awt.Color(255, 255, 255));
        txtCosto.setBordeColorFocus(new java.awt.Color(255, 255, 255));
        txtCosto.setBordeColorNoFocus(new java.awt.Color(255, 255, 255));
        txtCosto.setCaretColor(new java.awt.Color(255, 255, 255));
        txtCosto.setFont(new java.awt.Font("Roboto Bold", 0, 14)); // NOI18N
        txtCosto.setPlaceholder("Costo");
        txtCosto.setSelectedTextColor(new java.awt.Color(255, 255, 255));

        btnGuardar.setText("GUARDAR");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        txtPoveedor.setBackground(new java.awt.Color(28, 33, 53));
        txtPoveedor.setForeground(new java.awt.Color(255, 255, 255));
        txtPoveedor.setBordeColorFocus(new java.awt.Color(255, 255, 255));
        txtPoveedor.setBordeColorNoFocus(new java.awt.Color(255, 255, 255));
        txtPoveedor.setCaretColor(new java.awt.Color(255, 255, 255));
        txtPoveedor.setFont(new java.awt.Font("Roboto Bold", 0, 14)); // NOI18N
        txtPoveedor.setPlaceholder("Proveedor");
        txtPoveedor.setSelectedTextColor(new java.awt.Color(255, 255, 255));

        txtProducto.setBackground(new java.awt.Color(28, 33, 53));
        txtProducto.setForeground(new java.awt.Color(255, 255, 255));
        txtProducto.setBordeColorFocus(new java.awt.Color(255, 255, 255));
        txtProducto.setBordeColorNoFocus(new java.awt.Color(255, 255, 255));
        txtProducto.setCaretColor(new java.awt.Color(255, 255, 255));
        txtProducto.setFont(new java.awt.Font("Roboto Bold", 0, 14)); // NOI18N
        txtProducto.setPlaceholder("Producto");
        txtProducto.setSelectedTextColor(new java.awt.Color(255, 255, 255));

        txtBuscar.setBackground(new java.awt.Color(28, 33, 53));
        txtBuscar.setForeground(new java.awt.Color(255, 255, 255));
        txtBuscar.setBordeColorFocus(new java.awt.Color(255, 255, 255));
        txtBuscar.setBordeColorNoFocus(new java.awt.Color(255, 255, 255));
        txtBuscar.setCaretColor(new java.awt.Color(255, 255, 255));
        txtBuscar.setFont(new java.awt.Font("Roboto Bold", 0, 14)); // NOI18N
        txtBuscar.setPlaceholder("Buscar...");
        txtBuscar.setSelectedTextColor(new java.awt.Color(255, 255, 255));
        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarKeyReleased(evt);
            }
        });

        txtDescripcion.setBackground(new java.awt.Color(28, 33, 53));
        txtDescripcion.setForeground(new java.awt.Color(255, 255, 255));
        txtDescripcion.setBordeColorFocus(new java.awt.Color(255, 255, 255));
        txtDescripcion.setBordeColorNoFocus(new java.awt.Color(255, 255, 255));
        txtDescripcion.setCaretColor(new java.awt.Color(255, 255, 255));
        txtDescripcion.setFont(new java.awt.Font("Roboto Bold", 0, 14)); // NOI18N
        txtDescripcion.setPlaceholder("Descripcion");
        txtDescripcion.setSelectedTextColor(new java.awt.Color(255, 255, 255));

        TablaCompra.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Id Producto", "Producto", "Cantidad", "Precio", "Costo", "Proveedor", "Fecha", "Descripcion"
            }
        ));
        TablaCompra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaCompraMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TablaCompra);

        txtCant.setBackground(new java.awt.Color(28, 33, 53));
        txtCant.setForeground(new java.awt.Color(255, 255, 255));
        txtCant.setBordeColorFocus(new java.awt.Color(255, 255, 255));
        txtCant.setBordeColorNoFocus(new java.awt.Color(255, 255, 255));
        txtCant.setCaretColor(new java.awt.Color(255, 255, 255));
        txtCant.setFont(new java.awt.Font("Roboto Bold", 0, 14)); // NOI18N
        txtCant.setPlaceholder("Cantidad");
        txtCant.setSelectedTextColor(new java.awt.Color(255, 255, 255));

        txtPrecio.setBackground(new java.awt.Color(28, 33, 53));
        txtPrecio.setForeground(new java.awt.Color(255, 255, 255));
        txtPrecio.setBordeColorFocus(new java.awt.Color(255, 255, 255));
        txtPrecio.setBordeColorNoFocus(new java.awt.Color(255, 255, 255));
        txtPrecio.setCaretColor(new java.awt.Color(255, 255, 255));
        txtPrecio.setFont(new java.awt.Font("Roboto Bold", 0, 14)); // NOI18N
        txtPrecio.setPlaceholder("Precio");
        txtPrecio.setSelectedTextColor(new java.awt.Color(255, 255, 255));

        txtID.setEditable(false);
        txtID.setBackground(new java.awt.Color(28, 33, 53));
        txtID.setFont(new java.awt.Font("Monospaced", 0, 16)); // NOI18N
        txtID.setForeground(new java.awt.Color(28, 33, 53));
        txtID.setBorder(null);
        txtID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIDKeyTyped(evt);
            }
        });

        txtFecha.setBackground(new java.awt.Color(28, 33, 53));
        txtFecha.setFont(new java.awt.Font("Monospaced", 0, 16)); // NOI18N
        txtFecha.setForeground(new java.awt.Color(204, 204, 204));
        txtFecha.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtFecha.setText("fecha");
        txtFecha.setBorder(null);
        txtFecha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtFechaKeyTyped(evt);
            }
        });

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
        jScrollPane2.setViewportView(TablaProducto);

        btnAgregar.setText("AGREGAR");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        txtNameProduct.setEditable(false);
        txtNameProduct.setBackground(new java.awt.Color(28, 33, 53));
        txtNameProduct.setFont(new java.awt.Font("Monospaced", 0, 16)); // NOI18N
        txtNameProduct.setForeground(new java.awt.Color(28, 33, 53));
        txtNameProduct.setBorder(null);
        txtNameProduct.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNameProductKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(10, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 27, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 655, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(txtProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtCant, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtPoveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(60, 60, 60)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtCosto, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                                            .addComponent(txtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                                            .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGap(13, 13, 13)
                                        .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(36, 36, 36)
                                        .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(154, 154, 154)
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(45, 45, 45))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(350, 350, 350)
                                .addComponent(txtNameProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNameProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCosto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPoveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );
    }// </editor-fold>//GEN-END:initComponents

    public void viewProductos(String producto){
        lp.verProductos(TablaProducto,producto);
    }
    public void sumID(){
        int id;
        id = cnc.IdCompra();
        txtID.setText(id + "");
    }
    public void guardarCompra(){
        boolean compra;
        compra = cnc.insertCompra(TablaCompra);
        if (compra == true) {
            JOptionPane.showMessageDialog(null, "Datos registrados correctamente");
        }
        else {
         JOptionPane.showMessageDialog(null, "Error en la compra!");
        }
    }
    public void limpiar(){
        txtCant.setText("");
        txtCosto.setText("");
        txtDescripcion.setText("");
        txtFecha.setText("");
        txtNameProduct.setText("");
        txtPoveedor.setText("");
        txtPrecio.setText("");
        txtProducto.setText("");
    }
    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        guardarCompra();
         limpiar();
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void txtBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyReleased
        viewProductos(txtBuscar.getText());
    }//GEN-LAST:event_txtBuscarKeyReleased

    private void TablaCompraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaCompraMouseClicked
        int seleccionar = TablaCompra.getSelectedRow();
        txtID.setText(TablaCompra.getValueAt(seleccionar, 0)+"");
        txtProducto.setText(TablaCompra.getValueAt(seleccionar, 1)+"");
        txtCant.setText(TablaCompra.getValueAt(seleccionar, 2)+"");
        txtPrecio.setText(TablaCompra.getValueAt(seleccionar, 3)+"");
        txtCosto.setText(TablaCompra.getValueAt(seleccionar, 4)+"");
        txtPoveedor.setText(TablaCompra.getValueAt(seleccionar, 5)+"");
        txtDescripcion.setText(TablaCompra.getValueAt(seleccionar, 6)+"");
    }//GEN-LAST:event_TablaCompraMouseClicked

    private void txtIDKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIDKeyTyped

    }//GEN-LAST:event_txtIDKeyTyped

    private void txtFechaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFechaKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFechaKeyTyped

    private void TablaProductoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaProductoMouseClicked
        int seleccionar = TablaProducto.getSelectedRow();
        txtProducto.setText(TablaProducto.getValueAt(seleccionar, 0)+"");
        txtNameProduct.setText(TablaProducto.getValueAt(seleccionar, 1)+"");
    }//GEN-LAST:event_TablaProductoMouseClicked

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        
        DateFormat f = new SimpleDateFormat("dd/MM/yyyy");
        
        try {
        int id = Integer.parseInt(txtID.getText());
        int ipP = Integer.parseInt(txtProducto.getText());
        String nameP = txtNameProduct.getText();
        int cant = Integer.parseInt(txtCant.getText());
        double pre = Double.parseDouble(txtPrecio.getText());
        double costo = Double.parseDouble(txtCosto.getText());
        String provv = txtPoveedor.getText();
        Date fecha = f.parse(txtFecha.getText());
        String descri = txtDescripcion.getText();
        cnc.llenarTabla(id,ipP,nameP, cant, pre, costo, provv, fecha, descri, TablaCompra);
        
        } catch (ParseException ex) {
            Logger.getLogger(Form_Compra.class.getName()).log(Level.SEVERE, null, ex);
        }
//        limpiar();
        
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void txtNameProductKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNameProductKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameProductKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablaCompra;
    private javax.swing.JTable TablaProducto;
    private rojeru_san.RSButtonRiple btnAgregar;
    private rojeru_san.RSButtonRiple btnGuardar;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private rojeru_san.RSMTextFull txtBuscar;
    private rojeru_san.RSMTextFull txtCant;
    private rojeru_san.RSMTextFull txtCosto;
    private rojeru_san.RSMTextFull txtDescripcion;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtNameProduct;
    private rojeru_san.RSMTextFull txtPoveedor;
    private rojeru_san.RSMTextFull txtPrecio;
    private rojeru_san.RSMTextFull txtProducto;
    // End of variables declaration//GEN-END:variables
}
