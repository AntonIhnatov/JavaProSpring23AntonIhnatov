package main.java.HW12Multithreading_lvl1.MultithreadingConcepts;

import java.util.concurrent.Callable;

public class MyCallable implements Callable {
    @Override
    public Object call() throws Exception {
        System.out.println("This is MyCallable thread running");
        String threadName = Thread.currentThread().getName();
        return "Результат выполнения, имя текущего потока: " + threadName;
    }
}
