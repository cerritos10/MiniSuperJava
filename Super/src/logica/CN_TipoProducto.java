/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import Controller.TipoProductoJpaController;
import Entidad.TipoProducto;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author cerri
 */
public class CN_TipoProducto {
        private TipoProductoJpaController tpjp = new TipoProductoJpaController();
        TipoProducto tp = new TipoProducto();
        private String mensaje = "";
        
        public String insertTipoP(String tipoP){
            try {
                tp.setTipo(tipoP);
                tpjp.create(tp);
                mensaje = "Tipode de producto: \n"+ "Datos guardados correctamente";
            } catch (Exception e) {
                System.out.println("Mensaje en guardar: "+ e.getMessage());
                mensaje = "Error al registrar los datos";
            }
            return mensaje;
        }
        
        public String updateTipoP(int id,String tipoP){
            try {
                long idTP = id;
                tp.setIdTipoProducto(idTP);
                tp.setTipo(tipoP);
                tpjp.edit(tp);
                mensaje = "Tipode de producto: \n"+ "Datos actualizados correctamente";
            } catch (Exception e) {
                System.out.println("Mensaje en guardar: "+ e.getMessage());
                mensaje = "Error al actualizar los datos";
            }
            return mensaje;
        }
        
        public String deleteTipoP(int id){
            try {
                long idTP=id;
                tpjp.destroy(idTP);
                mensaje = "Tipode de producto: \n"+ "Datos eliminados correctamente";
            } catch (Exception e) {
                System.out.println("Mensaje en guardar: "+ e.getMessage());
                mensaje = "Error al eliminar los datos";
            }
            return mensaje;
        }
        
        public void verTipo(JTable tabla,String tipo){

             DefaultTableModel model;
            String [] encabezado = {"ID","Tipo Producto"};
            model = new DefaultTableModel(null,encabezado);
            List<TipoProducto> datos = buscarTipo(tipo);
            String [] datosTipo = new String [2];
            for (TipoProducto tablatipo: datos) {
                datosTipo[0] = tablatipo.getIdTipoProducto()+"";
                datosTipo[1] = tablatipo.getTipo()+"";
                model.addRow(datosTipo);
            }
            tabla.setModel(model);
        }
        
        private List<TipoProducto> buscarTipo(String tipo){
            EntityManager em = tpjp.getEntityManager();
            Query query = em.createQuery("SELECT t FROM TipoProducto t WHERE t.tipo LIKE :tipo");
            query.setParameter("tipo", tipo+"%");
            List<TipoProducto> lista =  query.getResultList();
            return lista;
        }
    
}
