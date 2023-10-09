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

