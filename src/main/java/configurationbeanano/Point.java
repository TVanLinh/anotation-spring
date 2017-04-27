package configurationbeanano;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.inject.Named;

/**
 * Created by linhtran on 25/04/2017.
 */

@Configuration
//@Scope(scopeName = "prototype")
public class Point {
    private  double x;
    private  double y;

    public  Point()
    {}

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

    public  void init()
    {
        System.out.println("Point created!");
    }

    public  void destroy()
    {
        System.out.println("Point destroyed!");
    }

}
