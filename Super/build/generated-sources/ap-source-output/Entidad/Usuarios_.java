package Entidad;

import Entidad.Ventas;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-10-15T16:17:45")
@StaticMetamodel(Usuarios.class)
public class Usuarios_ { 

    public static volatile SingularAttribute<Usuarios, String> pass;
    public static volatile SingularAttribute<Usuarios, Long> idUsuario;
    public static volatile SingularAttribute<Usuarios, String> direccion;
    public static volatile SingularAttribute<Usuarios, String> dui;
    public static volatile ListAttribute<Usuarios, Ventas> ventasList;
    public static volatile SingularAttribute<Usuarios, String> telefono;
    public static volatile SingularAttribute<Usuarios, String> nombre;
    public static volatile SingularAttribute<Usuarios, String> username;

}