import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.Session;
import org.hibernate.Query;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Order;
import org.hibernate.metadata.ClassMetadata;

import java.util.Map;

/**
 * Created by KPS on 8/9/2020.
 */
public class HiberConfig {
    private static final SessionFactory ourSessionFactory;

    static {
        try {
            ourSessionFactory = new Configuration().
                    configure("hibernate.cfg.xml").
                    addAnnotatedClass(Offices.class).
                    addAnnotatedClass(Employees.class).
                    addAnnotatedClass(Customers.class).
                    addAnnotatedClass(OrderDetails.class).
                    addAnnotatedClass(Orders.class).
                    addAnnotatedClass(Payments.class).
                    addAnnotatedClass(Productlines.class).
                    addAnnotatedClass(Products.class).
                    buildSessionFactory();
        } catch (Throwable ex) {
            throw new ExceptionInInitializerError(ex);
        }
    }

    public static Session getSession() throws HibernateException {
        return ourSessionFactory.openSession();
    }


}
