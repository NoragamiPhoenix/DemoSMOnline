/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package entity;

import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Dang Hoang
 */
@Local
public interface PointDiscountFacadeLocal {

    void create(PointDiscount pointDiscount);

    void edit(PointDiscount pointDiscount);

    void remove(PointDiscount pointDiscount);

    PointDiscount find(Object id);

    List<PointDiscount> findAll();

    List<PointDiscount> findRange(int[] range);

    int count();
    
}
