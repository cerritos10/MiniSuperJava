/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;


import Controller.VistaProductoJpaController;
import Entidad.Clientes;
import Entidad.Productos;
import Entidad.ViewProductosFull;
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
public class listarProductos {
    
    private VistaProductoJpaController vpc = new VistaProductoJpaController();
    public void verProductos(JTable tabla, String producto){
        try {
             DefaultTableModel model;
            String [] encabezado = {"ID","Producto","Tipo","Precio","Stock"};
            model = new DefaultTableModel(null,encabezado);
            List<VistaProducto> datos = buscarProducto(producto);
            String [] datospro = new String [5];
            for (VistaProducto tablapro: datos) {
                datospro[0] = tablapro.getIdProducto()+"";
                datospro[1] = tablapro.getProducto()+"";
                datospro[2] = tablapro.getTipo()+"";
                datospro[3] = tablapro.getPrecio()+"";
                datospro[4] = tablapro.getStock()+"";
                model.addRow(datospro);
            }
            tabla.setModel(model);
         } catch (Exception e) {
             
             System.out.println("Error \n"+ e.getMessage());
         }
         
    }
        private List<VistaProducto> buscarProducto(String producto){
            VistaProducto pro;
            EntityManager em = vpc.getEntityManager();
            Query query = em.createQuery("SELECT v FROM VistaProducto v WHERE v.producto LIKE :producto");
            query.setParameter("producto", producto+"%");
            List<VistaProducto> lista =  query.getResultList();
            return lista;
        }
        
        
        
         public void verProductosFull(JTable tabla, String producto){
        try {
             DefaultTableModel model;
            String [] encabezado = {"ID","Producto","Tipo","Precio","Stock","IDTipo"};
            model = new DefaultTableModel(null,encabezado);
            List<VistaProducto> datos = buscarProductoFull(producto);
            String [] datospro = new String [6];
            for (VistaProducto tablapro: datos) {
                datospro[0] = tablapro.getIdProducto()+"";
                datospro[1] = tablapro.getProducto()+"";
                datospro[2] = tablapro.getTipo()+"";
                datospro[3] = tablapro.getPrecio()+"";
                datospro[4] = tablapro.getStock()+"";
                datospro[5] = tablapro.getIdTipoProducto()+"";
                model.addRow(datospro);
            }
            tabla.setModel(model);
         } catch (Exception e) {
             
             System.out.println("Error \n"+ e.getMessage());
         }
         
    }
        private List<VistaProducto> buscarProductoFull(String producto){
            EntityManager em = vpc.getEntityManager();
            Query query = em.createQuery("SELECT v FROM VistaProducto v WHERE v.producto LIKE :producto");
            query.setParameter("producto", producto+"%");
            List<VistaProducto> lista =  query.getResultList();
            return lista;
        }
    
}
