package main.java.HW12Multithreading_lvl1.MultithreadingConcepts;

public class MyRunnable implements Runnable{
    @Override
    public void run() {
        System.out.println("This is MyRunnable thread running");
        String threadName = Thread.currentThread().getName();
        System.out.println("Имя текущего потока: " + threadName);
        System.out.println();
    }
}
