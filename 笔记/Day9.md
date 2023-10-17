## Day9

### Java 数据结构

Java工具包提供了强大的数据结构。在Java中的数据结构主要包括以下几种接口和类：

- 枚举（Enumeration）
- 位集合（BitSet）
- 向量（Vector）
- 栈（Stack）
- 字典（Dictionary）
- 哈希表（Hashtable）
- 属性（Properties）

以上这些类是传统遗留的，在Java2中引入了一种新的框架-**集合框架(Collection)**，我们后面再讨论。

### Java Enumeration接口

| **序号** |                         **方法描述**                         |
| :------- | :----------------------------------------------------------: |
| 1        | **boolean hasMoreElements( )**  测试此枚举是否包含更多的元素。 |
| 2        | **Object nextElement( )** 如果此枚举对象至少还有一个可提供的元素，则返回此枚举的下一个元素。 |

```java
import java.util.Vector;
import java.util.Enumeration;
 
public class EnumerationTester {
 
   public static void main(String args[]) {
      Enumeration<String> days;
      Vector<String> dayNames = new Vector<String>();
      dayNames.add("Sunday");
      dayNames.add("Monday");
      dayNames.add("Tuesday");
      dayNames.add("Wednesday");
      dayNames.add("Thursday");
      dayNames.add("Friday");
      dayNames.add("Saturday");
      days = dayNames.elements();
      while (days.hasMoreElements()){
         System.out.println(days.nextElement()); 
      }
   }
}
```

## 位集合（BitSet）

位集合类实现了一组可以单独设置和清除的位或标志。

该类在处理一组布尔值的时候非常有用，你只需要给每个值赋值一"位"，然后对位进行适当的设置或清除，就可以对布尔值进行操作了。

