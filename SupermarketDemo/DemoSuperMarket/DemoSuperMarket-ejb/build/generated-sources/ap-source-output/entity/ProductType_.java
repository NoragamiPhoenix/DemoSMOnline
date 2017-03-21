package entity;

import entity.Products;
import entity.SubCategories;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.0.v20130507-rNA", date="2017-03-18T16:59:40")
@StaticMetamodel(ProductType.class)
public class ProductType_ { 

    public static volatile SingularAttribute<ProductType, String> typeDescEn;
    public static volatile SingularAttribute<ProductType, String> typeDescVn;
    public static volatile CollectionAttribute<ProductType, Products> productsCollection;
    public static volatile SingularAttribute<ProductType, String> typeVn;
    public static volatile SingularAttribute<ProductType, SubCategories> subCateID;
    public static volatile SingularAttribute<ProductType, String> typeEn;
    public static volatile SingularAttribute<ProductType, Integer> typeID;

}