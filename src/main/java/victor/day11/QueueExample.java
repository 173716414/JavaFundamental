package victor.day11;

/**
 * @Author：Victor_htq
 * @Package：victor.day11
 * @Project：JavaFaundamental
 * @name：QueueExample
 * @Date：2023/10/19 10:27
 * @Filename：QueueExample
 */
import java.util.LinkedList;

public class QueueExample {
    public static void main(String[] args) {
        // 创建一个LinkedList作为队列
        LinkedList<Integer> queue = new LinkedList<>();

        // 入队操作
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);

        // 队列大小
        System.out.println("队列大小: " + queue.size()); // 输出：队列大小: 3

        // 查看队头元素
        System.out.println("队列前端元素: " + queue.peek()); // 输出：队列前端元素: 1

        // 出队操作
        int removedValue = queue.poll();
        System.out.println("出队: " + removedValue); // 输出：出队: 1

        // 队列大小
        System.out.println("队列大小: " + queue.size()); // 输出：队列大小: 2
    }
}
