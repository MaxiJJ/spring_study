package hibernate_test_2;

import hibernate_test_2.entity.Detail;
import hibernate_test_2.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {

    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Detail.class)
                .buildSessionFactory();

        Session session = null;
        try {
//            Session session = factory.getCurrentSession();
//            Employee employee = new Employee("Oleg", "Ivanov", "HR", 800);
//            Detail detail = new Detail("Kazan", "987654321", "oleg@rrrw.ru");
//            employee.setEmpDetail(detail);
//            session.beginTransaction();
//
//            session.save(employee);
//            session.getTransaction().commit();

            session = factory.getCurrentSession();
            session.beginTransaction();

            Employee employee = session.get(Employee.class, 3);
            session.delete(employee);

            session.getTransaction().commit();

        } finally {
            session.close();
            factory.close();
        }
    }
}
