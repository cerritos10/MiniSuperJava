/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import java.awt.event.KeyEvent;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import logica.CN_Ventas;
import logica.CN_Detalle;
import logica.CN_Stock;
import logica.InicioSesion;
import logica.listarClientes;
import logica.listarProductos;
import logica.sesion;
/**
 *
 * @author cerri
 */
public final class Form_Venta extends javax.swing.JPanel {

    /**
     * Creates new form Form_Venta
     */
    private CN_Ventas cnv = new CN_Ventas();
    private CN_Detalle cnd = new CN_Detalle();
    private CN_Stock cns = new CN_Stock();
    private listarClientes lc = new listarClientes();
    private listarProductos lp = new listarProductos();
    DefaultTableModel modelo = new DefaultTableModel();
    private InicioSesion in = new InicioSesion();
    
    double totalpagar,pre ;
    int cant;
    
    private CN_Detalle dd= new CN_Detalle();
    public Form_Venta() {
        initComponents();
        Calendar calendar = new GregorianCalendar();
        int año,mes,dia;
        año = calendar.get(Calendar.YEAR);
        mes = calendar.get(Calendar.MONTH)+1;
        dia = calendar.get(Calendar.DAY_OF_MONTH);
        txtFecha.setText(dia+"/"+mes+"/"+año);
        generarSerie();
        txtBuscarPro.setVisible(false);
        llenarUsuario(txtUser);
        idSumVentas();
        btnImprimir.setEnabled(false);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGuardar = new rojeru_san.RSButtonRiple();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableVenta = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        ver = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TablaCliente = new javax.swing.JTable();
        txtStock = new rojeru_san.RSMTextFull();
        txtPrecVenta = new rojeru_san.RSMTextFull();
        txtCant = new rojeru_san.RSMTextFull();
        txtNSerie = new javax.swing.JTextField();
        txtFecha = new javax.swing.JTextField();
        txtID = new javax.swing.JTextField();
        btnVerPRoductos = new rojeru_san.RSButtonRiple();
        btnVerClientes = new rojeru_san.RSButtonRiple();
        jScrollPane3 = new javax.swing.JScrollPane();
        TablaProducto = new javax.swing.JTable();
        txtNameProduct = new javax.swing.JTextField();
        btnagg = new rojeru_san.RSButtonRiple();
        jLabel1 = new javax.swing.JLabel();
        txtTotalPagar = new javax.swing.JTextField();
        txtBuscarCli = new rojeru_san.RSMTextFull();
        txtBuscarPro = new rojeru_san.RSMTextFull();
        jSeparator1 = new javax.swing.JSeparator();
        txtUser = new javax.swing.JTextField();
        txtFactura = new javax.swing.JTextField();
        btnImprimir = new rojeru_san.RSButtonRiple();
        txt_nProducto = new rojeru_san.RSMTextFull();
        txt_nCliente = new rojeru_san.RSMTextFull();
        txtProducto = new javax.swing.JTextField();
        txtCliente = new javax.swing.JTextField();

        setBackground(new java.awt.Color(28, 33, 53));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnGuardar.setText("GUARDAR");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 320, 100, -1));

        TableVenta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "N", "ID_P", "PRODUCTO", "CANTIDAD", "STOCK", "PRECIO", "TOTAL"
            }
        ));
        TableVenta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TableVentaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TableVenta);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 380, 525, 160));

        jLabel9.setFont(new java.awt.Font("Consolas", 0, 36)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("VENTAS");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 10, -1, -1));

        ver.setBackground(new java.awt.Color(28, 33, 53));
        ver.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        TablaCliente.addHierarchyBoundsListener(new java.awt.event.HierarchyBoundsListener() {
            public void ancestorMoved(java.awt.event.HierarchyEvent evt) {
            }
            public void ancestorResized(java.awt.event.HierarchyEvent evt) {
                TablaClienteAncestorResized(evt);
            }
        });
        TablaCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaClienteMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(TablaCliente);

        ver.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 300, 170));

        add(ver, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 130, 320, 190));

        txtStock.setBackground(new java.awt.Color(28, 33, 53));
        txtStock.setForeground(new java.awt.Color(255, 255, 255));
        txtStock.setBordeColorFocus(new java.awt.Color(255, 255, 255));
        txtStock.setBordeColorNoFocus(new java.awt.Color(255, 255, 255));
        txtStock.setCaretColor(new java.awt.Color(255, 255, 255));
        txtStock.setFont(new java.awt.Font("Roboto Bold", 0, 14)); // NOI18N
        txtStock.setPlaceholder("Stock");
        txtStock.setSelectedTextColor(new java.awt.Color(255, 255, 255));
        txtStock.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtStockKeyTyped(evt);
            }
        });
        add(txtStock, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 180, 194, 33));

        txtPrecVenta.setBackground(new java.awt.Color(28, 33, 53));
        txtPrecVenta.setForeground(new java.awt.Color(255, 255, 255));
        txtPrecVenta.setBordeColorFocus(new java.awt.Color(255, 255, 255));
        txtPrecVenta.setBordeColorNoFocus(new java.awt.Color(255, 255, 255));
        txtPrecVenta.setCaretColor(new java.awt.Color(255, 255, 255));
        txtPrecVenta.setFont(new java.awt.Font("Roboto Bold", 0, 14)); // NOI18N
        txtPrecVenta.setPlaceholder("Precio Venta");
        txtPrecVenta.setSelectedTextColor(new java.awt.Color(255, 255, 255));
        txtPrecVenta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPrecVentaKeyTyped(evt);
            }
        });
        add(txtPrecVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 120, 194, 33));

        txtCant.setBackground(new java.awt.Color(28, 33, 53));
        txtCant.setForeground(new java.awt.Color(255, 255, 255));
        txtCant.setBordeColorFocus(new java.awt.Color(255, 255, 255));
        txtCant.setBordeColorNoFocus(new java.awt.Color(255, 255, 255));
        txtCant.setCaretColor(new java.awt.Color(255, 255, 255));
        txtCant.setFont(new java.awt.Font("Roboto Bold", 0, 14)); // NOI18N
        txtCant.setPlaceholder("Cantidad");
        txtCant.setSelectedTextColor(new java.awt.Color(255, 255, 255));
        txtCant.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCantKeyTyped(evt);
            }
        });
        add(txtCant, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 230, 194, 33));

        txtNSerie.setBackground(new java.awt.Color(28, 33, 53));
        txtNSerie.setForeground(new java.awt.Color(255, 255, 255));
        txtNSerie.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNSerie.setText("Serie");
        txtNSerie.setBorder(null);
        txtNSerie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNSerieActionPerformed(evt);
            }
        });
        add(txtNSerie, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 50, 110, 30));

        txtFecha.setBackground(new java.awt.Color(28, 33, 53));
        txtFecha.setForeground(new java.awt.Color(255, 255, 255));
        txtFecha.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtFecha.setText("fecha");
        txtFecha.setBorder(null);
        txtFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFechaActionPerformed(evt);
            }
        });
        add(txtFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 50, 90, 30));

        txtID.setBackground(new java.awt.Color(28, 33, 53));
        txtID.setForeground(new java.awt.Color(28, 33, 53));
        txtID.setText("jTextField1");
        txtID.setBorder(null);
        add(txtID, new org.netbeans.lib.awtextra.AbsoluteConstraints(107, 25, -1, -1));

        btnVerPRoductos.setText("Ver Productos");
        btnVerPRoductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerPRoductosActionPerformed(evt);
            }
        });
        add(btnVerPRoductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 330, 127, -1));

        btnVerClientes.setText("Ver Clientes");
        btnVerClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerClientesActionPerformed(evt);
            }
        });
        add(btnVerClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 330, 113, -1));

        TablaProducto.setBackground(new java.awt.Color(204, 204, 0));
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
        jScrollPane3.setViewportView(TablaProducto);

        add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 140, 300, 170));

        txtNameProduct.setBackground(new java.awt.Color(28, 33, 53));
        txtNameProduct.setForeground(new java.awt.Color(28, 33, 53));
        txtNameProduct.setBorder(null);
        add(txtNameProduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(84, 47, 110, -1));

        btnagg.setText("AGREGAR");
        btnagg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaggActionPerformed(evt);
            }
        });
        add(btnagg, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 320, 100, -1));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Total a Pagar: ");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(436, 570, -1, -1));

        txtTotalPagar.setBackground(new java.awt.Color(28, 33, 53));
        txtTotalPagar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txtTotalPagar.setForeground(new java.awt.Color(255, 255, 255));
        txtTotalPagar.setBorder(null);
        add(txtTotalPagar, new org.netbeans.lib.awtextra.AbsoluteConstraints(523, 560, 104, 30));

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
        add(txtBuscarCli, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 90, 180, 40));

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
        add(txtBuscarPro, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 90, 180, 40));

        jSeparator1.setBackground(new java.awt.Color(255, 255, 255));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 590, 110, 30));

        txtUser.setEditable(false);
        txtUser.setBackground(new java.awt.Color(28, 33, 53));
        txtUser.setForeground(new java.awt.Color(28, 33, 53));
        txtUser.setBorder(null);
        add(txtUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(996, 8, 40, -1));

        txtFactura.setEditable(false);
        txtFactura.setBackground(new java.awt.Color(28, 33, 53));
        txtFactura.setForeground(new java.awt.Color(28, 33, 53));
        txtFactura.setBorder(null);
        add(txtFactura, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 96, 30));

        btnImprimir.setText("IMPRIMIR");
        btnImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImprimirActionPerformed(evt);
            }
        });
        add(btnImprimir, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 320, 120, -1));

        txt_nProducto.setBackground(new java.awt.Color(28, 33, 53));
        txt_nProducto.setForeground(new java.awt.Color(255, 255, 255));
        txt_nProducto.setBordeColorFocus(new java.awt.Color(255, 255, 255));
        txt_nProducto.setBordeColorNoFocus(new java.awt.Color(255, 255, 255));
        txt_nProducto.setCaretColor(new java.awt.Color(255, 255, 255));
        txt_nProducto.setFont(new java.awt.Font("Roboto Bold", 0, 14)); // NOI18N
        txt_nProducto.setPlaceholder("Producto");
        txt_nProducto.setSelectedTextColor(new java.awt.Color(255, 255, 255));
        txt_nProducto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_nProductoKeyTyped(evt);
            }
        });
        add(txt_nProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, 194, 33));

        txt_nCliente.setBackground(new java.awt.Color(28, 33, 53));
        txt_nCliente.setForeground(new java.awt.Color(255, 255, 255));
        txt_nCliente.setBordeColorFocus(new java.awt.Color(255, 255, 255));
        txt_nCliente.setBordeColorNoFocus(new java.awt.Color(255, 255, 255));
        txt_nCliente.setCaretColor(new java.awt.Color(255, 255, 255));
        txt_nCliente.setFont(new java.awt.Font("Roboto Bold", 0, 14)); // NOI18N
        txt_nCliente.setPlaceholder("Cliente");
        txt_nCliente.setSelectedTextColor(new java.awt.Color(255, 255, 255));
        txt_nCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_nClienteKeyTyped(evt);
            }
        });
        add(txt_nCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, 194, 33));

        txtProducto.setEditable(false);
        txtProducto.setBackground(new java.awt.Color(28, 33, 53));
        txtProducto.setForeground(new java.awt.Color(28, 33, 53));
        txtProducto.setBorder(null);
        add(txtProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 210, 80, -1));

        txtCliente.setEditable(false);
        txtCliente.setBackground(new java.awt.Color(28, 33, 53));
        txtCliente.setForeground(new java.awt.Color(28, 33, 53));
        txtCliente.setBorder(null);
        add(txtCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 150, 80, -1));
    }// </editor-fold>//GEN-END:initComponents

    public void llenarUsuario(JTextField usuario){
        String id = sesion.idUsuario+"";
        usuario.setText(id);
    }
    public void idSumVentas(){
        int id;
        id = cnv.idVentas();
        txtFactura.setText(id + "");
    }

    public void viewClientes(String nombre){
        lc.verClientess(TablaCliente,nombre);
    }
    public void viewProductos(String producto){
        lp.verProductos(TablaProducto,producto);
    }
    void generarSerie(){
        String serie = cnv.numSerie();
        int increment = Integer.parseInt(serie);
        increment= increment + 1;
        txtNSerie.setText("000000"+increment);
    }    
    public void llenarTabla(int Factura,int idpro,String producto,int cantidad,int stock,double precio,double total, JTable tabla,JTextField totalF)
    {
        DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();
        String [] titulo = {"Factura","idProducto" ,"Poducto","Cantidad", "Stock", "Precio", "Total"};
        double tot = (cantidad * precio);
        Object nuevaFila[] = {Factura,idpro, producto,cantidad,stock,precio, tot};
        modelo.addRow(nuevaFila);
        double t = 0;
        double p = 0;
        if(modelo.getRowCount() > 0)
        {
            for(int i = 0; i < modelo.getRowCount(); i ++)
            {
                p = Double.parseDouble((modelo.getValueAt(i, 6).toString()));
                t += p;
            }
            txtTotalPagar.setText(String.format("%.2f", t)+"");
        }
    }
