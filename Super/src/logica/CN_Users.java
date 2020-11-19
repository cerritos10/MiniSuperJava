
package logica;

import Entidad.Usuarios;
import Controller.UsuariosJpaController;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author cerri
 */
public class CN_Users {
    
        private UsuariosJpaController u = new UsuariosJpaController();
        Usuarios us= new Usuarios();
        private String mensaje="";        
        
        public String insertUser(String nombre,String telefono, String direccion, String dui, String user, String pass){
            
            try {
                
                us.setNombre(nombre);
                us.setTelefono(telefono);
                us.setDireccion(direccion);
                us.setDui(dui);
                us.setUsername(user);
                us.setPass(pass);
                u.create(us);
                mensaje="Datos registrados correctamente";
            } catch (Exception e) {
                System.out.println("Mensaje en guardar: "+ e.getMessage());
                mensaje = "Error al registrar los datos";
            }
            return mensaje;
        }
        
        public String updateUser(int id,String nombre,String telefono, String direccion, String dui, String user, String pass){
            try {
                long idU=id;
                us.setIdUsuario(idU);
                us.setNombre(nombre);
                us.setTelefono(telefono);
                us.setDireccion(direccion);
                us.setDui(dui);
                us.setUsername(user);
                us.setPass(pass);
                u.edit(us);
                mensaje="Datos actualizados correctamente";
            } catch (Exception e) {
                System.out.println("Mensaje en actualizar: "+ e.getMessage());
                mensaje = "Error al actualizar los datos \n" + e.getMessage();
            }
            return mensaje;
        }
        
        public String deleteUser(int id){
            
            try {
                long idU=id;
                u.destroy(idU);
                mensaje="Datos eliminados correctamente";
            } catch (Exception e) {
                System.out.println("Mensaje en eliminar: "+ e.getMessage());
                mensaje = "Error al eliminar los datos \n" + e.getMessage();
            }
            return mensaje;
        }
        
        
        public void listarUsers(JTable tabla){
            DefaultTableModel model;
            String [] encabezado = {"ID","Nombre","Telefono","Direccion","DUI","Username","Password"};
            model = new DefaultTableModel(null,encabezado);
            List<Usuarios> datos = u.findUsuariosEntities();
            String [] datosUser = new String [7];
            for (Usuarios tablauser: datos) {
                datosUser[0] = tablauser.getIdUsuario()+"";
                datosUser[1] = tablauser.getNombre()+"";
                datosUser[2] = tablauser.getTelefono()+"";
                datosUser[3] = tablauser.getDireccion()+"";
                datosUser[4] = tablauser.getDui()+"";
                datosUser[5] = tablauser.getUsername()+"";
                datosUser[6] = tablauser.getPass()+"";
                model.addRow(datosUser);
            }
            tabla.setModel(model);
            
        }
        
        
        public void verUsuarios(JTable tabla,String nombre){
            DefaultTableModel model;
            String [] encabezado = {"ID","Nombre","Telefono","Direccion","DUI","Username","Password"};
            model = new DefaultTableModel(null,encabezado);
            List<Usuarios> datos = buscarUsuarios(nombre);
            String [] datosUser = new String [7];
            for (Usuarios tablauser: datos) {
                datosUser[0] = tablauser.getIdUsuario()+"";
                datosUser[1] = tablauser.getNombre()+"";
                datosUser[2] = tablauser.getTelefono()+"";
                datosUser[3] = tablauser.getDireccion()+"";
                datosUser[4] = tablauser.getDui()+"";
                datosUser[5] = tablauser.getUsername()+"";
                datosUser[6] = tablauser.getPass()+"";
                model.addRow(datosUser);
            }
            tabla.setModel(model);
    }
      private List<Usuarios> buscarUsuarios(String nombre){
            Usuarios tablacli;
            EntityManager em = u.getEntityManager();
            Query query = em.createQuery("SELECT u FROM Usuarios u WHERE u.nombre LIKE :nombre");
            query.setParameter("nombre", nombre+"%");
            List<Usuarios> lista =  query.getResultList();
            return lista;
        }
        
        
        
        
}
