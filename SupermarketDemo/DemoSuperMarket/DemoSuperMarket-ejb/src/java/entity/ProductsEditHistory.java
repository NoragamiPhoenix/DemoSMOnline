/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Dang Hoang
 */
@Entity
@Table(name = "ProductsEditHistory", catalog = "SMOnline", schema = "dbo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ProductsEditHistory.findAll", query = "SELECT p FROM ProductsEditHistory p"),
    @NamedQuery(name = "ProductsEditHistory.findByEditID", query = "SELECT p FROM ProductsEditHistory p WHERE p.editID = :editID"),
    @NamedQuery(name = "ProductsEditHistory.findByTypeID", query = "SELECT p FROM ProductsEditHistory p WHERE p.typeID = :typeID"),
    @NamedQuery(name = "ProductsEditHistory.findBySupplyID", query = "SELECT p FROM ProductsEditHistory p WHERE p.supplyID = :supplyID"),
    @NamedQuery(name = "ProductsEditHistory.findByProductName", query = "SELECT p FROM ProductsEditHistory p WHERE p.productName = :productName"),
    @NamedQuery(name = "ProductsEditHistory.findByProductPrice", query = "SELECT p FROM ProductsEditHistory p WHERE p.productPrice = :productPrice"),
    @NamedQuery(name = "ProductsEditHistory.findByProductUnit", query = "SELECT p FROM ProductsEditHistory p WHERE p.productUnit = :productUnit"),
    @NamedQuery(name = "ProductsEditHistory.findByProductImage", query = "SELECT p FROM ProductsEditHistory p WHERE p.productImage = :productImage"),
    @NamedQuery(name = "ProductsEditHistory.findByProductDiscount", query = "SELECT p FROM ProductsEditHistory p WHERE p.productDiscount = :productDiscount"),
    @NamedQuery(name = "ProductsEditHistory.findByProductEditTime", query = "SELECT p FROM ProductsEditHistory p WHERE p.productEditTime = :productEditTime")})
public class ProductsEditHistory implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "EditID", nullable = false)
    private Integer editID;
    @Column(name = "TypeID")
    private Integer typeID;
    @Column(name = "SupplyID")
    private Integer supplyID;
    @Size(max = 50)
    @Column(name = "ProductName", length = 50)
    private String productName;
    @Column(name = "ProductPrice")
    private Integer productPrice;
    @Size(max = 50)
    @Column(name = "ProductUnit", length = 50)
    private String productUnit;
    @Size(max = 60)
    @Column(name = "ProductImage", length = 60)
    private String productImage;
    @Column(name = "ProductDiscount")
    private Integer productDiscount;
    @Column(name = "ProductEditTime")
    @Temporal(TemporalType.TIMESTAMP)
    private Date productEditTime;
    @JoinColumn(name = "ProductID", referencedColumnName = "ProductID")
    @ManyToOne
    private Products productID;

    public ProductsEditHistory() {
    }

    public ProductsEditHistory(Integer editID) {
        this.editID = editID;
    }

    public Integer getEditID() {
        return editID;
    }

    public void setEditID(Integer editID) {
        this.editID = editID;
    }

    public Integer getTypeID() {
        return typeID;
    }

    public void setTypeID(Integer typeID) {
        this.typeID = typeID;
    }

    public Integer getSupplyID() {
        return supplyID;
    }

    public void setSupplyID(Integer supplyID) {
        this.supplyID = supplyID;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Integer getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(Integer productPrice) {
        this.productPrice = productPrice;
    }

    public String getProductUnit() {
        return productUnit;
    }

    public void setProductUnit(String productUnit) {
        this.productUnit = productUnit;
    }

    public String getProductImage() {
        return productImage;
    }

    public void setProductImage(String productImage) {
        this.productImage = productImage;
    }

    public Integer getProductDiscount() {
        return productDiscount;
    }

    public void setProductDiscount(Integer productDiscount) {
        this.productDiscount = productDiscount;
    }

    public Date getProductEditTime() {
        return productEditTime;
    }

    public void setProductEditTime(Date productEditTime) {
        this.productEditTime = productEditTime;
    }

    public Products getProductID() {
        return productID;
    }

    public void setProductID(Products productID) {
        this.productID = productID;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (editID != null ? editID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProductsEditHistory)) {
            return false;
        }
        ProductsEditHistory other = (ProductsEditHistory) object;
        if ((this.editID == null && other.editID != null) || (this.editID != null && !this.editID.equals(other.editID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.ProductsEditHistory[ editID=" + editID + " ]";
    }
    
}
