/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import Controller.ClientesJpaController;
import Entidad.Clientes;
import Entidad.VistaProducto;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author cerri
 */
public class listarClientes {
        private ClientesJpaController cjp = new ClientesJpaController();
        
     public void verClientess(JTable tabla,String nombre){

             DefaultTableModel model;
            String [] encabezado = {"ID","Nombre"};
            model = new DefaultTableModel(null,encabezado);
            List<Clientes> datos = buscarCliente(nombre);
            String [] datosCli = new String [2];
            for (Clientes tablacli: datos) {
                datosCli[0] = tablacli.getIdCliente()+"";
                datosCli[1] = tablacli.getNombre()+"";
                
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
    
}
