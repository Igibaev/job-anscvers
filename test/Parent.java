package test;

import java.util.concurrent.Semaphore;

public class Parent extends Test{

    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(1); // создаем семафор с одним разрешением

        // Создаем потоки
        Thread thread1 = new Thread(() -> {
            try {
                semaphore.acquire(); // поток 1 получает разрешение
                System.out.println("Thread 1 acquired semaphore");
                Thread.sleep(2000); // какое-то время занимаем семафор
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                semaphore.release(); // освобождаем семафор
                System.out.println("Thread 1 released semaphore");
            }
        });

        Thread thread2 = new Thread(() -> {
            try {
                semaphore.acquire(); // поток 2 ждет освобождения семафора
                System.out.println("Thread 2 acquired semaphore");
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                semaphore.release(); // поток 2 освобождает семафор
                System.out.println("Thread 2 released semaphore");
            }
        });

        // Запускаем потоки
        thread1.start();
        thread2.start();
    }


    static {

        System.out.println("Static initializer of Parent");
    }

    {
        test = "sdfds";
        System.out.println("Instance initializer of Parent");
        System.out.println(test);
    }

    public Parent() {
        System.out.println("Constructor of Parent");
    }

}
