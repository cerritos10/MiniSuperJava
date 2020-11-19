/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import Controller.CompraJpaController;
import Controller.ProductosJpaController;
import Entidad.Compra;
import Entidad.Productos;
import Entidad.TipoProducto;
import java.math.BigDecimal;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.swing.JTable;
import javax.swing.JTextField;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author cerri
 */
public class CN_Compra {
    Productos p = new Productos();
    Compra cp = new Compra();
    CompraJpaController cjp = new CompraJpaController();
    EntityManager em = cjp.getEntityManager();
    listarProductos lp = new listarProductos();
    ProductosJpaController pjp = new ProductosJpaController();
    private final TipoProducto tp = new TipoProducto();
    
    public int IdCompra() {
        int conteo = cjp.getCompraCount();
        int it = conteo + 1;
        return it;
    }
    public void llenarTabla(int idC,int idpro,String producto,int cantidad,double precio,double gasto,String proveedor,
            Date fecha,String descr,JTable tabla)
    {
        DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();
        String [] enabezado = {"Factura","idProducto","Poducto","Cantidad","Precio", "Costo", "Proveedor","Fecha","Descripcion"};
        Object nuevaFila[] = {idC,idpro, producto,cantidad,precio,gasto,proveedor,fecha,descr};
        modelo.addRow(nuevaFila);
    }
  
    public boolean insertCompra(JTable tablaDetalle) {
        boolean valor = false;
        DefaultTableModel modelo = (DefaultTableModel) tablaDetalle.getModel();

        for (int i = 0; i < modelo.getRowCount(); i++) {
            try {
                long idC = IdCompra();
                //long idcompra = Integer.parseInt(idCompra.getText());
                //Integer.parseInt(modelo.getValueAt(i, 0).toString());
                long idpro= Integer.parseInt(modelo.getValueAt(i, 1).toString());
                String pro = modelo.getValueAt(i, 2).toString();
                long cantidad = Integer.parseInt(modelo.getValueAt(i, 3).toString());
                double precio = Double.parseDouble(modelo.getValueAt(i, 4).toString());
                double costo = Double.parseDouble(modelo.getValueAt(i, 5).toString());
                String provee = modelo.getValueAt(i, 6).toString();
                Date fecha = (Date) modelo.getValueAt(i, 7);
                String descr = modelo.getValueAt(i, 8).toString();
                BigDecimal pre = new BigDecimal(precio);
                BigDecimal cos = new BigDecimal(costo);
                p.setIdProducto(idpro);
                cp.setIdCompra(idC);
                cp.setIdProducto(p);
                cp.setCantidad(cantidad);
                cp.setPrecio(pre);
                cp.setGasto(cos);
                cp.setProveedor(provee);
                cp.setFecha(fecha);
                cp.setDescripcion(descr);
                
                cjp.create(cp);
                sumarProducto(idpro, cantidad);
                
                valor = true;
            } catch (Exception ex) {
                System.out.println("Mensaje en compra: " + ex.getMessage());
                valor = false;
            }
        }
        return valor;
    }
    public boolean sumarProducto(long id, long cantidad) {
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
    
     public void factura(JTextField fact){
        em.getTransaction().begin();
         java.sql.Connection conexion = em.unwrap(java.sql.Connection.class);
         em.getTransaction().commit();
         try {
        JasperReport reporte = null;
        String path = "src\\Reportes\\Factura.jasper";
        String idfac = fact.getText();
        
        Map parametro = new HashMap();
        parametro.put("Factura", idfac);
        
            reporte = (JasperReport) JRLoader.loadObjectFromFile(path);
            JasperPrint jprint = JasperFillManager.fillReport(reporte,null, conexion);
            JasperViewer view = new JasperViewer(jprint, false);
            view.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            view.setVisible(true);
        } catch (Exception e) {
             System.out.println("Error: "+ e.getMessage());
        }
           }
//    public void reporteProductos(){
//         em.getTransaction().begin();
//         java.sql.Connection conexion = em.unwrap(java.sql.Connection.class);
//         em.getTransaction().commit();
//         
//         try {
//             JasperReport reporte = null;
//             String path = "src\\Reportes\\Report_Productos.jasper";
//             reporte = (JasperReport) JRLoader.loadObjectFromFile(path);
//             JasperPrint jprint = JasperFillManager.fillReport(reporte,null, conexion);
//            JasperViewer view = new JasperViewer(jprint, false);
//            view.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
//            view.setVisible(true);
//         } catch (Exception e) {
//              System.out.println("Error: "+ e.getMessage());
//         }
//     }
     public void mensualGastoReporte(int mes){
            em.getTransaction().begin();
         java.sql.Connection conexion = em.unwrap(java.sql.Connection.class);
         em.getTransaction().commit();
         try {
        JasperReport reporte = null;
        String path = "src/Reportes/reportGastosMensuales.jasper";
//        String idfac = mes.getText();
        
        Map parametro = new HashMap();
        parametro.put("Meses", mes);
        
            reporte = (JasperReport) JRLoader.loadObjectFromFile(path);
            JasperPrint jprint = JasperFillManager.fillReport(reporte,parametro, conexion);
            JasperViewer view = new JasperViewer(jprint, false);
            view.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            view.setVisible(true);
        } catch (Exception e) {
             System.out.println("Error: "+ e.getMessage());
        }
    }
     public void anualGastoReporte(){
         em.getTransaction().begin();
         java.sql.Connection conexion = em.unwrap(java.sql.Connection.class);
         em.getTransaction().commit();
         
         try {
             JasperReport reporte = null;
             String path = "src\\Reportes\\reportGastosAnuales.jasper";
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
