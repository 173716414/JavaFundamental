## Day15

Java 8 API添加了一个新的抽象称为流Stream，可以让你以一种声明的方式处理数据。

Stream 使用一种类似用 SQL 语句从数据库查询数据的直观方式来提供一种对 Java 集合运算和表达的高阶抽象。

Stream API可以极大提高Java程序员的生产力，让程序员写出高效率、干净、简洁的代码。

这种风格将要处理的元素集合看作一种流， 流在管道中传输， 并且可以在管道的节点上进行处理， 比如筛选， 排序，聚合等。

元素流在管道中经过中间操作（intermediate operation）的处理，最后由最终操作(terminal operation)得到前面处理的结果。

```
+--------------------+       +------+   +------+   +---+   +-------+
| stream of elements +-----> |filter+-> |sorted+-> |map+-> |collect|
+--------------------+       +------+   +------+   +---+   +-------+
```

以上的流程转换为 Java 代码为：

```java
List<Integer> transactionsIds = 
widgets.stream()
             .filter(b -> b.getColor() == RED)
             .sorted((x,y) -> x.getWeight() - y.getWeight())
             .mapToInt(Widget::getWeight)
             .sum();
```

### 什么是 Stream？

Stream（流）是一个来自数据源的元素队列并支持聚合操作

- 元素是特定类型的对象，形成一个队列。 Java中的Stream并不会存储元素，而是按需计算。
- **数据源** 流的来源。 可以是集合，数组，I/O channel， 产生器generator 等。
- **聚合操作** 类似SQL语句一样的操作， 比如filter, map, reduce, find, match, sorted等。

和以前的Collection操作不同， Stream操作还有两个基础的特征：

- **Pipelining**: 中间操作都会返回流对象本身。 这样多个操作可以串联成一个管道， 如同流式风格（fluent style）。 这样做可以对操作进行优化， 比如延迟执行(laziness)和短路( short-circuiting)。
- **内部迭代**： 以前对集合遍历都是通过Iterator或者For-Each的方式, 显式的在集合外部进行迭代， 这叫做外部迭代。 Stream提供了内部迭代的方式， 通过访问者模式(Visitor)实现。

### 生成流

在 Java 8 中, 集合接口有两个方法来生成流：

- **stream()** − 为集合创建串行流。
- **parallelStream()** − 为集合创建并行流。

```java
List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
List<String> filtered = strings
    .stream()
    .filter(string -> !string.isEmpty())
    .collect(Collectors.toList());
```

### forEach

Stream 提供了新的方法 'forEach' 来迭代流中的每个数据。

### map

map 方法用于映射每个元素到对应的结果

### filter

filter 方法用于通过设置的条件过滤出元素。

### limit

limit 方法用于获取指定数量的流。

### sorted

sorted 方法用于对流进行排序。

### 并行（parallel）程序

parallelStream 是流并行处理程序的代替方法。

### Collectors

Collectors 类实现了很多归约操作，例如将流转换成集合和聚合元素。

### 统计

另外，一些产生统计结果的收集器也非常有用。



## Java 8 日期时间 API

Java 8 在 **java.time** 包下提供了很多新的 API。以下为两个比较重要的 API：

- **Local(本地)** − 简化了日期时间的处理，没有时区的问题。
- **Zoned(时区)** − 通过制定的时区处理日期时间。

新的java.time包涵盖了所有处理日期，时间，日期/时间，时区，时刻（instants），过程（during）与时钟（clock）的操作。



## runnoob错题：

以下代码输出正确的是？

```java
public class Test {
    public static void main(String[] args) {
        String s1 = "runoob";
        String s2 = "runoob";
        System.out.println("s1 == s2 is:" + s1 == s2);
    }
}
```

1. true
2.  s1 == s2 is:false
3.  s1 == s2 is:true
4.  false

输出结果为 **false**。

因为在 Java 中 + 操作符的优先级大于 ==，所以输出部分表达式等于 **“s1 == s2 is:runoob”** == **“runoob”**，该表达式计算结果为 false。



以下代码输出结果为：

```java
public class IfTest{
    public static void main(String[] args){
        int x=3;
        int y=1;
        if(x=y)
            System.out.println("不相等");
        else
            System.out.println("相等");
     }
}
```

1. 不相等
2.  相等
3.  第五行代码会引起编译错误
4.  程序正常执行，但没有输出结果

if() 语句括号中为比较表达式，返回值要么是 true，要么是 false，if(x=y) 是将 y 赋值给 x，但是数据类型是 int 类型的，编译不能通过。



以下代码输出结果为？

```java
public class Test {
    public static void main(String[] args) {
        char c = 65;
        System.out.println("c = "+c);
    }
}
```

c = A



以下代码输出结果为？

