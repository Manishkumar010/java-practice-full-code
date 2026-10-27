import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main{
    public static void main(String[] args){
        // Alien a1 = new Alien();
        // a1.setAid(101);
        // a1.setAname("Manish");
        // a1.setTech("java");

        // a1.setAid(1002);
        // a1.setAname("harsh");
        // a1.setTech("Spring");

        SessionFactory factory = new Configuration().addAnnotatedClass(com.telusko.Alien.class).configure().buildSessionFactory();
        Session session = factory.openSession();

        // Alien a1 = session.find(Alien.class, 103);

        // Alien a1 = session.byId(Alien.class).load(103);

        // Lazy Fetching
        // Alien a1 = session.byId(Alien.class).getReference(103);


        // Eager Fetching - firing the select query 
        // Alein  a1 = session.get(Alien.class, 103); 

        // Eager Fetching - find method alose uses eager fetching technique
        // Alien a1  = session.find(Alien.class, 103);


        Transaction transaction = session.beginTransaction();

        // updatinng 
        // session.merge(a1);

        // deleting
        Alien a1 = session.find(Alien.class, 104);
        session.remove(a1);

        transaction.commit();

        session.close();
        factory.close();

      
    }
}