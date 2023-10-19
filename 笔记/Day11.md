## Day11

### Java LinkedList

链表（Linked list）是一种常见的基础数据结构，是一种线性表，但是并不会按线性的顺序存储数据，而是在每一个节点里存到下一个节点的地址。

Java LinkedList（链表） 类似于 ArrayList，是一种常用的数据容器。

与 ArrayList 相比，LinkedList 的增加和删除的操作效率更高，而查找和修改的操作效率较低。

![610px-Doubly-linked-list.svg_](img/610px-Doubly-linked-list.svg_.png)

![610px-Doubly-linked-list.svg_](img/610px-Doubly-linked-list.svg_.png)

**以下情况使用 ArrayList :**

- 频繁**访问**列表中的某一个元素。
- 只需要在列表**末尾**进行添加和删除元素操作。

**以下情况使用 LinkedList :**

- 你需要通过循环迭代来访问列表中的某些元素。
- 需要频繁的在列表开头、中间、末尾等位置进行**添加和删除**元素操作。

LinkedList 继承了 AbstractSequentialList 类。

**LinkedList 实现了 Queue 接口，可作为队列使用。**

LinkedList 实现了 List 接口，可进行列表的相关操作。

**LinkedList 实现了 Deque 接口，可作为双端队列使用。**

LinkedList 实现了 Cloneable 接口，可实现克隆。

LinkedList 实现了 java.io.Serializable 接口，即可支持序列化，能通过序列化去传输。

![linkedlist-2020-11-16](img/linkedlist-2020-11-16.png)

```java
// 引入 LinkedList 类
import java.util.LinkedList; 

LinkedList<E> list = new LinkedList<E>();   // 普通创建方法
或者
LinkedList<E> list = new LinkedList(Collection<? extends E> c); // 使用集合创建链表
```

```java
// 引入 LinkedList 类
import java.util.LinkedList;

public class RunoobTest {
    public static void main(String[] args) {
        LinkedList<String> sites = new LinkedList<String>();
        sites.add("Google");
        sites.add("Runoob");
        sites.add("Taobao");
        // 使用 addFirst() 在头部添加元素
        sites.addFirst("Wiki");
        System.out.println(sites);
        // 使用 addLast() 在尾部添加元素
        sites.addLast("Wiki");
        System.out.println(sites);
        // 使用 removeFirst() 移除头部元素
        sites.removeFirst();
        System.out.println(sites);
        // 使用 removeLast() 移除尾部元素
        sites.removeLast();
        System.out.println(sites);
        // 使用 getFirst() 获取头部元素
        System.out.println(sites.getFirst());
        // 使用 getLast() 获取尾部元素
        System.out.println(sites.getLast());
    }
}
```

### 迭代元素

我们可以使用 for 配合 size() 方法来迭代列表中的元素：

```java
for (int size = sites.size(), i = 0; i < size; i++) {
    System.out.println(sites.get(i));
}
```

也可以使用 for-each 来迭代元素：

```java
for (String i : sites) {
    System.out.println(i);
}
```

