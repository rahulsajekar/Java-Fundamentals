import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String[] args) {
       // System.out.println( 10/0);
        Scanner sc= new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        // generic exception
        try{
            System.out.println(n1/n2);
        }catch (Exception obj){
            System.out.println(obj);
        }



    }
}
