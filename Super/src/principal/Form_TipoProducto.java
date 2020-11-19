
package principal;

import javax.swing.JOptionPane;
import logica.CN_TipoProducto;

/**
 *
 * @author cerri
 */
public class Form_TipoProducto extends javax.swing.JPanel {

    /**
     * Creates new form Form_TipoProducto
     */
    
    CN_TipoProducto cnTipo = new CN_TipoProducto();
    public Form_TipoProducto() {
        initComponents();
        listarTipo("");
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        TablaTipo = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        btnGuardar = new rojeru_san.RSButtonRiple();
        btnUpdate = new rojeru_san.RSButtonRiple();
        btnDelete = new rojeru_san.RSButtonRiple();
        txtTipo = new rojeru_san.RSMTextFull();
        txtBuscar = new rojeru_san.RSMTextFull();

        setBackground(new java.awt.Color(28, 33, 53));

        TablaTipo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        TablaTipo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaTipoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TablaTipo);

        jLabel3.setFont(new java.awt.Font("Consolas", 0, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("TIPO DE PRODRUCTO");

        txtID.setBackground(new java.awt.Color(28, 33, 53));
        txtID.setFont(new java.awt.Font("Monospaced", 0, 16)); // NOI18N
        txtID.setForeground(new java.awt.Color(28, 33, 53));
        txtID.setBorder(null);
        txtID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIDKeyTyped(evt);
            }
        });

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

        txtTipo.setBackground(new java.awt.Color(28, 33, 53));
        txtTipo.setForeground(new java.awt.Color(255, 255, 255));
        txtTipo.setBordeColorFocus(new java.awt.Color(255, 255, 255));
        txtTipo.setBordeColorNoFocus(new java.awt.Color(255, 255, 255));
        txtTipo.setCaretColor(new java.awt.Color(255, 255, 255));
        txtTipo.setFont(new java.awt.Font("Roboto Bold", 0, 14)); // NOI18N
        txtTipo.setPlaceholder("Tipo de Producto");
        txtTipo.setSelectedTextColor(new java.awt.Color(255, 255, 255));

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(296, 296, 296)
                        .addComponent(jLabel3)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(740, Short.MAX_VALUE)
                        .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(189, 189, 189)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 443, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(78, 78, 78))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(70, 70, 70)
                .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(75, 75, 75)
                                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(214, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    
    public void listarTipo(String tipo){
        cnTipo.verTipo(TablaTipo, tipo);
    }
    private void txtIDKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIDKeyTyped

    }//GEN-LAST:event_txtIDKeyTyped

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        if (txtTipo.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Error: \n No deben haber campos vacíos.");
        }
        else {
            String tipo = this.txtTipo.getText();
            String mensaje = "";
            mensaje = cnTipo.insertTipoP(tipo);
            JOptionPane.showMessageDialog(null, mensaje);
            txtTipo.setText("");
            listarTipo("");
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        if (txtID.getText().isEmpty() || txtTipo.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Error: \n No deben haber campos vacíos.");
        }
        else {
            int id = Integer.parseInt(txtID.getText());
            String tipo = this.txtTipo.getText();
            String mensaje = "";
            mensaje = cnTipo.updateTipoP(id,tipo);
            JOptionPane.showMessageDialog(null, mensaje);
            txtTipo.setText("");
            txtID.setText("");
            listarTipo("");
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        if (txtID.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Error: \n No deben haber campos vacíos.");
        }
        else {
            int id = Integer.parseInt(txtID.getText());
            String mensaje = "";
            mensaje = cnTipo.deleteTipoP(id);
            JOptionPane.showMessageDialog(null, mensaje);
            txtTipo.setText("");
            txtID.setText("");
            listarTipo("");
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void TablaTipoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaTipoMouseClicked
         int seleccionar = TablaTipo.getSelectedRow();
        txtID.setText(TablaTipo.getValueAt(seleccionar, 0)+"");
        txtTipo.setText(TablaTipo.getValueAt(seleccionar, 1)+""); 
    }//GEN-LAST:event_TablaTipoMouseClicked

    private void txtBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyReleased
        listarTipo(txtBuscar.getText());
    }//GEN-LAST:event_txtBuscarKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablaTipo;
    private rojeru_san.RSButtonRiple btnDelete;
    private rojeru_san.RSButtonRiple btnGuardar;
    private rojeru_san.RSButtonRiple btnUpdate;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private rojeru_san.RSMTextFull txtBuscar;
    private javax.swing.JTextField txtID;
    private rojeru_san.RSMTextFull txtTipo;
    // End of variables declaration//GEN-END:variables
}
