import com.kovalenko.model.Student;
import org.hibernate.Session;

public class App {
    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();

        session.beginTransaction();
        session.save(new Student(1,12,6,9,5));
        session.getTransaction().commit();
    }
}
