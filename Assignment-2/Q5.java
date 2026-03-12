abstract class Shape {
}
class Square extends Shape {
    double side;
    Square(double side) {
        this.side = side;
    }
    void area(){
        System.out.println("Area: "+(side*side));
    }
}
class Triangle extends Shape{
    double height;
    double base;
    Triangle(double height, double base){
        this.height = height;
        this.base = base;
    }
    void area(){
        System.out.println("Area: "+(0.5*height*base));
    }
}
class Circle extends Shape{
    double radius;
    Circle(double radius){
        this.radius = radius;
    }
    void area(){
        System.out.println("Area: "+(2*Math.PI*radius));
    }
}
public class Q5 {
    public static void main(String[] args){
        Square Sobj = new Square(2.3);
        Triangle Tobj = new Triangle(2, 3);
        Circle Cobj = new Circle(3.5);
        Sobj.area();
        Tobj.area();
        Cobj.area();
    }
}