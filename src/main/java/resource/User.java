package resource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

/**
 * Created by linhtran on 25/04/2017.
 * 1) The @Component annotation marks a java class as a bean so the component-scanning mechanism of spring can pick it up and pull it into the application context. To use this annotation, apply it over class as below:
 @Component
 public class EmployeeDAOImpl implements EmployeeDAO {
 ...
 }
 2) Although above use of @Component is good enough but you can use more
 suitable annotation that provides additional benefits specifically for DAOs i.e.
 @Repository annotation. The @Repository annotation is a specialization of the
 @Component annotation with similar use and functionality.
 In addition to importing the DAOs into the DI container,
 it also makes the unchecked exceptions (thrown from DAO methods)
 eligible for translation into Spring DataAccessException.

 3) The @Service annotation is also a specialization of the component annotation.
 It doesn’t currently provide any additional behavior over the @Component annotation,
 but it’s a good idea to use @Service over @Component in service-layer classes
 because it specifies intent better.
 Additionally, tool support and additional behavior might rely on it in the future.

 4) @Controller annotation marks a class as a Spring Web MVC controller.
 It too is a @Component specialization, so beans marked with it are automatically imported
 into the DI container. When you add the @Controller annotation to a class,
 you can use another annotation i.e. @RequestMapping; to map URLs to instance methods of a class.
 */

@Controller//@component,@Service,@Repository
public class User {
     private String name;
     private  String pass;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", pass='" + pass + '\'' +
                '}';
    }

    public static void main(String[] args) {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("resouce-bean-anotation.xml");
        User user= (User) applicationContext.getBean("user");
        user.setName("Tran Van Linh");
        user.setPass("123456");
        System.out.println(user);

        User user2= (User) applicationContext.getBean("user");
        System.out.println(user2);

    }
}
