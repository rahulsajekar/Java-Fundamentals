class A{
    void magic(){
        System.out.println("A");
    }
    void magic(double a){}
}

class B extends A{
    void magic(){
        System.out.println("B");
    }
}

class C extends B{
    void magic(){
        System.out.println("C");
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        A a = new C();
        a.magic();
        /*
        * Upcasting
        * during runtime most derived methods will call
        * */
    }
}
