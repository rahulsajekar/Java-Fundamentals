import java.util.Scanner;

public class InputOutput {

    public static void main(String[] args) {

//       int age =24;
//        System.out.println("This is a Test");
//       System.out.println("My age is : "+age);
        // taking input from user
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your name and programming experience : ");
        String name = sc.nextLine();
        int experience = sc.nextInt();
        System.out.println(name+" has "+experience+" years of  programming experience");
    }

}
