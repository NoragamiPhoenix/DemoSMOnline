/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;

/**
 *
 * @author Dang Hoang
 */
@Embeddable
public class OrderDetailsPK implements Serializable {
    @Basic(optional = false)
    @NotNull
    @Column(name = "OrderMID", nullable = false)
    private int orderMID;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ProductID", nullable = false)
    private int productID;

    public OrderDetailsPK() {
    }

    public OrderDetailsPK(int orderMID, int productID) {
        this.orderMID = orderMID;
        this.productID = productID;
    }

    public int getOrderMID() {
        return orderMID;
    }

    public void setOrderMID(int orderMID) {
        this.orderMID = orderMID;
    }

    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) orderMID;
        hash += (int) productID;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OrderDetailsPK)) {
            return false;
        }
        OrderDetailsPK other = (OrderDetailsPK) object;
        if (this.orderMID != other.orderMID) {
            return false;
        }
        if (this.productID != other.productID) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.OrderDetailsPK[ orderMID=" + orderMID + ", productID=" + productID + " ]";
    }
    
}
