package entity;

import entity.OrderDetails;
import entity.ProductType;
import entity.ProductsCommentRating;
import entity.ProductsEditHistory;
import entity.Supplier;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.0.v20130507-rNA", date="2017-03-18T16:59:40")
@StaticMetamodel(Products.class)
public class Products_ { 

    public static volatile CollectionAttribute<Products, ProductsCommentRating> productsCommentRatingCollection;
    public static volatile SingularAttribute<Products, String> productImage;
    public static volatile CollectionAttribute<Products, ProductsEditHistory> productsEditHistoryCollection;
    public static volatile SingularAttribute<Products, Integer> productDiscount;
    public static volatile SingularAttribute<Products, Supplier> supplyID;
    public static volatile SingularAttribute<Products, Integer> productID;
    public static volatile SingularAttribute<Products, String> productUnit;
    public static volatile SingularAttribute<Products, Double> productRating;
    public static volatile SingularAttribute<Products, String> productStatus;
    public static volatile SingularAttribute<Products, String> productNameVn;
    public static volatile SingularAttribute<Products, String> productDiscribe;
    public static volatile SingularAttribute<Products, Double> productPrice;
    public static volatile SingularAttribute<Products, Integer> productQuanlity;
    public static volatile SingularAttribute<Products, ProductType> typeID;
    public static volatile CollectionAttribute<Products, OrderDetails> orderDetailsCollection;

}