import java.util.Arrays;
import java.util.function.BiFunction;
import java.util.function.Function;

public class Lambdas {
    public static void main(String[] args) {

        // Functional Interfaces
        Function<Double,Double>f1 = (val)->val*(0.9);
        System.out.println(f1.apply(100.0));

        BiFunction<Integer,Integer,Integer> add = (n1,n2)->n1+n2;
        System.out.println(add.apply(5,6));

        // Stream API example
        double numbers[] = {1.0,2.0,3.0,4.0,5.0};
        Arrays.stream(numbers).forEach(x -> System.out.println(x*0.9));

    }
}
