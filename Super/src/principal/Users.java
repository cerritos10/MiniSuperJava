/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import Entidad.Usuarios;
import Controller.UsuariosJpaController;
import Entidad.entityMain;
import javax.swing.JOptionPane;
import logica.CN_Users;



/**
 *
 * @author cerri
 */
public class Users extends javax.swing.JPanel {

    /**
     * Creates new form Usuarios
     */
    private CN_Users cnUsers = new CN_Users();
    public Users() {
        initComponents();
        listarUser();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGuardar = new rojeru_san.RSButtonRiple();
        btnUpdate1 = new rojeru_san.RSButtonRiple();
        btnDelete1 = new rojeru_san.RSButtonRiple();
        txtpass = new rojeru_san.RSMTextFull();
        txtTelefono = new rojeru_san.RSMTextFull();
        txtDirec = new rojeru_san.RSMTextFull();
        txtId = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtdui = new rojeru_san.RSMTextFull();
        txtusername = new rojeru_san.RSMTextFull();
        txtnombre = new rojeru_san.RSMTextFull();
        txtBuscar = new rojeru_san.RSMTextFull();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaUsuarios = new javax.swing.JTable();

        setBackground(new java.awt.Color(28, 33, 53));

        btnGuardar.setText("GUARDAR");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnUpdate1.setText("ACTUALIZAR");
        btnUpdate1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdate1ActionPerformed(evt);
            }
        });

        btnDelete1.setText("ELIMINAR");
        btnDelete1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDelete1ActionPerformed(evt);
            }
        });

        txtpass.setBackground(new java.awt.Color(28, 33, 53));
        txtpass.setForeground(new java.awt.Color(255, 255, 255));
        txtpass.setBordeColorFocus(new java.awt.Color(255, 255, 255));
        txtpass.setBordeColorNoFocus(new java.awt.Color(255, 255, 255));
        txtpass.setCaretColor(new java.awt.Color(255, 255, 255));
        txtpass.setFont(new java.awt.Font("Roboto Bold", 0, 14)); // NOI18N
        txtpass.setPlaceholder("Password");
        txtpass.setSelectedTextColor(new java.awt.Color(255, 255, 255));

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

        txtId.setBackground(new java.awt.Color(28, 33, 53));
        txtId.setFont(new java.awt.Font("Monospaced", 0, 16)); // NOI18N
        txtId.setForeground(new java.awt.Color(28, 33, 53));
        txtId.setBorder(null);
        txtId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIdKeyTyped(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Consolas", 0, 36)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("USUARIOS");

        txtdui.setBackground(new java.awt.Color(28, 33, 53));
        txtdui.setForeground(new java.awt.Color(255, 255, 255));
        txtdui.setBordeColorFocus(new java.awt.Color(255, 255, 255));
        txtdui.setBordeColorNoFocus(new java.awt.Color(255, 255, 255));
        txtdui.setCaretColor(new java.awt.Color(255, 255, 255));
        txtdui.setFont(new java.awt.Font("Roboto Bold", 0, 14)); // NOI18N
        txtdui.setPlaceholder("DUI");
        txtdui.setSelectedTextColor(new java.awt.Color(255, 255, 255));

        txtusername.setBackground(new java.awt.Color(28, 33, 53));
        txtusername.setForeground(new java.awt.Color(255, 255, 255));
        txtusername.setBordeColorFocus(new java.awt.Color(255, 255, 255));
        txtusername.setBordeColorNoFocus(new java.awt.Color(255, 255, 255));
        txtusername.setCaretColor(new java.awt.Color(255, 255, 255));
        txtusername.setFont(new java.awt.Font("Roboto Bold", 0, 14)); // NOI18N
        txtusername.setPlaceholder("Username");
        txtusername.setSelectedTextColor(new java.awt.Color(255, 255, 255));

        txtnombre.setBackground(new java.awt.Color(28, 33, 53));
        txtnombre.setForeground(new java.awt.Color(255, 255, 255));
        txtnombre.setBordeColorFocus(new java.awt.Color(255, 255, 255));
        txtnombre.setBordeColorNoFocus(new java.awt.Color(255, 255, 255));
        txtnombre.setCaretColor(new java.awt.Color(255, 255, 255));
        txtnombre.setFont(new java.awt.Font("Roboto Bold", 0, 14)); // NOI18N
        txtnombre.setPlaceholder("Nombre");
        txtnombre.setSelectedTextColor(new java.awt.Color(255, 255, 255));

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

        TablaUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        TablaUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaUsuariosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TablaUsuarios);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addGap(430, 430, 430))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(85, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtdui, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtusername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtpass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDirec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(63, 63, 63)
                                .addComponent(btnUpdate1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34)
                                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)
                                .addComponent(btnDelete1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(121, 121, 121)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 530, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(txtBuscar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(82, 82, 82))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel9))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(24, 24, 24)
                .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtDirec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtdui, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtusername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtpass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 177, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnUpdate1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnDelete1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void limpiar(){
        txtId.setText("");
        txtnombre.setText("");
        txtpass.setText("");
        txtTelefono.setText("");
        txtDirec.setText("");
        txtdui.setText("");
        txtusername.setText("");
        txtpass.setText("");
    }
    
    private void listarUser(){
       cnUsers.listarUsers(TablaUsuarios);
    }
    public void viewClientes(String nombre){
        cnUsers.verUsuarios(TablaUsuarios,nombre);
    }
    
    private void txtIdKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdKeyTyped

    }//GEN-LAST:event_txtIdKeyTyped

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
       if (txtnombre.getText().isEmpty() || txtTelefono.getText().isEmpty() || txtDirec.getText().isEmpty() ||
                txtdui.getText().isEmpty() || txtusername.getText().isEmpty() || txtpass.getText().isEmpty()) 
        {
            JOptionPane.showMessageDialog(null, "No deben haber campos vacíos.");
        }
        else{
            String nombre = this.txtnombre.getText();
            String telefono = this.txtTelefono.getText();
            String direccion = this.txtDirec.getText();
            String dui = this.txtdui.getText();
            String user = this.txtusername.getText();
            String pass = this.txtpass.getText();
            String mensaje = "";
            mensaje = cnUsers.insertUser(nombre, telefono, direccion, dui, user, pass);
            JOptionPane.showMessageDialog(null, mensaje);
            limpiar();
            listarUser();
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnUpdate1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdate1ActionPerformed
          if (txtId.getText().isEmpty() || txtnombre.getText().isEmpty() || txtTelefono.getText().isEmpty() || txtDirec.getText().isEmpty() ||
                txtdui.getText().isEmpty() || txtusername.getText().isEmpty() || txtpass.getText().isEmpty()) 
        {
            JOptionPane.showMessageDialog(null, "No deben haber campos vacíos.");
        }
        else{
            int id = Integer.parseInt(txtId.getText());
            String nombre = this.txtnombre.getText();
            String telefono = this.txtTelefono.getText();
            String direccion = this.txtDirec.getText();
            String dui = this.txtdui.getText();
            String user = this.txtusername.getText();
            String pass = this.txtpass.getText();
            String mensaje = "";
            mensaje = cnUsers.updateUser(id, nombre, telefono, direccion, dui, user, pass);
            JOptionPane.showMessageDialog(null, mensaje);
            limpiar();
            listarUser();
        }
    }//GEN-LAST:event_btnUpdate1ActionPerformed

    private void btnDelete1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelete1ActionPerformed
        if (txtId.getText().isEmpty() || txtpass.getText().isEmpty() || txtTelefono.getText().isEmpty() || txtDirec.getText().isEmpty() ||
                txtdui.getText().isEmpty() || txtusername.getText().isEmpty() || txtpass.getText().isEmpty()) 
        {
            JOptionPane.showMessageDialog(null, "No deben haber campos vacíos.");
        }
        else{
            int id = Integer.parseInt(txtId.getText());
            String mensaje = "";
            mensaje = cnUsers.deleteUser(id);
            JOptionPane.showMessageDialog(null, mensaje);
            limpiar();
            listarUser();
        }
    }//GEN-LAST:event_btnDelete1ActionPerformed

    private void TablaUsuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaUsuariosMouseClicked
        int seleccionar = TablaUsuarios.getSelectedRow();
        txtId.setText(TablaUsuarios.getValueAt(seleccionar, 0)+"");
        txtnombre.setText(TablaUsuarios.getValueAt(seleccionar, 1)+"");      
        txtTelefono.setText(TablaUsuarios.getValueAt(seleccionar, 2)+"");
        txtDirec.setText(TablaUsuarios.getValueAt(seleccionar, 3)+"");
        txtdui.setText(TablaUsuarios.getValueAt(seleccionar, 4)+"");
        txtusername.setText(TablaUsuarios.getValueAt(seleccionar, 5)+"");
        txtpass.setText(TablaUsuarios.getValueAt(seleccionar, 6)+"");
    }//GEN-LAST:event_TablaUsuariosMouseClicked

    private void txtBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyReleased
        viewClientes(txtBuscar.getText());
    }//GEN-LAST:event_txtBuscarKeyReleased

 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablaUsuarios;
    private rojeru_san.RSButtonRiple btnDelete1;
    private rojeru_san.RSButtonRiple btnGuardar;
    private rojeru_san.RSButtonRiple btnUpdate1;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private rojeru_san.RSMTextFull txtBuscar;
    private rojeru_san.RSMTextFull txtDirec;
    private javax.swing.JTextField txtId;
    private rojeru_san.RSMTextFull txtTelefono;
    private rojeru_san.RSMTextFull txtdui;
    private rojeru_san.RSMTextFull txtnombre;
    private rojeru_san.RSMTextFull txtpass;
    private rojeru_san.RSMTextFull txtusername;
    // End of variables declaration//GEN-END:variables
}
