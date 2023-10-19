package victor.day11;

/**
 * @Author：Victor_htq
 * @Package：victor.day11
 * @Project：JavaFaundamental
 * @name：DequeExample
 * @Date：2023/10/19 10:29
 * @Filename：DequeExample
 */
import java.util.LinkedList;

public class DequeExample {
    public static void main(String[] args) {
        LinkedList<Integer> deque = new LinkedList<>();

        // 在队头添加元素
        deque.addFirst(1);
        deque.addFirst(2);

        // 在队尾添加元素
        deque.addLast(3);
        deque.addLast(4);

        // 双端队列元素: [2, 1, 3, 4]
        System.out.println("双端队列元素: " + deque);

        // 移除队头元素
        int removedFromFront = deque.removeFirst(); // 移除2
        System.out.println("从队头移除的元素: " + removedFromFront); // 输出：从队头移除的元素: 2

        // 移除队尾元素
        int removedFromEnd = deque.removeLast(); // 移除4
        System.out.println("从队尾移除的元素: " + removedFromEnd); // 输出：从队尾移除的元素: 4

        // 双端队列元素: [1, 3]
        System.out.println("双端队列元素: " + deque);
    }
}

