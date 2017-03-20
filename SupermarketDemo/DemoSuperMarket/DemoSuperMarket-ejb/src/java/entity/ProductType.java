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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
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
 * @author Dang Hoang
 */
@Entity
@Table(name = "ProductType", catalog = "SMOnline", schema = "dbo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ProductType.findAll", query = "SELECT p FROM ProductType p"),
    @NamedQuery(name = "ProductType.findByTypeID", query = "SELECT p FROM ProductType p WHERE p.typeID = :typeID"),
    @NamedQuery(name = "ProductType.findByTypeEn", query = "SELECT p FROM ProductType p WHERE p.typeEn = :typeEn"),
    @NamedQuery(name = "ProductType.findByTypeVn", query = "SELECT p FROM ProductType p WHERE p.typeVn = :typeVn"),
    @NamedQuery(name = "ProductType.findByTypeDescEn", query = "SELECT p FROM ProductType p WHERE p.typeDescEn = :typeDescEn"),
    @NamedQuery(name = "ProductType.findByTypeDescVn", query = "SELECT p FROM ProductType p WHERE p.typeDescVn = :typeDescVn")})
public class ProductType implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "TypeID", nullable = false)
    private Integer typeID;
    @Size(max = 50)
    @Column(name = "TypeEn", length = 50)
    private String typeEn;
    @Size(max = 50)
    @Column(name = "TypeVn", length = 50)
    private String typeVn;
    @Size(max = 300)
    @Column(name = "TypeDescEn", length = 300)
    private String typeDescEn;
    @Size(max = 300)
    @Column(name = "TypeDescVn", length = 300)
    private String typeDescVn;
    @OneToMany(mappedBy = "typeID")
    private Collection<Products> productsCollection;
    @JoinColumn(name = "SubCateID", referencedColumnName = "SubCateID")
    @ManyToOne
    private SubCategories subCateID;

    public ProductType() {
    }

    public ProductType(Integer typeID) {
        this.typeID = typeID;
    }

    public Integer getTypeID() {
        return typeID;
    }

    public void setTypeID(Integer typeID) {
        this.typeID = typeID;
    }

    public String getTypeEn() {
        return typeEn;
    }

    public void setTypeEn(String typeEn) {
        this.typeEn = typeEn;
    }

    public String getTypeVn() {
        return typeVn;
    }

    public void setTypeVn(String typeVn) {
        this.typeVn = typeVn;
    }

    public String getTypeDescEn() {
        return typeDescEn;
    }

    public void setTypeDescEn(String typeDescEn) {
        this.typeDescEn = typeDescEn;
    }

    public String getTypeDescVn() {
        return typeDescVn;
    }

    public void setTypeDescVn(String typeDescVn) {
        this.typeDescVn = typeDescVn;
    }

    @XmlTransient
    public Collection<Products> getProductsCollection() {
        return productsCollection;
    }

    public void setProductsCollection(Collection<Products> productsCollection) {
        this.productsCollection = productsCollection;
    }

    public SubCategories getSubCateID() {
        return subCateID;
    }

    public void setSubCateID(SubCategories subCateID) {
        this.subCateID = subCateID;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (typeID != null ? typeID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProductType)) {
            return false;
        }
        ProductType other = (ProductType) object;
        if ((this.typeID == null && other.typeID != null) || (this.typeID != null && !this.typeID.equals(other.typeID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.ProductType[ typeID=" + typeID + " ]";
    }
    
}
