/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package entity;

import java.io.Serializable;
import java.util.Collection;
import javax.annotation.Generated;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
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
@Table(name = "Products", catalog = "SMOnline", schema = "dbo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Products.findAll", query = "SELECT p FROM Products p"),
    @NamedQuery(name = "Products.findByProductID", query = "SELECT p FROM Products p WHERE p.productID = :productID"),
    @NamedQuery(name = "Products.findByProductNameVn", query = "SELECT p FROM Products p WHERE p.productNameVn = :productNameVn"),
    @NamedQuery(name = "Products.findByProductDiscribe", query = "SELECT p FROM Products p WHERE p.productDiscribe = :productDiscribe"),
    @NamedQuery(name = "Products.findByProductPrice", query = "SELECT p FROM Products p WHERE p.productPrice = :productPrice"),
    @NamedQuery(name = "Products.findByProductUnit", query = "SELECT p FROM Products p WHERE p.productUnit = :productUnit"),
    @NamedQuery(name = "Products.findByProductQuanlity", query = "SELECT p FROM Products p WHERE p.productQuanlity = :productQuanlity"),
    @NamedQuery(name = "Products.findByProductImage", query = "SELECT p FROM Products p WHERE p.productImage = :productImage"),
    @NamedQuery(name = "Products.findByProductDiscount", query = "SELECT p FROM Products p WHERE p.productDiscount = :productDiscount"),
    @NamedQuery(name = "Products.findByProductRating", query = "SELECT p FROM Products p WHERE p.productRating = :productRating"),
    @NamedQuery(name = "Products.findByProductStatus", query = "SELECT p FROM Products p WHERE p.productStatus = :productStatus")})
public class Products implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ProductID", nullable = false)
    private Integer productID;
    @Size(max = 50)
    @Column(name = "ProductNameVn", length = 50)
    private String productNameVn;
    @Size(max = 500)
    @Column(name = "ProductDiscribe", length = 500)
    private String productDiscribe;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "ProductPrice", precision = 53)
    private Double productPrice;
    @Size(max = 50)
    @Column(name = "ProductUnit", length = 50)
    private String productUnit;
    @Column(name = "ProductQuanlity")
    private Integer productQuanlity;
    @Size(max = 60)
    @Column(name = "ProductImage", length = 60)
    private String productImage;
    @Column(name = "ProductDiscount")
    private Integer productDiscount;
    @Column(name = "ProductRating", precision = 53)
    private Double productRating;
    @Size(max = 1)
    @Column(name = "ProductStatus", length = 1)
    private String productStatus;
    @JoinColumn(name = "SupplyID", referencedColumnName = "SupplyID")
    @ManyToOne
    private Supplier supplyID;
    @JoinColumn(name = "TypeID", referencedColumnName = "TypeID")
    @ManyToOne
    private ProductType typeID;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "products")
    private Collection<OrderDetails> orderDetailsCollection;
    @OneToMany(mappedBy = "productID")
    private Collection<ProductsCommentRating> productsCommentRatingCollection;
    @OneToMany(mappedBy = "productID")
    private Collection<ProductsEditHistory> productsEditHistoryCollection;

    public Products() {
    }

    public Products(Integer productID, String productNameVn, String productDiscribe, Double productPrice, String productUnit, Integer productQuanlity, String productImage, Integer productDiscount, Double productRating, String productStatus, Supplier supplyID, ProductType typeID) {
        this.productID = productID;
        this.productNameVn = productNameVn;
        this.productDiscribe = productDiscribe;
        this.productPrice = productPrice;
        this.productUnit = productUnit;
        this.productQuanlity = productQuanlity;
        this.productImage = productImage;
        this.productDiscount = productDiscount;
        this.productRating = productRating;
        this.productStatus = productStatus;
        this.supplyID = supplyID;
        this.typeID = typeID;
    }
    
    public Products(Integer productID) {
        this.productID = productID;
    }

    public Integer getProductID() {
        return productID;
    }

    public void setProductID(Integer productID) {
        this.productID = productID;
    }

    public String getProductNameVn() {
        return productNameVn;
    }

    public void setProductNameVn(String productNameVn) {
        this.productNameVn = productNameVn;
    }

    public String getProductDiscribe() {
        return productDiscribe;
    }

    public void setProductDiscribe(String productDiscribe) {
        this.productDiscribe = productDiscribe;
    }

    public Double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(Double productPrice) {
        this.productPrice = productPrice;
    }

    public String getProductUnit() {
        return productUnit;
    }

    public void setProductUnit(String productUnit) {
        this.productUnit = productUnit;
    }

    public Integer getProductQuanlity() {
        return productQuanlity;
    }

    public void setProductQuanlity(Integer productQuanlity) {
        this.productQuanlity = productQuanlity;
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

    public Double getProductRating() {
        return productRating;
    }

    public void setProductRating(Double productRating) {
        this.productRating = productRating;
    }

    public String getProductStatus() {
        return productStatus;
    }

    public void setProductStatus(String productStatus) {
        this.productStatus = productStatus;
    }

    public Supplier getSupplyID() {
        return supplyID;
    }

    public void setSupplyID(Supplier supplyID) {
        this.supplyID = supplyID;
    }

    public ProductType getTypeID() {
        return typeID;
    }

    public void setTypeID(ProductType typeID) {
        this.typeID = typeID;
    }

    @XmlTransient
    public Collection<OrderDetails> getOrderDetailsCollection() {
        return orderDetailsCollection;
    }

    public void setOrderDetailsCollection(Collection<OrderDetails> orderDetailsCollection) {
        this.orderDetailsCollection = orderDetailsCollection;
    }

    @XmlTransient
    public Collection<ProductsCommentRating> getProductsCommentRatingCollection() {
        return productsCommentRatingCollection;
    }

    public void setProductsCommentRatingCollection(Collection<ProductsCommentRating> productsCommentRatingCollection) {
        this.productsCommentRatingCollection = productsCommentRatingCollection;
    }

    @XmlTransient
    public Collection<ProductsEditHistory> getProductsEditHistoryCollection() {
        return productsEditHistoryCollection;
    }

    public void setProductsEditHistoryCollection(Collection<ProductsEditHistory> productsEditHistoryCollection) {
        this.productsEditHistoryCollection = productsEditHistoryCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (productID != null ? productID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Products)) {
            return false;
        }
        Products other = (Products) object;
        if ((this.productID == null && other.productID != null) || (this.productID != null && !this.productID.equals(other.productID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Products[ productID=" + productID + " ]";
    }
    
}
