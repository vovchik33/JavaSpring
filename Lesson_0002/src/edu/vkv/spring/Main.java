package edu.vkv.spring;

import edu.vkv.spring.common.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by vladimirkr on 03.07.2014.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, Spring");
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(new String[]{"/application-config.xml"});
        Person person = (Person) applicationContext.getBean("person");
        System.out.println(person);
    }
}
