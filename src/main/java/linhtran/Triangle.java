package linhtran;

import org.springframework.beans.factory.annotation.Required;

/**
 * Created by linhtran on 25/04/2017.
 */
public class Triangle implements Shape {

    Point pointA;
    Point pointB;
    Point pointC;

    public Point getPointA() {
        return pointA;
    }

    @Required
    public void setPointA(Point pointA) {
        this.pointA = pointA;
    }

    public Point getPointB() {
        return pointB;
    }

    public void setPointB(Point pointB) {
        this.pointB = pointB;
    }

    public Point getPointC() {
        return pointC;
    }

    public void setPointC(Point pointC) {
        this.pointC = pointC;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "pointA=" + pointA +
                ", pointB=" + pointB +
                ", pointC=" + pointC +
                '}';
    }

    @Override
    public void draw() {
        System.out.println("["+pointA+pointB+pointC+"]");
    }
}
