package configurationbeanano;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by linhtran on 27/04/2017.
 */
public class Test {
    public static void main(String[] args) {
        AbstractApplicationContext applicationContext=new ClassPathXmlApplicationContext("configuration-bean.xml");
        applicationContext.registerShutdownHook();

        Point point= (Point) applicationContext.getBean("getPoint");
        System.out.println(point);
        System.out.println("--------------------------------");

        Point point2= (Point) applicationContext.getBean("getPoint");
        point2.setX(555);
        System.out.println(point2);
        System.out.println("--------------------------------");
        System.out.println(point);

//        Circle circle= (Circle) applicationContext.getBean("circle");
//        System.out.println("circle:" +circle);
//        System.out.println("--------------------------------");
//        Circle circle2= (Circle) applicationContext.getBean("circle");
//        circle2.getPoint().setX(655);
//        System.out.println(circle2);
//        System.out.println("--------------------------------");
//        System.out.println("circle:" +circle);
    }
}
