/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package entity;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Dang Hoang
 */
@Stateless
public class ProductsCommentRatingFacade extends AbstractFacade<ProductsCommentRating> implements ProductsCommentRatingFacadeLocal {
    @PersistenceContext(unitName = "DemoSuperMarket-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ProductsCommentRatingFacade() {
        super(ProductsCommentRating.class);
    }
    
}
