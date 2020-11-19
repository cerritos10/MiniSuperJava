
package principal;

import javax.swing.JOptionPane;
import logica.CN_Clientes;


/**
 *
 * @author cerri
 */
public class Form_Clientes extends javax.swing.JPanel {
    
    private CN_Clientes cnClientes = new CN_Clientes();
    
    public Form_Clientes() {
        initComponents();
        listarClientes();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        TablaClientes = new javax.swing.JTable();
        btnGuardar = new rojeru_san.RSButtonRiple();
        btnUpdate = new rojeru_san.RSButtonRiple();
        btnDelete = new rojeru_san.RSButtonRiple();
        txtnombre = new rojeru_san.RSMTextFull();
        txtTelefono = new rojeru_san.RSMTextFull();
        txtDirec = new rojeru_san.RSMTextFull();
        txtID = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtBuscar = new rojeru_san.RSMTextFull();

        setBackground(new java.awt.Color(28, 33, 53));

        TablaClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        TablaClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaClientesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TablaClientes);

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

        txtnombre.setBackground(new java.awt.Color(28, 33, 53));
        txtnombre.setForeground(new java.awt.Color(255, 255, 255));
        txtnombre.setBordeColorFocus(new java.awt.Color(255, 255, 255));
        txtnombre.setBordeColorNoFocus(new java.awt.Color(255, 255, 255));
        txtnombre.setCaretColor(new java.awt.Color(255, 255, 255));
        txtnombre.setFont(new java.awt.Font("Roboto Bold", 0, 14)); // NOI18N
        txtnombre.setPlaceholder("Nombre");
        txtnombre.setSelectedTextColor(new java.awt.Color(255, 255, 255));

        txtTelefono.setBackground(new java.awt.Color(28, 33, 53));
        txtTelefono.setForeground(new java.awt.Color(255, 255, 255));
        txtTelefono.setBordeColorFocus(new java.awt.Color(255, 255, 255));
        txtTelefono.setBordeColorNoFocus(new java.awt.Color(255, 255, 255));
        txtTelefono.setCaretColor(new java.awt.Color(255, 255, 255));
        txtTelefono.setFont(new java.awt.Font("Roboto Bold", 0, 14)); // NOI18N
        txtTelefono.setPlaceholder("Telefóno");
        txtTelefono.setSelectedTextColor(new java.awt.Color(255, 255, 255));

        txtDirec.setBackground(new java.awt.Color(28, 33, 53));
        txtDirec.setForeground(new java.awt.Color(255, 255, 255));
        txtDirec.setBordeColorFocus(new java.awt.Color(255, 255, 255));
        txtDirec.setBordeColorNoFocus(new java.awt.Color(255, 255, 255));
        txtDirec.setCaretColor(new java.awt.Color(255, 255, 255));
        txtDirec.setFont(new java.awt.Font("Roboto Bold", 0, 14)); // NOI18N
        txtDirec.setPlaceholder("Dirección");
        txtDirec.setSelectedTextColor(new java.awt.Color(255, 255, 255));

