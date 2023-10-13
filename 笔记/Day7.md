## Day7

### Java 枚举(enum)

```java
enum Color 
{ 
    RED, GREEN, BLUE; 
} 
  
public class Test 
{ 
    // 执行输出结果
    public static void main(String[] args) 
    { 
        Color c1 = Color.RED; 
        System.out.println(c1); 
    } 
}
```

### 内部类中使用枚举

枚举类也可以声明在内部类中：

```java
public class Test 
{ 
    enum Color 
    { 
        RED, GREEN, BLUE; 
    } 
  
    // 执行输出结果
    public static void main(String[] args) 
    { 
        Color c1 = Color.RED; 
        System.out.println(c1); 
    } 
}
```

### 迭代枚举元素

可以使用 for 语句来迭代枚举元素：

```java
enum Color 
{ 
    RED, GREEN, BLUE; 
} 
public class MyClass { 
  public static void main(String[] args) { 
    for (Color myVar : Color.values()) {
      System.out.println(myVar);
    }
  } 
}
```

### values(), ordinal() 和 valueOf() 方法

enum 定义的枚举类默认继承了 java.lang.Enum 类，并实现了 java.lang.Serializable 和 java.lang.Comparable 两个接口。

values(), ordinal() 和 valueOf() 方法位于 java.lang.Enum 类中：

- values() 返回枚举类中所有的值。
- ordinal()方法可以找到每个枚举常量的索引，就像数组索引一样。
- valueOf()方法返回指定字符串值的枚举常量。

```java
enum Color 
{ 
    RED, GREEN, BLUE; 
} 
  
public class Test 
{ 
    public static void main(String[] args) 
    { 
        // 调用 values() 
        Color[] arr = Color.values(); 
  
        // 迭代枚举
        for (Color col : arr) 
        { 
            // 查看索引
            System.out.println(col + " at index " + col.ordinal()); 
        } 
  
        // 使用 valueOf() 返回枚举常量，不存在的会报错 IllegalArgumentException 
        System.out.println(Color.valueOf("RED")); 
        // System.out.println(Color.valueOf("WHITE")); 
    } 
}
```

### 枚举类成员

枚举跟普通类一样可以用自己的变量、方法和构造函数，构造函数只能使用 private 访问修饰符，所以外部无法调用。

枚举既可以包含具体方法，也可以包含抽象方法。 如果枚举类具有抽象方法，则枚举类的每个实例都必须实现它。

```java
enum Color 
{ 
    RED, GREEN, BLUE; 
  
    // 构造函数
    private Color() 
    { 
        System.out.println("Constructor called for : " + this.toString()); 
    } 
  
    public void colorInfo() 
    { 
        System.out.println("Universal Color"); 
    } 
} 
  
public class Test 
{     
    // 输出
    public static void main(String[] args) 
    { 
        Color c1 = Color.RED; 
        System.out.println(c1); 
        c1.colorInfo(); 
    } 
}
```

执行以上代码输出结果为：

```
Constructor called for : RED
Constructor called for : GREEN
Constructor called for : BLUE
RED
Universal Color
```

