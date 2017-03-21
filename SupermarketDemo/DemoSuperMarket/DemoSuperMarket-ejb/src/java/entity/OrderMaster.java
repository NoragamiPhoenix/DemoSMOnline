/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package entity;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
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
@Table(name = "OrderMaster", catalog = "SMOnline", schema = "dbo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "OrderMaster.findAll", query = "SELECT o FROM OrderMaster o"),
    @NamedQuery(name = "OrderMaster.findByOrderMID", query = "SELECT o FROM OrderMaster o WHERE o.orderMID = :orderMID"),
    @NamedQuery(name = "OrderMaster.findByOMDate", query = "SELECT o FROM OrderMaster o WHERE o.oMDate = :oMDate")})
public class OrderMaster implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "OrderMID", nullable = false)
    private Integer orderMID;
    @Size(max = 10)
    @Column(name = "OMDate", length = 10)
    private String oMDate;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "orderMaster")
    private Collection<OrderDetails> orderDetailsCollection;
    @JoinColumn(name = "CustomerID", referencedColumnName = "CustomerID")
    @ManyToOne
    private Customer customerID;

    public OrderMaster() {
    }

    public OrderMaster(Integer orderMID) {
        this.orderMID = orderMID;
    }

    public Integer getOrderMID() {
        return orderMID;
    }

    public void setOrderMID(Integer orderMID) {
        this.orderMID = orderMID;
    }

    public String getOMDate() {
        return oMDate;
    }

    public void setOMDate(String oMDate) {
        this.oMDate = oMDate;
    }

    @XmlTransient
    public Collection<OrderDetails> getOrderDetailsCollection() {
        return orderDetailsCollection;
    }

    public void setOrderDetailsCollection(Collection<OrderDetails> orderDetailsCollection) {
        this.orderDetailsCollection = orderDetailsCollection;
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
        hash += (orderMID != null ? orderMID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OrderMaster)) {
            return false;
        }
        OrderMaster other = (OrderMaster) object;
        if ((this.orderMID == null && other.orderMID != null) || (this.orderMID != null && !this.orderMID.equals(other.orderMID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.OrderMaster[ orderMID=" + orderMID + " ]";
    }
    
}
