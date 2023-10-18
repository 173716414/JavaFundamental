## Day10

## Java ArrayList

![ArrayList-1-768x406-1](img/ArrayList-1-768x406-1.png)

```java
import java.util.ArrayList; // 引入 ArrayList 类

ArrayList<E> objectName =new ArrayList<>();　 // 初始化
```

- **E**: 泛型数据类型，用于设置 objectName 的数据类型，**只能为引用数据类型**。
- **objectName**: 对象名。

### 添加元素

ArrayList 类提供了很多有用的方法，添加元素到 ArrayList 可以使用 add() 方法:

```java
import java.util.ArrayList;

public class RunoobTest {
    public static void main(String[] args) {
        ArrayList<String> sites = new ArrayList<String>();
        sites.add("Google");
        sites.add("Runoob");
        sites.add("Taobao");
        sites.add("Weibo");
        System.out.println(sites);
    }
}
```

### 访问元素

访问 ArrayList 中的元素可以使用 get() 方法：

```java
import java.util.ArrayList;

public class RunoobTest {
    public static void main(String[] args) {
        ArrayList<String> sites = new ArrayList<String>();
        sites.add("Google");
        sites.add("Runoob");
        sites.add("Taobao");
        sites.add("Weibo");
        System.out.println(sites.get(1));  // 访问第二个元素
    }
}
```

### 修改元素

如果要修改 ArrayList 中的元素可以使用 set() 方法：

```java
import java.util.ArrayList;

public class RunoobTest {
    public static void main(String[] args) {
        ArrayList<String> sites = new ArrayList<String>();
        sites.add("Google");
        sites.add("Runoob");
        sites.add("Taobao");
        sites.add("Weibo");
        sites.set(2, "Wiki"); // 第一个参数为索引位置，第二个为要修改的值
        System.out.println(sites);
    }
}
```

### 删除元素

如果要删除 ArrayList 中的元素可以使用 remove() 方法：

```java
import java.util.ArrayList;

public class RunoobTest {
    public static void main(String[] args) {
        ArrayList<String> sites = new ArrayList<String>();
        sites.add("Google");
        sites.add("Runoob");
        sites.add("Taobao");
        sites.add("Weibo");
        sites.remove(3); // 删除第四个元素
        System.out.println(sites);
    }
}
```

### 计算大小

如果要计算 ArrayList 中的元素数量可以使用 size() 方法：

```java
System.out.println(sites.size());
```

### 迭代数组列表

我们可以使用 for 来迭代数组列表中的元素：

```java
for (int i = 0; i < sites.size(); i++) {
            System.out.println(sites.get(i));
}
```

也可以使用 for-each 来迭代元素：

```java
import java.util.ArrayList;

public class RunoobTest {
    public static void main(String[] args) {
        ArrayList<String> sites = new ArrayList<String>();
        sites.add("Google");
        sites.add("Runoob");
        sites.add("Taobao");
        sites.add("Weibo");
        for (String i : sites) {
            System.out.println(i);
        }
    }
}
```

### 其他的引用类型

ArrayList 中的元素实际上是对象，在以上实例中，数组列表元素都是字符串 String 类型。

如果我们要存储其他类型，而 <E> 只能为引用数据类型，这时我们就需要使用到基本类型的包装类。

此外，BigInteger、BigDecimal 用于高精度的运算，BigInteger 支持任意精度的整数，也是引用类型，但它们没有相对应的基本类型。

```java
import java.util.ArrayList;

public class RunoobTest {
    public static void main(String[] args) {
        ArrayList<Integer> myNumbers = new ArrayList<Integer>();
        myNumbers.add(10);
        myNumbers.add(15);
        myNumbers.add(20);
        myNumbers.add(25);
        for (int i : myNumbers) {
            System.out.println(i);
        }
    }
}
```

### ArrayList 排序

Collections 类也是一个非常有用的类，位于 java.util 包中，提供的 sort() 方法可以对字符或数字列表进行排序。

以下实例对字母进行排序：

```java
import java.util.ArrayList;
import java.util.Collections;  // 引入 Collections 类

public class RunoobTest {
    public static void main(String[] args) {
        ArrayList<String> sites = new ArrayList<String>();
        sites.add("Taobao");
        sites.add("Wiki");
        sites.add("Runoob");
        sites.add("Weibo");
        sites.add("Google");
        Collections.sort(sites);  // 字母排序
        for (String i : sites) {
            System.out.println(i);
        }
    }
}
```

