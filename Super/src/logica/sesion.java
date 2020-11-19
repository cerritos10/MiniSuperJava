/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

/**
 *
 * @author cerri
 */
public class sesion {

    public sesion() {
    }

    
    public static int idUsuario;
    public static String nombre;
    public static String username;
    
    public static int getIdUsuario() {
        return idUsuario;
    }

    public static void setIdUsuario(int idUsuario) {
        sesion.idUsuario = idUsuario;
    }

    public static String getNombre() {
        return nombre;
    }

    public static void setNombre(String nombre) {
        sesion.nombre = nombre;
    }

    public static String getUsername() {
        return username;
    }

    public static void setUsername(String username) {
        sesion.username = username;
    }

 
}
