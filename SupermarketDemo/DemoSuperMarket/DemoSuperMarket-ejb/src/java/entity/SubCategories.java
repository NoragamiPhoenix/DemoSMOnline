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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "SubCategories", catalog = "SMOnline", schema = "dbo", uniqueConstraints = {
    @UniqueConstraint(columnNames = {"SubCateNameEn"}),
    @UniqueConstraint(columnNames = {"SubCateNameVn"})})
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SubCategories.findAll", query = "SELECT s FROM SubCategories s"),
    @NamedQuery(name = "SubCategories.findBySubCateID", query = "SELECT s FROM SubCategories s WHERE s.subCateID = :subCateID"),
    @NamedQuery(name = "SubCategories.findBySubCateNameEn", query = "SELECT s FROM SubCategories s WHERE s.subCateNameEn = :subCateNameEn"),
    @NamedQuery(name = "SubCategories.findBySubCateNameVn", query = "SELECT s FROM SubCategories s WHERE s.subCateNameVn = :subCateNameVn"),
    @NamedQuery(name = "SubCategories.findBySubCateDescEn", query = "SELECT s FROM SubCategories s WHERE s.subCateDescEn = :subCateDescEn"),
    @NamedQuery(name = "SubCategories.findBySubCateDescVn", query = "SELECT s FROM SubCategories s WHERE s.subCateDescVn = :subCateDescVn")})
public class SubCategories implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "SubCateID", nullable = false)
    private Integer subCateID;
    @Size(max = 50)
    @Column(name = "SubCateNameEn", length = 50)
    private String subCateNameEn;
    @Size(max = 50)
    @Column(name = "SubCateNameVn", length = 50)
    private String subCateNameVn;
    @Size(max = 300)
    @Column(name = "SubCateDescEn", length = 300)
    private String subCateDescEn;
    @Size(max = 300)
    @Column(name = "SubCateDescVn", length = 300)
    private String subCateDescVn;
    @OneToMany(mappedBy = "subCateID")
    private Collection<ProductType> productTypeCollection;
    @JoinColumn(name = "CateID", referencedColumnName = "CateID")
    @ManyToOne
    private Categories cateID;

    public SubCategories() {
    }

    public SubCategories(Integer subCateID) {
        this.subCateID = subCateID;
    }

    public Integer getSubCateID() {
        return subCateID;
    }

    public void setSubCateID(Integer subCateID) {
        this.subCateID = subCateID;
    }

    public String getSubCateNameEn() {
        return subCateNameEn;
    }

    public void setSubCateNameEn(String subCateNameEn) {
        this.subCateNameEn = subCateNameEn;
    }

    public String getSubCateNameVn() {
        return subCateNameVn;
    }

    public void setSubCateNameVn(String subCateNameVn) {
        this.subCateNameVn = subCateNameVn;
    }

    public String getSubCateDescEn() {
        return subCateDescEn;
    }

    public void setSubCateDescEn(String subCateDescEn) {
        this.subCateDescEn = subCateDescEn;
    }

    public String getSubCateDescVn() {
        return subCateDescVn;
    }

    public void setSubCateDescVn(String subCateDescVn) {
        this.subCateDescVn = subCateDescVn;
    }

    @XmlTransient
    public Collection<ProductType> getProductTypeCollection() {
        return productTypeCollection;
    }

    public void setProductTypeCollection(Collection<ProductType> productTypeCollection) {
        this.productTypeCollection = productTypeCollection;
    }

    public Categories getCateID() {
        return cateID;
    }

    public void setCateID(Categories cateID) {
        this.cateID = cateID;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (subCateID != null ? subCateID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SubCategories)) {
            return false;
        }
        SubCategories other = (SubCategories) object;
        if ((this.subCateID == null && other.subCateID != null) || (this.subCateID != null && !this.subCateID.equals(other.subCateID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.SubCategories[ subCateID=" + subCateID + " ]";
    }
    
}
