package aop.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class NewLoggingAspect {

    @Around("execution(public String returnBook())")
    public Object aroundReturnBookLoggingAdvice(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {

        Object targetMethodResult = null;

        System.out.println("aroundReturnBookLoggingAdvice: The book try to give away to the library");
        try {
            targetMethodResult = proceedingJoinPoint.proceed();
        } catch (Exception e) {
            System.out.println("aroundReturnBookLoggingAdvice: exception e was caught");
            throw e;
        }
        System.out.println("aroundReturnBookLoggingAdvice: The book successful give away to the library");
        return targetMethodResult;
    }
}
