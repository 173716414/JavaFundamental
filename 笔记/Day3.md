## Day3.1

### Java StringBuffer 和 StringBuilder 类

和 String 类不同的是，StringBuffer 和 StringBuilder 类的对象能够被多次的修改，并且不产生新的未使用对象。

StringBuilder 类在 Java 5 中被提出，它和 StringBuffer 之间的最大不同在于 StringBuilder 的方法不是线程安全的（不能同步访问）。

由于 **StringBuilder 相较于 StringBuffer 有速度优势**，所以多数情况下建议使用 StringBuilder 类。(特别是刷题时候)

```java
public class RunoobTest{
    public static void main(String args[]){
        StringBuilder sb = new StringBuilder(10);
        sb.append("Runoob..");
        System.out.println(sb);  
        sb.append("!");
        System.out.println(sb); 
        sb.insert(8, "Java");
        System.out.println(sb); 
        sb.delete(5,8);
        System.out.println(sb);  
    }
}
```

![2021-03-01-java-stringbuffer](F:\Learning\JavaFaundamental\笔记\img\2021-03-01-java-stringbuffer.svg)

然而在应用程序要求线程安全的情况下，则必须使用 StringBuffer 类。

常用方法：

| 1    | public StringBuffer append(String s) 将指定的字符串追加到此字符序列。 |
| ---- | ------------------------------------------------------------ |
| 2    | public StringBuffer reverse()  将此字符序列用其反转形式取代。 |
| 3    | public delete(int start, int end) 移除此序列的子字符串中的字符。 |
| 4    | public insert(int offset, int i) 将 `int` 参数的字符串表示形式插入此序列中。 |
| 5    | insert(int offset, String str) 将 `str` 参数的字符串插入此序列中。 |
| 6    | replace(int start, int end, String str) 使用给定 `String` 中的字符替换此序列的子字符串中的字符。 |

| 1    | int capacity() 返回当前容量。                                |
| ---- | ------------------------------------------------------------ |
| 2    | char charAt(int index) 返回此序列中指定索引处的 `char` 值。  |
| 3    | void ensureCapacity(int minimumCapacity) 确保容量至少等于指定的最小值。 |
| 4    | void getChars(int srcBegin, int srcEnd, char[] dst, int dstBegin) 将字符从此序列复制到目标字符数组 `dst`。 |
| 5    | int indexOf(String str) 返回第一次出现的指定子字符串在该字符串中的索引。 |
| 6    | int indexOf(String str, int fromIndex) 从指定的索引处开始，返回第一次出现的指定子字符串在该字符串中的索引。 |
| 7    | int lastIndexOf(String str) 返回最右边出现的指定子字符串在此字符串中的索引。 |
| 8    | int lastIndexOf(String str, int fromIndex) 返回 String 对象中子字符串最后出现的位置。 |
| 9    | int length()  返回长度（字符数）。                           |
| 10   | void setCharAt(int index, char ch) 将给定索引处的字符设置为 `ch`。 |
| 11   | void setLength(int newLength) 设置字符序列的长度。           |
| 12   | CharSequence subSequence(int start, int end) 返回一个新的字符序列，该字符序列是此序列的子序列。 |
| 13   | String substring(int start) 返回一个新的 `String`，它包含此字符序列当前所包含的字符子序列。 |
| 14   | String substring(int start, int end) 返回一个新的 `String`，它包含此序列当前所包含的字符子序列。 |
| 15   | String toString() 返回此序列中数据的字符串表示形式。         |

### 附录：

在Java中，每个对象都继承了`Object`类，而`Object`类包含一个`toString`方法。因此，在Java中，您可以通过调用对象的`toString`方法来将其转换为字符串表示形式。但是，在Java中，有一些情况下，`toString`方法可能会自动调用：

打印对象：当您使用`System.out.println`或其他打印方法来打印一个对象时，Java会自动调用该对象的`toString`方法，以将其转换为字符串并打印出来。例如：

```java
MyClass myObject = new MyClass();
System.out.println(myObject); // 自动调用 myObject.toString()
```

字符串拼接：当您将对象与字符串使用"+"运算符连接时，Java会自动调用对象的`toString`方法，以将对象转换为字符串并执行连接操作。例如：

```
javaCopy codeMyClass myObject = new MyClass();
String result = "Object: " + myObject; // 自动调用 myObject.toString()
```

这些是Java中`toString`方法自动调用的两个常见情况。但是，您可以在任何需要将对象转换为字符串的地方显式调用`toString`方法，如下所示：

```
javaCopy codeMyClass myObject = new MyClass();
String objectAsString = myObject.toString(); // 显式调用 toString()
```

