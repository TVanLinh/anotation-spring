package annonamedinject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by linhtran on 26/04/2017.
 */
public class Test {
    public static void main(String[] args) {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("named-inject.xml");
        Circle circle= (Circle) applicationContext.getBean("circle");
        circle.draw();
    }
}
