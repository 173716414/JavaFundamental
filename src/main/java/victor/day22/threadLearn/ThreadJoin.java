package victor.day22.threadLearn;

public class ThreadJoin {
    public static void main(String[] args) {
        Thread thread = new Thread(() -> System.out.println("new thread start"));
        System.out.println("main start");
        thread.start();
        try {
            thread.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("main end");
    }
}
