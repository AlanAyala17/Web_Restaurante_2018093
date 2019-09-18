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
@Table(name = "tipocliente")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tipocliente.findAll", query = "SELECT t FROM Tipocliente t")
    , @NamedQuery(name = "Tipocliente.findByIdtipocliente", query = "SELECT t FROM Tipocliente t WHERE t.idtipocliente = :idtipocliente")
    , @NamedQuery(name = "Tipocliente.findByDescripcion", query = "SELECT t FROM Tipocliente t WHERE t.descripcion = :descripcion")})
public class Tipocliente implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idtipocliente")
    private Integer idtipocliente;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "descripcion")
    private String descripcion;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idtipocliente")
    private List<Clientes> clientesList;

    public Tipocliente() {
    }

    public Tipocliente(Integer idtipocliente) {
        this.idtipocliente = idtipocliente;
    }

    public Tipocliente(Integer idtipocliente, String descripcion) {
        this.idtipocliente = idtipocliente;
        this.descripcion = descripcion;
    }

    public Integer getIdtipocliente() {
        return idtipocliente;
    }

    public void setIdtipocliente(Integer idtipocliente) {
        this.idtipocliente = idtipocliente;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @XmlTransient
    public List<Clientes> getClientesList() {
        return clientesList;
    }

    public void setClientesList(List<Clientes> clientesList) {
        this.clientesList = clientesList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idtipocliente != null ? idtipocliente.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tipocliente)) {
            return false;
        }
        Tipocliente other = (Tipocliente) object;
        if ((this.idtipocliente == null && other.idtipocliente != null) || (this.idtipocliente != null && !this.idtipocliente.equals(other.idtipocliente))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.alanayala.entities.Tipocliente[ idtipocliente=" + idtipocliente + " ]";
    }
    
}
