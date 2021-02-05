import java.util.Scanner;

public class Grades {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your marks ");
        int marks = sc.nextInt();

        if(marks >= 90){
            System.out.println("A+");
        }
        else if( marks >=81 && marks <=89){
            System.out.println("A");
        }
        else if( marks >=71 && marks <=80){
            System.out.println("B+");
        }
        else if( marks >=61 && marks <=70){
            System.out.println("B");
        }
        else if( marks >=41 && marks <=60){
            System.out.println("Passed");
        }
        else{
            System.out.println("Failed");
        }
    }
}
