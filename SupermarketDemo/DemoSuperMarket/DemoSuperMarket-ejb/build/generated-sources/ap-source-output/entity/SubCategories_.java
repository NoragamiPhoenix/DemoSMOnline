package entity;

import entity.Categories;
import entity.ProductType;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.0.v20130507-rNA", date="2017-03-18T16:59:40")
@StaticMetamodel(SubCategories.class)
public class SubCategories_ { 

    public static volatile CollectionAttribute<SubCategories, ProductType> productTypeCollection;
    public static volatile SingularAttribute<SubCategories, String> subCateNameVn;
    public static volatile SingularAttribute<SubCategories, String> subCateDescEn;
    public static volatile SingularAttribute<SubCategories, Categories> cateID;
    public static volatile SingularAttribute<SubCategories, Integer> subCateID;
    public static volatile SingularAttribute<SubCategories, String> subCateDescVn;
    public static volatile SingularAttribute<SubCategories, String> subCateNameEn;

}