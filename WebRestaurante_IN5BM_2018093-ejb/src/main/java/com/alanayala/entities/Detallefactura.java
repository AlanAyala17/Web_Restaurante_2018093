/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alanayala.entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author programacion
 */
@Entity
@Table(name = "detallefactura")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Detallefactura.findAll", query = "SELECT d FROM Detallefactura d")
    , @NamedQuery(name = "Detallefactura.findByIddetallefactura", query = "SELECT d FROM Detallefactura d WHERE d.iddetallefactura = :iddetallefactura")
    , @NamedQuery(name = "Detallefactura.findByPlato", query = "SELECT d FROM Detallefactura d WHERE d.plato = :plato")
    , @NamedQuery(name = "Detallefactura.findByPrecio", query = "SELECT d FROM Detallefactura d WHERE d.precio = :precio")
    , @NamedQuery(name = "Detallefactura.findByCantidad", query = "SELECT d FROM Detallefactura d WHERE d.cantidad = :cantidad")
    , @NamedQuery(name = "Detallefactura.findByTotalventa", query = "SELECT d FROM Detallefactura d WHERE d.totalventa = :totalventa")})
public class Detallefactura implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "iddetallefactura")
    private Integer iddetallefactura;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "plato")
    private String plato;
    @Basic(optional = false)
    @NotNull
    @Column(name = "precio")
    private double precio;
    @Basic(optional = false)
    @NotNull
    @Column(name = "cantidad")
    private int cantidad;
    @Basic(optional = false)
    @NotNull
    @Column(name = "totalventa")
    private double totalventa;
    @JoinColumn(name = "idcocinero", referencedColumnName = "idcocinero")
    @ManyToOne(optional = false)
    private Cocinero idcocinero;
    @JoinColumn(name = "idfactura", referencedColumnName = "idfactura")
    @ManyToOne(optional = false)
    private Factura idfactura;

    public Detallefactura() {
    }

    public Detallefactura(Integer iddetallefactura) {
        this.iddetallefactura = iddetallefactura;
    }

    public Detallefactura(Integer iddetallefactura, String plato, double precio, int cantidad, double totalventa) {
        this.iddetallefactura = iddetallefactura;
        this.plato = plato;
        this.precio = precio;
        this.cantidad = cantidad;
        this.totalventa = totalventa;
    }

    public Integer getIddetallefactura() {
        return iddetallefactura;
    }

    public void setIddetallefactura(Integer iddetallefactura) {
        this.iddetallefactura = iddetallefactura;
    }

    public String getPlato() {
        return plato;
    }

    public void setPlato(String plato) {
        this.plato = plato;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getTotalventa() {
        return totalventa;
    }

    public void setTotalventa(double totalventa) {
        this.totalventa = totalventa;
    }

    public Cocinero getIdcocinero() {
        return idcocinero;
    }

    public void setIdcocinero(Cocinero idcocinero) {
        this.idcocinero = idcocinero;
    }

    public Factura getIdfactura() {
        return idfactura;
    }

    public void setIdfactura(Factura idfactura) {
        this.idfactura = idfactura;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iddetallefactura != null ? iddetallefactura.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Detallefactura)) {
            return false;
        }
        Detallefactura other = (Detallefactura) object;
        if ((this.iddetallefactura == null && other.iddetallefactura != null) || (this.iddetallefactura != null && !this.iddetallefactura.equals(other.iddetallefactura))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.alanayala.entities.Detallefactura[ iddetallefactura=" + iddetallefactura + " ]";
    }
    
}
