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
@Table(name = "cocinero")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Cocinero.findAll", query = "SELECT c FROM Cocinero c")
    , @NamedQuery(name = "Cocinero.findByIdcocinero", query = "SELECT c FROM Cocinero c WHERE c.idcocinero = :idcocinero")
    , @NamedQuery(name = "Cocinero.findByNombres", query = "SELECT c FROM Cocinero c WHERE c.nombres = :nombres")
    , @NamedQuery(name = "Cocinero.findByApellidos", query = "SELECT c FROM Cocinero c WHERE c.apellidos = :apellidos")})
public class Cocinero implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idcocinero")
    private Integer idcocinero;
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
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idcocinero")
    private List<Detallefactura> detallefacturaList;

    public Cocinero() {
    }

    public Cocinero(Integer idcocinero) {
        this.idcocinero = idcocinero;
    }

    public Cocinero(Integer idcocinero, String nombres, String apellidos) {
        this.idcocinero = idcocinero;
        this.nombres = nombres;
        this.apellidos = apellidos;
    }

    public Integer getIdcocinero() {
        return idcocinero;
    }

    public void setIdcocinero(Integer idcocinero) {
        this.idcocinero = idcocinero;
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
    public List<Detallefactura> getDetallefacturaList() {
        return detallefacturaList;
    }

    public void setDetallefacturaList(List<Detallefactura> detallefacturaList) {
        this.detallefacturaList = detallefacturaList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idcocinero != null ? idcocinero.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cocinero)) {
            return false;
        }
        Cocinero other = (Cocinero) object;
        if ((this.idcocinero == null && other.idcocinero != null) || (this.idcocinero != null && !this.idcocinero.equals(other.idcocinero))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.alanayala.entities.Cocinero[ idcocinero=" + idcocinero + " ]";
    }
    
}
