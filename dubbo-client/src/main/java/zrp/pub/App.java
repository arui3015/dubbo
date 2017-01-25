package zrp.pub;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import zrp.pub.api.SayHelloToService;

/**
 * Hello world!
 */
public class App {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        String configLocation = "dubbo-consumer.xml";
        ApplicationContext context = new ClassPathXmlApplicationContext(configLocation);
        SayHelloToService sayHelloToService = (SayHelloToService) context.getBean("sayHelloToService");
        String resulut = sayHelloToService.sayHello("arui");
        System.out.println(resulut);
    }
}
