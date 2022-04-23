package spring.introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test5 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationConfig2");

        Dog dog = context.getBean("myPet", Dog.class);
        dog.say();

        context.close();
    }
}
