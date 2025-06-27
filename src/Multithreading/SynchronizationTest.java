package Multithreading;

public class SynchronizationTest extends Thread {
    public void run() {
        synchronized (this) {
            for (int i = 1; i <= 5; i++) {
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    System.out.println(e);
                }
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        SynchronizationTest t1 = new SynchronizationTest();
        SynchronizationTest t2 = new SynchronizationTest();
        SynchronizationTest t3 = new SynchronizationTest();
        t1.start();
        t2.start();
        t3.start();
    }

}
