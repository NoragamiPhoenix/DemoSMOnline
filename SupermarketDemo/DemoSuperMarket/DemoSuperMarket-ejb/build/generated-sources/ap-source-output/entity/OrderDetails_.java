package entity;

import entity.OrderDetailsPK;
import entity.OrderMaster;
import entity.Products;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.0.v20130507-rNA", date="2017-03-18T16:59:40")
@StaticMetamodel(OrderDetails.class)
public class OrderDetails_ { 

    public static volatile SingularAttribute<OrderDetails, Date> oDTime;
    public static volatile SingularAttribute<OrderDetails, OrderMaster> orderMaster;
    public static volatile SingularAttribute<OrderDetails, OrderDetailsPK> orderDetailsPK;
    public static volatile SingularAttribute<OrderDetails, Integer> quantity;
    public static volatile SingularAttribute<OrderDetails, Integer> discountPercent;
    public static volatile SingularAttribute<OrderDetails, Products> products;

}