package entity;

import entity.Customer;
import entity.OrderDetails;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.0.v20130507-rNA", date="2017-03-18T16:59:40")
@StaticMetamodel(OrderMaster.class)
public class OrderMaster_ { 

    public static volatile SingularAttribute<OrderMaster, Integer> orderMID;
    public static volatile SingularAttribute<OrderMaster, Customer> customerID;
    public static volatile SingularAttribute<OrderMaster, String> oMDate;
    public static volatile CollectionAttribute<OrderMaster, OrderDetails> orderDetailsCollection;

}