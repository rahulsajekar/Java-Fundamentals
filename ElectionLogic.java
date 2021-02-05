import java.util.Scanner;

public class ElectionLogic {

    // Reply the user if they are eligible for voting or not.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Age");
        int age = sc.nextInt();
        if(age >= 18){
            System.out.println("YES, you are eligible for voting");
        }
        else{
            System.out.println("Sorry, you are not eligible for voting");
        }
    }

}
