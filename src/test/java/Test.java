import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test {
    public static void main(String[] args) {
        Configuration configuration = new Configuration();
        configuration.addAnnotatedClass(lk.rotec.orm.entity.Student.class);
        SessionFactory sessionFactory = configuration.buildSessionFactory();

    }
}
