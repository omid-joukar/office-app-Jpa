import org.hibernate.Session;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by KPS on 8/23/2020.
 */
public class EmployeesTest {
    @Test
    public void hqlTest1(){
        try(Session session = HiberConfig.getSession()){
            List<Employees> employeesList = session.createQuery("from Employees ").list();
            for (Employees employees : employeesList){
                System.out.println(employees);
            }
        }
    }
    @Test
    public void hqlTest2(){
        try(Session session = HiberConfig.getSession()){
            List<Employees> employeesList = session.createQuery("select new Employees(e.employeeNumber , e.firstName) from Employees as e").list();
            for(Employees employees : employeesList){
                System.out.println(employees);
            }
        }
    }
    @Test
    public void hqlTest3(){
        try(Session session = HiberConfig.getSession()){
            List<Employees> employeesList = session.createQuery("from Employees as e where e.employeeNumber between 1000 and 1300").list();
            for(Employees employees : employeesList){
                System.out.println(employees);
            }
        }
    }


}