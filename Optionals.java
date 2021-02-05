package Optionals;

// Optionals generally used to process null fileds

import java.util.Arrays;
import java.util.Optional;

class Scientist{
    Optional<String> name;

    public Scientist(String name) {
        this.name = Optional.ofNullable(name);
    }

    public Scientist() {
        this.name = Optional.ofNullable(null);
    }
}

public class Optionals {
    public static void main(String[] args) {
//        String name = null;
//        System.out.println(name.toLowerCase());

        // Optional.of() -> cannot store null inside
        // Optional.ofNullable() -> can store null but operation will perform when value is present

//        Optional<String> name = Optional.ofNullable("rahul");
//        name.ifPresent(x-> System.out.println(x));
//
//        Optional<Integer> n1 = Optional.ofNullable(null);
//        n1.ifPresent(x-> System.out.println(x));

        Scientist s2 = new Scientist();
//        s2.name.ifPresent(x-> System.out.println(x));

        Scientist s1 = new Scientist("Stephen hawking");
//        s1.name.ifPresentOrElse(x-> System.out.println(x),()-> System.out.println("Nothing"));

        Scientist s3 = new Scientist("Charles darwin");
        Scientist s4 = new Scientist();
        Scientist s5 = new Scientist("Albert einstein");

        Scientist[] arr = {s1,s2,s3,s4,s5};

        Arrays.stream(arr)
                .forEach(x->x.name.ifPresent(val-> System.out.println(
                        val.split(" ")[0]+"-->"+val.split(" ")[1])));

    }
}
