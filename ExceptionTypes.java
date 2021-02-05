public class ExceptionTypes {
    public static void main(String[] args) {
        try {
            int[] a = {1,2};
            System.out.println(10/0);
            System.out.println(a[5]);
        }catch (ArithmeticException obj){
            System.out.println("May be Division by zer0");
        }
        catch (ArrayIndexOutOfBoundsException objA){
            System.out.println("Index Out of bound");
        }
        finally {
            // commonly used to close connections e.g. database connection, file handling
            System.out.println("Finally Executed");
        }


    }
}
