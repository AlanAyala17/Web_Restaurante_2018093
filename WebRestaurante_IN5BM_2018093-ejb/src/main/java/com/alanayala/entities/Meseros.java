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
@Table(name = "meseros")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Meseros.findAll", query = "SELECT m FROM Meseros m")
    , @NamedQuery(name = "Meseros.findByIdmeseros", query = "SELECT m FROM Meseros m WHERE m.idmeseros = :idmeseros")
    , @NamedQuery(name = "Meseros.findByNombres", query = "SELECT m FROM Meseros m WHERE m.nombres = :nombres")
    , @NamedQuery(name = "Meseros.findByApellidos", query = "SELECT m FROM Meseros m WHERE m.apellidos = :apellidos")})
public class Meseros implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idmeseros")
    private Integer idmeseros;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "nombres")
    private String nombres;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "apellidos")
    private String apellidos;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idmeseros")
    private List<Factura> facturaList;

    public Meseros() {
    }

    public Meseros(Integer idmeseros) {
        this.idmeseros = idmeseros;
    }

    public Meseros(Integer idmeseros, String nombres, String apellidos) {
        this.idmeseros = idmeseros;
        this.nombres = nombres;
        this.apellidos = apellidos;
    }

    public Integer getIdmeseros() {
        return idmeseros;
    }

    public void setIdmeseros(Integer idmeseros) {
        this.idmeseros = idmeseros;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
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
        hash += (idmeseros != null ? idmeseros.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Meseros)) {
            return false;
        }
        Meseros other = (Meseros) object;
        if ((this.idmeseros == null && other.idmeseros != null) || (this.idmeseros != null && !this.idmeseros.equals(other.idmeseros))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.alanayala.entities.Meseros[ idmeseros=" + idmeseros + " ]";
    }
    
}
