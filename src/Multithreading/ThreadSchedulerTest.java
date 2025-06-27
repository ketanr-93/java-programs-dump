package Multithreading;

public class ThreadSchedulerTest extends Thread{
    public void run(){
        for(int i=1;i<=5;i++){
            try{
                Thread.sleep(500);
            }catch(InterruptedException e){
                System.out.println(e);
            }
            System.out.println(i);
        }
    }
    public static void main(String[] args){
        ThreadSchedulerTest t1 = new ThreadSchedulerTest();
        ThreadSchedulerTest t2 = new ThreadSchedulerTest();
        ThreadSchedulerTest t3 = new ThreadSchedulerTest();
        t1.setName("Thread 1");
        t2.setName("Thread 2");
        t3.setName("Thread 3");

        System.out.println("Is Alive:"+t1.isAlive());

        t1.start();
        t2.start();
        t3.start();
        System.out.println("Is Alive:"+t1.isAlive());
    }

}
