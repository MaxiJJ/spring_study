package spring.introduction;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
@Scope("prototype")
public class Dog implements Pet{
    public Dog() {}

    @Override
    public void say() {
        System.out.println("Bow-Wow");
    }

//    @PostConstruct
//    public void init() {
//        System.out.println("Class D init method");
//    }
//
//    @PreDestroy
//    public void destroy() {
//        System.out.println("Class D destroy method");
//    }
}
