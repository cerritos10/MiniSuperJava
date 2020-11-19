/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import Controller.DetalleVentasJpaController;
import Controller.ProductosJpaController;
import Entidad.DetalleVentas;
import Entidad.Productos;
import Entidad.TipoProducto;
import Entidad.Ventas;
import java.math.BigDecimal;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author cerri
 */
public class CN_Detalle {

    Ventas v = new Ventas();
    Productos p = new Productos();
    DetalleVentas dv = new DetalleVentas();
    DetalleVentasJpaController dvjp = new DetalleVentasJpaController();
     ProductosJpaController pjp = new ProductosJpaController();
     CN_Ventas cnvs= new CN_Ventas();
    EntityManager em = dvjp.getEntityManager();
    private final TipoProducto tp = new TipoProducto();
    String mensaje = "";
//    public String insertarDetalle(int idDetalle,int idVentas, int idProducto, int  cantidad, Double precio_venta){
//        try {
//                BigDecimal pv = new BigDecimal(precio_venta);
//                long idd = idDetalle;
//                long idv = idVentas;
//                long idp = idProducto;
//                long cant = cantidad;
//                v.setIdVentas(idv);
//                p.setIdProducto(idp);
//                
//                dv.setIdDetalle(idd);
//                dv.setIdVentas(v);
//                dv.setIdProducto(p);
//                dv.setCantidad(cant);
//                dv.setPrecioVenta(pv);
//                dvjp.create(dv);
//                mensaje="Datos registrados correctamente";
//            } catch (Exception e) {
//                System.out.println("Mensaje en guardar: "+ e.getMessage());
//                mensaje = "Error al registrar los datos"+ e.getMessage();
//            }
//            return mensaje; 
//        }
//    
//    
//        public int idDetalle(){
//        String idd = "";
//        
//        try {
//            Query query = em.createQuery("SELECT MAX(d.idDetalle) FROM DetalleVentas d");
//            List<Ventas> lstVentas = query.getResultList();
//            for (int i = 0; i < lstVentas.size(); i++) {
//                 idd=lstVentas.get(0)+"";
//                System.out.println(idd);
//            }
//        } catch (Exception e) {
//            JOptionPane.showMessageDialog(null, "Error: "+e.getMessage());
//        }
//        
//        return idd;
//    
//    }
    //--------------------------------------------------------------------------------------

    public int IdDetalle() {
        int conteo = dvjp.getDetalleVentasCount();
        int it = conteo + 1;
        return it;
    }

    public boolean ingresarDetalle(JTable tablaDetalle,JTextField iddvv) {
        boolean valor = false;
        DefaultTableModel modelo = (DefaultTableModel) tablaDetalle.getModel();

        for (int i = 0; i < modelo.getRowCount(); i++) {
            try {
                long idD =  IdDetalle();
                long idventa =Integer.parseInt(iddvv.getText());
//                Integer.parseInt(modelo.getValueAt(i, 0).toString());
                long idP =Integer.parseInt(modelo.getValueAt(i, 1).toString());
                long cantidad = Integer.parseInt(modelo.getValueAt(i, 3).toString());
                double precio = Double.parseDouble(modelo.getValueAt(i, 5).toString());
                BigDecimal prv = new BigDecimal(precio); 
//                int gg = idventa - 1;
//                long idmas = gg;

                v.setIdVentas(idventa);
                p.setIdProducto(idP);
                dv.setIdDetalle(idD);
                dv.setIdVentas(v);
                dv.setIdProducto(p);
                dv.setCantidad(cantidad);
                dv.setPrecioVenta(prv);

                dvjp.create(dv);
                restarProducto(idP, cantidad);

                valor = true;
            } catch (Exception ex) {
                System.out.println("Mensaje en detalle: " + ex.getMessage());
                valor = false;
            }
        }
        return valor;
    }

    public boolean restarProducto(long id, long cantidad) {
        boolean val;
        try {
            Productos pp = new Productos();
            Query query = em.createQuery("SELECT p FROM Productos p WHERE p.idProducto =:idProducto");
            query.setParameter("idProducto", id);
            pp = (Productos) query.getSingleResult();
            
            long idPro = pp.getIdProducto();
            long tipoP = Integer.parseInt( pp.getIdTipoProducto()+"");
            String pro = pp.getProducto();
            double precio = Double.parseDouble(pp.getPrecio().toString());
            long stock =Integer.parseInt( pp.getStock().toString());
            
            long nuevostock = stock - cantidad;
            BigDecimal pre = new BigDecimal(precio);
            long idP = id;
            long idT = tipoP;
            long stk = stock;
            tp.setIdTipoProducto(idT);
            p.setIdProducto(idPro);
            p.setIdTipoProducto(tp);
            p.setProducto(pro);
            p.setPrecio(pre);
            p.setStock(nuevostock);
//            BigDecimal pre = new BigDecimal(precio);
//
//            tp.setIdTipoProducto(tipoP);
//            
//            p.setIdProducto(idPro);
//            p.setIdTipoProducto(tp);
//            p.setProducto(pro);
//            p.setPrecio(pre);
//            p.setStock(nuevostock);
            pjp.edit(p);
            
            val = true;
        } catch (Exception ex) {
            
            System.out.println("Mensaje en stock: " + ex.getMessage());
            val = false;
        }
        return val;
    }
    public void reportProductMas(){
         em.getTransaction().begin();
         java.sql.Connection conexion = em.unwrap(java.sql.Connection.class);
         em.getTransaction().commit();
         
         try {
             JasperReport reporte = null;
             String path = "src\\Reportes\\ReporteProducMas.jasper";
             reporte = (JasperReport) JRLoader.loadObjectFromFile(path);
             JasperPrint jprint = JasperFillManager.fillReport(reporte,null, conexion);
            JasperViewer view = new JasperViewer(jprint, false);
            view.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            view.setVisible(true);
         } catch (Exception e) {
              System.out.println("Error: "+ e.getMessage());
         }
    }
    
    public void reportProductMenos(){
         em.getTransaction().begin();
         java.sql.Connection conexion = em.unwrap(java.sql.Connection.class);
         em.getTransaction().commit();
         
         try {
             JasperReport reporte = null;
             String path = "src\\Reportes\\reportProductosMenos.jasper";
             reporte = (JasperReport) JRLoader.loadObjectFromFile(path);
             JasperPrint jprint = JasperFillManager.fillReport(reporte,null, conexion);
            JasperViewer view = new JasperViewer(jprint, false);
            view.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            view.setVisible(true);
         } catch (Exception e) {
              System.out.println("Error: "+ e.getMessage());
         }
    }
}
