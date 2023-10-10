## Day1

### Math & Number

1. ##### Number和基本数据类型关系，以及Number类层次结构

   1. 自动装箱拆箱

      | 包装类    | 基本数据类型 |
      | :-------- | :----------- |
      | Boolean   | boolean      |
      | Byte      | byte         |
      | Short     | short        |
      | Integer   | int          |
      | Long      | long         |
      | Character | char         |
      | Float     | float        |
      | Double    | double       |

   2. 对应关系

      ![OOP_WrapperClass](img/OOP_WrapperClass.png)

2. ##### 常用方法

   Number类（注意以下内容需要在方法内，而非类中定义，方法与字段职责范围定义见最后笔记）

   - **xxxValue() 方法**：这些方法用于将 `Number` 对象转换为不同的数字数据类型。`xxx` 表示具体的数据类型，例如 `intValue()` 将 `Number` 对象转换为 `int`，`doubleValue()` 将 `Number` 对象转换为 `double`。这些方法提供了将 `Number` 对象的值提取为原始数据类型的便捷方式。

   ```java
   javaCopy codeNumber num = 42.5;
   int intValue = num.intValue(); // 将 Number 对象转换为 int 类型的值
   double doubleValue = num.doubleValue(); // 将 Number 对象转换为 double 类型的值
   Double d = new Double(-100.9);
   int i = d.intValue();
   System.out.printf("%d", i);
   ```

   - **compareTo() 方法**：这个方法用于将 `Number` 对象与另一个数字进行比较。它返回一个整数，表示两个数字的比较结果。如果 `Number` 对象小于参数，返回负数；如果相等，返回0；如果大于参数，返回正数。

     ```java
     javaCopy codeNumber num1 = 42.5;
     Number num2 = 30;
     int result = num1.compareTo(num2);
     ```

   - **equals() 方法**：这个方法用于判断 `Number` 对象是否与参数相等。它返回一个布尔值，表示两个对象是否具有相同的值。

     ```java
     javaCopy codeNumber num1 = 42.5;
     Number num2 = 42.5;
     boolean isEqual = num1.equals(num2);
     ```

   - **valueOf() 方法**：这个方法用于返回一个 `Number` 对象，该对象包含指定的内置数据类型的值。它可以用于将原始数据类型转换为 `Number` 对象。

     ```java
     javaCopy codeint intValue = 42;
     Number num = Number.valueOf(intValue); // 返回一个包含 int 值的 Number 对象
     ```

   - **toString() 方法**：这个方法用于以字符串形式返回 `Number` 对象的值。

     ```java
     javaCopy codeNumber num = 42.5;
     String numStr = num.toString(); // 返回字符串 "42.5"
     ```

   - **parseInt() 方法**：`parseInt()` 不是 `Number` 类的方法，它是 `Integer` 类的一个静态方法，用于将字符串解析为 `int` 类型的值。

     ```java
     javaCopy codeString numStr = "42";
     int intValue = Integer.parseInt(numStr); // 将字符串解析为 int 值
     ```

   Math类

   1. **`abs()`**：返回参数的绝对值，即去掉数值的符号。

   2. **`ceil()`**：返回大于等于给定参数的最小整数，返回类型为双精度浮点型。

   3. **`floor()`**：返回小于等于给定参数的最大整数。

   4. **`rint()`**：返回与参数最接近的整数，返回类型为 double。

   5. **`round()`**：表示四舍五入，算法为 `Math.floor(x + 0.5)`，即将原来的数字加上 0.5 后再向下取整。例如，`Math.round(11.5)` 的结果为 12，`Math.round(-11.5)` 的结果为 -11。

   6. **`min()`**：返回两个参数中的最小值。

   7. **`max()`**：返回两个参数中的最大值。

   8. **`exp()`**：返回自然数底数e的参数次方。

   9. **`log()`**：返回参数的自然数底数的对数值。

   10. **`pow()`**：返回第一个参数的第二个参数次方。

   11. **`sqrt()`**：求参数的算术平方根。

       public class MathExamples {
           public static void main(String[] args) {
               // abs() - 返回参数的绝对值
               double absoluteValue = Math.abs(-42.5);
               System.out.println("Absolute Value: " + absoluteValue);

       ```java
       public class MathExamples {
           public static void main(String[] args) {
               // abs() - 返回参数的绝对值
               double absoluteValue = Math.abs(-42.5);
               System.out.println("Absolute Value: " + absoluteValue);
       
               // ceil() - 返回大于等于给定参数的最小整数
               double ceilValue = Math.ceil(42.3);
               System.out.println("Ceil Value: " + ceilValue);
       
               // floor() - 返回小于等于给定参数的最大整数
               double floorValue = Math.floor(42.7);
               System.out.println("Floor Value: " + floorValue);
       
               // rint() - 返回与参数最接近的整数
               double rintValue = Math.rint(42.5);
               System.out.println("Rint Value: " + rintValue);
       
               // round() - 四舍五入
               long roundValue1 = Math.round(11.5);
               long roundValue2 = Math.round(-11.5);
               System.out.println("Round Value 1: " + roundValue1);
               System.out.println("Round Value 2: " + roundValue2);
       
               // min() - 返回两个参数中的最小值
               int minValue = Math.min(30, 20);
               System.out.println("Min Value: " + minValue);
       
               // max() - 返回两个参数中的最大值
               int maxValue = Math.max(30, 20);
               System.out.println("Max Value: " + maxValue);
       
               // exp() - 返回自然数底数e的参数次方
               double expValue = Math.exp(2);
               System.out.println("Exp Value: " + expValue);
       
               // log() - 返回参数的自然数底数的对数值
               double logValue = Math.log(10);
               System.out.println("Log Value: " + logValue);
       
               // pow() - 返回第一个参数的第二个参数次方
               double powValue = Math.pow(2, 3);
               System.out.println("Pow Value: " + powValue);
       
               // sqrt() - 求参数的算术平方根
               double sqrtValue = Math.sqrt(25);
               System.out.println("Square Root Value: " + sqrtValue);
           }
       }
       ```

### 附录

`compareTo` 方法和 `equals` 方法都用于比较两个对象，但它们有不同的用途和行为：

1. **`compareTo` 方法**：

   - `compareTo` 方法通常用于比较两个对象的大小关系，特别是在排序或比较操作中。
   - compareTo方法返回一个整数，表示两个对象之间的比较结果。返回值的含义如下：
     - 如果调用对象小于参数对象，返回负数。
     - 如果调用对象等于参数对象，返回0。
     - 如果调用对象大于参数对象，返回正数。
   - `compareTo` 方法通常在实现了 `Comparable` 接口的类中定义。这个接口要求实现类提供一个比较方法，以便进行对象比较。

   示例：

   ```java
   javaCopy codeInteger num1 = 42;
   Integer num2 = 30;
   int result = num1.compareTo(num2);
   ```

2. **`equals` 方法**：

   - `equals` 方法用于检查两个对象是否相等，即是否具有相同的内容。
   - `equals` 方法返回一个布尔值，如果两个对象相等，则返回 `true`，否则返回 `false`。
   - `equals` 方法通常在 `Object` 类中定义，但它通常会被具体类覆盖以提供对象内容比较的逻辑。

   示例：

   ```java
   javaCopy codeString str1 = "Hello";
   String str2 = "Hello";
   boolean isEqual = str1.equals(str2); // 返回 true，因为两个字符串内容相等
   ```

总结：

- `compareTo` 通常用于比较对象的大小关系，返回一个整数。
- `equals` 用于检查对象的内容是否相等，返回一个布尔值。
- `compareTo` 方法通常在实现了 `Comparable` 接口的类中定义，而 `equals` 方法通常在类中根据需要进行自定义覆盖。

大数怎么处理

在 Java 中，处理大数（超出原始数据类型范围的数值）通常需要使用 Java 的大数库，最常用的是 `java.math.BigInteger` 和 `java.math.BigDecimal` 类。

1. **BigInteger**：`BigInteger` 是用于处理任意精度的整数的类。它允许你表示和执行各种整数运算，而不受原始数据类型的范围限制。以下是一个使用 `BigInteger` 的示例：

```java
javaCopy codeimport java.math.BigInteger;

public class LargeNumbersExample {
    public static void main(String[] args) {
        BigInteger bigInt1 = new BigInteger("123456789012345678901234567890");
        BigInteger bigInt2 = new BigInteger("987654321098765432109876543210");
        
        BigInteger sum = bigInt1.add(bigInt2);
        System.out.println("Sum: " + sum);
    }
}
```

1. **BigDecimal**：`BigDecimal` 用于处理任意精度的浮点数，特别是在需要精确小数计算时很有用。它也可以处理大数，同时保持高精度。以下是一个使用 `BigDecimal` 的示例：

```java
javaCopy codeimport java.math.BigDecimal;

public class LargeDecimalNumbersExample {
    public static void main(String[] args) {
        BigDecimal bigDecimal1 = new BigDecimal("1234.56789");
        BigDecimal bigDecimal2 = new BigDecimal("9876.543210");
        
        BigDecimal product = bigDecimal1.multiply(bigDecimal2);
        System.out.println("Product: " + product);
    }
}
```

这两个类提供了一系列方法，用于执行基本的数学运算，如加法、减法、乘法和除法，同时保持高精度。你可以根据具体的需求使用它们来处理大数。不过需要注意，由于它们是对象而不是原始数据类型，因此在计算时需要使用相应的方法。



java中变量和类的命名规范

在 Java 中，有一些命名规范和约定，用于定义变量、类、方法和其他标识符的名称。这些规范有助于使代码更加可读和一致。以下是一些常见的 Java 命名规范：

### 变量命名规范：

1. **驼峰命名法（Camel Case）**：Java 中的变量名通常使用驼峰命名法，即首字母小写，后续每个单词的首字母大写。例如：`myVariableName`。
2. **有意义的名字**：变量名应该具有描述性，能够清晰地表达其用途。避免使用无意义的名称，如 `x`、`y`、`temp` 等。
3. **不要使用特殊字符**：变量名只能包含字母、数字、下划线（`_`）和美元符号（`$`），但不应该以数字开头。
4. **避免使用关键字**：不要使用 Java 的保留关键字（例如，`if`、`for`、`while` 等）作为变量名。
5. **常量命名**：如果变量是常量，通常使用大写字母和下划线来命名，例如：`MAX_VALUE`。

### 类命名规范：

1. **驼峰命名法**：类名应该采用驼峰命名法，首字母大写，后续每个单词的首字母大写。例如：`MyClassName`。
2. **有意义的名字**：类名应该描述类的用途，且首字母应该大写。

### 方法命名规范：

1. **驼峰命名法**：方法名应该采用驼峰命名法，首字母小写，后续每个单词的首字母大写。例如：`calculateTotal()`。
2. **有意义的名字**：方法名应该清晰地表达其功能。

### 包命名规范：

1. **小写字母**：包名应该使用小写字母。
2. **逆域名（反向域名）**：包名通常采用逆域名的格式，例如：`com.example.myproject`。

### 常量命名规范：

1. **全部大写**：常量名通常使用大写字母，并用下划线分隔单词。例如：`MAX_VALUE`。
2. **静态和 final 修饰符**：常量通常声明为静态（`static`）和不可变（`final`）。

遵循这些命名规范有助于代码的可读性和维护性，并使不同的 Java 程序员更容易理解和合作编写代码。

​			在 Java 类中，字段（field）和方法（method）是两种不同的成员，它们各自具有不同的职责和范围。

### 字段（Field）：

1. **职责**：字段是类中用于存储数据的成员。它们表示了类的属性或状态，并存储了对象的数据。字段的职责通常是描述类的特征性信息，如对象的属性或属性值。

2. **范围**：字段可以具有不同的访问控制修饰符，例如 `private`、`protected`、`public` 或包级私有（默认修饰符）。访问字段的范围取决于其修饰符，但一般情况下，字段可以在类的内部（包括方法内）访问，也可以根据访问修饰符在类的外部进行访问或修改。

3. **示例**：

   ```java
   javaCopy codepublic class Person {
       private String name; // 私有字段
       public int age;      // 公共字段
   
       // 构造方法
       public Person(String name, int age) {
           this.name = name;
           this.age = age;
       }
   
       // Getter 和 Setter 方法用于访问 name 字段
       public String getName() {
           return name;
       }
   
       public void setName(String name) {
           this.name = name;
       }
   }
   ```

### 方法（Method）：

1. **职责**：方法是类中用于执行操作的成员。它们定义了类的行为和功能。方法的职责通常是实现特定的操作或功能，以修改字段的状态或返回结果。

2. **范围**：方法的可见性也受到访问修饰符的控制，可以在类的内部（包括其他方法内）进行调用。同时，根据方法的修饰符，方法可以在类的外部进行访问或调用。公共方法通常用于提供类的外部访问接口。

3. **示例**：

   ```java
   javaCopy codepublic class Person {
       private String name;
       public int age;
   
       public Person(String name, int age) {
           this.name = name;
           this.age = age;
       }
   
       public String getName() {
           return name;
       }
   
       public void setName(String name) {
           this.name = name;
       }
   
       // 示例方法，用于打印个人信息
       public void printInfo() {
           System.out.println("Name: " + name);
           System.out.println("Age: " + age);
       }
   }
   ```

总之，字段用于存储对象的数据，而方法用于定义对象的行为和功能。字段和方法的访问范围取决于其访问修饰符，以及它们在类中的位置和作用域。字段和方法的组合形成了类的属性和操作，共同定义了类的行为和特征。





可以初始化字段内容么

是的，你可以在 Java 类中初始化字段的内容。在 Java 中，字段可以有默认初始值，也可以在字段声明时或构造方法中进行显式初始化。下面是一些示例：

1. 默认初始值：如果你没有显式地为字段赋值，Java 会为字段提供默认初始值。默认初始值取决于字段的数据类型。例如，整数字段默认为0，布尔字段默认为`false`，引用类型字段默认为`null`。

```java
javaCopy codepublic class Person {
    private int age; // 默认初始值为0
    private boolean isStudent; // 默认初始值为false
    private String name; // 默认初始值为null

    // ...
}
```

1. 显式初始化：你可以在字段声明时或构造方法中显式为字段赋初值。这样可以确保字段在创建对象时就具有特定的值。

```java
javaCopy codepublic class Person {
    private int age = 30; // 显式初始化为30
    private String name;

    // 构造方法
    public Person(String name) {
        this.name = name;
    }

    // ...
}
```

1. 静态初始块：对于静态字段，你可以使用静态初始化块来初始化它们。静态初始化块在类加载时执行，并且只执行一次。

```java
javaCopy codepublic class Constants {
    public static final int MAX_VALUE;

    static {
        MAX_VALUE = 100;
    }
}
```

1. 实例初始块：你还可以使用实例初始化块为字段赋初值。实例初始化块在对象创建时执行，并且在构造方法之前执行。

```java
javaCopy codepublic class Person {
    private String name;

    // 实例初始化块
    {
        name = "John";
    }

    // 构造方法
    public Person() {
        // 构造方法可以进一步初始化字段
    }

    // ...
}
```

总之，你可以根据需要选择适当的方式来初始化字段的内容，这取决于字段的特定要求和设计。字段可以有默认初始值，也可以在声明、构造方法或初始化块中显式初始化。



valueOf和parseInt

`Integer.valueOf` 和 `Integer.parseInt` 都用于将字符串转换为整数 (`int`)，但它们之间有几个关键区别：

1. **返回类型**：
   - `Integer.valueOf` 返回一个 `Integer` 对象，即包装类对象。
   - `Integer.parseInt` 返回一个原始的 `int` 数据类型。
2. **异常处理**：
   - `Integer.valueOf` 不会抛出异常，而是返回一个包装类对象，如果无法解析字符串，则返回 `null`。
   - `Integer.parseInt` 可能会抛出 `NumberFormatException` 异常，如果无法解析字符串。
3. **使用场景**：
   - `Integer.valueOf` 更适合在需要将字符串转换为整数并且可以处理 `null` 值的情况下使用，因为它不会抛出异常，而是返回 `null`。
   - `Integer.parseInt` 适合在确定字符串是有效整数的情况下使用，因为它会抛出异常以指示解析错误。

示例：

```java
javaCopy codeString str1 = "42";
String str2 = "abc";

// 使用 Integer.valueOf
Integer intValue1 = Integer.valueOf(str1); // 返回 Integer 对象
Integer intValue2 = Integer.valueOf(str2); // 返回 null，因为字符串无法解析为整数

// 使用 Integer.parseInt
int intValue3 = Integer.parseInt(str1); // 返回 int 值 42
// int intValue4 = Integer.parseInt(str2); // 会抛出 NumberFormatException，因为字符串无法解析为整数
```

总之，如果你希望在无法解析字符串为整数时得到一个空值，可以使用 `Integer.valueOf`，而如果你确定字符串一定是有效整数并希望将其转换为原始 `int` 类型，可以使用 `Integer.parseInt`。在实际应用中，你可以根据需要来选择合适的方法。