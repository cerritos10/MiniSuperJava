/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import Controller.ProductosJpaController;
import Entidad.Productos;
import Entidad.VistaProducto;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author cerri
 */
public class CN_Stock {
    private ProductosJpaController pjp= new ProductosJpaController();
    Productos p = new Productos();
    String mensaje = "";
    public int actualizarStock(int id,int stock){
            try {
                long idS=id;
                long sk=stock;
                p.setIdProducto(idS);
                p.setStock(sk);
                pjp.edit(p);
                mensaje="Stock actualizado correctamente";
            } catch (Exception e) {
                System.out.println("Mensaje en stock: "+ e.getMessage());
                mensaje = "Error al actualizar el stock \n" + e.getMessage();
            }
            return 1;
        }
 
    
}
