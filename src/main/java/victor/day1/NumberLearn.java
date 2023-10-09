package victor.day1;

public class NumberLearn {
    Number num = 3.9;

    public static void main(String[] args) {
        double number = -5.5;
        double absoluteValue = Math.abs(number);
        System.out.println("绝对值：" + absoluteValue); // 输出：绝对值：5.5

        double squareRoot = Math.sqrt(16);
        System.out.println("平方根：" + squareRoot); // 输出：平方根：4.0

        double base = 2.0;
        double exponent = 3.0;
        double result = Math.pow(base, exponent);
        System.out.println(base + " 的 " + exponent + " 次方是：" + result); // 输出：2.0 的 3.0 次方是：8.0

        number = 10.0;
        double naturalLog = Math.log(number);
        System.out.println("自然对数：" + naturalLog); // 输出：自然对数：2.302585092994046
        System.out.println("10为底数对数：" + Math.log10(10)); // 输出：自然对数：2.302585092994046


        double num1 = 25.3;
        double num2 = 19.7;
        double max = Math.max(num1, num2);
        double min = Math.min(num1, num2);
        System.out.println("最大值：" + max); // 输出：最大值：25.3
        System.out.println("最小值：" + min); // 输出：最小值：19.7

        // 创建一个 Number 对象
        Number num = 42.5;

        // 将 Number 对象转换为不同类型的数字
        byte byteValue = num.byteValue();
        short shortValue = num.shortValue();
        int intValue = num.intValue();
        long longValue = num.longValue();
        float floatValue = num.floatValue();
        double doubleValue = num.doubleValue();

        System.out.println("byte 值：" + byteValue);
        System.out.println("short 值：" + shortValue);
        System.out.println("int 值：" + intValue);
        System.out.println("long 值：" + longValue);
        System.out.println("float 值：" + floatValue);
        System.out.println("double 值：" + doubleValue);


        // Deque
    }
}
