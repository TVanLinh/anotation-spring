package configurationbeanano;

import linhtran.Shape;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.*;
import org.springframework.stereotype.Component;

import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Singleton;

/**
 * Created by linhtran */

@Component
@Scope(scopeName = "prototype")
public class Circle implements Shape ,BeanNameAware {


    Point point;
    Point2 point2;

    @Bean
    Point2 point2(Point point)
    {
        return  new Point2(point);
    }
    @Override
    public void draw() {
        System.out.println(point);
    }

    @Bean(initMethod = "init",destroyMethod = "destroy",name = "getPoint")
    @Description("Provides a basic example of a bean")
    @Scope(scopeName = "prototype")
    public Point getPoint() {
        System.out.println("getPoint");
        return point;
    }

    @Inject
    public void setPoint(Point point) {
        System.out.println("@Inject!");
        this.point = point;
    }

    @Bean
    public Point2 getPoint2() {
        return point2;
    }

    public void setPoint2(Point2 point2) {
        this.point2 = point2;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "point=" + point +
                '}';
    }

    @Override
    public void setBeanName(String name) {
        System.out.println(name);
    }
}
