package victor.day22.threadLearn;

public class ThreadLearn {
    public static void main(String[] args) {

//        Thread myThread = new Thread();
//        myThread.start();

//        Thread myThread = new myThread();
//        myThread.start();

//        Thread thread = new Thread(new myRunnable());
//        thread.start();

        Thread thread = new Thread(() -> System.out.println("New thread start"));
        thread.start();
    }

}
//class myThread extends Thread {
//    @Override
//    public void run() {
//        System.out.println("New thread start");
//    }
//}

//class myRunnable implements Runnable {
//    @Override
//    public void run() {
//        System.out.println("New thread start");
//    }
//}