package Entidad;

import Entidad.Productos;
import Entidad.Ventas;
import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-10-15T16:17:45")
@StaticMetamodel(DetalleVentas.class)
public class DetalleVentas_ { 

    public static volatile SingularAttribute<DetalleVentas, Long> idDetalle;
    public static volatile SingularAttribute<DetalleVentas, Long> cantidad;
    public static volatile SingularAttribute<DetalleVentas, Productos> idProducto;
    public static volatile SingularAttribute<DetalleVentas, BigDecimal> precioVenta;
    public static volatile SingularAttribute<DetalleVentas, Ventas> idVentas;

}