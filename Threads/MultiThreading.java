package Threads;

public class MultiThreading {
    public static void main(String[] args) {
        for (int i = 0; i < 4; i++) {
            MultiThread myThing1 = new MultiThread(i);
            myThing1.start();
        }
    }
}
