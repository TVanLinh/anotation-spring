package annonamedinject;

import linhtran.Shape;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.config.BeanPostProcessor;

import javax.inject.Inject;
import javax.inject.Named;
import javax.annotation.ManagedBean;
/**
 * Created by linhtran */

@Named //<=>@ManagedBean
public class Circle implements Shape ,BeanNameAware {

    @Inject
    Point point;
    @Override
    public void draw() {
        System.out.println(point);
    }

    public Point getPoint() {
        return point;
    }

    @Inject
    public void setPoint(Point point) {
        System.out.println("@Inject!");
        this.point = point;
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
