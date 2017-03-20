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
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Dang Hoang
 */
@Entity
@Table(name = "Categories", catalog = "SMOnline", schema = "dbo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Categories.findAll", query = "SELECT c FROM Categories c"),
    @NamedQuery(name = "Categories.findByCateID", query = "SELECT c FROM Categories c WHERE c.cateID = :cateID"),
    @NamedQuery(name = "Categories.findByCateNameEn", query = "SELECT c FROM Categories c WHERE c.cateNameEn = :cateNameEn"),
    @NamedQuery(name = "Categories.findByCateNameVn", query = "SELECT c FROM Categories c WHERE c.cateNameVn = :cateNameVn"),
    @NamedQuery(name = "Categories.findByCateDescEn", query = "SELECT c FROM Categories c WHERE c.cateDescEn = :cateDescEn"),
    @NamedQuery(name = "Categories.findByCateDescVn", query = "SELECT c FROM Categories c WHERE c.cateDescVn = :cateDescVn")})
public class Categories implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "CateID", nullable = false)
    private Integer cateID;
    @Size(max = 50)
    @Column(name = "CateNameEn", length = 50)
    private String cateNameEn;
    @Size(max = 50)
    @Column(name = "CateNameVn", length = 50)
    private String cateNameVn;
    @Size(max = 300)
    @Column(name = "CateDescEn", length = 300)
    private String cateDescEn;
    @Size(max = 300)
    @Column(name = "CateDescVn", length = 300)
    private String cateDescVn;
    @OneToMany(mappedBy = "cateID")
    private Collection<SubCategories> subCategoriesCollection;

    public Categories() {
    }

    public Categories(Integer cateID) {
        this.cateID = cateID;
    }

    public Integer getCateID() {
        return cateID;
    }

    public void setCateID(Integer cateID) {
        this.cateID = cateID;
    }

    public String getCateNameEn() {
        return cateNameEn;
    }

    public void setCateNameEn(String cateNameEn) {
        this.cateNameEn = cateNameEn;
    }

    public String getCateNameVn() {
        return cateNameVn;
    }

    public void setCateNameVn(String cateNameVn) {
        this.cateNameVn = cateNameVn;
    }

    public String getCateDescEn() {
        return cateDescEn;
    }

    public void setCateDescEn(String cateDescEn) {
        this.cateDescEn = cateDescEn;
    }

    public String getCateDescVn() {
        return cateDescVn;
    }

    public void setCateDescVn(String cateDescVn) {
        this.cateDescVn = cateDescVn;
    }

    @XmlTransient
    public Collection<SubCategories> getSubCategoriesCollection() {
        return subCategoriesCollection;
    }

    public void setSubCategoriesCollection(Collection<SubCategories> subCategoriesCollection) {
        this.subCategoriesCollection = subCategoriesCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cateID != null ? cateID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Categories)) {
            return false;
        }
        Categories other = (Categories) object;
        if ((this.cateID == null && other.cateID != null) || (this.cateID != null && !this.cateID.equals(other.cateID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Categories[ cateID=" + cateID + " ]";
    }
    
}
