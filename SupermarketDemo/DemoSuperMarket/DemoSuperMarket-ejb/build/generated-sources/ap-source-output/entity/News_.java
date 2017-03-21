package entity;

import entity.Staff;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.0.v20130507-rNA", date="2017-03-18T16:59:40")
@StaticMetamodel(News.class)
public class News_ { 

    public static volatile SingularAttribute<News, String> newsImage;
    public static volatile SingularAttribute<News, Staff> staffID;
    public static volatile SingularAttribute<News, Integer> newsID;
    public static volatile SingularAttribute<News, String> newsText;
    public static volatile SingularAttribute<News, Date> newsDate;

}