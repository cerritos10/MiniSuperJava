package Entidad;

import Entidad.Productos;
import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-10-15T16:17:45")
@StaticMetamodel(Compra.class)
public class Compra_ { 

    public static volatile SingularAttribute<Compra, String> descripcion;
    public static volatile SingularAttribute<Compra, Date> fecha;
    public static volatile SingularAttribute<Compra, BigDecimal> precio;
    public static volatile SingularAttribute<Compra, Long> idCompra;
    public static volatile SingularAttribute<Compra, String> proveedor;
    public static volatile SingularAttribute<Compra, Long> cantidad;
    public static volatile SingularAttribute<Compra, Productos> idProducto;
    public static volatile SingularAttribute<Compra, BigDecimal> gasto;

}