package spring.introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test2 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationConfig");
        Pet pet = context.getBean("myPet", Pet.class);
        pet.say();

        context.close();
    }
}
