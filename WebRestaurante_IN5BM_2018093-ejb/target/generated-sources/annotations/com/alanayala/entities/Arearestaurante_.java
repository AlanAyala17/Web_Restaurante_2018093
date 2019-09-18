package com.alanayala.entities;

import com.alanayala.entities.Mesas;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.0.v20170811-rNA", date="2019-09-17T11:40:20")
@StaticMetamodel(Arearestaurante.class)
public class Arearestaurante_ { 

    public static volatile SingularAttribute<Arearestaurante, String> descripcion;
    public static volatile SingularAttribute<Arearestaurante, Integer> idarearestaurante;
    public static volatile ListAttribute<Arearestaurante, Mesas> mesasList;

}