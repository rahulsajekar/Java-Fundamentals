public class Factorial {

    int value;

    public Factorial(int num) {
        this.value = num;
    }

    int factorial(int value){
        int ans=1;
        for (int count=1; count<=value; count++){
            ans *= count;
        }
        return ans;
    }

    public static void main(String[] args) {
        Factorial f = new Factorial(5);
        System.out.println(f.factorial(f.value));
    }
}
