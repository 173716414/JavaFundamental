package victor.day10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * @Author：Victor_htq
 * @Package：victor.day10
 * @Project：JavaFaundamental
 * @name：ArrayListLearn
 * @Date：2023/10/18 9:52
 * @Filename：ArrayListLearn
 */
public class ArrayListLearn {
    public static void main(String[] args) {
        ArrayList<Integer> intArray = new ArrayList<>();
        intArray.add(1);
        intArray.add(20);
        intArray.add(100);
        intArray.add(35);
        intArray.add(15);
        System.out.println(intArray);
        Collections.sort(intArray);
        System.out.println(intArray);
        // Collections.sort(intArray, new Comparator<Integer>() {
        //     @Override
        //     public int compare(Integer o1, Integer o2) {
        //         return o1.compareTo(o2) ;
        //     }
        // });
        Collections.sort(intArray, Comparator.reverseOrder());
        System.out.println(intArray);
        intArray.sort(Comparator.naturalOrder());
        System.out.println(intArray);
    }
}
