import org.hibernate.Session;
import org.junit.Test;

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

}