要自定义对象的`toString`方法，您可以在自己的类中重写`Object`类的`toString`方法，以便返回您希望的字符串表示形式。这对于自定义类的调试和日志记录非常有用。例如：

```java
javaCopy codepublic class MyClass {
    private String name;
    private int age;

    // 构造函数和其他方法

    @Override
    public String toString() {
        return "MyClass{name='" + name + "', age=" + age + '}';
    }
}
```

## Day3.2

### Java数组

```java
dataType[] arrayRefVar;   // 首选的方法
dataType arrayRefVar[];  // 效果相同，但不是首选方法
```

Java语言使用new操作符来创建数组，语法如下：

```java
arrayRefVar = new dataType[arraySize];
```

上面的语法语句做了两件事：

- 一、使用 dataType[arraySize] 创建了一个数组。
- 二、把新创建的数组的**引用**赋值给变量 arrayRefVar。

```java
dataType[] arrayRefVar = new dataType[arraySize];
//完成初始化并赋值
dataType[] arrayRefVar = {value0, value1, ..., valuek};

//如果返回空数组
dataType[] arrayRefVar = new dataType[0];

```

## For-Each 循环

JDK 1.5 引进了一种新的循环类型，被称为 For-Each 循环或者加强型循环，它能在不使用下标的情况下遍历数组。

语法格式如下：

```java
for(type element: array)
{
    System.out.println(element);
}
```

### 多维数组的动态初始化（以二维数组为例）

1. 直接为每一维分配空间，格式如下：

```java
type[][] typeName = new type[typeLength1][typeLength2];
```

type 可以为基本数据类型和复合数据类型，typeLength1 和 typeLength2 必须为正整数，typeLength1 为行数，typeLength2 为列数。

```java
int[][] a = new int[2][3];
```

二维数组for-each

```java
int[][] data = new int[2][3];
for (int[] da : data) {
    for (int d : da) {
        sout(d);
    }
}
```

## Day3.3

日期：在算法题中不多
        

```java
import java.util.Date;
  
public class DateDemo {
   public static void main(String[] args) {
       // 初始化 Date 对象
       Date date = new Date();
        
       // 使用 toString() 函数显示日期时间
       System.out.println(date.toString());
   }
}
```
## 日期比较

Java使用以下三种方法来比较两个日期：

- 使用 getTime() 方法获取两个日期（自1970年1月1日经历的毫秒数值），然后比较这两个值。
- 使用方法 before()，after() 和 equals()。例如，一个月的12号比18号早，则 new Date(99, 2, 12).before(new Date (99, 2, 18)) 返回true。
- 使用 compareTo() 方法，它是由 Comparable 接口定义的，Date 类实现了这个接口。

```java
import  java.util.*;
import java.text.*;
 
public class DateDemo {
   public static void main(String[] args) {
 
      Date dNow = new Date( );
      SimpleDateFormat ft = new SimpleDateFormat ("yyyy-MM-dd hh:mm:ss");
 
      System.out.println("当前时间为: " + ft.format(dNow));
   }
}
```

#### 格式化输出

```java
import java.util.Date;
public class DateFormatExample {
   public static void main(String[] args) {
      Date date = new Date();
      System.out.printf("%tY-%tm-%td %tH:%tM:%tS %tZ", date, date, date, date, date, date);
   }
}
```

#### 解析字符串为时间

SimpleDateFormat 类有一些附加的方法，特别是parse()，它试图按照给定的SimpleDateFormat 对象的格式化存储来解析字符串。例如：

```java
import java.util.*;
import java.text.*;
  
public class DateDemo {
 
   public static void main(String[] args) {
      SimpleDateFormat ft = new SimpleDateFormat ("yyyy-MM-dd"); 
 
      String input = args.length == 0 ? "1818-11-11" : args[0]; 
 
      System.out.print(input + " Parses as "); 
 
      Date t; 
 
      try { 
          t = ft.parse(input); 
          System.out.println(t); 
      } catch (ParseException e) { 
          System.out.println("Unparseable using " + ft); 
      }
   }
}
```

测量时间间隔

```java
import java.util.*;
  
public class DiffDemo {
 
   public static void main(String[] args) {
      try {
         long start = System.currentTimeMillis( );
         System.out.println(new Date( ) + "\n");
         Thread.sleep(5*60*10);
         System.out.println(new Date( ) + "\n");
         long end = System.currentTimeMillis( );
         long diff = end - start;
         System.out.println("Difference is : " + diff);
      } catch (Exception e) {
         System.out.println("Got an exception!");
      }
   }
}
```

注意使用long来接收返回值，currentTimeMillis()返回时间毫秒值

## Calendar类

