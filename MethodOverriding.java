class GeometricShape{
    String name;

    public GeometricShape(String name) {
        this.name = name;
    }
    double Area(){
        return 0.0;
    }
}

class Circle extends GeometricShape{
    double radius;

    public Circle(String name, double radius) {
        super(name);
        this.radius = radius;
    }
    double Area(){
        return 3.14*this.radius*this.radius;
    }

}

class Rectangle extends GeometricShape{
    double len,wid;

    public Rectangle(String name, double len, double wid) {
        super(name);
        this.len = len;
        this.wid = wid;
    }

    double Area(){
        return this.len*this.wid;
    }
}

class Square extends GeometricShape{
    double side;

    public Square(String name, double side) {
        super(name);
        this.side = side;
    }
    double Area(){
        return this.side*this.side;
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        Rectangle rec = new Rectangle("Rectangle",32.32,52.32);
        System.out.println(rec.Area());
        Circle c = new Circle("Circle",3.14);
        System.out.println(c.Area());

    }
}
