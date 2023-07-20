package main.java.HW12Multithreading_lvl1.MultithreadingConcepts;

public class MyThread extends Thread{
    @Override
    public void run() {
        System.out.println("This is MyThread extension running");
        String threadName = getName();
        System.out.println("Имя текущего потока: " + threadName);
        System.out.println();
    }
}
