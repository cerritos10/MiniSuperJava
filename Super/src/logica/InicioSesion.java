/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import Entidad.Usuarios;
import Controller.UsuariosJpaController;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.swing.JOptionPane;

/**
 *
 * @author cerri
 */
public class InicioSesion {
    private Usuarios user = new Usuarios();
    private UsuariosJpaController ujp = new UsuariosJpaController();
    EntityManager em = ujp.getEntityManager();
    public int login(String username, String pass){
            
            int valor;
            try {
                Query query = em.createQuery("SELECT u.idUsuario,u.username,u.pass FROM Usuarios u WHERE u.username=:username AND u.pass=:pass ");
                
                query.setParameter("username", username);
                query.setParameter("pass", pass);
                List resultado = query.getResultList();
                
                if (!resultado.isEmpty()) {
                    valor = 1;
                    
                }
                else{
                    valor = 0;
                }
            } catch (Exception e) {
                valor = 0;
                JOptionPane.showMessageDialog(null, "Error: \n"+ e.getMessage());
            }
            return valor;
        }
    public Usuarios recuperarSesion(String username, String pass){
                Usuarios uu = new Usuarios();
                Query query = em.createQuery("SELECT u FROM Usuarios u WHERE u.username=:username AND u.pass=:pass ");                
                query.setParameter("username", username);
                query.setParameter("pass", pass);
                 uu = (Usuarios) query.getSingleResult();
                 
                 long u = uu.getIdUsuario();
                 sesion.idUsuario = (int) u ;
                 String nombre = uu.getNombre();
                 sesion.nombre= nombre;
                 System.out.println("id recuperado: " + sesion.idUsuario);
                 return uu;
                
    }

}
