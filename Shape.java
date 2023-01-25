import java.util.*;

class shapes{
    double radius;
    double base;
    double length;
    double height;
    double breadth;
    double side1;
    double side2;

    

    void triangle(){
        System.out.println("Perimeter of triangle: "+side1+side2+base);
        System.out.println("Area of triangle: "+0.5*(base*height));
    }

    void circle(){
        System.out.println("Perimeter of circle: "+2*3.14*radius);
        System.out.println("Area of circle: "+3.14*(radius*radius));
    }

    void rectangle(){
        System.out.println("Perimeter of rectangle: "+2*(length+breadth));
        System.out.println("Area of rectangle: "+length*breadth);
    }

    shapes(double radius){
        this.radius  = radius;
        circle();
    }

    shapes(double side1, double side2, double base, double height){
        this.side1  = side1;
        this.side2  = side2;
        this.base  = base;
        this.height = height;
        triangle();
    }

    shapes(double length, double breadth){
        this.length  = length;
        this.breadth  = breadth;
        rectangle();
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

                shapes s = new shapes(side1, side2, base, height);
            }
            else if(choice == 2){
                System.out.println("enter length: ");
                double length = sc.nextDouble();
                System.out.println("enter breadth: ");
                double breadth = sc.nextDouble();

                shapes s = new shapes(length, breadth);
            }
            else if(choice == 2){
                System.out.println("enter length: ");
                double length = sc.nextDouble();
                System.out.println("enter breadth: ");
                double breadth = sc.nextDouble();

                shapes s = new shapes(length, breadth);
            }
            else if(choice == 3){
                System.out.println("enter radius: ");
                double radius = sc.nextDouble();

                shapes s = new shapes(radius);
            }
            else{
                System.out.print("exiting..");
                System.exit(1);
            }


        }while(n == 1);
    }
    
}
