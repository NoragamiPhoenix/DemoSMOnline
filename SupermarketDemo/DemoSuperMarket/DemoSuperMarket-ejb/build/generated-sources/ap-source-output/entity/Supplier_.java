package entity;

import entity.Products;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.0.v20130507-rNA", date="2017-03-18T16:59:40")
@StaticMetamodel(Supplier.class)
public class Supplier_ { 

    public static volatile CollectionAttribute<Supplier, Products> productsCollection;
    public static volatile SingularAttribute<Supplier, Integer> supplyID;
    public static volatile SingularAttribute<Supplier, String> supplyName;
    public static volatile SingularAttribute<Supplier, String> supplyLogo;

}