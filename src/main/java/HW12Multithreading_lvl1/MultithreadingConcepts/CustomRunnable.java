package main.java.HW12Multithreading_lvl1.MultithreadingConcepts;

import main.java.HW12Multithreading_lvl1.Main;

public class CustomRunnable implements Runnable{
    @Override
    public void run() {
        for (int j = 0; j < 1000; j++) {
            Main.varToPass++;
        }
    }
}
