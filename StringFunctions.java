import java.util.Arrays;
import java.util.Scanner;

public class StringFunctions {
    public static void main(String[] args) {
        String data = "This is a test data";
//        System.out.println(data.toLowerCase());
//        System.out.println(data.toUpperCase());
//        System.out.println(data.contains("X")); // check whether given character is present in the string
//        System.out.println(data.charAt(2)); // return character at index 2
//        System.out.println(data.substring(0,4));
//        System.out.println("rahul".toUpperCase());
        for(String word:data.split(" ")){
            System.out.println(word);
        }
        System.out.println(data.endsWith("ta"));
        System.out.println(data.startsWith("And"));
        System.out.println(data.concat(" Combined"));
        System.out.println(data.length()); // size of string
        System.out.println(data.toCharArray());// gives you a character array

        // verify the data entered is at least 5  character
//        Scanner sc = new Scanner(System.in);
//        System.out.println(sc.nextLine().length()>=5);

        // add 2 numbers given by the user --> input is in the string format
        // input -> 20 54
//        String input = sc.nextLine();
//        String[] num = input.split(" ");
//        System.out.println(Integer.parseInt(num[0])+Integer.parseInt(num[1]));

        // take 3 Strings from the user. print the Strings starts with "H"

//        for(int i=0; i<3; i++){
//            String text = sc.nextLine();
//            if(text.startsWith("H")){
//                System.out.println(text);
//            }
//        }

        // Alternative for above
//        for(String sentence : sc.nextLine().split(".")){
//            if(sentence.startsWith("H")){
//                System.out.println(sentence);
//            }
//        }
        data = "This is test data test data test";
        System.out.println(data.isBlank());
        System.out.println(data.isEmpty());
        System.out.println(data.indexOf("t"));
        System.out.println(data.lastIndexOf("test"));
        System.out.println(data.replace('t','X'));
        System.out.println(data.replaceAll("test","ABC"));

        // take an input from user. Convert all "A" into "Z"
        System.out.println(new Scanner(System.in).nextLine().replace('A','Z'));

    }
}
