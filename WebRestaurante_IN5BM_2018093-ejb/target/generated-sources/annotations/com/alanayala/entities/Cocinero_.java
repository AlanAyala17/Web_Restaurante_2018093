package com.alanayala.entities;

import com.alanayala.entities.Detallefactura;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.0.v20170811-rNA", date="2019-09-17T11:40:20")
@StaticMetamodel(Cocinero.class)
public class Cocinero_ { 

    public static volatile SingularAttribute<Cocinero, String> apellidos;
    public static volatile ListAttribute<Cocinero, Detallefactura> detallefacturaList;
    public static volatile SingularAttribute<Cocinero, Integer> idcocinero;
    public static volatile SingularAttribute<Cocinero, String> nombres;

}