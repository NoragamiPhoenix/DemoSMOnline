package entity;

import entity.SubCategories;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.0.v20130507-rNA", date="2017-03-18T16:59:40")
@StaticMetamodel(Categories.class)
public class Categories_ { 

    public static volatile SingularAttribute<Categories, String> cateDescEn;
    public static volatile SingularAttribute<Categories, String> cateNameVn;
    public static volatile SingularAttribute<Categories, String> cateNameEn;
    public static volatile SingularAttribute<Categories, Integer> cateID;
    public static volatile CollectionAttribute<Categories, SubCategories> subCategoriesCollection;
    public static volatile SingularAttribute<Categories, String> cateDescVn;

}