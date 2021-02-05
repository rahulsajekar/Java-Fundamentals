class shape{
   double Area(double side){
       return side*side;
   }
   double Area(boolean isCircle, double r){
       return 3.14*r*r;
   }
   double Area(double l,double b){
       return l*b;
   }
}

public class MethodOverloading {
    public static void main(String[] args) {
        shape circle = new shape();
        System.out.println(circle.Area(true,12.25));
        shape rectangle = new shape();
        System.out.println(rectangle.Area(5.3,5.6));
        shape square = new shape();
        System.out.println(square.Area(23.3));
    }
}
