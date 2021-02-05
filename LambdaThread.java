// Third Method to create a Thread using Lambda Expressions....

public class LambdaThread {

    public static void main(String[] args) throws InterruptedException {

        int[] numbers = {1,2,3,4,5,6,7,8,9,10};
        int[] results = new int[10];
        Thread t1 = new Thread(()->{
            for (int n1=0; n1<5; n1++){
                int ans =1;
                for (int count=1;count<=numbers[n1];count++){
                    ans *= count;
                }
                results[n1] = ans;
            }
        });


        Thread t2 = new Thread(()->{
            for (int n1=5; n1<10; n1++){
                int ans =1;
                for (int count=1;count<=numbers[n1];count++){
                    ans *= count;
                }
                results[n1] = ans;
            }
        });
        t1.start();
        t1.join();
        t2.start();
        t2.join();

        for (int n : results){
            System.out.println(n);
        }

        // Contact Details
        // 8779092028
        // harshitshukla36@gmail.com

    }
}

/*
create 2 thread that calculate factorial of 10 numbers stored in the array.
first thread will calculate for first members and second thread will next 5
store all the result in a common array and print the result
 */
