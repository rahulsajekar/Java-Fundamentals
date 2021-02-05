import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;


public class ThrowsKeyword {

    // throws used for -> for future use you are aware about what kind of exception can throws by method
    // warning of exception can happen
    // transfer the exception handling responsibility to caller method
    void demo() throws IOException{
        ThrowsKeyword t2 = new ThrowsKeyword();
        t2.magic();
    }

    void magic() throws IOException {
        // file open for reading
        Reader f1 = Files.newBufferedReader(Paths.get("abcd.txt"));
    }

    public static void main(String[] args) throws ArithmeticException{
        ThrowsKeyword t1 = new ThrowsKeyword();
        System.out.println("HEllo");
        try{
            t1.demo();
        }catch (Exception e){
            System.out.println("Handled in main");
        }

//        System.out.println("bye");

        /*
    take name and age from user
    username is more than 7 letters in size, set name to null
    ask user to enter name again till name is less than 7 char in size
    print the 5th characters in the user name
    after the process, greet user goodbye
     */

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Name");
        String name= sc.nextLine();
        while(name.length()>7){
            System.out.println("Enter Name Again");
            name = sc.nextLine();
        }
        System.out.println("Enter Age");
        int age = sc.nextInt();
        try{
            System.out.println(name.charAt(4));
        }catch (StringIndexOutOfBoundsException obj){
            System.out.println(obj);
        }
        System.out.println("GOOD BYE!");



    }




}
