/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import Controller.ClientesJpaController;
import Entidad.Clientes;
import Entidad.Usuarios;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.persistence.EntityManager;
import javax.persistence.Query;
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
public class CN_Clientes {
    
    private ClientesJpaController cjp = new ClientesJpaController();
     EntityManager em = cjp.getEntityManager();
    Clientes cli = new Clientes();
    private String mensaje = "";
    
    public String insertCliente(String nombre, String direccion,String telefono){
            
            try {
                
                cli.setNombre(nombre);
                cli.setTelefono(telefono);
                cli.setDireccion(direccion);
                cjp.create(cli);
                mensaje="Datos registrados correctamente";
            } catch (Exception e) {
                System.out.println("Mensaje en guardar: "+ e.getMessage());
                mensaje = "Error al registrar los datos";
            }
            return mensaje;
        }
    public String updateCliente(int id,String nombre,String direccion,String telefono){
            
            try {
                long idC=id;
                cli.setIdCliente(idC);
                cli.setNombre(nombre);
                cli.setDireccion(direccion);
                cli.setTelefono(telefono);
                cjp.edit(cli);
                mensaje="Datos registrados correctamente";
            } catch (Exception e) {
                System.out.println("Mensaje en actualizar: "+ e.getMessage());
                mensaje = "Error al actualizar los datos \n"+ e.getMessage();
            }
            return mensaje;
        }
    public String deleteCliente(int id){
            
            try {
                long idC=id;
                cjp.destroy(idC);
                mensaje="Datos eliminados correctamente";
            } catch (Exception e) {
                System.out.println("Mensaje en eliminar: "+ e.getMessage());
                mensaje = "Error al eliminar los datos \n" + e.getMessage();
            }
            return mensaje;
        }
    public void listarClientes(JTable tabla){
            DefaultTableModel model;
            String [] encabezado = {"ID","Nombre","Direccion","Telefono"};
            model = new DefaultTableModel(null,encabezado);
            List<Clientes> datos = cjp.findClientesEntities();
            String [] datosCli = new String [4];
            for (Clientes tablacli: datos) {
                datosCli[0] = tablacli.getIdCliente()+"";
                datosCli[1] = tablacli.getNombre()+"";
                datosCli[2] = tablacli.getDireccion()+"";
                datosCli[3] = tablacli.getTelefono()+"";
                model.addRow(datosCli);
            }
            tabla.setModel(model);
            
        }        
     public void verClientes(JTable tabla,String nombre){

             DefaultTableModel model;
            String [] encabezado = {"ID","Nombre","Direccion","Telefono"};
            model = new DefaultTableModel(null,encabezado);
            List<Clientes> datos = buscarCliente(nombre);
            String [] datosCli = new String [4];
            for (Clientes tablacli: datos) {
                datosCli[0] = tablacli.getIdCliente()+"";
                datosCli[1] = tablacli.getNombre()+"";
                datosCli[2] = tablacli.getDireccion()+"";
                datosCli[3] = tablacli.getTelefono()+"";
                model.addRow(datosCli);
            }
            tabla.setModel(model);
    }
      private List<Clientes> buscarCliente(String nombre){
            Clientes tablacli;
            EntityManager em = cjp.getEntityManager();
            Query query = em.createQuery("SELECT c FROM Clientes c WHERE c.nombre LIKE :nombre");
            query.setParameter("nombre", nombre+"%");
            List<Clientes> lista =  query.getResultList();
            return lista;
        }
      public void ventasXCliente(int cli){
        em.getTransaction().begin();
         java.sql.Connection conexion = em.unwrap(java.sql.Connection.class);
         em.getTransaction().commit();
         try {
        JasperReport reporte = null;
        String path = "src\\Reportes\\rVentasXClie.jasper";
        
        Map parametro = new HashMap();
        parametro.put("cliente", cli);
        
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
