import javax.security.auth.login.Configuration;

public class Main2 {
    public static void main(String[] args) {
        Alien a1 = new Alien();
        a1.setAid(104);
        a1.setAname("Avni");
        a1.setTech("Database");

        SessionFactory factory = new Configuration().addAnnotatedClass(com.telusko.Alien.class).configure().buildSessionFactory();
        Session session = factory.openSession();

        Transaction transaction = session.beginTransaction();

        session.persist(a1);
        transaction.commit();

        session.close();
        factory.close();

    }
}
