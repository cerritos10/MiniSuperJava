/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import Controller.DetalleVentasJpaController;
import Controller.VentasJpaController;
import Entidad.Clientes;
import Entidad.DetalleVentas;
import Entidad.Productos;
import Entidad.Usuarios;
import Entidad.Ventas;
import java.math.BigDecimal;
import java.sql.ResultSet;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;
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
public class CN_Ventas {
    
    
    Ventas v = new Ventas();
    Clientes cl = new Clientes();
    Usuarios u = new Usuarios();
    sesion s = new sesion();
    VentasJpaController vjp = new VentasJpaController();
    EntityManager em = vjp.getEntityManager();
    String mensaje = "";
    public String insertarVentas(int idVentas,int idCliente, int idUser, String serie, Date fecha, Double total,String estado){
        try {
                BigDecimal tot = new BigDecimal(total);
                long idv = idVentas;
                long idc = idCliente;
                long idu = idUser;
                cl.setIdCliente(idc);
                u.setIdUsuario(idu);
                //s.setIdUsuario(idUser);
                v.setIdVentas(idv);
                v.setIdCliente(cl);
                v.setIdUsuario(u);
                v.setNumSerie(serie);
                v.setFecha(fecha);
                v.setTotal(tot);
                v.setEstado(estado);
                vjp.create(v);
                mensaje="Datos registrados correctamente!";
            } catch (Exception e) {
                System.out.println("Mensaje en guardar: "+ e.getMessage());
                mensaje = "Error al registrar los datos "+ e.getMessage();
            }
            return mensaje; 
        }
    public int idVentas(){
        int sumId = vjp.getVentasCount();
        int id = sumId + 1;
        return id;
    }
//        String idv = "";
//        try {
//            Query query = em.createQuery("SELECT MAX(v.idVentas) FROM Ventas v");
//            List<Ventas> lstVentas = query.getResultList();
//            for (int i = 0; i < lstVentas.size(); i++) {
//                 idv=lstVentas.get(0)+"";
//                System.out.println(idv);
//            }
//        } catch (Exception e) {
//            JOptionPane.showMessageDialog(null, "Error: "+e.getMessage());
//        }
//        
//        return idv;
    
//    }
    public String numSerie(){
        String nums = "";
        try {
            Query query = em.createQuery("SELECT MAX(v.numSerie) FROM Ventas v");
            List<Ventas> lstVentas = query.getResultList();
            for (int i = 0; i < lstVentas.size(); i++) {
                 nums=lstVentas.get(0)+"";
                System.out.println(nums);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: "+e.getMessage());
        }
        
        return nums;
    }        
    public void facturaReporte(JTextField fact){
            em.getTransaction().begin();
         java.sql.Connection conexion = em.unwrap(java.sql.Connection.class);
         em.getTransaction().commit();
         try {
        JasperReport reporte = null;
        String path = "src/Reportes/Factura.jasper";
        String idfac = fact.getText();
        
        Map parametro = new HashMap();
        parametro.put("Factura", idfac);
        
            reporte = (JasperReport) JRLoader.loadObjectFromFile(path);
            JasperPrint jprint = JasperFillManager.fillReport(reporte,parametro, conexion);
            JasperViewer view = new JasperViewer(jprint, false);
            view.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            view.setVisible(true);
        } catch (Exception e) {
             System.out.println("Error: "+ e.getMessage());
        }
    }
    public void mensualesReporte(int mes){
            em.getTransaction().begin();
         java.sql.Connection conexion = em.unwrap(java.sql.Connection.class);
         em.getTransaction().commit();
         try {
        JasperReport reporte = null;
        String path = "src/Reportes/reportTotalMensual.jasper";
//        String idfac = mes.getText();
        
        Map parametro = new HashMap();
        parametro.put("Mes", mes);
        
            reporte = (JasperReport) JRLoader.loadObjectFromFile(path);
            JasperPrint jprint = JasperFillManager.fillReport(reporte,parametro, conexion);
            JasperViewer view = new JasperViewer(jprint, false);
            view.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            view.setVisible(true);
        } catch (Exception e) {
             System.out.println("Error: "+ e.getMessage());
        }
    }
    public void anualesReporte(){
         em.getTransaction().begin();
         java.sql.Connection conexion = em.unwrap(java.sql.Connection.class);
         em.getTransaction().commit();
         
         try {
             JasperReport reporte = null;
             String path = "src\\Reportes\\reporTotalAnual.jasper";
             reporte = (JasperReport) JRLoader.loadObjectFromFile(path);
             JasperPrint jprint = JasperFillManager.fillReport(reporte,null, conexion);
            JasperViewer view = new JasperViewer(jprint, false);
            view.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            view.setVisible(true);
         } catch (Exception e) {
              System.out.println("Error: "+ e.getMessage());
         }
     }
//    try {
//        JasperReport reporte = null;
//        String path = "src/Reportes/factura.jasper";
//        String idfac = txtIdDetalleVenta.getText();
//        
//        Map parametro = new HashMap();
//        parametro.put("Factura", idfac);
//        
//            reporte = (JasperReport) JRLoader.loadObjectFromFile(path);
//            JasperPrint jprint = JasperFillManager.fillReport(reporte, parametro, cn);
//            JasperViewer view = new JasperViewer(jprint, false);
//            view.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
//            view.setVisible(true);
//        } catch (JRException ex) {
//            Logger.getLogger(Generar_Factura.class.getName()).log(Level.SEVERE, null, ex);
//        }
    
}
