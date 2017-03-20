package entity;

import entity.News;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.0.v20130507-rNA", date="2017-03-18T16:59:40")
@StaticMetamodel(Staff.class)
public class Staff_ { 

    public static volatile SingularAttribute<Staff, Integer> staffID;
    public static volatile CollectionAttribute<Staff, News> newsCollection;
    public static volatile SingularAttribute<Staff, String> staffLevel;
    public static volatile SingularAttribute<Staff, String> staffPassword;
    public static volatile SingularAttribute<Staff, String> staffName;
    public static volatile SingularAttribute<Staff, String> staffPhone;
    public static volatile SingularAttribute<Staff, String> staffEmail;
    public static volatile SingularAttribute<Staff, String> staffRole;

}