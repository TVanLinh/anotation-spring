package resource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by linhtran on 25/04/2017.
 */
public class Test {
    public static void main(String[] args) {
      //  ApplicationContext context=new ClassPathXmlApplicationContext("resouce-bean-anotation.xml");
        AbstractApplicationContext context=new ClassPathXmlApplicationContext("resouce-bean-anotation.xml");
        context.registerShutdownHook();
        Circle circle= (Circle) context.getBean("circle");
        circle.draw();
        Circle circle2= (Circle) context.getBean("circle2");
        circle2.draw();
    }
}
