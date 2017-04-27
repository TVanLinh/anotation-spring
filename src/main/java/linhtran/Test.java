package linhtran;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by linhtran on 25/04/2017.
 */
public class Test {
    public static void main(String[] args)
    {
        String bean[]={"bean.xml"};
        ApplicationContext context=new ClassPathXmlApplicationContext(bean);

        Circle shape= (Circle) context.getBean("requried");
        shape.setPoint(new Point());
        System.out.println( shape);

        Circle2 circle2= (Circle2) context.getBean("autowire");
        circle2.draw();

        Circle2 circle3= (Circle2) context.getBean("autowire2");
        circle3.draw();
    }
}
