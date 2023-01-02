package pl.coderslab.app;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import pl.coderslab.Car;
import pl.coderslab.beans.EmailService;
import pl.coderslab.beans.HelloWorld;
import pl.coderslab.beans.MessageSender;
import pl.coderslab.beans.MessageService;

public class SpringDiApplication {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("beansTasks.xml");
        HelloWorld helloWorld=(HelloWorld) context.getBean("helloWorld");
        System.out.println(helloWorld.getMessage());
        MessageService emailService=(MessageService) context.getBean("emailService");
        emailService.send();
        MessageSender messageSender=context.getBean("messageSender", MessageSender.class);
        messageSender.sendMessage();
        messageSender.sendMessageFromProperty();
        context.close();
    }
}
