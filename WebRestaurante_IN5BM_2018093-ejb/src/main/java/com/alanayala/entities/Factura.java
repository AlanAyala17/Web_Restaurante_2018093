/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alanayala.entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author programacion
 */
@Entity
@Table(name = "factura")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Factura.findAll", query = "SELECT f FROM Factura f")
    , @NamedQuery(name = "Factura.findByIdfactura", query = "SELECT f FROM Factura f WHERE f.idfactura = :idfactura")
    , @NamedQuery(name = "Factura.findByFechafactura", query = "SELECT f FROM Factura f WHERE f.fechafactura = :fechafactura")})
public class Factura implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idfactura")
    private Integer idfactura;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "fechafactura")
    private String fechafactura;
    @JoinColumn(name = "idclientes", referencedColumnName = "idclientes")
    @ManyToOne(optional = false)
    private Clientes idclientes;
    @JoinColumn(name = "idmesas", referencedColumnName = "idmesas")
    @ManyToOne(optional = false)
    private Mesas idmesas;
    @JoinColumn(name = "idmeseros", referencedColumnName = "idmeseros")
    @ManyToOne(optional = false)
    private Meseros idmeseros;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idfactura")
    private List<Detallefactura> detallefacturaList;

    public Factura() {
    }

    public Factura(Integer idfactura) {
        this.idfactura = idfactura;
    }

    public Factura(Integer idfactura, String fechafactura) {
        this.idfactura = idfactura;
        this.fechafactura = fechafactura;
    }

    public Integer getIdfactura() {
        return idfactura;
    }

    public void setIdfactura(Integer idfactura) {
        this.idfactura = idfactura;
    }

    public String getFechafactura() {
        return fechafactura;
    }

    public void setFechafactura(String fechafactura) {
        this.fechafactura = fechafactura;
    }

    public Clientes getIdclientes() {
        return idclientes;
    }

    public void setIdclientes(Clientes idclientes) {
        this.idclientes = idclientes;
    }

    public Mesas getIdmesas() {
        return idmesas;
    }

    public void setIdmesas(Mesas idmesas) {
        this.idmesas = idmesas;
    }

    public Meseros getIdmeseros() {
        return idmeseros;
    }

    public void setIdmeseros(Meseros idmeseros) {
        this.idmeseros = idmeseros;
    }

    @XmlTransient
    public List<Detallefactura> getDetallefacturaList() {
        return detallefacturaList;
    }

    public void setDetallefacturaList(List<Detallefactura> detallefacturaList) {
        this.detallefacturaList = detallefacturaList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idfactura != null ? idfactura.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Factura)) {
            return false;
        }
        Factura other = (Factura) object;
        if ((this.idfactura == null && other.idfactura != null) || (this.idfactura != null && !this.idfactura.equals(other.idfactura))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.alanayala.entities.Factura[ idfactura=" + idfactura + " ]";
    }
    
}
