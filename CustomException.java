import java.util.Scanner;

class ValueExceededException extends Exception{
    public ValueExceededException(String msg) {
        super(msg); // control will goto exception class
    }
}

public class CustomException{

    public static void main(String[] args) throws ValueExceededException {
        Scanner sc = new Scanner(System.in);
        int[] arr= new int[3];
        for(int i=0;i<3;i++){
            int a = sc.nextInt();
            if(a>21){
                try{throw new ValueExceededException("NUmber is greater than 21");}
                catch(ValueExceededException e){
                    System.out.println("problem");
                }
            }
            else{
                arr[i]=a;
            }
        }
        for (int val : arr){
            System.out.println(val);
        }
    }

}