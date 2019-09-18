package com.alanayala.entities;

import com.alanayala.entities.Arearestaurante;
import com.alanayala.entities.Factura;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.0.v20170811-rNA", date="2019-09-17T11:40:20")
@StaticMetamodel(Mesas.class)
public class Mesas_ { 

    public static volatile SingularAttribute<Mesas, Integer> idmesas;
    public static volatile SingularAttribute<Mesas, Integer> nummaxclientes;
    public static volatile ListAttribute<Mesas, Factura> facturaList;
    public static volatile SingularAttribute<Mesas, Arearestaurante> idarearestaurante;

}