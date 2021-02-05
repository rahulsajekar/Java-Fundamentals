import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        for (int count=1; count<=10; count++){
            System.out.println(count);
        }

        Scanner sc = new Scanner(System.in);
        // while loop
        String data = "";
        while(!data.equals("STOP")){
            System.out.println("Hello");
            data = sc.nextLine();
        }

        int num = 1;
        while(num!=0){
            num = sc.nextInt();
            System.out.println(num*10);
        }
    }
}
