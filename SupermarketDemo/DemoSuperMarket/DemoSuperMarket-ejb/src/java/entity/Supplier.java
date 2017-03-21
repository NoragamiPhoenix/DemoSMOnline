/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package entity;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Dang Hoang
 */
@Entity
@Table(name = "Supplier", catalog = "SMOnline", schema = "dbo", uniqueConstraints = {
    @UniqueConstraint(columnNames = {"SupplyName"})})
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Supplier.findAll", query = "SELECT s FROM Supplier s"),
    @NamedQuery(name = "Supplier.findBySupplyID", query = "SELECT s FROM Supplier s WHERE s.supplyID = :supplyID"),
    @NamedQuery(name = "Supplier.findBySupplyName", query = "SELECT s FROM Supplier s WHERE s.supplyName = :supplyName"),
    @NamedQuery(name = "Supplier.findBySupplyLogo", query = "SELECT s FROM Supplier s WHERE s.supplyLogo = :supplyLogo")})
public class Supplier implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "SupplyID", nullable = false)
    private Integer supplyID;
    @Size(max = 50)
    @Column(name = "SupplyName", length = 50)
    private String supplyName;
    @Size(max = 60)
    @Column(name = "SupplyLogo", length = 60)
    private String supplyLogo;
    @OneToMany(mappedBy = "supplyID")
    private Collection<Products> productsCollection;

    public Supplier() {
    }

    public Supplier(Integer supplyID) {
        this.supplyID = supplyID;
    }

    public Integer getSupplyID() {
        return supplyID;
    }

    public void setSupplyID(Integer supplyID) {
        this.supplyID = supplyID;
    }

    public String getSupplyName() {
        return supplyName;
    }

    public void setSupplyName(String supplyName) {
        this.supplyName = supplyName;
    }

    public String getSupplyLogo() {
        return supplyLogo;
    }

    public void setSupplyLogo(String supplyLogo) {
        this.supplyLogo = supplyLogo;
    }

    @XmlTransient
    public Collection<Products> getProductsCollection() {
        return productsCollection;
    }

    public void setProductsCollection(Collection<Products> productsCollection) {
        this.productsCollection = productsCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (supplyID != null ? supplyID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Supplier)) {
            return false;
        }
        Supplier other = (Supplier) object;
        if ((this.supplyID == null && other.supplyID != null) || (this.supplyID != null && !this.supplyID.equals(other.supplyID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Supplier[ supplyID=" + supplyID + " ]";
    }
    
}
