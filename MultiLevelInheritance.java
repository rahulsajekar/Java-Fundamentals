class GrandParents{
    double property_amount;

    public GrandParents(double property_amount) {
        this.property_amount = property_amount;
        System.out.println("GrandParent");
    }

    @Override
    public String toString() {
        return "GrandParents{" +
                "property_amount=" + property_amount +
                '}';
    }
}

class Parents extends GrandParents{
    String surname;

    public Parents(double property, String surname) {
        super(property);
        this.surname = surname;
        System.out.println("Parent");
    }

    @Override
    public String toString() {
        return "Parents{" +
                "property_amount=" + property_amount +
                ", surname='" + surname + '\'' +
                '}';
    }
}

class Childs extends Parents{
    String name;

    public Childs(double property, String surname, String name) {
        super(property, surname);
        this.name = name;
    }

    @Override
    public String toString() {
        return "Childs{" +
                "property_amount=" + property_amount +
                ", surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}

public class MultiLevelInheritance {
    public static void main(String[] args) {
        Childs c1 = new Childs(45.35,"sajekar","rahul");
        System.out.println(c1);
    }
}
