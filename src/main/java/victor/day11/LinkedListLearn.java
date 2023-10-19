package victor.day11;

import java.util.Comparator;
import java.util.LinkedList;

/**
 * @Author：Victor_htq
 * @Package：victor.day10.day11
 * @Project：JavaFaundamental
 * @name：LinkedListLearn
 * @Date：2023/10/19 10:14
 * @Filename：LinkedListLearn
 */
public class LinkedListLearn {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(100);
        linkedList.add(1000);
        linkedList.add(200);
        linkedList.add(500);
        linkedList.add(236);
        for (int i : linkedList) {
            System.out.println(i);
            // linkedList.set(i, 100);
        }
        linkedList.sort(Comparator.naturalOrder());
        System.out.println(linkedList);
        linkedList.add(5, 900);
        System.out.println(linkedList);
        linkedList.offer(1200);
        System.out.println(linkedList);
        linkedList.remove();
        System.out.println(linkedList);
        linkedList.remove(1);
        System.out.println(linkedList);
        System.out.println(linkedList.poll());
        System.out.println(linkedList);
        System.out.println(linkedList.get(1));
        System.out.println(linkedList.indexOf(1000));
        System.out.println(linkedList.peek());
        linkedList.set(2, 380);
        System.out.println(linkedList);
        linkedList.clear();
        System.out.println(linkedList);
    }

}