| 方法                                           | 描述                                                         |
| :--------------------------------------------- | :----------------------------------------------------------- |
| public **boolean** add(E e)                    | 链表**末尾**添加元素，返回是否成功，成功为 true，失败为 false。 |
| public **void** add(int index, E element)      | **向指定位置插入元素。**                                     |
| public boolean addAll(Collection c)            | 将一个集合的所有元素添加到链表后面，返回是否成功，成功为 true，失败为 false。 |
| public boolean addAll(int index, Collection c) | 将一个集合的所有元素添加到链表的指定位置后面，返回是否成功，成功为 true，失败为 false。 |
| public void addFirst(E e)                      | 元素添加到头部。                                             |
| public void addLast(E e)                       | 元素添加到尾部。                                             |
| public boolean **offer(E e)**                  | 向链表末尾添加元素，返回是否成功，成功为 true，失败为 false。 |
| public boolean offerFirst(E e)                 | 头部插入元素，返回是否成功，成功为 true，失败为 false。      |
| public boolean offerLast(E e)                  | 尾部插入元素，返回是否成功，成功为 true，失败为 false。      |
| public void **clear()**                        | 清空链表。                                                   |
| public E removeFirst()                         | 删除并返回第一个元素。                                       |
| public E removeLast()                          | 删除并返回最后一个元素。                                     |
| public boolean remove(Object o)                | 删除某一元素，返回是否成功，成功为 true，失败为 false。      |
| public E **remove(int index)**                 | 删除指定位置的元素。                                         |
| public E **poll()**                            | 删除并返回第一个元素。                                       |
| public E remove()                              | 删除并返回第一个元素。                                       |
| public boolean **contains(Object o)**          | 判断是否含有某一元素。                                       |
| public E **get(int index)**                    | 返回指定位置的元素。                                         |
| public E getFirst()                            | 返回第一个元素。                                             |
| public E getLast()                             | 返回最后一个元素。                                           |
| public int **indexOf(Object o)**               | 查找指定元素从前往后第一次出现的索引。                       |
| public int **lastIndexOf(Object o)**           | 查找指定元素最后一次出现的索引。                             |
| public E **peek()**                            | 返回第一个元素。                                             |
| public E element()                             | 返回第一个元素。                                             |
| public E peekFirst()                           | 返回头部元素。                                               |
| public E **peekLast()**                        | 返回尾部元素。                                               |
| public E **set(int index, E element)**         | 设置指定位置的元素。                                         |
| public Object clone()                          | 克隆该列表。                                                 |
| public Iterator descendingIterator()           | 返回倒序迭代器。                                             |
| public int **size()**                          | 返回链表元素个数。                                           |
| public ListIterator listIterator(int index)    | 返回从指定位置开始到末尾的迭代器。                           |
| public Object[] toArray()                      | 返回一个由链表元素组成的数组。                               |
| public T[] toArray(T[] a)                      | 返回一个由链表元素转换类型而成的数组。                       |



## Java HashSet

HashSet 基于 HashMap 来实现的，是一个不允许有重复元素的集合。

HashSet 允许有 null 值。

HashSet 是无序的，即不会记录插入的顺序。

HashSet **不是线程安全的**， 如果多个线程尝试同时修改 HashSet，则最终结果是不确定的。 您必须在多线程访问时显式同步对 HashSet 的并发访问。

HashSet 实现了 Set 接口。

![java-hashset-hierarchy](img/java-hashset-hierarchy.png)

```java
import java.util.HashSet; // 引入 HashSet 类
HashSet<String> sites = new HashSet<String>();
```

### 添加元素

HashSet 类提供了很多有用的方法，添加元素可以使用 add() 方法:

```java
sites.add("Runoob");  // 重复的元素不会被添加
```

### 判断元素是否存在

我们可以使用 contains() 方法来判断元素是否存在于集合当中:

```java
System.out.println(sites.contains("Taobao"));
```

### 删除元素

我们可以使用 remove() 方法来删除集合中的元素:

```java
sites.remove("Taobao");  // 删除元素，删除成功返回 true，否则为 false
System.out.println(sites);
```

删除集合中所有元素可以使用 clear 方法

### 计算大小

如果要计算 HashSet 中的元素数量可以使用 size() 方法

### 迭代 HashSet

可以使用 for-each 来迭代 HashSet 中的元素。

### 附录

加载因子（Load Factor）是与哈希表（Hash Table）相关的一个概念，通常用于调整哈希表的性能和内存消耗之间的平衡。

加载因子 = 已使用存储桶数 / 总存储桶数

通常，哈希表的实现会在加载因子达到一定阈值时自动进行扩容，以减少冲突并维持性能。扩容通常会导致存储桶数翻倍，同时重新散列存储桶中的元素。这个过程在时间和内存消耗方面都有开销，因此合适的加载因子选择对于维护哈希表的性能至关重要。

通常，加载因子的典型值是0.7或0.75，但实际选择可能因具体应用和性能需求而有所不同。如果你需要更高的内存利用率，可以选择较高的加载因子，但需要牺牲一些性能。如果性能是首要考虑因素，可以选择较低的加载因子。

| 构造器      | 描述                                                         |
| :---------- | :----------------------------------------------------------- |
| `HashSet()` | 构造一个新的空集; 支持`HashMap`实例具有默认初始容量（16）和加载因子（0.75）。 |