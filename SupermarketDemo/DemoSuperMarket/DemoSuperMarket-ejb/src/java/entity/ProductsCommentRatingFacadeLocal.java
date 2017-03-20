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
public interface ProductsCommentRatingFacadeLocal {

    void create(ProductsCommentRating productsCommentRating);

    void edit(ProductsCommentRating productsCommentRating);

    void remove(ProductsCommentRating productsCommentRating);

    ProductsCommentRating find(Object id);

    List<ProductsCommentRating> findAll();

    List<ProductsCommentRating> findRange(int[] range);

    int count();
    
}
