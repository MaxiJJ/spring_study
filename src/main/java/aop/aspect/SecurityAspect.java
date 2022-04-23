package aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(20)
public class SecurityAspect {
    @Before("aop.aspect.MyPointcut.allAddMethod()")
    public void beforeAddSecurityAdvice() {
        System.out.println("beforeGetSecurityAdvice: check root for get book/magazine");
        System.out.println("--------------------");
    }
}
