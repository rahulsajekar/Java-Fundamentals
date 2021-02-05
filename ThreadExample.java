class S extends Thread{ // Method 1 for creating Thread
    int[] numbers={1,2,3,4,5};

    public void run(){
        System.out.println("Sqaure Thread has ID: "+this.getId());
        for (int n1 : numbers){
            try {
                Thread.sleep(1000); // stop program for 1 second
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Sqaure of "+n1+" is "+n1*n1 + " ");
        }
        System.out.println();
    }
}

class Cube implements Runnable{ // method 2 for creating thread
    int[] numbers={1,2,3,4,5};

    public void run(){
        //System.out.println("Cube Thread has ID: "+this.getId());
        for (int n1 : numbers){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Cube of "+n1+" is "+n1*n1*n1 + " ");
        }
        System.out.println();
    }
}


public class ThreadExample {

    public static void main(String[] args) throws InterruptedException {
        S sqaure = new S();
        Thread t = new Thread(new Cube());// method 2 for creating thread

        long start = System.currentTimeMillis();
        sqaure.start();
        t.start();
        sqaure.join(); // main method will wait to end the execution of thread..
        t.join();
        long end = System.currentTimeMillis();

        System.out.println("total time: " + (end-start));

    }
}
