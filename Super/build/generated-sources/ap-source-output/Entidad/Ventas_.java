package Entidad;

import Entidad.Clientes;
import Entidad.DetalleVentas;
import Entidad.Usuarios;
import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-10-15T16:17:45")
@StaticMetamodel(Ventas.class)
public class Ventas_ { 

    public static volatile SingularAttribute<Ventas, Date> fecha;
    public static volatile SingularAttribute<Ventas, BigDecimal> total;
    public static volatile SingularAttribute<Ventas, String> estado;
    public static volatile ListAttribute<Ventas, DetalleVentas> detalleVentasList;
    public static volatile SingularAttribute<Ventas, Clientes> idCliente;
    public static volatile SingularAttribute<Ventas, Usuarios> idUsuario;
    public static volatile SingularAttribute<Ventas, Long> idVentas;
    public static volatile SingularAttribute<Ventas, String> numSerie;

}