package zrp.pub.api;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 */
public class App {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        String configLocation = "spring.xml";
        ApplicationContext context = new ClassPathXmlApplicationContext(configLocation);
        String[] names = context.getBeanDefinitionNames();
        System.out.print("Beans:");
        for (String string : names) {
            System.out.println(string + ",");
        }
        System.out.println();
        try {
            Thread.sleep(1000*60*10);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }  
    }
}
