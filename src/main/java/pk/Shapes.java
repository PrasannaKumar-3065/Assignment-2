package pk;
import java.util.logging.*;


abstract class Shapes{
    static double radius;
    static double base;
    static double length;
    static double height;
    static double breadth;
    static double side1;
    static double side2;
    double ans;
    protected static final Logger LOGGER =  Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
    abstract void perimeter();
    abstract void area();

}
