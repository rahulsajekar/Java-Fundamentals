// Single Inheritance
class Parent{
    String surname;

    public Parent(String surname) {
        this.surname = surname;
    }
}

class Child extends Parent{
    String name;

    public Child(String surname, String name) {
        super(surname);
        this.name = name;
    }

    @Override
    public String toString() {
        return "Child{" +
                "surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}

/*
Super keyword is used to call method from immediate parent
call of super in constructor must be a first line.
*/

/*
*  To  create object of the child its parent object MANDATARILY created someway.
*  Parents needs to be created first.
* */


public class Inheritance {
    public static void main(String[] args) {
        Child c1 = new Child("Smith","John");
        System.out.println(c1);
    }
}

