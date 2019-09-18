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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author programacion
 */
@Entity
@Table(name = "mesas")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Mesas.findAll", query = "SELECT m FROM Mesas m")
    , @NamedQuery(name = "Mesas.findByIdmesas", query = "SELECT m FROM Mesas m WHERE m.idmesas = :idmesas")
    , @NamedQuery(name = "Mesas.findByNummaxclientes", query = "SELECT m FROM Mesas m WHERE m.nummaxclientes = :nummaxclientes")})
public class Mesas implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idmesas")
    private Integer idmesas;
    @Basic(optional = false)
    @NotNull
    @Column(name = "nummaxclientes")
    private int nummaxclientes;
    @JoinColumn(name = "idarearestaurante", referencedColumnName = "idarearestaurante")
    @ManyToOne(optional = false)
    private Arearestaurante idarearestaurante;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idmesas")
    private List<Factura> facturaList;

    public Mesas() {
    }

    public Mesas(Integer idmesas) {
        this.idmesas = idmesas;
    }

    public Mesas(Integer idmesas, int nummaxclientes) {
        this.idmesas = idmesas;
        this.nummaxclientes = nummaxclientes;
    }

    public Integer getIdmesas() {
        return idmesas;
    }

    public void setIdmesas(Integer idmesas) {
        this.idmesas = idmesas;
    }

    public int getNummaxclientes() {
        return nummaxclientes;
    }

    public void setNummaxclientes(int nummaxclientes) {
        this.nummaxclientes = nummaxclientes;
    }

    public Arearestaurante getIdarearestaurante() {
        return idarearestaurante;
    }

    public void setIdarearestaurante(Arearestaurante idarearestaurante) {
        this.idarearestaurante = idarearestaurante;
    }

    @XmlTransient
    public List<Factura> getFacturaList() {
        return facturaList;
    }

    public void setFacturaList(List<Factura> facturaList) {
        this.facturaList = facturaList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idmesas != null ? idmesas.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Mesas)) {
            return false;
        }
        Mesas other = (Mesas) object;
        if ((this.idmesas == null && other.idmesas != null) || (this.idmesas != null && !this.idmesas.equals(other.idmesas))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.alanayala.entities.Mesas[ idmesas=" + idmesas + " ]";
    }
    
}
