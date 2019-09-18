package com.alanayala.entities;

import com.alanayala.entities.Clientes;
import com.alanayala.entities.Detallefactura;
import com.alanayala.entities.Mesas;
import com.alanayala.entities.Meseros;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.0.v20170811-rNA", date="2019-09-17T11:40:20")
@StaticMetamodel(Factura.class)
public class Factura_ { 

    public static volatile SingularAttribute<Factura, Mesas> idmesas;
    public static volatile ListAttribute<Factura, Detallefactura> detallefacturaList;
    public static volatile SingularAttribute<Factura, String> fechafactura;
    public static volatile SingularAttribute<Factura, Meseros> idmeseros;
    public static volatile SingularAttribute<Factura, Clientes> idclientes;
    public static volatile SingularAttribute<Factura, Integer> idfactura;

}