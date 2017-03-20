package entity;

import entity.CustomerAddress;
import entity.OrderMaster;
import entity.ProductsCommentRating;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.0.v20130507-rNA", date="2017-03-18T16:59:40")
@StaticMetamodel(Customer.class)
public class Customer_ { 

    public static volatile SingularAttribute<Customer, String> customerName;
    public static volatile CollectionAttribute<Customer, ProductsCommentRating> productsCommentRatingCollection;
    public static volatile SingularAttribute<Customer, Integer> customerPoint;
    public static volatile SingularAttribute<Customer, String> customerStatus;
    public static volatile SingularAttribute<Customer, String> customerPhone;
    public static volatile SingularAttribute<Customer, String> customerEmail;
    public static volatile SingularAttribute<Customer, Integer> customerID;
    public static volatile CollectionAttribute<Customer, CustomerAddress> customerAddressCollection;
    public static volatile CollectionAttribute<Customer, OrderMaster> orderMasterCollection;
    public static volatile SingularAttribute<Customer, String> customerPassword;

}