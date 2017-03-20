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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Dang Hoang
 */
@Entity
@Table(name = "PointDiscount", catalog = "SMOnline", schema = "dbo", uniqueConstraints = {
    @UniqueConstraint(columnNames = {"DiscountPercent"}),
    @UniqueConstraint(columnNames = {"CusPoint"})})
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PointDiscount.findAll", query = "SELECT p FROM PointDiscount p"),
    @NamedQuery(name = "PointDiscount.findByPointDiscountID", query = "SELECT p FROM PointDiscount p WHERE p.pointDiscountID = :pointDiscountID"),
    @NamedQuery(name = "PointDiscount.findByCusPoint", query = "SELECT p FROM PointDiscount p WHERE p.cusPoint = :cusPoint"),
    @NamedQuery(name = "PointDiscount.findByDiscountPercent", query = "SELECT p FROM PointDiscount p WHERE p.discountPercent = :discountPercent")})
public class PointDiscount implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "PointDiscountID", nullable = false)
    private Integer pointDiscountID;
    @Column(name = "CusPoint")
    private Integer cusPoint;
    @Column(name = "DiscountPercent")
    private Integer discountPercent;

    public PointDiscount() {
    }

    public PointDiscount(Integer pointDiscountID) {
        this.pointDiscountID = pointDiscountID;
    }

    public Integer getPointDiscountID() {
        return pointDiscountID;
    }

    public void setPointDiscountID(Integer pointDiscountID) {
        this.pointDiscountID = pointDiscountID;
    }

    public Integer getCusPoint() {
        return cusPoint;
    }

    public void setCusPoint(Integer cusPoint) {
        this.cusPoint = cusPoint;
    }

    public Integer getDiscountPercent() {
        return discountPercent;
    }

    public void setDiscountPercent(Integer discountPercent) {
        this.discountPercent = discountPercent;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pointDiscountID != null ? pointDiscountID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PointDiscount)) {
            return false;
        }
        PointDiscount other = (PointDiscount) object;
        if ((this.pointDiscountID == null && other.pointDiscountID != null) || (this.pointDiscountID != null && !this.pointDiscountID.equals(other.pointDiscountID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.PointDiscount[ pointDiscountID=" + pointDiscountID + " ]";
    }
    
}
