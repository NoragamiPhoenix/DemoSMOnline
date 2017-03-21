package entity;

import entity.Products;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.0.v20130507-rNA", date="2017-03-18T16:59:40")
@StaticMetamodel(ProductsEditHistory.class)
public class ProductsEditHistory_ { 

    public static volatile SingularAttribute<ProductsEditHistory, Date> productEditTime;
    public static volatile SingularAttribute<ProductsEditHistory, String> productImage;
    public static volatile SingularAttribute<ProductsEditHistory, Integer> supplyID;
    public static volatile SingularAttribute<ProductsEditHistory, Integer> productDiscount;
    public static volatile SingularAttribute<ProductsEditHistory, String> productName;
    public static volatile SingularAttribute<ProductsEditHistory, Integer> productPrice;
    public static volatile SingularAttribute<ProductsEditHistory, String> productUnit;
    public static volatile SingularAttribute<ProductsEditHistory, Products> productID;
    public static volatile SingularAttribute<ProductsEditHistory, Integer> editID;
    public static volatile SingularAttribute<ProductsEditHistory, Integer> typeID;

}