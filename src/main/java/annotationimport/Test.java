package annotationimport;

import linhtran.Point;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by linhtran on 27/04/2017.
 */
public class Test {

    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        HelloWorldService hello = (HelloWorldService) context.getBean("helloWorldBean");
        hello.sayHello("Spring 3.2.3");

        GoodbyeService bye = (GoodbyeService) context.getBean("goodbyeBean");
        bye.sayGoodbye("Spring 3.2.3");

        Point point= (Point) context.getBean("point");
        System.out.println(point);
    }
}

