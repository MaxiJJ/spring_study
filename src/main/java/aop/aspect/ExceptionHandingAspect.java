package aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(30)
public class ExceptionHandingAspect {
    @Before("aop.aspect.MyPointcut.allAddMethod()")
    public void beforeAddExceptionHandingAdvice() {
        System.out.println("beforeGetExceptionHandingAdvice: try to handle exception");
        System.out.println("--------------------");
    }
}
