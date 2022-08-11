package peaksoft.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import peaksoft.spring.people.Person;

/**
 * Hello world!
 */
public class App {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("appContext.xml");

        Person musab = context.getBean("musab", Person.class);
        System.out.println(musab);

        Person umar = context.getBean("umar", Person.class);
        System.out.println(umar);

        context.close();
    }
}
