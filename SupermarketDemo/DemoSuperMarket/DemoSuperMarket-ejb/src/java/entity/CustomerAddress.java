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
@Table(name = "CustomerAddress", catalog = "SMOnline", schema = "dbo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CustomerAddress.findAll", query = "SELECT c FROM CustomerAddress c"),
    @NamedQuery(name = "CustomerAddress.findByCustomerAddressId", query = "SELECT c FROM CustomerAddress c WHERE c.customerAddressId = :customerAddressId"),
    @NamedQuery(name = "CustomerAddress.findByCustomerAddressDistance", query = "SELECT c FROM CustomerAddress c WHERE c.customerAddressDistance = :customerAddressDistance"),
    @NamedQuery(name = "CustomerAddress.findByCustomerAddressDetail", query = "SELECT c FROM CustomerAddress c WHERE c.customerAddressDetail = :customerAddressDetail")})
public class CustomerAddress implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "CustomerAddressId", nullable = false)
    private Integer customerAddressId;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "CustomerAddressDistance", precision = 53)
    private Double customerAddressDistance;
    @Size(max = 150)
    @Column(name = "CustomerAddressDetail", length = 150)
    private String customerAddressDetail;
    @JoinColumn(name = "CustomerID", referencedColumnName = "CustomerID")
    @ManyToOne
    private Customer customerID;

    public CustomerAddress() {
    }

    public CustomerAddress(Integer customerAddressId) {
        this.customerAddressId = customerAddressId;
    }

    public Integer getCustomerAddressId() {
        return customerAddressId;
    }

    public void setCustomerAddressId(Integer customerAddressId) {
        this.customerAddressId = customerAddressId;
    }

    public Double getCustomerAddressDistance() {
        return customerAddressDistance;
    }

    public void setCustomerAddressDistance(Double customerAddressDistance) {
        this.customerAddressDistance = customerAddressDistance;
    }

    public String getCustomerAddressDetail() {
        return customerAddressDetail;
    }

    public void setCustomerAddressDetail(String customerAddressDetail) {
        this.customerAddressDetail = customerAddressDetail;
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
        hash += (customerAddressId != null ? customerAddressId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CustomerAddress)) {
            return false;
        }
        CustomerAddress other = (CustomerAddress) object;
        if ((this.customerAddressId == null && other.customerAddressId != null) || (this.customerAddressId != null && !this.customerAddressId.equals(other.customerAddressId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.CustomerAddress[ customerAddressId=" + customerAddressId + " ]";
    }
    
}