关于该类的更多信息，[请参见位集合（BitSet）](https://www.runoob.com/java/java-bitset-class.html)。

### 向量（Vector）

向量（Vector）类和传统数组非常相似，但是Vector的大小能根据需要动态的变化。

和数组一样，Vector对象的元素也能通过索引访问。

使用Vector类最主要的好处就是在创建对象的时候不必给对象指定大小，它的大小会根据需要动态的变化。

关于该类的更多信息，[请参见向量(Vector)](https://www.runoob.com/java/java-vector-class.html)

Vector 类实现了一个动态数组。和 ArrayList 很相似，但是两者是不同的：

- Vector 是同步访问的。
- Vector 包含了许多传统的方法，这些方法不属于集合框架。

Vector 主要用在事先不知道数组的大小，或者只是需要一个可以改变大小的数组的情况

### Java Stack 类

栈是Vector的一个子类，它实现了一个标准的后进先出的栈。

堆栈只定义了默认构造函数，用来创建一个空栈。 堆栈除了包括由Vector定义的所有方法，也定义了自己的一些方法。

```java
Stack()
```

除了由Vector定义的所有方法，自己也定义了一些方法：

| 序号 | 方法描述                                                     |
| :--- | :----------------------------------------------------------- |
| 1    | boolean empty()  测试堆栈是否为空。                          |
| 2    | Object peek( ) 查看堆栈顶部的对象，但不从堆栈中移除它。      |
| 3    | Object pop( ) 移除堆栈顶部的对象，并作为此函数的值返回该对象。 |
| 4    | Object push(Object element) 把项压入堆栈顶部。               |
| 5    | int search(Object element) 返回对象在堆栈中的位置，以 **1** 为基数。 |

### Java Dictionary 类

------

Dictionary 类是一个抽象类，用来存储键/值对，作用和Map类相似。

给出键和值，你就可以将值存储在Dictionary对象中。一旦该值被存储，就可以通过它的键来获取它。所以和Map一样， Dictionary 也可以作为一个键/值对列表。

Hashtable是原始的java.util的一部分， 是一个Dictionary具体的实现 。

### Java Hashtable 类

然而，Java 2 重构的Hashtable实现了Map接口，因此，Hashtable现在集成到了集合框架中。它和HashMap类很相似，但是它支持同步。

像HashMap一样，Hashtable在哈希表中存储键/值对。当使用一个哈希表，要指定用作键的对象，以及要链接到该键的值。

然后，该键经过哈希处理，所得到的散列码被用作存储在该表中值的索引。

### 属性（Properties）

Properties 继承于 Hashtable.Properties 类表示了一个持久的属性集.属性列表中每个键及其对应值都是一个字符串。

Properties 类被许多Java类使用。例如，在获取环境变量时它就作为System.getProperties()方法的返回值。

Properties 继承于 Hashtable，用于管理配置信息的类。

由于 Properties 继承自 Hashtable 类，因此具有 Hashtable 的所有功能，同时还提供了一些特殊的方法来读取和写入属性文件。

Properties 类常用于存储程序的配置信息，例如数据库连接信息、日志输出配置、应用程序设置等。使用Properties类，可以将这些信息存储在一个文本文件中，并在程序中读取这些信息。

```java
import java.io.*;
import java.util.Properties;

public class PropertiesExample {
    public static void main(String[] args) {
        Properties prop = new Properties();

        try {
            // 读取属性文件
            prop.load(new FileInputStream("config.properties"));

            // 获取属性值
            String username = prop.getProperty("username");
            String password = prop.getProperty("password");

            // 输出属性值
            System.out.println("username: " + username);
            System.out.println("password: " + password);

            // 修改属性值
            prop.setProperty("username", "newUsername");
            prop.setProperty("password", "newPassword");

            // 保存属性到文件
            prop.store(new FileOutputStream("config.properties"), null);

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
```

```java
import java.util.*;
 
public class PropDemo {
 
   public static void main(String args[]) {
      Properties capitals = new Properties();
      Set states;
      String str;
      
      capitals.put("Illinois", "Springfield");
      capitals.put("Missouri", "Jefferson City");
      capitals.put("Washington", "Olympia");
      capitals.put("California", "Sacramento");
      capitals.put("Indiana", "Indianapolis");
 
      // Show all states and capitals in hashtable.
      states = capitals.keySet(); // get set-view of keys
      Iterator itr = states.iterator();
      while(itr.hasNext()) {
         str = (String) itr.next();
         System.out.println("The capital of " +
            str + " is " + capitals.getProperty(str) + ".");
      }
      System.out.println();
 
      // look for state not in list -- specify default
      str = capitals.getProperty("Florida", "Not Found");
      System.out.println("The capital of Florida is "
          + str + ".");
   }
}
```

```bash
The capital of Missouri is Jefferson City.
The capital of Illinois is Springfield.
The capital of Indiana is Indianapolis.
The capital of California is Sacramento.
The capital of Washington is Olympia.

The capital of Florida is Not Found.
```

# Java 集合框架

早在 Java 2 中之前，Java 就提供了特设类。比如：Dictionary, Vector, Stack, 和 Properties 这些类用来存储和操作对象组。

虽然这些类都非常有用，但是它们缺少一个核心的，统一的主题。由于这个原因，使用 Vector 类的方式和使用 Properties 类的方式有着很大不同。 

集合框架被设计成要满足以下几个目标。

- 该框架必须是高性能的。基本集合（动态数组，链表，树，哈希表）的实现也必须是高效的。
- 该框架允许不同类型的集合，以类似的方式工作，具有高度的互操作性。
- 对一个集合的扩展和适应必须是简单的。

为此，整个集合框架就围绕一组标准接口而设计。你可以直接使用这些接口的标准实现，诸如： **LinkedList**, **HashSet**, 和 **TreeSet** 等,除此之外你也可以通过这些接口实现自己的集合。

在Java中，`Iterator`（迭代器）是一个接口，用于遍历集合类（如`List`、`Set`、`Map`等）中的元素。它提供了一种通用的方式来迭代（遍历）集合中的元素，而不需要暴露集合内部的结构。`Iterator`接口定义在`java.util`包中。

`Iterator` 接口定义了以下常用的方法：

1. `boolean hasNext()`: 这个方法检查是否还有下一个元素可以被迭代。如果有下一个元素，则返回 `true`；否则返回 `false`。
2. `E next()`: 这个方法返回下一个元素，并将迭代器的位置移到下一个元素。如果没有下一个元素可迭代，调用 `next()` 方法会引发 `NoSuchElementException` 异常。
3. `void remove()`: 这个方法可选地从集合中删除迭代器最后访问的元素。不是所有的集合都支持此操作，所以通常在使用之前需要检查是否支持。

使用 `Iterator` 可以很方便地遍历各种集合类，如 `ArrayList`、`HashSet` 等。

```java
import java.util.ArrayList;
import java.util.Iterator;

public class IteratorExample {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");

        // 获取 Iterator 对象
        Iterator<String> iterator = list.iterator();

        // 使用 Iterator 遍历集合
        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println(element);
        }
    }
}
```

注意，从 Java 5 开始，引入了增强的 `for-each` 循环（也称为 "for-each" 循环），它提供了更简洁的方式来遍历集合，不需要显式使用 `Iterator`。这是更常见的做法，除非您需要在遍历时删除元素或需要更多的控制。

![集合框架](img/集合框架.gif)

1. **根接口 - Collection**：
   - `java.util.Collection` 接口是Java集合框架的根接口。它定义了一组基本的操作，例如添加、删除、检查元素的存在等。`Collection` 接口有两主要子接口：`Set` 和 `List`。
2. **Set 接口**：
   - `java.util.Set` 接口继承自 `Collection` 接口，它代表一个无序的、不允许重复元素的集合。常见的 `Set` 实现包括 `HashSet`, `LinkedHashSet`, 和 `TreeSet`。
3. **List 接口**：
   - `java.util.List` 接口也继承自 `Collection` 接口，它代表一个有序的、允许重复元素的集合。常见的 `List` 实现包括 `ArrayList`, `LinkedList`, 和 `Vector`。
4. **Queue 接口**：
   - `java.util.Queue` 接口继承自 `Collection` 接口，它代表一个队列数据结构，通常用于实现先进先出（FIFO）的行为。`Queue` 的常见实现包括 `LinkedList` 和 `PriorityQueue`。
5. **Map 接口**：
   - `java.util.Map` 接口代表键-值对的集合，其中每个元素都有一个唯一的键。常见的 `Map` 实现包括 `HashMap`, `LinkedHashMap`, `TreeMap`, 和 `HashTable`。
6. **实现类**：
   - 上述接口都有相应的实现类，用于实际存储和管理数据。例如，`ArrayList`、`HashSet`、`HashMap` 都是集合框架中的常见实现类。
7. **通用类 - Collections**：
   - `java.util.Collections` 类包含了一组静态方法，用于在集合上执行各种操作，如排序、搜索、同步等。
8. **排序 - Comparator 和 Comparable**：
   - `java.util.Comparator` 接口定义了自定义对象的比较规则，可以用于对集合中的元素进行排序。同时，对象可以实现 `java.lang.Comparable` 接口，以指定默认的自然排序规则。
9. **迭代器 - Iterator**：
   - `java.util.Iterator` 接口提供了一种通用的方式来遍历集合中的元素。它可以应用于所有实现 `Collection` 接口的类。
10. **并发集合 - Concurrent Collections**：
    - Java还提供了一组并发集合类，用于多线程环境中安全地存储和访问数据。这包括 `ConcurrentHashMap`、`CopyOnWriteArrayList`、`BlockingQueue` 等。

从上面的集合框架图可以看到，Java 集合框架主要包括两种类型的容器，一种是集合（Collection），存储一个元素集合，另一种是映射（Map），存储键/值对映射。Collection 接口又有 3 种子类型，List、Set 和 Queue，再下面是一些抽象类，最后是具体实现类，常用的有 [ArrayList](https://www.runoob.com/java/java-arraylist.html)、[LinkedList](https://www.runoob.com/java/java-linkedlist.html)、[HashSet](https://www.runoob.com/java/java-hashset.html)、LinkedHashSet、[HashMap](https://www.runoob.com/java/java-hashmap.html)、LinkedHashMap 等等。

集合框架是一个用来代表和操纵集合的统一架构。所有的集合框架都包含如下内容：

- **接口：**是代表集合的抽象数据类型。例如 Collection、List、Set、Map 等。之所以定义多个接口，是为了以不同的方式操作集合对象
- **实现（类）：**是集合接口的具体实现。从本质上讲，它们是可重复使用的数据结构，例如：ArrayList、LinkedList、HashSet、HashMap。
- **算法：**是实现集合接口的对象里的方法执行的一些有用的计算，例如：搜索和排序，这些算法实现了多态，那是因为相同的方法可以在相似的接口上有着不同的实现。

![java-coll-2020-11-16](img/java-coll-2020-11-16.png)

| 序号 | 接口描述                                                     |
| :--- | :----------------------------------------------------------- |
| 1    | Collection 接口 Collection 是最基本的集合接口，一个 Collection 代表一组 Object，即 Collection 的元素, Java不提供直接继承自Collection的类，只提供继承于的子接口(如List和set)。Collection 接口存储一组不唯一，无序的对象。 |
| 2    | List 接口 List接口是一个有序的 Collection，使用此接口能够精确的控制每个元素插入的位置，能够通过索引(元素在List中位置，类似于数组的下标)来访问List中的元素，第一个元素的索引为 0，而且允许有相同的元素。List 接口存储一组不唯一，有序（插入顺序）的对象。 |
| 3    | Set Set 具有与 Collection 完全一样的接口，只是行为上不同，Set 不保存重复的元素。Set 接口存储一组唯一，无序的对象。 |
| 4    | SortedSet 继承于Set保存有序的集合。                          |
| 5    | Map Map 接口存储一组键值对象，提供key（键）到value（值）的映射。 |
| 6    | Map.Entry 描述在一个Map中的一个元素（键/值对）。是一个 Map 的内部接口。 |
| 7    | SortedMap 继承于 Map，使 Key 保持在升序排列。                |
| 8    | Enumeration 这是一个传统的接口和定义的方法，通过它可以枚举（一次获得一个）对象集合中的元素。这个传统接口已被迭代器取代。 |

### Set和List的区别

1. Set 接口实例存储的是**无序的**，**不重复**的数据。List 接口实例存储的是**有序的**，**可以重复**的元素。
2. Set **检索效率低下**，删除和插入效率高，插入和删除不会引起元素位置改变 **<实现类有HashSet,TreeSet>**。
3. List 和数组类似，可以动态增长，根据实际存储的数据的长度自动增长 List 的长度。查找元素效率高，**插入删除效率低**，因为会引起其他元素位置改变 **<实现类有ArrayList,LinkedList,Vector>** 。

## 集合实现类（集合类）

Java提供了一套实现了Collection接口的标准集合类。其中一些是具体类，这些类可以直接拿来使用，而另外一些是抽象类，提供了接口的部分实现。

标准集合类汇总于下表：

| 序号 | 类描述                                                       |
| :--- | :----------------------------------------------------------- |
| 1    | **AbstractCollection**  实现了大部分的集合接口。             |
| 2    | **AbstractList**  继承于AbstractCollection 并且实现了大部分List接口。 |
| 3    | **AbstractSequentialList**  继承于 AbstractList ，提供了对数据元素的链式访问而不是随机访问。 |
| 4    | [LinkedList](https://www.runoob.com/java/java-linkedlist.html) 该类实现了List接口，允许有null（空）元素。主要用于创建链表数据结构，**该类没有同步方法，如果多个线程同时访问一个List，则必须自己实现访问同步，解决方法就是在创建List时候构造一个同步的List**。例如：`List list=Collections.synchronizedList(newLinkedList(...));`LinkedList 查找效率低。 |
| 5    | [ArrayList](https://www.runoob.com/java/java-arraylist.html) 该类也是实现了List的接口，实现了可变大小的数组，随机访问和遍历元素时，提供更好的性能。**该类也是非同步的,在多线程的情况下不要使用。ArrayList 增长当前长度的50%，插入删除效率低。** |
| 6    | **AbstractSet**  继承于AbstractCollection 并且实现了大部分Set接口。 |
| 7    | [HashSet](https://www.runoob.com/java/java-hashset.html) 该类实现了Set接口，不允许出现重复元素，不保证集合中元素的顺序，**允许包含值为null的元素**，但**最多只能一个**。 |
| 8    | LinkedHashSet 具有可预知迭代顺序的 `Set` 接口的哈希表和链接列表实现。 |
| 9    | TreeSet 该类实现了Set接口，可以实现排序等功能。              |
| 10   | **AbstractMap**  实现了大部分的Map接口。                     |
| 11   | [HashMap](https://www.runoob.com/java/java-hashmap.html) HashMap 是一个散列表，它存储的内容是键值对(key-value)映射。 该类实现了Map接口，**根据键的HashCode值存储数据，具有很快的访问速度，最多允许一条记录的键为null，不支持线程同步。** |
| 12   | TreeMap 继承了AbstractMap，并且使用一颗树。                  |
| 13   | WeakHashMap 继承AbstractMap类，使用弱密钥的哈希表。          |
| 14   | LinkedHashMap 继承于HashMap，**使用元素的自然顺序对元素进行排序。** |
| 15   | IdentityHashMap 继承AbstractMap类，比较文档时使用引用相等。  |

## 集合算法

集合框架定义了几种算法，可用于集合和映射。这些算法被定义为集合类的静态方法。

在尝试比较不兼容的类型时，一些方法能够抛出 ClassCastException异常。当试图修改一个不可修改的集合时，抛出UnsupportedOperationException异常。

1. **排序（Sorting）**：
   - `Collections.sort(List<T> list)`: 用于对列表中的元素进行自然排序。
   - `Collections.sort(List<T> list, Comparator<? super T> c)`: 用于使用自定义比较器对列表中的元素进行排序。
   - `List.sort(Comparator<? super T> c)`: 用于使用自定义比较器对列表中的元素进行排序（Java 8+）。
2. **二分查找（Binary Search）**：
   - `Collections.binarySearch(List<? extends Comparable<? super T>> list, T key)`: 用于在已排序的列表中执行二分查找。
3. **洗牌（Shuffling）**：
   - `Collections.shuffle(List<?> list)`: 用于随机打乱列表中的元素的顺序。
4. **反转（Reversing）**：
   - `Collections.reverse(List<?> list)`: 用于颠倒列表中元素的顺序。
5. **复制（Copying）**：
   - `Collections.copy(List<? super T> dest, List<? extends T> src)`: 用于将一个列表的元素复制到另一个列表。
6. **查找极值（Finding Extremum）**：
   - `Collections.max(Collection<? extends T> coll)`: 用于查找集合中的最大元素。
   - `Collections.min(Collection<? extends T> coll)`: 用于查找集合中的最小元素。
7. **替换所有（Replacing All）**：
   - `Collections.replaceAll(List<T> list, T oldVal, T newVal)`: 用于将列表中的所有旧值替换为新值。
8. **频率统计（Frequency Counting）**：
   - `Collections.frequency(Collection<?> c, Object o)`: 用于统计集合中指定元素的出现频率。
9. **添加所有（Adding All）**：
   - `Collections.addAll(Collection<? super T> c, T... elements)`: 用于将一组元素添加到集合中。
10. **集合的交集、并集和差集（Set Operations）**：
    - `boolean Collections.disjoint(Collection<?> c1, Collection<?> c2)`: 用于检查两个集合是否没有交集。
    - `void Collections.addAll(Collection<? super T> c, T... elements)`: 用于将多个元素添加到集合中。
    - `boolean Collections.addAll(Collection<? super T> c, T... elements)`: 用于将多个元素添加到集合中。
    - `boolean Collections.addAll(Collection<? super T> c, T... elements)`: 用于将多个元素添加到集合中。
    - `boolean Collections.addAll(Collection<? super T> c, T... elements)`: 用于将多个元素添加到集合中。

```java
List<String> colors = Arrays.asList("Red", "Blue", "Green", "Red", "Blue");
int redFrequency = Collections.frequency(colors, "Red");
```

## 如何使用迭代器

通常情况下，你会希望遍历一个集合中的元素。例如，显示集合中的每个元素。

一般遍历数组都是采用for循环或者增强for，这两个方法也可以用在集合框架，但是还有一种方法是采用迭代器遍历集合框架，它是一个对象，实现了[Iterator](https://www.runoob.com/java/java-iterator.html) 接口或 ListIterator接口。

```java
import java.util.*;
 
public class Test{
 public static void main(String[] args) {
     List<String> list=new ArrayList<String>();
     list.add("Hello");
     list.add("World");
     list.add("HAHAHAHA");
     //第一种遍历方法使用 For-Each 遍历 List
     for (String str : list) {            //也可以改写 for(int i = 0; i < list.size(); i++) 这种形式
        System.out.println(str);
     }
 
     //第二种遍历，把链表变为数组相关的内容进行遍历
     String[] strArray=new String[list.size()];
     list.toArray(strArray);
     for(int i=0;i<strArray.length;i++) //这里也可以改写为  for(String str:strArray) 这种形式
     {
        System.out.println(strArray[i]);
     }
     
    //第三种遍历 使用迭代器进行相关遍历
     
     Iterator<String> ite=list.iterator();
     while(ite.hasNext())//判断下一个元素之后有值
     {
         System.out.println(ite.next());
     }
 }
}
```

### 遍历 Map

```java
import java.util.*;
 
public class Test{
     public static void main(String[] args) {
      Map<String, String> map = new HashMap<String, String>();
      map.put("1", "value1");
      map.put("2", "value2");
      map.put("3", "value3");
      
      //第一种：普遍使用，二次取值
      System.out.println("通过Map.keySet遍历key和value：");
      for (String key : map.keySet()) {
       System.out.println("key= "+ key + " and value= " + map.get(key));
      }
      
      //第二种
      System.out.println("通过Map.entrySet使用iterator遍历key和value：");
      Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();
      while (it.hasNext()) {
       Map.Entry<String, String> entry = it.next();
       System.out.println("key= " + entry.getKey() + " and value= " + entry.getValue());
      }
      
      //第三种：推荐，尤其是容量大时
      System.out.println("通过Map.entrySet遍历key和value");
      for (Map.Entry<String, String> entry : map.entrySet()) {
       System.out.println("key= " + entry.getKey() + " and value= " + entry.getValue());
      }
    
      //第四种
      System.out.println("通过Map.values()遍历所有的value，但不能遍历key");
      for (String v : map.values()) {
       System.out.println("value= " + v);
      }
     }
}
```

## 总结

Java集合框架为程序员提供了预先包装的数据结构和算法来操纵他们。

集合是一个对象，可容纳其他对象的引用。集合接口声明对每一种类型的集合可以执行的操作。

集合框架的类和接口均在java.util包中。

任何对象加入集合类后，自动转变为Object类型，所以在取出的时候，需要进行强制类型转换。

在Java中，集合类（例如`ArrayList`、`List`, `Set`, `Map` 等）是泛型的，这意味着您可以指定集合存储的元素类型。当您添加对象到一个泛型集合时，这些对象的类型信息会被保留，并不会自动转变为 `Object` 类型。因此，取出元素时通常不需要进行强制类型转换，因为编译器会确保类型安全。