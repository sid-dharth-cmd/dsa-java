class Shape{
    String color;
    Shape(String color){
        this.color = color;
    }
}
class Circle extends Shape{
    double radius;
    Circle (String color, double radius){
        super(color);
        this.radius = radius;
    }
    double area(double radius){
        return Math.PI*radius*radius;
    }
    void display(){
        System.out.println("Radius: "+radius+", Color: "+color+", Area: "+area(radius));
    }
}
class Rectangle extends Shape{
    double length;
    double width;
    Rectangle(String color, double length, double width){
        super(color);
        this.length = length;
        this.width = width; 
    }
    double area(double length, double width){
        return length*width;
    }
    void display(){
        System.out.println("Length: "+length+", Width: "+width+", Color: "+color+", Area: "+area(length, width));
    }
}

public class Q7 {
    public static void main(String[] args){
        Circle Cobj = new Circle("yellow", 2.5);
        Rectangle Robj = new Rectangle("blue", 4.3, 3.2);
        Cobj.display();
        Robj.display();
    }
}
