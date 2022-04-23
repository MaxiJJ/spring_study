package spring.introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ScopeTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationConfig3");

        Dog myDog = context.getBean("dog", Dog.class);
        myDog.say();

        context.close();
    }
}
