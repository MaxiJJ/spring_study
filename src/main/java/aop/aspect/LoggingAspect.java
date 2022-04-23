package aop.aspect;

import aop.Book;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(10)
public class LoggingAspect {

    @Before("aop.aspect.MyPointcut.allAddMethod()")
    public void beforeAddLoggingAdvice(JoinPoint joinPoint) {

        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        System.out.println("methodSignature = " + methodSignature);
        System.out.println("methodSignature getMethod = " + methodSignature.getMethod());
        System.out.println("methodSignature getReturnMethod = " + methodSignature.getReturnType());
        System.out.println("methodSignature getName = " + methodSignature.getName());

        if(methodSignature.getName().equals("addBook")) {
            Object[] args = joinPoint.getArgs();
            for(Object obj:args) {
                if(obj instanceof Book) {
                    Book myBook = (Book) obj;
                    System.out.println("Information about a book: title of book " + myBook.getName() + ", author" +
                            " - " + myBook.getAuthor() + ", year of publication " + myBook.getYearOfPublication());
                } else if (obj instanceof String) {
                    System.out.println(obj + " add book to the library");
                }
            }
        }

        System.out.println("beforeGetLoggingAdvice: try to logging " +
                "get book/magazine");
        System.out.println("--------------------");


    }
//    @Pointcut("execution(* aop.UniLibrary.*(..))")
//    private void allMethodFromUniLibrary() {
//    }
//
//    @Pointcut("execution(public void aop.UniLibrary.returnMagazine())")
//    private void returnMagazineFromUniLibrary() {
//    }
//
//    @Pointcut("allMethodFromUniLibrary() && !returnMagazineFromUniLibrary()")
//    private void allMethodsExceptReturnMagazineFromUniLibrary () {
//    }
//
//    @Before("allMethodsExceptReturnMagazineFromUniLibrary ()")
//    public void beforeAllMethodsExceptReturnMagazineAdvice() {
//        System.out.println("beforeAllMethodsExceptReturnMagazineAdvice: writing Log #1)");

//    }
//    @Pointcut ("execution(* aop.UniLibrary.get*())")
//        private void allGetsMethodsUniLibrary() {
//    }
//
//    @Pointcut ("execution(* aop.UniLibrary.return*())")
//    private void allReturnsMethodsUniLibrary() {
//    }
//
//    @Pointcut("allGetsMethodsUniLibrary() || allReturnsMethodsUniLibrary()")
//    private void allGetAndReturnsMethodsUniLibrary() {
//    }
//
//    @Before("allGetsMethodsUniLibrary()")
//    public void beforeGetLoggingAdvice() {
//        System.out.println("beforeGetLoggingAdvice: writing Log #1)");
//    }
//
//    @Before("allReturnsMethodsUniLibrary()")
//    public void beforeReturnsLoggingAdvice() {
//        System.out.println("beforeReturnsLoggingAdvice: writing Log #2)");
//    }
//
//    @Before("allGetAndReturnsMethodsUniLibrary()")
//    public void BeforeGetAndReturnsMethodsUniLibrary() {
//        System.out.println("beforeGetAndReturnsLoggingAdvice: writing Log #3)");

//    }


//    @Before("execution(* returnBook())")
//    public void beforeReturnBookAdvice() {
//        System.out.println("beforeReturnBookAdvice: try to give away book");
//    }
}
