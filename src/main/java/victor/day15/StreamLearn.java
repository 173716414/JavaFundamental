package victor.day15;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

/**
 * @Author：Victor_htq
 * @Package：victor.day15
 * @Project：JavaFaundamental
 * @name：StreamLearn
 * @Date：2023/10/25 9:18
 * @Filename：StreamLearn
 */
public class StreamLearn {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd", "", "jkl");
        List<String> filtered = strings
                .stream()
                .filter(string -> !string.isEmpty())
                .collect(Collectors.toList());
        System.out.println(filtered);

        Random random = new Random();
        random
                .ints()
                .limit(10)
                .forEach(System.out::println);

        List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
        List<Integer> squaresList = numbers
                .stream()
                .map(i -> i * i)
                .distinct()
                .collect(Collectors.toList());
        System.out.println(squaresList);

        long count = strings
                .stream()
                .filter(String::isEmpty)
                .count();
        System.out.println(count);

        // random = new Random();
        random.ints()
                .limit(10)
                .sorted()
                .forEach(System.out::println);

        count = strings
                .parallelStream()
                .filter(String::isEmpty)
                .count();
        System.out.println(count);

        strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
        filtered = strings
                .stream()
                .filter(string -> !string.isEmpty())
                .collect(Collectors.toList());
        System.out.println("筛选列表: " + filtered);
        String mergedString = strings
                .stream().filter(string -> !string.isEmpty())
                .collect(Collectors.joining(", "));
        System.out.println("合并字符串: " + mergedString);


        IntSummaryStatistics stats = numbers
                .stream()
                .mapToInt((x) -> x)
                .summaryStatistics();
        System.out.println("列表中最大的数 : " + stats.getMax());
        System.out.println("列表中最小的数 : " + stats.getMin());
        System.out.println("所有数之和 : " + stats.getSum());
        System.out.println("平均数 : " + stats.getAverage());
    }
}
