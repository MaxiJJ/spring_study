package hibernate_one_to_many_bi;

import hibernate_one_to_many_bi.entity.Department;
import hibernate_one_to_many_bi.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {

    public static void main(String[] args) {
        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Department.class)
                .buildSessionFactory();

        Session session = null;
        try {
//            session = factory.getCurrentSession();
//            Department department = new Department("Sales", 1500, 800);
//            Employee emp1 = new Employee("Maxim", "Grigorev", 800);
//            Employee emp2 = new Employee("Ivan", "Ivanov", 1500);
//            Employee emp3 = new Employee("Regina", "Sadreeva", 1200);
//
//            department.addEmployeeToDepartment(emp1);
//            department.addEmployeeToDepartment(emp2);
//            department.addEmployeeToDepartment(emp3);
//
//            session.beginTransaction();
//            session.save(department);
//
//            session.getTransaction().commit();
//*************************************************
            session = factory.getCurrentSession();

            session.beginTransaction();
            Department department = session.get(Department.class, 4);

            System.out.println(department);

            session.getTransaction().commit();
        } finally {
            session.close();
            factory.close();
        }
    }
}
