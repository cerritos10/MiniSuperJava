package Entidad;

import Entidad.Ventas;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-10-15T16:17:45")
@StaticMetamodel(Clientes.class)
public class Clientes_ { 

    public static volatile SingularAttribute<Clientes, Long> idCliente;
    public static volatile SingularAttribute<Clientes, String> direccion;
    public static volatile ListAttribute<Clientes, Ventas> ventasList;
    public static volatile SingularAttribute<Clientes, String> telefono;
    public static volatile SingularAttribute<Clientes, String> nombre;

}