//    public void guardarDetalle(){
//        try {
//            
//            for (int i = 0; i < TableVenta.getRowCount(); i++) {
//                String idde = cnd.idDetalle();
//            int idDetalle = Integer.parseInt(idde);
//            int iddf = idDetalle+1;
//            String idve = cnv.idVentas();
//            int idventas = Integer.parseInt(idve);
//            int producto  = Integer.parseInt(TableVenta.getValueAt(i, 1).toString());
//            int cantidad = Integer.parseInt(TableVenta.getValueAt(i, 3).toString());
//            Double precioV = Double.parseDouble(TableVenta.getValueAt(i, 4).toString());
//            String mensaje = "";
//            mensaje = dd.insertarDetalle(iddf,idventas, producto, cantidad, precioV);
//            }        
//        } catch (Exception e) {
//            JOptionPane.showMessageDialog(null, "Error en detalle: "+ e.getMessage());
//        }
//    }
//    public void calcularStock(){
//        for (int i = 0; i < TableVenta.getRowCount(); i++) {
//            int producto  = Integer.parseInt(TableVenta.getValueAt(i, 1).toString());
//            int cantidad = Integer.parseInt(TableVenta.getValueAt(i, 3).toString());
//            int StockA = Integer.parseInt(txtStock.getText());
//            int calculoStock = StockA - cantidad;
//            int stock = calculoStock;
//            System.out.println(stock);
//            cns.actualizarStock(producto, stock);
//            calcularStock();
//            
//            
//        }
//    }
    public void detalleG(){
        boolean jj;
        jj=cnd.ingresarDetalle(TableVenta,txtFactura);
        if (jj==true) {
            
        }
        else {
         JOptionPane.showMessageDialog(null, "Error en detalle");
        }
    }
  
    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
            DateFormat f = new SimpleDateFormat("dd/MM/yyyy");
        try {
            
            int idV = Integer.parseInt(txtFactura.getText());
            int idcliente = Integer.parseInt(txtCliente.getText());
            int iduser = Integer.parseInt(txtUser.getText());
            String serie = txtNSerie.getText();
            Date fecha = f.parse(txtFecha.getText());
            Double total = Double.parseDouble(txtTotalPagar.getText());
            String estado = "1";
            String mensaje = "";
            mensaje = cnv.insertarVentas(idV,idcliente, iduser, serie, fecha, total, estado);
            detalleG();
//          guardarDetalle();
//          calcularStock();
            generarSerie();
            JOptionPane.showMessageDialog(null, mensaje);
            btnImprimir.setEnabled(true);
        } catch (ParseException ex) {
            Logger.getLogger(Form_Venta.class.getName()).log(Level.SEVERE, null, ex);
        }             
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void TableVentaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableVentaMouseClicked
        
    }//GEN-LAST:event_TableVentaMouseClicked

    private void TablaProductoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaProductoMouseClicked
        int seleccionar = TablaProducto.getSelectedRow();
        txtProducto.setText(TablaProducto.getValueAt(seleccionar, 0)+"");
        txt_nProducto.setText(TablaProducto.getValueAt(seleccionar, 1)+"");
        txtPrecVenta.setText(TablaProducto.getValueAt(seleccionar, 3)+"");
         txtStock.setText(TablaProducto.getValueAt(seleccionar, 4)+"");
    }//GEN-LAST:event_TablaProductoMouseClicked

    private void btnVerPRoductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerPRoductosActionPerformed
        
        txtBuscarPro.setVisible(true);
        txtBuscarCli.setVisible(false);
        ver.setVisible(false);
        
        viewProductos("");
    }//GEN-LAST:event_btnVerPRoductosActionPerformed

    private void btnaggActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaggActionPerformed

        int fac = Integer.parseInt(txtFactura.getText());
        int idprod = Integer.parseInt(txtProducto.getText());
        String pro = txt_nProducto.getText();
        int cant = Integer.parseInt(txtCant.getText());
        int stock = Integer.parseInt(txtStock.getText());
        double prec = Double.parseDouble(txtPrecVenta.getText().toString());
        
        llenarTabla(fac, idprod, pro, cant, stock, prec, totalpagar, TableVenta,txtTotalPagar);
    }//GEN-LAST:event_btnaggActionPerformed

    private void txtBuscarProKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarProKeyPressed
        
    }//GEN-LAST:event_txtBuscarProKeyPressed

    private void txtBuscarProKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarProKeyReleased
        viewProductos(txtBuscarPro.getText());
    }//GEN-LAST:event_txtBuscarProKeyReleased

    private void txtBuscarProActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarProActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscarProActionPerformed

    private void txtFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFechaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFechaActionPerformed

    private void txtNSerieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNSerieActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNSerieActionPerformed

    private void TablaClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaClienteMouseClicked
        int seleccionar = TablaCliente.getSelectedRow();
        txtCliente.setText(TablaCliente.getValueAt(seleccionar, 0)+"");
        txt_nCliente.setText(TablaCliente.getValueAt(seleccionar, 1)+"");
    }//GEN-LAST:event_TablaClienteMouseClicked

    private void txtBuscarCliKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarCliKeyReleased
        viewClientes(txtBuscarCli.getText());
    }//GEN-LAST:event_txtBuscarCliKeyReleased

    private void txtBuscarCliKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarCliKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscarCliKeyPressed

    private void btnVerClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerClientesActionPerformed
        txtBuscarCli.setVisible(true);
        txtBuscarPro.setVisible(false);
        ver.setVisible(true);
        viewClientes("");

    }//GEN-LAST:event_btnVerClientesActionPerformed

    private void txtPrecVentaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrecVentaKeyTyped
        char caracter = evt.getKeyChar();
        if (((caracter < '0') || (caracter > '9')) 
            && (caracter != KeyEvent.VK_BACK_SPACE)
            && (caracter != '.' || txtPrecVenta.getText().contains(".")) ) {
            evt.consume();
        } 
    }//GEN-LAST:event_txtPrecVentaKeyTyped

    private void txtStockKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtStockKeyTyped
         char validar = evt.getKeyChar();
        if(!Character.isDigit(validar)&& validar != evt.VK_BACK_SPACE){
            evt.consume();
            JOptionPane.showMessageDialog(null, "ERROR: \n" + "Solo se aceptan números");
        }
    }//GEN-LAST:event_txtStockKeyTyped

    private void txtCantKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCantKeyTyped
         char validar = evt.getKeyChar();
        if(!Character.isDigit(validar)&& validar != evt.VK_BACK_SPACE){
            evt.consume();
            JOptionPane.showMessageDialog(null, "ERROR: \n" + "Solo se aceptan números");
        }
    }//GEN-LAST:event_txtCantKeyTyped

    private void btnImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimirActionPerformed

        cnv.facturaReporte(txtFactura);
    }//GEN-LAST:event_btnImprimirActionPerformed

    private void TablaClienteAncestorResized(java.awt.event.HierarchyEvent evt) {//GEN-FIRST:event_TablaClienteAncestorResized
        // TODO add your handling code here:
    }//GEN-LAST:event_TablaClienteAncestorResized

    private void txt_nProductoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_nProductoKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nProductoKeyTyped

    private void txt_nClienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_nClienteKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nClienteKeyTyped
    public void calcularTotal(){
        totalpagar = 0;
        for (int i = 0; i < TableVenta.getRowCount(); i++) {
            cant = Integer.parseInt(TableVenta.getValueAt(i, 4).toString());
            pre = Double.parseDouble(TableVenta.getValueAt(i, 5).toString());
            totalpagar+=cant*pre;
        }
        txtTotalPagar.setText(""+totalpagar);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablaCliente;
    private javax.swing.JTable TablaProducto;
    private javax.swing.JTable TableVenta;
    private rojeru_san.RSButtonRiple btnGuardar;
    private rojeru_san.RSButtonRiple btnImprimir;
    private rojeru_san.RSButtonRiple btnVerClientes;
    private rojeru_san.RSButtonRiple btnVerPRoductos;
    private rojeru_san.RSButtonRiple btnagg;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private rojeru_san.RSMTextFull txtBuscarCli;
    private rojeru_san.RSMTextFull txtBuscarPro;
    private rojeru_san.RSMTextFull txtCant;
    private javax.swing.JTextField txtCliente;
    private javax.swing.JTextField txtFactura;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtNSerie;
    private javax.swing.JTextField txtNameProduct;
    private rojeru_san.RSMTextFull txtPrecVenta;
    private javax.swing.JTextField txtProducto;
    private rojeru_san.RSMTextFull txtStock;
    private javax.swing.JTextField txtTotalPagar;
    private javax.swing.JTextField txtUser;
    private rojeru_san.RSMTextFull txt_nCliente;
    private rojeru_san.RSMTextFull txt_nProducto;
    private javax.swing.JPanel ver;
    // End of variables declaration//GEN-END:variables
}
