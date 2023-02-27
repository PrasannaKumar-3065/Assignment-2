package pk;
import java.util.logging.*;

public class Circle extends Shapes{
    void perimeter(){
        ans = 2*3.14*Shapes.radius;
        LOGGER.log(Level.INFO,Double.toString(ans),"Perimeter of circle: "+ans);
    }

    void area(){
        ans = 3.14*(Shapes.radius*Shapes.radius);
        LOGGER.log(Level.INFO,Double.toString(ans),"Area of circle: "+ans);
    }

    Circle(double radius){
        Shapes.radius = radius;
    }
}