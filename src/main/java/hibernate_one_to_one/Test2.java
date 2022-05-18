package hibernate_one_to_one;

import hibernate_one_to_one.entity.Detail;
import hibernate_one_to_one.entity.Employee;
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

        // Spring MVC + шаблонизатор
        // UI -> back -> show all -> selecet * from employee;
        // Create employee
        // Delete
        // Get by id
        // Pagination
        // Get by name

        // Rest API
        // CRUD (Create Read Update Delete)

        // Spring Boot
        // Spring Data Jpa
        // Git (.gitignore)
        // Sql (create table, drop table, insert, selesct, update, delete, join)

        Session session = null;
        try {


            session = factory.getCurrentSession();
//            Employee employee = new Employee("Nikolay", "Ivanov", "HR", 650);
//
//
//            Detail detail = new Detail("Izhevsk", "456123789", "Nikola@rrrw.ru");
//            employee.setEmpDetail(detail);
//            detail.setEmployee(employee);
//            employee.setEmpDetail(detail);
            session.beginTransaction();

            Detail detail = session.get(Detail.class, 1);
            session.delete(detail);

            session.getTransaction().commit();

        } finally {
            session.close();
            factory.close();
        }
    }
}
