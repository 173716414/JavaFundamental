package victor.day3;

/**
 * @Author：Victor_htq
 * @Package：victor.day1.day3
 * @Project：JavaFaundamental
 * @name：ArrayLearn
 * @Date：2023/10/9 10:58
 * @Filename：ArrayLearn
 */
public class ArrayLearn {
    static int[][] data = new int[2][3];

    public static void main(String[] args) {
        for (int[] da : data) {
            for (int d : da) {
                System.out.print(d);
            }
            System.out.println();
        }
    }

}
