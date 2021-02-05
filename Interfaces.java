interface data{
    int n1 = 100; // implicitly final
    void display2times();
}

class BigData implements data{
    @Override
    // has to be public implementation
    public void display2times() {
        System.out.println(n1*2);
    }
}
public class Interfaces {

    public static void main(String[] args) {
        BigData b1 = new BigData();
        b1.display2times();
    }
}
