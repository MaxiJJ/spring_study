package hibernate_test_2;

import hibernate_test_2.entity.Detail;
import hibernate_test_2.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test2 {

    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Detail.class)
                .buildSessionFactory();

        Session session = null;
           try {
            session = factory.getCurrentSession();
            Employee employee = new Employee("Aleksei", "Kryglob", "Kitchen", 300);



            Detail detail = new Detail("Kazan", "9876543212", "Aleksei@rrrw.ru");
//            detail.setEmployee(employee);
            session.beginTransaction();

            session.save(detail);
            session.getTransaction().commit();

        } finally {
            session.close();
            factory.close();
        }
    }
}