        txtID.setBackground(new java.awt.Color(28, 33, 53));
        txtID.setFont(new java.awt.Font("Monospaced", 0, 16)); // NOI18N
        txtID.setForeground(new java.awt.Color(28, 33, 53));
        txtID.setBorder(null);
        txtID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIDKeyTyped(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Consolas", 0, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("CLIENTES");

        txtBuscar.setBackground(new java.awt.Color(28, 33, 53));
        txtBuscar.setForeground(new java.awt.Color(255, 255, 255));
        txtBuscar.setBordeColorFocus(new java.awt.Color(255, 255, 255));
        txtBuscar.setBordeColorNoFocus(new java.awt.Color(255, 255, 255));
        txtBuscar.setCaretColor(new java.awt.Color(255, 255, 255));
        txtBuscar.setFont(new java.awt.Font("Roboto Bold", 0, 14)); // NOI18N
        txtBuscar.setPlaceholder("Buscar...");
        txtBuscar.setSelectedTextColor(new java.awt.Color(255, 255, 255));
        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtBuscarKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarKeyReleased(evt);
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
                .addContainerGap(480, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(756, Short.MAX_VALUE)
                        .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap(136, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtDirec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(60, 60, 60))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 560, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(74, 74, 74))
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
                .addGap(18, 18, 18)
                .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(txtDirec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(279, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    
    public void listarClientes(){
        cnClientes.listarClientes(TablaClientes);
    }
    private void limpiar(){
        txtID.setText("");
        txtnombre.setText("");
        txtTelefono.setText("");
        txtDirec.setText("");
    }
    public void viewClientes(String nombre){
        cnClientes.verClientes(TablaClientes,nombre);
    }
    private void txtIDKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIDKeyTyped

    }//GEN-LAST:event_txtIDKeyTyped

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        if (txtnombre.getText().isEmpty() || txtDirec.getText().isEmpty() || txtTelefono.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "No deben haber campos vacíos.");
        }
        else {
            String nombre = this.txtnombre.getText();
            String telefono = this.txtTelefono.getText();
            String direccion = this.txtDirec.getText();
            String mensaje = "";
            mensaje = cnClientes.insertCliente(nombre, direccion, telefono);
            JOptionPane.showMessageDialog(null, mensaje);
            limpiar();
            listarClientes();
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void txtBuscarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyPressed

    }//GEN-LAST:event_txtBuscarKeyPressed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        if (txtnombre.getText().isEmpty() || txtDirec.getText().isEmpty() || txtID.getText().isEmpty() || txtTelefono.getText().isEmpty()) 
        {
                JOptionPane.showMessageDialog(null, "No deben haber campos vacíos.");
        }
        else {
            int id = Integer.parseInt(txtID.getText());
            String nombre = this.txtnombre.getText();
            String direccion = this.txtDirec.getText();
            String telefono = this.txtTelefono.getText();
            String mensaje = "";
            mensaje = cnClientes.updateCliente(id,nombre, direccion, telefono);
            JOptionPane.showMessageDialog(null, mensaje);
            limpiar();
            listarClientes();
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        if (txtnombre.getText().isEmpty() || txtDirec.getText().isEmpty() || txtID.getText().isEmpty() || txtTelefono.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "No deben haber campos vacíos.");
        }
        else {
            int id = Integer.parseInt(txtID.getText());
            String mensaje = "";
            mensaje = cnClientes.deleteCliente(id);
            JOptionPane.showMessageDialog(null, mensaje);
            limpiar();
            listarClientes();
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void TablaClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaClientesMouseClicked
        int seleccionar = TablaClientes.getSelectedRow();
        txtID.setText(TablaClientes.getValueAt(seleccionar, 0)+"");
        txtnombre.setText(TablaClientes.getValueAt(seleccionar, 1)+""); 
        txtDirec.setText(TablaClientes.getValueAt(seleccionar, 2)+"");
        txtTelefono.setText(TablaClientes.getValueAt(seleccionar, 3)+""); 
    }//GEN-LAST:event_TablaClientesMouseClicked

    private void txtBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyReleased
        viewClientes(txtBuscar.getText());
    }//GEN-LAST:event_txtBuscarKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablaClientes;
    private rojeru_san.RSButtonRiple btnDelete;
    private rojeru_san.RSButtonRiple btnGuardar;
    private rojeru_san.RSButtonRiple btnUpdate;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private rojeru_san.RSMTextFull txtBuscar;
    private rojeru_san.RSMTextFull txtDirec;
    private javax.swing.JTextField txtID;
    private rojeru_san.RSMTextFull txtTelefono;
    private rojeru_san.RSMTextFull txtnombre;
    // End of variables declaration//GEN-END:variables
}
