/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import Entidad.Usuarios;
import javax.swing.JOptionPane;
import logica.sesion;

/**
 *
 * @author cerri
 */
public class prueba extends javax.swing.JFrame {

    /**
     * Creates new form prueba
     */
    public prueba() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblprueba = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        ver = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TablaCliente = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        TablaProducto = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(lblprueba, new org.netbeans.lib.awtextra.AbsoluteConstraints(125, 33, 111, 28));

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 20, -1, -1));

        ver.setBackground(new java.awt.Color(34, 33, 74));
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
        TablaCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaClienteMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(TablaCliente);

        ver.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 300, 170));

        getContentPane().add(ver, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 240, 320, 190));

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

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 250, 290, 170));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
     String edad;
        edad="";
        edad=JOptionPane.showInputDialog("Ingrese contraseña");

        if(edad==null)
         System.out.println("La operacion ha sido cancelada");
        else {
         int edad2;
         edad2 = Integer.parseInt(edad);

          if(edad2==185)
           System.out.println("Eres mayor de edad");
          else
     System.out.println("Eres menor de edad");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void TablaClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaClienteMouseClicked
        //        int  fila=TablaCliente.getSelectedRow();
        //        if (fila==-1) {
            //            javax.swing.JOptionPane.showMessageDialog(null,"Debe seleccionar una fila para agregar");
            //        }else{
            //            id= Integer.parseInt((String)TablaCliente.getValueAt(fila,0).toString());
            //            txtCliente.setText(""+id);
            //        }
    }//GEN-LAST:event_TablaClienteMouseClicked

    private void TablaProductoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaProductoMouseClicked
        //        int  fila=TablaProducto.getSelectedRow();
        //        if (fila==-1) {
            //            javax.swing.JOptionPane.showMessageDialog(null,"Debe seleccionar una fila para agregar");
            //        }else{
            //            id= Integer.parseInt((String)TablaProducto.getValueAt(fila,0).toString());
            //            String stock=(String)TablaProducto.getValueAt(fila,3);
            //            String pre=(String)TablaProducto.getValueAt(fila,4);
            //            txtProducto.setText(""+id);
            //            txtStockActual.setText(stock);
            //            txtPrecio.setText(pre);
            //        }
    }//GEN-LAST:event_TablaProductoMouseClicked

    
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
            java.util.logging.Logger.getLogger(prueba.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(prueba.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(prueba.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(prueba.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new prueba().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablaCliente;
    private javax.swing.JTable TablaProducto;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblprueba;
    private javax.swing.JPanel ver;
    // End of variables declaration//GEN-END:variables
}