package entity;

import entity.Customer;
import entity.Products;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.0.v20130507-rNA", date="2017-03-18T16:59:40")
@StaticMetamodel(ProductsCommentRating.class)
public class ProductsCommentRating_ { 

    public static volatile SingularAttribute<ProductsCommentRating, String> commentText;
    public static volatile SingularAttribute<ProductsCommentRating, Integer> commentID;
    public static volatile SingularAttribute<ProductsCommentRating, Customer> customerID;
    public static volatile SingularAttribute<ProductsCommentRating, Products> productID;
    public static volatile SingularAttribute<ProductsCommentRating, String> customerRating;

}