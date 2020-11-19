CREATE TABLE usuarios(
    id_usuario NUMBER(10,0) not null PRIMARY KEY,
    nombre VARCHAR(25),
    telefono VARCHAR(9),
    direccion VARCHAR(25),
    dui VARCHAR(10),
    username VARCHAR(25),
    pass VARCHAR(25)
);

create sequence usuarios_seq
START WITH 1
INCREMENT BY 1;

CREATE TRIGGER TRIG_USUARIOS
BEFORE INSERT ON usuarios
FOR EACH ROW
BEGIN
SELECT usuarios_seq.nextval INTO :NEW.id_usuario FROM DUAL;
END;

------------------------------------------------------------------------------;
CREATE TABLE clientes(
    id_cliente NUMBER(10,0) not null PRIMARY KEY,
    nombre VARCHAR(25),
    telefono VARCHAR(9),
    direccion VARCHAR(25)
);
create sequence clientes_seq
START WITH 1
INCREMENT BY 1;

CREATE TRIGGER TRIG_CLIENTES
BEFORE INSERT ON clientes
FOR EACH ROW
BEGIN
SELECT clientes_seq.NEXTVAL INTO :NEW.id_cliente FROM DUAL;
END;

------------------------------------------------------------------------------;

CREATE TABLE ventas(
    id_ventas NUMBER(10,0) not null PRIMARY KEY,
    id_cliente NUMBER(10,0) not null
            CONSTRAINT fk_clientes REFERENCES clientes(id_cliente),
    id_usuario NUMBER(10,0) not null
            CONSTRAINT fk_usuarios REFERENCES usuarios(id_usuario),
    num_serie VARCHAR(8),
    fecha DATE not null,
    total NUMBER(10,2),
    estado VARCHAR(1)
);
create sequence ventas_seq
START WITH 1
INCREMENT BY 1;

CREATE TRIGGER TRIG_VENTAS
BEFORE INSERT ON ventas
FOR EACH ROW
BEGIN
SELECT ventas_seq.NEXTVAL INTO :NEW.id_ventas FROM DUAL;
END;

------------------------------------------------------------------------------;

CREATE TABLE tipo_producto(
    id_tipo_producto NUMBER(10,0) not null PRIMARY KEY,
    tipo VARCHAR(25)
);
create sequence tipo_producto_seq
START WITH 1
INCREMENT BY 1;

CREATE TRIGGER TRIG_TIPO_PRODUCTO
BEFORE INSERT ON tipo_producto
FOR EACH ROW
BEGIN
SELECT tipo_producto_seq.NEXTVAL INTO :NEW.id_tipo_producto FROM DUAL;
END;

------------------------------------------------------------------------------;


------------------------------------------------------------------------------;

CREATE TABLE detalle_ventas(
    id_detalle NUMBER(10,0) not null PRIMARY KEY,
    id_ventas NUMBER(10,0) not null
            CONSTRAINT fk_ventas REFERENCES ventas(id_ventas),
    id_producto NUMBER(10,0) not null
            CONSTRAINT fk_productos2 REFERENCES productos(id_producto),
    cantidad NUMBER(10),
    precio_venta NUMBER(10,2)
);
create sequence detalle_ventas_seq
START WITH 1
INCREMENT BY 1;

CREATE TRIGGER TRIG_DETALLE_VENTAS
BEFORE INSERT ON detalle_ventas
FOR EACH ROW
BEGIN
SELECT detalle_ventas_seq.NEXTVAL INTO :NEW.id_detalle FROM DUAL;
END;

------------------------------------------------------------------------------;

CREATE TABLE compra(
    id_compra NUMBER(10,0) not null PRIMARY KEY,
    id_producto NUMBER(10,0) not null
            CONSTRAINT fk_productos3 REFERENCES productos(id_producto),
    cantidad NUMBER(10),
    precio NUMBER(10,2),
    gasto NUMBER(10,2),
    proveedor VARCHAR(50),
    fecha DATE not null,
    descripcion VARCHAR(250)
);
create sequence compra_seq
START WITH 1
INCREMENT BY 1;

CREATE TRIGGER TRIG_COMPRA
BEFORE INSERT ON compra
FOR EACH ROW
BEGIN
SELECT compra_seq.NEXTVAL INTO :NEW.id_compra FROM DUAL;
END;

------------------------------------------------------------------------------;

INSERT INTO clientes(nombre,direccion,telefono)
    VALUES('Mario, Fernandez','Candelaria de la frontera','7432-5544');

INSERT INTO usuarios(nombre,telefono,direccion,dui,username,pass)
    VALUES('Vidal, Hernandez','7890-6574','Aldea bolaños','01235456-0','vidal','hernandez00');

INSERT INTO tipo_producto(tipo)
    VALUES('Bebidas');
    
INSERT INTO productos(id_tipo_producto,producto,precio,stock)
    values(1,'Coca-Cola',0.65,50);

INSERT INTO compra(id_producto,cantidad,precio,gasto,proveedor,fecha,descripcion)
    values(1,50,0.60,40.00,'Coca-cola','22/06/2020','Fue soda en lata');
    
INSERT INTO ventas(id_cliente,id_usuario,num_serie,fecha,total,estado)
    VALUES (2,1,'000000','22/06/2020',10.50,'1');
    
INSERT INTO detalle_ventas(id_ventas,id_producto,cantidad,precio_venta)
    values(3,1,2,0.65);
    
select * from detalle_ventas










