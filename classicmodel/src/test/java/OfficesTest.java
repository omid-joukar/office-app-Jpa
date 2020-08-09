import org.hibernate.Session;
import org.junit.Test;

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

}