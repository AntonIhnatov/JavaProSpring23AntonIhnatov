package main.java.HW12Multithreading_lvl1;

import main.java.HW12Multithreading_lvl1.ChickenAndEggGame.ChickenAndEggGame;
import main.java.HW12Multithreading_lvl1.MultithreadingConcepts.CustomRunnable;
import main.java.HW12Multithreading_lvl1.MultithreadingConcepts.MyCallable;
import main.java.HW12Multithreading_lvl1.MultithreadingConcepts.MyRunnable;
import main.java.HW12Multithreading_lvl1.MultithreadingConcepts.MyThread;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {
    public static int varToPass = 1;

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        //Создать потоки 4ма способами
        Thread threadRunnable = new Thread(new MyRunnable());
        threadRunnable.start();

        MyThread myThread = new MyThread();
        myThread.start();

        Thread threadLambda = new Thread(() -> {
            System.out.println("This is lambda for thread"+ "\nИмя текущего потока: " + Thread.currentThread().getName());
            System.out.println();
        });
        threadLambda.start();

        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Future<String> futureResult = executorService.submit(new MyCallable());
        executorService.shutdown();
        System.out.println(futureResult.get());

        //На прикладі уроку зробити самостійно запуск 10ти потоків у циклі, які будуть всередині методу run робити інкремент та виводити значення змінної
        System.out.println();
        runSeveralThreads();
        System.out.println();

        //Гра курка чи яйце
        ChickenAndEggGame.startGame();
    }

    public static void runSeveralThreads() {
        for (int i = 0; i < 10; i++) {
            Thread thread = new Thread(new CustomRunnable());
            thread.start();
        }

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Значение переменной: " + varToPass);
    }

    //Из-за асинхронного выполнения потоков, значение переменной varToPass недетерминированное
    // 10 потоков инкрементируют переменную varToPass по 100 раз каждый
    // Как результат, фактическое значение varToPass может быть разным при каждом запуске
}

