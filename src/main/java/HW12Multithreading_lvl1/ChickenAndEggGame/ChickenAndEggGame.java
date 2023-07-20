package main.java.HW12Multithreading_lvl1.ChickenAndEggGame;

public class ChickenAndEggGame {
    private static final Object lock = new Object();
    private static boolean isChickenTurn = true;

    public static void startGame() {
        Thread chickenThread = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                synchronized (lock) {
                    while (!isChickenTurn) {
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    System.out.println("НЕТ, КУРИЦА!!!");
                    isChickenTurn = false;
                    lock.notifyAll();
                }
            }
        });

        Thread eggThread = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                synchronized (lock) {
                    while (isChickenTurn) {
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    System.out.println("ДА НЕТ ЖЕ, ЭТО ЯЙЦО!!!");
                    isChickenTurn = true;
                    lock.notifyAll();
                }
            }
        });

        chickenThread.start();
        eggThread.start();

        try {
            chickenThread.join();
            eggThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println();
        System.out.println("Яйцо как способ размножения появилось намного раньше кур.\nСогласно современным взглядам, птицы являются эволюционными «потомками» динозавров,\nуже размножавшихся яйцами задолго до начала процесса эволюционной трансформации некоторой части динозавров в птиц.");
    }
}
