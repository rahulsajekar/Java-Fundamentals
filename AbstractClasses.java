abstract class GeometricShapes{
    String name;

    public GeometricShapes(String name) {
        this.name = name;
    }
    abstract double Area();
}

class CicularShape extends GeometricShapes{

    double radius;

    public CicularShape(String name, double radius) {
        super(name);
        this.radius = radius;
    }

    @Override
    double Area() {
        return this.radius*this.radius*3.14;
    }
}

public class AbstractClasses {
    public static void main(String[] args) {
        CicularShape cs = new CicularShape("Circle",3.2);
        System.out.println(cs.Area());
    }
}
