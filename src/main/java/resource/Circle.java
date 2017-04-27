package resource;

import linhtran.Point;
import linhtran.Shape;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

/**
 * Created by linhtran on 25/04/2017.
 */
public class Circle implements Shape {
    @Resource(name = "point") //or @Resource default by name of class
    Point point;
    @Override
    public void draw() {
        System.out.println(point);
    }

    public Point getPoint() {
        return point;
    }

    public void setPoint(Point point) {
        this.point = point;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "point=" + point +
                '}';
    }

    @PostConstruct
    public void init()
    {
        System.out.println("Circle inited");
    }

    @PreDestroy
    public void desTroy()
    {
        System.out.println("Circle destroy");
    }
}
