package in.sp.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import in.sp.beans.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Student std = new Student();
        std.setId(101);
        std.setName("deepak");
        std.setEmail("deepak@gmail.com");
        std.setPassword("deepak123");
        std.setCity("delhi");
        
        Configuration cfg = new Configuration();
        cfg.configure("/in/sp/resources/hibernate.cfg.xml");
        
        SessionFactory sessionFactory = cfg.buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        
        session.save(std);
        transaction.commit();
        System.out.println("success");
        
        session.close();
        sessionFactory.close();
    }
}
