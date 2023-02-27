package pk;
import java.util.logging.*;

public class Triangle extends Shapes{
    
    void perimeter(){
        ans = (Shapes.side1+Shapes.side2+Shapes.base);
        LOGGER.log(Level.INFO,Double.toString(ans),"Perimeter of triangle: "+ans);
    }

    void area(){
        ans = 0.5*(Shapes.base*Shapes.height);
        LOGGER.log(Level.INFO,Double.toString(ans),"Area of triangle: "+ans);
    }

    Triangle(double side1, double side2, double base, double height){
        Shapes.side1 = side1;
        Shapes.side2 = side2;
        Shapes.base = base;
        Shapes.height = height;  
    }
}