package annonamedinject;

import org.springframework.context.annotation.Scope;

import javax.inject.Named;

/**
 * Created by linhtran on 25/04/2017.
 */
@Named
public class Point {
    private  double x;
    private  double y;

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
}
