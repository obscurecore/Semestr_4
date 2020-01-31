package entity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class Main2 {
    public static void main(String[] args) {

        final StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
                .configure() // configures settings from hibernate.cfg.xml
                .build();
        try {
            SessionFactory sessionFactory = new MetadataSources(registry).buildMetadata().buildSessionFactory();
            Session session = sessionFactory.openSession();
            session.beginTransaction();

            HomeAdress homeAdress = new HomeAdress();
            Person person = new Person();
            session.persist(homeAdress);
            session.persist(person);

            session.getTransaction().commit();
            session.close();

        } catch (Exception e) {
            StandardServiceRegistryBuilder.destroy(registry);
        }


    }
}
