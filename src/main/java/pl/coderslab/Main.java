package pl.coderslab;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import pl.coderslab.beans.EmailService;
import pl.coderslab.beans.MessageService;

public class Main {
    public static void main(String[] args) {
        System.out.println("test");

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("beans.xml");

        Car carBean=(Car)context.getBean("carBean");
        carBean.move();

        EmailService emailService=(EmailService) context.getBean("emailService");
        emailService.send();

        context.close();
    }
}
