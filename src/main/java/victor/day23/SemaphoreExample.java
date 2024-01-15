package victor.day23;

import java.util.concurrent.Semaphore;

public class SemaphoreExample {
    public static void main(String[] args) {
        // 创建一个信号量，初始许可数为3
        Semaphore semaphore = new Semaphore(3);

        // 创建多个线程并启动
        for (int i = 1; i <= 5; i++) {
            Thread thread = new Thread(new Worker(i, semaphore));
            thread.start();
        }
    }

    static class Worker implements Runnable {
        private int id;
        private Semaphore semaphore;

        public Worker(int id, Semaphore semaphore) {
            this.id = id;
            this.semaphore = semaphore;
        }

        @Override
        public void run() {
            try {
                System.out.println("Worker " + id + " is waiting for permit.");
                semaphore.acquire(); // 获取许可
                System.out.println("Worker " + id + " has acquired permit.");

                // 模拟工作
                Thread.sleep(2000);

                System.out.println("Worker " + id + " is releasing permit.");
                semaphore.release(); // 释放许可
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}