package pk;
import java.util.logging.*;

public class Rectangle extends Shapes{
    void perimeter(){
        ans = 2*(Shapes.length+Shapes.breadth);
        LOGGER.log(Level.INFO,Double.toString(ans),"Perimeter of rectangle: "+ans);
    }

    void area(){
        ans = (Shapes.length*Shapes.breadth);
        LOGGER.log(Level.INFO,Double.toString(ans),"Area of rectangle: "+ans);
    }
    Rectangle(double length, double breadth){
        Shapes.length = length;
        Shapes.breadth = breadth;
    }
}
