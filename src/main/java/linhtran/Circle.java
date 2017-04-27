package linhtran;

import org.springframework.beans.factory.annotation.Required;

/**
 * Created by linhtran on 25/04/2017.
 */
public class Circle implements Shape {
    Point point;
    @Override
    public void draw() {
        System.out.println(point);
    }

    public Point getPoint() {
        return point;
    }

    @Required
    public void setPoint(Point point) {
        this.point = point;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "point=" + point +
                '}';
    }
}
