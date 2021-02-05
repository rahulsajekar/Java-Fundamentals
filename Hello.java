class Student{
    int id;
    String name;
}

public class Hello {

    public static void main(String[] args) {
        System.out.println("Hello World");

        Student ajay = new Student();
        ajay.id=1;
        ajay.name="Ajay Mishra";

        Student manoj = new Student();
        manoj.id=2;
        manoj.name="Manoj Kumar";

        System.out.println("Hii "+ajay.name + " and " +manoj.name+" Welcome to Java World!");

        // Data Types
        int num = 1189; // 4 bytes
        String name ="Rahul Sajekar"; // created on heap used no.of character = no.of bytes
        double d1 = 56.77459; // 8 bytes 15 digits allowed after decimal
        float f1 = 64.765f; // 7 digits allowed after decimal
        boolean b1 = true; // 1 byte used
        boolean b2 = false;
    }

}
