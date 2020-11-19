
package principal;

import javax.swing.JOptionPane;
import logica.CN_Productos;
import logica.CN_TipoProducto;
import logica.CN_Ventas;
import logica.listarProductos;

/**
 *
 * @author cerri
 */
public class Form_Productos extends javax.swing.JPanel {

    /**
     * Creates new form Form_Productos
     */
    CN_Productos cnp = new CN_Productos();
    listarProductos lp = new listarProductos();
    CN_TipoProducto cntp = new CN_TipoProducto();
    String mensaje = "";
    public Form_Productos() {
        initComponents();
        listarProductos("");
        listarTipoP("");
        hide();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaTipos = new javax.swing.JTable();
        btnGuardar = new rojeru_san.RSButtonRiple();
        btnUpdate = new rojeru_san.RSButtonRiple();
        btnDelete = new rojeru_san.RSButtonRiple();
        txtTipoProducto = new rojeru_san.RSMTextFull();
        txtPrecio = new rojeru_san.RSMTextFull();
        txtProducto = new rojeru_san.RSMTextFull();
        txtID = new javax.swing.JTextField();
        txtStock = new rojeru_san.RSMTextFull();
        jScrollPane2 = new javax.swing.JScrollPane();
        TablaProductos = new javax.swing.JTable();
        txtBuscarTipo = new rojeru_san.RSMTextFull();
        txtBuscarProducto = new rojeru_san.RSMTextFull();

        setBackground(new java.awt.Color(28, 33, 53));

        jLabel3.setFont(new java.awt.Font("Consolas", 0, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("PRODUCTOS");

        TablaTipos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        TablaTipos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaTiposMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TablaTipos);

        btnGuardar.setText("GUARDAR");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnUpdate.setText("ACTUALIZAR");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnDelete.setText("ELIMINAR");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        txtTipoProducto.setBackground(new java.awt.Color(28, 33, 53));
        txtTipoProducto.setForeground(new java.awt.Color(255, 255, 255));
        txtTipoProducto.setBordeColorFocus(new java.awt.Color(255, 255, 255));
        txtTipoProducto.setBordeColorNoFocus(new java.awt.Color(255, 255, 255));
        txtTipoProducto.setCaretColor(new java.awt.Color(255, 255, 255));
        txtTipoProducto.setFont(new java.awt.Font("Roboto Bold", 0, 14)); // NOI18N
        txtTipoProducto.setPlaceholder("Tipo de Producto");
        txtTipoProducto.setSelectedTextColor(new java.awt.Color(255, 255, 255));

        txtPrecio.setBackground(new java.awt.Color(28, 33, 53));
        txtPrecio.setForeground(new java.awt.Color(255, 255, 255));
        txtPrecio.setBordeColorFocus(new java.awt.Color(255, 255, 255));
        txtPrecio.setBordeColorNoFocus(new java.awt.Color(255, 255, 255));
        txtPrecio.setCaretColor(new java.awt.Color(255, 255, 255));
        txtPrecio.setFont(new java.awt.Font("Roboto Bold", 0, 14)); // NOI18N
        txtPrecio.setPlaceholder("Precio");
        txtPrecio.setSelectedTextColor(new java.awt.Color(255, 255, 255));

        txtProducto.setBackground(new java.awt.Color(28, 33, 53));
        txtProducto.setForeground(new java.awt.Color(255, 255, 255));
        txtProducto.setBordeColorFocus(new java.awt.Color(255, 255, 255));
        txtProducto.setBordeColorNoFocus(new java.awt.Color(255, 255, 255));
        txtProducto.setCaretColor(new java.awt.Color(255, 255, 255));
        txtProducto.setFont(new java.awt.Font("Roboto Bold", 0, 14)); // NOI18N
        txtProducto.setPlaceholder("Producto");
        txtProducto.setSelectedTextColor(new java.awt.Color(255, 255, 255));

        txtID.setBackground(new java.awt.Color(28, 33, 53));
        txtID.setFont(new java.awt.Font("Monospaced", 0, 16)); // NOI18N
        txtID.setForeground(new java.awt.Color(28, 33, 53));
        txtID.setBorder(null);
        txtID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIDKeyTyped(evt);
            }
        });

        txtStock.setBackground(new java.awt.Color(28, 33, 53));
        txtStock.setForeground(new java.awt.Color(255, 255, 255));
        txtStock.setBordeColorFocus(new java.awt.Color(255, 255, 255));
        txtStock.setBordeColorNoFocus(new java.awt.Color(255, 255, 255));
        txtStock.setCaretColor(new java.awt.Color(255, 255, 255));
        txtStock.setFont(new java.awt.Font("Roboto Bold", 0, 14)); // NOI18N
        txtStock.setPlaceholder("Stock");
        txtStock.setSelectedTextColor(new java.awt.Color(255, 255, 255));

        TablaProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        TablaProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaProductosMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(TablaProductos);

        txtBuscarTipo.setBackground(new java.awt.Color(28, 33, 53));
        txtBuscarTipo.setForeground(new java.awt.Color(255, 255, 255));
        txtBuscarTipo.setBordeColorFocus(new java.awt.Color(255, 255, 255));
        txtBuscarTipo.setBordeColorNoFocus(new java.awt.Color(255, 255, 255));
        txtBuscarTipo.setCaretColor(new java.awt.Color(255, 255, 255));
        txtBuscarTipo.setFont(new java.awt.Font("Roboto Bold", 0, 14)); // NOI18N
        txtBuscarTipo.setPlaceholder("Buscar...");
        txtBuscarTipo.setSelectedTextColor(new java.awt.Color(255, 255, 255));
        txtBuscarTipo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtBuscarTipoKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarTipoKeyReleased(evt);
            }
        });

        txtBuscarProducto.setBackground(new java.awt.Color(28, 33, 53));
        txtBuscarProducto.setForeground(new java.awt.Color(255, 255, 255));
        txtBuscarProducto.setBordeColorFocus(new java.awt.Color(255, 255, 255));
        txtBuscarProducto.setBordeColorNoFocus(new java.awt.Color(255, 255, 255));
        txtBuscarProducto.setCaretColor(new java.awt.Color(255, 255, 255));
        txtBuscarProducto.setFont(new java.awt.Font("Roboto Bold", 0, 14)); // NOI18N
        txtBuscarProducto.setPlaceholder("Buscar...");
        txtBuscarProducto.setSelectedTextColor(new java.awt.Color(255, 255, 255));
        txtBuscarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarProductoActionPerformed(evt);
            }
        });
        txtBuscarProducto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtBuscarProductoKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarProductoKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(379, 379, 379)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtBuscarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 622, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(txtBuscarTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(txtProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtTipoProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(40, 40, 40)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(67, 67, 67))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTipoProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(44, 44, 44))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(txtBuscarTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)))
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtBuscarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    public void listarProductos(String producto){
        lp.verProductosFull(TablaProductos, producto);
    }
    public void listarP(String producto){
        lp.verProductos(TablaProductos, producto);
    } 
    public void listarTipoP(String tipo){
        cntp.verTipo(TablaTipos, tipo);
    }
    public void limpiar(){
        txtPrecio.setText("");
        txtProducto.setText("");
        txtStock.setText("");
        txtTipoProducto.setText("");
        txtID.setText("");
    }
    public void hide(){
        TablaProductos.getColumnModel().getColumn(5).setMaxWidth(0);
        TablaProductos.getColumnModel().getColumn(5).setMinWidth(0);
        TablaProductos.getColumnModel().getColumn(5).setPreferredWidth(0);
    }
    private void TablaTiposMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaTiposMouseClicked
        int seleccionar = TablaTipos.getSelectedRow();
        txtTipoProducto.setText(TablaTipos.getValueAt(seleccionar, 0)+""); 
    }//GEN-LAST:event_TablaTiposMouseClicked

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        if (txtTipoProducto.getText().isEmpty() || txtProducto.getText().isEmpty() || txtPrecio.getText().isEmpty() || txtStock.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Error: \n No deben haber campos vacíos.");
        }
        else{
            int tipo = Integer.parseInt(txtTipoProducto.getText());
            String producto = txtProducto.getText();
            Double precio = Double.parseDouble(txtPrecio.getText());
            int stock = Integer.parseInt(txtStock.getText());
            mensaje = cnp.insertProducto(tipo, producto, precio, stock);
            JOptionPane.showMessageDialog(null, mensaje);
            listarProductos("");
            hide();
            limpiar();
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        if (txtID.getText().isEmpty() ||txtTipoProducto.getText().isEmpty() || txtProducto.getText().isEmpty() || txtPrecio.getText().isEmpty() || txtStock.getText().isEmpty() ) {
            JOptionPane.showMessageDialog(null, "Error: \n No deben haber campos vacíos. \n Debe seleccionar una opcion." );
        }
        else{
            int id = Integer.parseInt(txtID.getText());
            int tipo = Integer.parseInt(txtTipoProducto.getText());
            String producto = txtProducto.getText();
            Double precio = Double.parseDouble(txtPrecio.getText());
            int stock = Integer.parseInt(txtStock.getText());
            mensaje = cnp.updateProducto(id,tipo, producto, precio, stock);
            JOptionPane.showMessageDialog(null, mensaje);
            listarProductos("");
            hide();
            limpiar();
        }
        
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        if (txtID.getText().isEmpty() || TablaProductos.getSelectedRow()<1) {
            JOptionPane.showMessageDialog(null, "Error: \n No deben haber campos vacíos.\n Debe seleccionar una opcion.");
        }
        else {
            int id = Integer.parseInt(txtID.getText());
            String mensaje = "";
            mensaje = cnp.deleteProducto(id);
            JOptionPane.showMessageDialog(null, mensaje);
            limpiar();
            listarProductos("");
            hide();
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void txtIDKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIDKeyTyped

    }//GEN-LAST:event_txtIDKeyTyped

    private void TablaProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaProductosMouseClicked
        int seleccionar = TablaProductos.getSelectedRow();
        txtID.setText(TablaProductos.getValueAt(seleccionar, 0)+"");
        txtProducto.setText(TablaProductos.getValueAt(seleccionar, 1)+""); 
        txtTipoProducto.setText(TablaProductos.getValueAt(seleccionar, 5)+"");
        txtPrecio.setText(TablaProductos.getValueAt(seleccionar, 3)+"");
        txtStock.setText(TablaProductos.getValueAt(seleccionar, 4)+"");
        
    }//GEN-LAST:event_TablaProductosMouseClicked

    private void txtBuscarTipoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarTipoKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscarTipoKeyPressed

    private void txtBuscarTipoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarTipoKeyReleased
        listarTipoP(txtBuscarTipo.getText());
    }//GEN-LAST:event_txtBuscarTipoKeyReleased

    private void txtBuscarProductoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarProductoKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscarProductoKeyPressed

    private void txtBuscarProductoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarProductoKeyReleased
        listarProductos(txtBuscarProducto.getText());
        hide();
    }//GEN-LAST:event_txtBuscarProductoKeyReleased

    private void txtBuscarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscarProductoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablaProductos;
    private javax.swing.JTable TablaTipos;
    private rojeru_san.RSButtonRiple btnDelete;
    private rojeru_san.RSButtonRiple btnGuardar;
    private rojeru_san.RSButtonRiple btnUpdate;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private rojeru_san.RSMTextFull txtBuscarProducto;
    private rojeru_san.RSMTextFull txtBuscarTipo;
    private javax.swing.JTextField txtID;
    private rojeru_san.RSMTextFull txtPrecio;
    private rojeru_san.RSMTextFull txtProducto;
    private rojeru_san.RSMTextFull txtStock;
    private rojeru_san.RSMTextFull txtTipoProducto;
    // End of variables declaration//GEN-END:variables
}
