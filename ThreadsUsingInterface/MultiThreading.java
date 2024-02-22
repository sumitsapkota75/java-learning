package ThreadsUsingInterface;

public class MultiThreading {
    public static void main(String[] args) {
        for (int i = 0; i < 4; i++) {
            MultiThread myThing1 = new MultiThread(i);
            Thread myThread = new Thread(myThing1);
            myThread.start();
        }
    }
}
