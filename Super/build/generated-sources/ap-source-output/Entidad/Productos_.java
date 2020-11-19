package Entidad;

import Entidad.Compra;
import Entidad.DetalleVentas;
import Entidad.TipoProducto;
import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-10-15T16:17:45")
@StaticMetamodel(Productos.class)
public class Productos_ { 

    public static volatile SingularAttribute<Productos, BigDecimal> precio;
    public static volatile ListAttribute<Productos, DetalleVentas> detalleVentasList;
    public static volatile SingularAttribute<Productos, Long> idProducto;
    public static volatile SingularAttribute<Productos, String> producto;
    public static volatile SingularAttribute<Productos, Long> stock;
    public static volatile ListAttribute<Productos, Compra> compraList;
    public static volatile SingularAttribute<Productos, TipoProducto> idTipoProducto;

}