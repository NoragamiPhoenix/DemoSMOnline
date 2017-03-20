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
public interface SubCategoriesFacadeLocal {

    void create(SubCategories subCategories);

    void edit(SubCategories subCategories);

    void remove(SubCategories subCategories);

    SubCategories find(Object id);

    List<SubCategories> findAll();

    List<SubCategories> findRange(int[] range);

    int count();
    
}