```java
class Test
{
    public static void main(String[] args)
    {
        StringBuffer a = new StringBuffer("Runoob");
        StringBuffer b = new StringBuffer("Google");
        a.delete(1,3);
        a.append(b);
        System.out.println(a);
    }
}
```

delete(x, y) 删除从字符串 x 的索引位置开始到 y-1 的位置，append() 函数用于连接字符串。



**Java 中 float 类型的在内存中的大小为多少字节？**

​	4个字节

**Java 中局部变量不一定要初始化？**

​	Java 实例变量不需要初始化，局部变量必须初始化。

**Math.round(3.7) 输出结果为？**

​	round 表示”四舍五入”，算法为Math.floor(x+0.5) ，即将原来的数字加上 0.5 后再向下取整，所以 Math.round(11.5) 的结果为 12，**Math.round(-11.5) 的结果为 -11**。

**线程结束后可以重新 start 吗？**

​	线程属于一次性消耗品，在执行完 run() 方法之后线程便会正常结束了，线程结束后便会销毁，不能再次 start，只能重新建立新的线程对象。

**所有异常类的基类是？**

​	**Java.Lang.throwable**

java 中小数为浮点型类型 ，**默认为 double 。**

**空引用可用于访问静态变量或方法 ？**

​	当我们通过一个对象的引用访问静态成员属性或者方法时 ，访问操作只与所声明的引用类型相关 ；与引用对象是否为 null 无关 ，因为访问静态成员不需要实例化对象 ；即便引用不为 null ，也与运行时多态无关 ，因为静态成员是类相关的 

**你可以将布尔值与整数进行比较吗 ？**

​	boolean 类型不能转换成任何其它数据类型。

**基础数据类型在堆栈上分配？**

​	基本类型类型以及对象的引用变量是存储在栈内存中 ；而对象本身的值或者说 new 创建的对象和数组是存储在堆内存中。

**以下代码将导致：**

```java
int num = 6.7
```

**编译错误**

小数类型转为整数类型，小数可能被舍弃，所有出现精度损失，所以需要强制转换。

**以下输出是什么 ？**

```java
class TestIt
{
    public static void main ( String[] args )
    {
        int[] myArray = {1, 2, 3, 4, 5};
        ChangeIt.doIt( myArray );
        for(int j=0; j<myArray.length; j++)
            System.out.print( myArray[j] + " " );
    }
}
class ChangeIt
{
    static void doIt( int[] z ) 
    {
        z = null ;
    }
}
```

 **1 2 3 4 5**

引用传递也是一种值传递，并不会修改原来的引用的值，即 myArray 引用的值没有变化，还是和原来一样；但是由于引用传递传递的是引用数据在堆中的地址，因此可以通过引用传递修改引用数据类型在堆中的值，**但是引用传递并不能修改原来的引用的值**。



**以下代码输出结果为：**

```java
class Main {
    public static void main(String args[]) { 
        System.out.println(fun());
    } 

    int fun()
    {
        return 20;
    }
}
```

Main 类中 main() 是一个静态函数， fun() 是一个非静态函数， Java 静态函数中不能调用非静态函数的方法。

**以下代码输出结果为：**

```java
public class Main { 
    public static void main(String args[]) { 
       String x = null; 
       giveMeAString(x); 
       System.out.println(x); 
    } 
    static void giveMeAString(String y) 
    { 
       y = "RUNOOB"; 
    } 
}
```

 **null**

Java 中参数通过值传递，所以 x 传到函数中不会影响原来的值。



**Java 函数不允许参数设置默认值。**

```java
static int fun(int x = 0)
    {
        return x;
    }
```

**编程错误**



**clone( ) 方法调用时会生成多个对象的拷贝。 类只有在实现 Cloneable 接口才可以实现克隆。**

```java
class Test implements Cloneable
{
    int a;
 
    Test cloning()
    {
        try
        {
            return (Test) super.clone();
        }
        catch(CloneNotSupportedException e)
        {
            System.out.println("CloneNotSupportedException is caught");
            return this;
        }
    }
}
 
class Main
{
 
    public static void main(String args[])
    {
        Test obj1 = new Test();
        Test obj2;
        obj1.a = 10;
        obj2 = obj1.cloning();
        obj2.a = 20;
 
        System.out.println("obj1.a = " + obj1.a);
        System.out.println("obj2.a = " + obj2.a);
    }
}
```

```java
obj1.a = 10
obj2.a = 20
```



str.toUpperCase() 将字符串小写字母转换为大写字母，但是它**不会改变原始的字符串**。 str.substring(x, y) 返回 ‘x'(包含) 到 **‘y'(不包含)** 位置的字符串。 str.charAt(x) 返回 x 位置的字符。

