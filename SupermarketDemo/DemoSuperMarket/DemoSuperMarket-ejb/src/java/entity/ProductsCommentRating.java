/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Dang Hoang
 */
@Entity
@Table(name = "ProductsCommentRating", catalog = "SMOnline", schema = "dbo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ProductsCommentRating.findAll", query = "SELECT p FROM ProductsCommentRating p"),
    @NamedQuery(name = "ProductsCommentRating.findByCommentID", query = "SELECT p FROM ProductsCommentRating p WHERE p.commentID = :commentID"),
    @NamedQuery(name = "ProductsCommentRating.findByCommentText", query = "SELECT p FROM ProductsCommentRating p WHERE p.commentText = :commentText"),
    @NamedQuery(name = "ProductsCommentRating.findByCustomerRating", query = "SELECT p FROM ProductsCommentRating p WHERE p.customerRating = :customerRating")})
public class ProductsCommentRating implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "CommentID", nullable = false)
    private Integer commentID;
    @Size(max = 300)
    @Column(name = "CommentText", length = 300)
    private String commentText;
    @Size(max = 1)
    @Column(name = "CustomerRating", length = 1)
    private String customerRating;
    @JoinColumn(name = "ProductID", referencedColumnName = "ProductID")
    @ManyToOne
    private Products productID;
    @JoinColumn(name = "CustomerID", referencedColumnName = "CustomerID")
    @ManyToOne
    private Customer customerID;

    public ProductsCommentRating() {
    }

    public ProductsCommentRating(Integer commentID) {
        this.commentID = commentID;
    }

    public Integer getCommentID() {
        return commentID;
    }

    public void setCommentID(Integer commentID) {
        this.commentID = commentID;
    }

    public String getCommentText() {
        return commentText;
    }

    public void setCommentText(String commentText) {
        this.commentText = commentText;
    }

    public String getCustomerRating() {
        return customerRating;
    }

    public void setCustomerRating(String customerRating) {
        this.customerRating = customerRating;
    }

    public Products getProductID() {
        return productID;
    }

    public void setProductID(Products productID) {
        this.productID = productID;
    }

    public Customer getCustomerID() {
        return customerID;
    }

    public void setCustomerID(Customer customerID) {
        this.customerID = customerID;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (commentID != null ? commentID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProductsCommentRating)) {
            return false;
        }
        ProductsCommentRating other = (ProductsCommentRating) object;
        if ((this.commentID == null && other.commentID != null) || (this.commentID != null && !this.commentID.equals(other.commentID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.ProductsCommentRating[ commentID=" + commentID + " ]";
    }
    
}
