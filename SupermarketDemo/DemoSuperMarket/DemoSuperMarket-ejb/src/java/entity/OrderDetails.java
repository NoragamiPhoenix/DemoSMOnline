/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Dang Hoang
 */
@Entity
@Table(name = "OrderDetails", catalog = "SMOnline", schema = "dbo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "OrderDetails.findAll", query = "SELECT o FROM OrderDetails o"),
    @NamedQuery(name = "OrderDetails.findByOrderMID", query = "SELECT o FROM OrderDetails o WHERE o.orderDetailsPK.orderMID = :orderMID"),
    @NamedQuery(name = "OrderDetails.findByProductID", query = "SELECT o FROM OrderDetails o WHERE o.orderDetailsPK.productID = :productID"),
    @NamedQuery(name = "OrderDetails.findByODTime", query = "SELECT o FROM OrderDetails o WHERE o.oDTime = :oDTime"),
    @NamedQuery(name = "OrderDetails.findByDiscountPercent", query = "SELECT o FROM OrderDetails o WHERE o.discountPercent = :discountPercent"),
    @NamedQuery(name = "OrderDetails.findByQuantity", query = "SELECT o FROM OrderDetails o WHERE o.quantity = :quantity")})
public class OrderDetails implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected OrderDetailsPK orderDetailsPK;
    @Column(name = "ODTime")
    @Temporal(TemporalType.TIMESTAMP)
    private Date oDTime;
    @Column(name = "DiscountPercent")
    private Integer discountPercent;
    @Column(name = "Quantity")
    private Integer quantity;
    @JoinColumn(name = "ProductID", referencedColumnName = "ProductID", nullable = false, insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Products products;
    @JoinColumn(name = "OrderMID", referencedColumnName = "OrderMID", nullable = false, insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private OrderMaster orderMaster;

    public OrderDetails() {
    }

    public OrderDetails(OrderDetailsPK orderDetailsPK) {
        this.orderDetailsPK = orderDetailsPK;
    }

    public OrderDetails(int orderMID, int productID) {
        this.orderDetailsPK = new OrderDetailsPK(orderMID, productID);
    }

    public OrderDetailsPK getOrderDetailsPK() {
        return orderDetailsPK;
    }

    public void setOrderDetailsPK(OrderDetailsPK orderDetailsPK) {
        this.orderDetailsPK = orderDetailsPK;
    }

    public Date getODTime() {
        return oDTime;
    }

    public void setODTime(Date oDTime) {
        this.oDTime = oDTime;
    }

    public Integer getDiscountPercent() {
        return discountPercent;
    }

    public void setDiscountPercent(Integer discountPercent) {
        this.discountPercent = discountPercent;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Products getProducts() {
        return products;
    }

    public void setProducts(Products products) {
        this.products = products;
    }

    public OrderMaster getOrderMaster() {
        return orderMaster;
    }

    public void setOrderMaster(OrderMaster orderMaster) {
        this.orderMaster = orderMaster;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (orderDetailsPK != null ? orderDetailsPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OrderDetails)) {
            return false;
        }
        OrderDetails other = (OrderDetails) object;
        if ((this.orderDetailsPK == null && other.orderDetailsPK != null) || (this.orderDetailsPK != null && !this.orderDetailsPK.equals(other.orderDetailsPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.OrderDetails[ orderDetailsPK=" + orderDetailsPK + " ]";
    }
    
}
