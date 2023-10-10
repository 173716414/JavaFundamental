package victor.day4;

/**
 * @Author：Victor_htq
 * @Package：victor.day4
 * @Project：JavaFaundamental
 * @name：FinalizeLearn
 * @Date：2023/10/10 16:00
 * @Filename：FinalizeLearn
 */
public class FinalizeLearn {
    public static void main(String[] args) {
        Cake c1 = new Cake(1);
        Cake c2 = new Cake(2);
        Cake c3 = new Cake(3);

        c2 = c3 = null;
        System.gc(); //调用Java垃圾收集器
    }
}

class Cake extends Object {
    private int id;
    public Cake(int id) {
        this.id = id;
        System.out.println("Cake Object " + id + " is created");
    }

    protected void finalize() throws java.lang.Throwable {
        super.finalize();
        System.out.println("Cake Object " + id + " is disposed");
    }
}
