package pk;
import java.util.*;


abstract class Shapes{
    static double radius;
    static double base;
    static double length;
    static double height;
    static double breadth;
    static double side1;
    static double side2;

    abstract void perimeter();
    abstract void area();

    // Shapes(double radius){
    //     this.radius  = radius;
    // }
    // Shapes(double side1, double side2, double base, double height){
    //     this.side1  = side1;
    //     this.side2  = side2;
    //     this.base  = base;
    //     this.height = height;
    // }
    // Shapes(double length, double breadth){
    //     this.length  = length;
    //     this.breadth  = breadth;
    // }
}

class Triangle extends Shapes{

    void perimeter(){
        System.out.println("Perimeter of triangle: "+(Shapes.side1+Shapes.side2+Shapes.base));
    }

    void area(){
        System.out.println("Area of triangle: "+0.5*(Shapes.base*Shapes.height));
    }

    Triangle(double side1, double side2, double base, double height){
        Shapes.side1 = side1;
        Shapes.side2 = side2;
        Shapes.base = base;
        Shapes.height = height;  
    }
}

class Circle extends Shapes{

    void perimeter(){
        System.out.println("Perimeter of circle: "+2*3.14*Shapes.radius);
    }

    void area(){
        System.out.println("Area of circle: "+3.14*(Shapes.radius*Shapes.radius));
    }

    Circle(double radius){
        Shapes.radius = radius;
    }
}
class Rectangle extends Shapes{
    void perimeter(){
        System.out.println("Perimeter of rectangle: "+2*(Shapes.length+Shapes.breadth));
    }

    void area(){
        System.out.println("Area of rectangle: "+(Shapes.length*Shapes.breadth));
    }
    Rectangle(double length, double breadth){
        Shapes.length = length;
        Shapes.breadth = breadth;
    }
}

public class Shape {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        int n = 1;
        do{
            System.out.println("1.Triangle 2.Rectangle 3.Circle\n");
            int choice = sc.nextInt();
            if(choice == 1){
                System.out.println("enter side 1: ");
                double side1 = sc.nextDouble();
                System.out.println("enter side 2: ");
                double side2 = sc.nextDouble();
                System.out.println("enter base: ");
                double base = sc.nextDouble();
                System.out.println("enter height: ");
                double height = sc.nextDouble();

                Shapes s = new Triangle(side1,side2,base,height);//side1, side2, base, height
                s.perimeter();
                s.area();
            }
            else if(choice == 2){
                System.out.println("enter length: ");
                double length = sc.nextDouble();
                System.out.println("enter breadth: ");
                double breadth = sc.nextDouble();

                Shapes s = new Rectangle(length, breadth);//length, breadth
                s.perimeter();
                s.area();
            }
            else if(choice == 3){
                System.out.println("enter radius: ");
                double radius = sc.nextDouble();

                Shapes s = new Circle(radius);//radius);
                s.perimeter();
                s.area();
            }
            else{
                System.out.print("exiting..");
                System.exit(1);
            }
        }while(n == 1);
    }
    
}
