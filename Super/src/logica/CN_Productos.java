/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import Controller.ProductosJpaController;
import Entidad.Productos;
import Entidad.TipoProducto;
import Entidad.ViewProductosFull;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import javax.persistence.EntityManager;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author cerri
 */
public class CN_Productos {
    
    ProductosJpaController pjp = new ProductosJpaController();
    Productos p = new Productos();
    TipoProducto tp = new TipoProducto();
    EntityManager em = pjp.getEntityManager();
    String mensaje = "";
    public String insertProducto(int idtipo,String producto,Double precio,int stock){
        
        try {
            BigDecimal pre = new BigDecimal(precio);
            long idT = idtipo;
            long stk = stock;
            tp.setIdTipoProducto(idT);
            
            p.setIdTipoProducto(tp);
            p.setProducto(producto);
            p.setPrecio(pre);
            p.setStock(stk);
            pjp.create(p);
            mensaje="Datos registrados correctamente";
        } catch (Exception e) {
            System.out.println("Mensaje en guardar: "+ e.getMessage());
                mensaje = "Error al registrar los datos"+ e.getMessage();
        }
        return mensaje;
    }
     public String updateProducto(int id,int idtipo,String producto,Double precio,int stock){
        
        try {
            BigDecimal pre = new BigDecimal(precio);
            long idP = id;
            long idT = idtipo;
            long stk = stock;
            tp.setIdTipoProducto(idT);
            p.setIdProducto(idP);
            p.setIdTipoProducto(tp);
            p.setProducto(producto);
            p.setPrecio(pre);
            p.setStock(stk);
            pjp.edit(p);
            mensaje="Datos actualizados correctamente";
        } catch (Exception e) {
            System.out.println("Mensaje en actualizar: "+ e.getMessage());
                mensaje = "Error al actualizar los datos"+ e.getMessage();
        }
        return mensaje;
    }
     public String deleteProducto(int id){
            try {
                long idTP=id;
                pjp.destroy(idTP);
                mensaje = "Producto: \n"+ "Datos eliminados correctamente";
            } catch (Exception e) {
                System.out.println("Mensaje en guardar: "+ e.getMessage());
                mensaje = "Error al eliminar los datos";
            }
            return mensaje;
        }
     public void reporteProductos(){
         em.getTransaction().begin();
         java.sql.Connection conexion = em.unwrap(java.sql.Connection.class);
         em.getTransaction().commit();
         
         try {
             JasperReport reporte = null;
             String path = "src\\Reportes\\Report_Productos.jasper";
             reporte = (JasperReport) JRLoader.loadObjectFromFile(path);
             JasperPrint jprint = JasperFillManager.fillReport(reporte,null, conexion);
            JasperViewer view = new JasperViewer(jprint, false);
            view.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            view.setVisible(true);
         } catch (Exception e) {
              System.out.println("Error: "+ e.getMessage());
         }
     }
     public void existenciasXProducto(int pro){
        em.getTransaction().begin();
         java.sql.Connection conexion = em.unwrap(java.sql.Connection.class);
         em.getTransaction().commit();
         try {
        JasperReport reporte = null;
        String path = "src\\Reportes\\reportExisXPro.jasper";
        
        Map parametro = new HashMap();
        parametro.put("producto", pro);
        
            reporte = (JasperReport) JRLoader.loadObjectFromFile(path);
            JasperPrint jprint = JasperFillManager.fillReport(reporte,parametro, conexion);
            JasperViewer view = new JasperViewer(jprint, false);
            view.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            view.setVisible(true);
        } catch (Exception e) {
             System.out.println("Error: "+ e.getMessage());
        }
    }
    
}
