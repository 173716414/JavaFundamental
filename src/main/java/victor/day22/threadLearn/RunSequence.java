package victor.day22.threadLearn;

public class RunSequence {
//    public static void main(String[] args) {
//        System.out.println("main start");
//        Thread thread = new Thread(() -> {
//            System.out.println("thread start");
//            System.out.println("thread end");
//        });
//        thread.start();
//        System.out.println("main end");
//    }

//main线程肯定是先打印main start，再打印main end；
//t线程肯定是先打印thread run，再打印thread end。
//但是，除了可以肯定，main start会先打印外，main end打印在thread run之前、thread end之后或者之间，都无法确定。因为从t线程开始运行以后，两个线程就开始同时运行了，并且由操作系统调度，程序本身无法确定线程的调度顺序。
    public static void main(String[] args) {
        System.out.println("main start...");
        Thread t = new Thread() {
            public void run() {
                System.out.println("thread run...");
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {}
                System.out.println("thread end.");
            }
        };
        t.start();
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {}
        System.out.println("main end...");
    }
}
