package annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by linhtran on 25/04/2017.
 */
public class TestSpringContext
{
    public static void main(String[] args)
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("resouce-bean-anotation.xml");

        //EmployeeManager manager = (EmployeeManager) context.getBean(EmployeeManager.class);

        //OR this will also work

        EmployeeController controller = (EmployeeController) context.getBean("employeeController");

        System.out.println(controller.createNewEmployee());
    }
}