我们现在已经能够格式化并创建一个日期对象了，但是我们如何才能设置和获取日期数据的特定部分呢，比如说小时，日，或者分钟? 我们又如何在日期的这些部分加上或者减去值呢? 答案是使用Calendar 类。

```java
Calendar c = Calendar.getInstance();//默认是当前日期

//创建一个代表2009年1月12日的Calendar对象
Calendar c1 = Calendar.getInstance();
c1.set(2009, 1, 12);

```

set&get

```java
public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        c.set(Calendar.DAY_OF_MONTH, 2);
        System.out.println(c.get(Calendar.DATE));
    }
    // // 获得年份
    // int year = c1.get(Calendar.YEAR);
    // // 获得月份
    // int month = c1.get(Calendar.MONTH) + 1;
    // // 获得日期
    // int date = c1.get(Calendar.DATE);
    // // 获得小时
    // int hour = c1.get(Calendar.HOUR_OF_DAY);
    // // 获得分钟
    // int minute = c1.get(Calendar.MINUTE);
    // // 获得秒
    // int second = c1.get(Calendar.SECOND);
    // // 获得星期几（注意（这个与Date类是不同的）：1代表星期日、2代表星期1、3代表星期二，以此类推）
    // int day = c1.get(Calendar.DAY_OF_WEEK);
```

| 1    | void add(int field, int amount) 根据日历规则，将指定的（有符号的）时间量添加到给定的日历字段中。 |
| ---- | ------------------------------------------------------------ |
| 2    | **Date getTime()** 获取日历当前时间                          |

### Day3.4 正则表达式

java.util.regex 包主要包括以下三个类：

- Pattern 类：

  pattern 对象是一个正则表达式的编译表示。Pattern 类没有公共构造方法。要创建一个 Pattern 对象，你必须首先调用其公共静态编译方法，它返回一个 Pattern 对象。该方法接受一个正则表达式作为它的第一个参数。

- Matcher 类：

  Matcher 对象是对输入字符串进行解释和匹配操作的引擎。与Pattern 类一样，Matcher 也没有公共构造方法。你需要调用 Pattern 对象的 matcher 方法来获得一个 Matcher 对象。

- PatternSyntaxException：

  PatternSyntaxException 是一个非强制异常类，它表示一个正则表达式模式中的语法错误。

```java
import java.util.regex.*;
 
class RegexExample1{
   public static void main(String[] args){
      String content = "I am noob " +
        "from runoob.com.";
 
      String pattern = ".*runoob.*";
 
      boolean isMatch = Pattern.matches(pattern, content);
      System.out.println("字符串中是否包含了 'runoob' 子字符串? " + isMatch);
   }
}
```

#### 捕获组

捕获组是把多个字符当一个单独单元进行处理的方法，它通过对括号内的字符分组来创建。

这个示例的正则表达式是 `"(\\D*)(\\d+)(.*)"`，它用于匹配包含非数字字符、数字字符和剩余字符的文本。

```java
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexMatches {
    public static void main(String[] args) {

        // 在字符串中查找匹配项的文本
        String line = "This order was placed for QT3000! OK?";
        String pattern = "(\\D*)(\\d+)(.*)";

        // 创建 Pattern 对象，用于编译正则表达式
        Pattern r = Pattern.compile(pattern);

        // 创建 matcher 对象，用于执行匹配操作
        Matcher m = r.matcher(line);

        // 使用 find() 方法查找匹配项
        if (m.find()) {
            System.out.println("Found value: " + m.group(0)); // 打印整个匹配项
            System.out.println("Found value: " + m.group(1)); // 打印第一个捕获组，即非数字字符部分
            System.out.println("Found value: " + m.group(2)); // 打印第二个捕获组，即数字字符部分
            System.out.println("Found value: " + m.group(3)); // 打印第三个捕获组，即剩余字符部分
        } else {
            System.out.println("NO MATCH");
        }
    }
}

```

### 正则表达式语法

在其他语言中，**\\** 表示：**我想要在正则表达式中插入一个普通的（字面上的）反斜杠，请不要给它任何特殊的意义。**

在 Java 中，**\\** 表示：**我要插入一个正则表达式的反斜线，所以其后的字符具有特殊的意义。**

所以，在其他的语言中（如 Perl），一个反斜杠\\就足以具有转义的作用，而在 Java 中正则表达式中则需要有两个反斜杠才能被解析为其他语言中的转义作用。也可以简单的理解在 Java 的正则表达式中，两个 **\\** 代表其他语言中的一个 **，这也就是为什么表示一位数字的正则表达式是 \\d**，而表示一个普通的反斜杠是 \\\\。

```java
System.out.print("\\");    // 输出为 \
System.out.print("\\\\");  // 输出为 \\
```





