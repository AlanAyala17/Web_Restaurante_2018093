package com.alanayala.entities;

import com.alanayala.entities.Cocinero;
import com.alanayala.entities.Factura;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.0.v20170811-rNA", date="2019-09-17T11:40:20")
@StaticMetamodel(Detallefactura.class)
public class Detallefactura_ { 

    public static volatile SingularAttribute<Detallefactura, Double> precio;
    public static volatile SingularAttribute<Detallefactura, Double> totalventa;
    public static volatile SingularAttribute<Detallefactura, Integer> cantidad;
    public static volatile SingularAttribute<Detallefactura, String> plato;
    public static volatile SingularAttribute<Detallefactura, Cocinero> idcocinero;
    public static volatile SingularAttribute<Detallefactura, Integer> iddetallefactura;
    public static volatile SingularAttribute<Detallefactura, Factura> idfactura;

}