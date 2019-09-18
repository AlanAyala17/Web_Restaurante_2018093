package com.alanayala.entities;

import com.alanayala.entities.Factura;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.0.v20170811-rNA", date="2019-09-17T11:40:20")
@StaticMetamodel(Meseros.class)
public class Meseros_ { 

    public static volatile SingularAttribute<Meseros, String> apellidos;
    public static volatile ListAttribute<Meseros, Factura> facturaList;
    public static volatile SingularAttribute<Meseros, Integer> idmeseros;
    public static volatile SingularAttribute<Meseros, String> nombres;

}