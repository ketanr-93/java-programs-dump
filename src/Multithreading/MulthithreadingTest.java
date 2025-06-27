package Multithreading;
import java.util.*;

public class MulthithreadingTest implements Runnable {
    public void run() {
        System.out.println("Thread is running.");
    }

    public static void main(String[] args) {
        MulthithreadingTest obj = new MulthithreadingTest();
        Thread thread = new Thread(obj);
        thread.start();
    }

}
