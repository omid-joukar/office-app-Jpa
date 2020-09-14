import org.hibernate.Session;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Property;
import org.hibernate.criterion.Restrictions;
import org.junit.Test;

import java.lang.annotation.Retention;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by KPS on 8/9/2020.
 */
public class OfficesTest {
    @Test
    public void te(){
        try(Session session = HiberConfig.getSession()){
            Offices offices = session.get(Offices.class,"1");
            System.out.println(offices);
        }
    }
    @Test
    public void hqlTest2(){
        try(Session session = HiberConfig.getSession()) {
        List<Employees> employeesList = session.createNamedQuery("employeeS").setParameter("emN",1002l).list();
            for (Employees employees : employeesList){
                System.out.println(employees);
            }
        }
    }
    @Test
    public void hqlTest3(){
        try(Session session = HiberConfig.getSession()){

            System.out.println();
            List<Offices> officesList = session.createQuery("from Offices o inner join o.employeesList").list();
            for(Offices offices : officesList){
                for (Employees employees: offices.getEmployeesList()){
                    System.out.println(employees);
                }
            }
        }
    }
    @Test
    public void criteriaTest1(){
        try(Session session = HiberConfig.getSession()){
            List<Offices> officesList = session.createCriteria(Offices.class).add(Restrictions.like("officeCode" , "1")).list();
            for (Offices offices : officesList){
                System.out.println(offices);
            }
        }
    }
    @Test
    public void criteriaTest2(){
        try(Session session = HiberConfig.getSession()){
            List<Offices> officesList = session.createCriteria(Offices.class)
                    .add(Restrictions.between("officeCode" , "1","7"))
                    .addOrder(Order.desc("officeCode")).list();
            for (Offices offices : officesList){
                System.out.println(offices);
            }
        }
    }
    @Test
    public void criteriaTest3() {
        Property officeCode = Property.forName("officeCode");
        try (Session session = HiberConfig.getSession()) {
            List<Offices> officesList = session.createCriteria(Offices.class)
                    .add(Restrictions.disjunction().add(Restrictions.like(String.valueOf(officeCode), "1")))
                    .list();
            for (Offices offices : officesList) {
                System.out.println(offices);
            }

        }
    }
    @Test
    public void criteriaTest4() {
        Property officeCode = Property.forName("officeCode");
        try (Session session = HiberConfig.getSession()) {
            List<Offices> officesList = session.createCriteria(Offices.class).createCriteria("employeesList" , "empl")
                    .add(Restrictions.disjunction().add(Restrictions.like("empl.employeeNumber", 1002L)))
                    .list();
            for (Offices offices : officesList) {
                for (Employees employees : offices.getEmployeesList()){
                    System.out.println(employees);
                };
            }

        }
    }
}