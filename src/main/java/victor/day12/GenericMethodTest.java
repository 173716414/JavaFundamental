package victor.day12;

/**
 * @Author：Victor_htq
 * @Package：victor.day12
 * @Project：JavaFaundamental
 * @name：GenericMethodTest
 * @Date：2023/10/23 14:56
 * @Filename：GenericMethodTest
 */
public class GenericMethodTest {
    public static <E> void printArray(E[] inputArray) {
        for (E element : inputArray) {
            System.out.printf("%s ", element);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Integer[] intArray = {1, 3, 5, 7, 9};
        Double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5};
        Character[] charArrary = {'A', 'B', 'C', 'D', 'E'};

        printArray(intArray);
        printArray(doubleArray);
        printArray(charArrary);
    }
}
