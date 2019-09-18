package com.alanayala.entities;

import com.alanayala.entities.Factura;
import com.alanayala.entities.Tipocliente;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.0.v20170811-rNA", date="2019-09-17T11:40:20")
@StaticMetamodel(Clientes.class)
public class Clientes_ { 

    public static volatile SingularAttribute<Clientes, String> apellidos;
    public static volatile SingularAttribute<Clientes, String> nit;
    public static volatile SingularAttribute<Clientes, String> direccion;
    public static volatile ListAttribute<Clientes, Factura> facturaList;
    public static volatile SingularAttribute<Clientes, Tipocliente> idtipocliente;
    public static volatile SingularAttribute<Clientes, Integer> idclientes;
    public static volatile SingularAttribute<Clientes, String> nombres;

}