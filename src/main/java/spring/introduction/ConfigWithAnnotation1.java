package spring.introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConfigWithAnnotation1 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationConfig3");

        Cat cat = context.getBean("catBean", Cat.class);
        cat.say();

        context.close();
    }
}
