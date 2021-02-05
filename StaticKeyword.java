import javax.print.Doc;

class Doctor{
    int id; // non-default variable
    double fees = 450.21; // default value, can change later
    static String Hospital="JKS Hospital"; // single copy through entire class
    // if one object change the value of static variable other object will get the changed version of that variable

    public Doctor(int id, double fees) {
        this.id = id;
        this.fees = fees;
    }


}

public class StaticKeyword {
    public static void main(String[] args) {
        Doctor d1= new Doctor(45,653.4);
        System.out.println(Doctor.Hospital); // static variable should access with Class reference
    }
}
