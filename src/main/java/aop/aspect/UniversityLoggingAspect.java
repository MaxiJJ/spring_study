package aop.aspect;

import aop.Student;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Aspect
public class UniversityLoggingAspect {

//    @Before("execution(* getStudents())")
//    public void beforeGetStudentsLoggingAdvice() {
//        System.out.println("beforeGetStudentsLoggingAdvice: logging to get list of students before " +
//                "method getStudents");
//    }

//    @AfterReturning(pointcut = "execution(* getStudents())", returning = "students")
//    public void afterReturningGetStudentsLoggingAdvice(List<Student> students) {
//
//        Student std1 = students.get(0);
//
//        String name = std1.getNameSurname();
//        name = "Mr " + name;
//        std1.setNameSurname(name);
//
//        double avrGrade = std1.getAvgGrade();
//        avrGrade = avrGrade + 1;
//        std1.setAvgGrade(avrGrade);
//
//        System.out.println("afterReturningGetStudentsLoggingAdvice: logging to get list of students after " +
//                "method getStudents");
//    }
//
//    @AfterThrowing(pointcut = "execution(* getStudents())", throwing = "exception")
//    public void afterTrowingGetStudentsLoggingAdvice(Throwable exception) {
//        System.out.println("afterTrowingGetStudentsLoggingAdvice: logging trowing exception " + exception);
//    }

    @After("execution(* getStudents())")
    public void afterGetStudentsLoggingAdvice() {
        System.out.println("afterGetStudentsLoggingAdvice: logging normal ending of work method or throw exceprion");
    }
}