```bash
Google
Runoob
Taobao
Weibo
Wiki
```

## Java ArrayList 方法

Java ArrayList 常用方法列表如下：

| 方法                                                         | 描述                                                 |
| :----------------------------------------------------------- | :--------------------------------------------------- |
| [add()](https://www.runoob.com/java/java-arraylist-add.html) | **<u>将元素插入到指定位置的 arraylist 中</u>**       |
| [addAll()](https://www.runoob.com/java/java-arraylist-addall.html) | 添加**<u>集合</u>**中的所有元素到 arraylist 中       |
| [clear()](https://www.runoob.com/java/java-arraylist-clear.html) | **<u>删除 arraylist 中的所有元素</u>**               |
| [clone()](https://www.runoob.com/java/java-arraylist-clone.html) | 复制一份 arraylist                                   |
| [contains()](https://www.runoob.com/java/java-arraylist-contains.html) | **<u>判断元素是否在 arraylist</u>**返回boolen        |
| [get()](https://www.runoob.com/java/java-arraylist-get.html) | **<u>通过索引值获取 arraylist 中的元素</u>**         |
| [indexOf()](https://www.runoob.com/java/java-arraylist-indexof.html) | **<u>返回 arraylist 中元素的索引值</u>**             |
| [removeAll()](https://www.runoob.com/java/java-arraylist-removeall.html) | 删除存在于指定集合中的 arraylist 里的所有元素        |
| [remove()](https://www.runoob.com/java/java-arraylist-remove.html) | **<u>删除 arraylist 里的单个元素</u>**               |
| [size()](https://www.runoob.com/java/java-arraylist-size.html) | <u>**返回 arraylist 里元素数量**</u>                 |
| [isEmpty()](https://www.runoob.com/java/java-arraylist-isempty.html) | **<u>判断 arraylist 是否为空</u>**                   |
| [subList()](https://www.runoob.com/java/java-arraylist-sublist.html) | 截取部分 arraylist 的元素                            |
| [set()](https://www.runoob.com/java/java-arraylist-set.html) | **<u>替换 arraylist 中指定索引的元素</u>**           |
| [sort()](https://www.runoob.com/java/java-arraylist-sort.html) | **<u>对 arraylist 元素进行排序</u>**                 |
| [toArray()](https://www.runoob.com/java/java-arraylist-toarray.html) | **<u>将 arraylist 转换为数组</u>**                   |
| [toString()](https://www.runoob.com/java/java-arraylist-tostring.html) | 将 arraylist 转换为字符串                            |
| [ensureCapacity](https://www.runoob.com/java/java-arraylist-surecapacity.html)() | 设置指定容量大小的 arraylist                         |
| [lastIndexOf()](https://www.runoob.com/java/java-arraylist-lastindexof.html) | 返回指定元素在 arraylist 中最后一次出现的位置        |
| [retainAll()](https://www.runoob.com/java/java-arraylist-retainall.html) | 保留 arraylist 中在指定集合中也存在的那些元素        |
| [containsAll()](https://www.runoob.com/java/java-arraylist-containsall.html) | 查看 arraylist 是否包含指定集合中的所有元素          |
| [trimToSize()](https://www.runoob.com/java/java-arraylist-trimtosize.html) | 将 arraylist 中的容量调整为数组中的元素个数          |
| [removeRange()](https://www.runoob.com/java/java-arraylist-removerange.html) | 删除 arraylist 中指定索引之间存在的元素              |
| [replaceAll()](https://www.runoob.com/java/java-arraylist-replaceall.html) | 将给定的操作内容替换掉数组中每一个元素               |
| [removeIf()](https://www.runoob.com/java/java-arraylist-removeif.html) | 删除所有满足特定条件的 arraylist 元素                |
| [forEach()](https://www.runoob.com/java/java-arraylist-foreach.html) | **<u>遍历 arraylist 中每一个元素并执行特定操作</u>** |

```java
// 排序
arraylist.sort(Comparator c)
sites.sort(Comparator.naturalOrder());
sites.sort(Comparator.reverseOrder());
// 删除指定元素
arraylist.remove(Object obj)

// 删除指定索引位置的元素
arraylist.remove(int index)
    
String[] arr = new String[sites.size()];
// 将ArrayList对象转换成数组
sites.toArray(arr);
// 将 ArrayList 对象转换成数组
// 该方法没有参数
Object[] obj = sites.toArray();
```

