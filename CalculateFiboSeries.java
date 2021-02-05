class Number{
    int value;

    public Number(int value) {
        this.value = value;
    }
}


class FibonacciSeries extends Number{

    public FibonacciSeries(int value) {
        super(value);
        int a=0,b=1;
        System.out.print(a+" "+b+" ");
        for (int count=2;count<=value;count++){
            int temp = a+b;
            System.out.print(temp+" ");
            a=b;
            b=temp;
        }
    }
}

public class CalculateFiboSeries{
    public static void main(String[] args) {
        new FibonacciSeries(5);
    }
}
