## Day8

### Java 包(package)

为了更好地组织类，Java 提供了包机制，用于区别类名的命名空间。

### 包的作用

- 1、把功能相似或相关的类或接口组织在同一个包中，方便类的查找和使用。
- 2、如同文件夹一样，包也采用了树形目录的存储方式。**同一个包中的类名字是不同的，不同的包中的类的名字是可以相同的**，当同时调用两个不同包中相同类名的类时，应该加上包名加以区别。因此，包可以避免名字冲突。
- 3、包也限定了**访问权限**，拥有包访问权限的类才能访问某个包中的类。

Java 使用包（package）这种机制是为了防止命名冲突，访问控制，提供搜索和定位类（class）、接口、枚举（enumerations）和注解（annotation）等。

```java
package pkg1[．pkg2[．pkg3…]];
```

```java
package net.java.util;
public class Something{
   ...
}
```

那么它的路径应该是 **net/java/util/Something.java** 这样保存的。 package(包) 的作用是把不同的 java 程序分类保存，更方便的被其他 java 程序调用。

一个包（package）可以定义为一组相互联系的类型（类、接口、枚举和注释），为这些类型提供访问保护和命名空间管理的功能。

以下是一些 Java 中的包：

- **java.lang**-打包基础的类
- **java.io**-包含输入输出功能的函数

包声明应该在源文件的第一行，每个源文件只能有一个包声明，这个文件中的每个类型都应用于它。

如果一个源文件中没有使用包声明，那么其中的类，函数，枚举，注释等将被放在一个无名的包（unnamed package）中。

让我们来看一个例子，这个例子创建了一个叫做animals的包。通常使用**小写**的字母来命名避免与类、接口名字的冲突。

在 animals 包中加入一个接口（interface）：

```java
/* 文件名: Animal.java */
package animals;
 
interface Animal {
   public void eat();
   public void travel();
}
```

```java
package animals;
 
/* 文件名 : MammalInt.java */
public class MammalInt implements Animal{
 
   public void eat(){
      System.out.println("Mammal eats");
   }
 
   public void travel(){
      System.out.println("Mammal travels");
   } 
 
   public int noOfLegs(){
      return 0;
   }
 
   public static void main(String args[]){
      MammalInt m = new MammalInt();
      m.eat();
      m.travel();
   }
}
```

```bash
$ mkdir animals
$ cp Animal.class  MammalInt.class animals
$ java animals/MammalInt
Mammal eats
Mammal travel
```

## import 关键字

为了能够使用某一个包的成员，我们需要在 Java 程序中明确导入该包。

在 Java 中，**import** 关键字用于导入其他类或包中定义的类型，以便在当前源文件中使用这些类型。

**import** 关键字用于引入其他包中的类、接口或**静态成员**，**它允许你在代码中直接使用其他包中的类，而不需要完整地指定类的包名。**

在 java 源文件中 import 语句**必须位于 Java 源文件的头部**，其语法格式为：

```java
// 第一行非注释行是 package 语句
package com.example;
 
// import 语句引入其他包中的类
import java.util.ArrayList;
import java.util.List;
 
// 类的定义
public class MyClass {
    // 类的成员和方法
}
```

可以使用通配符 ***** 来引入整个包或包的子包：

```java
import com.runoob.mypackage.*;
```

注意，使用通配符 ***** 导入整个包时，只会导入包中的类，而不会导入包中的子包。

```java
import java.util.ArrayList; // 引入 java.util 包中的 ArrayList 类
import java.util.*; // 引入 java.util 包中的所有类

import com.example.MyClass; // 引入 com.example 包中的 MyClass 类
import com.example.*; // 引入 com.example 包中的所有类
```

下面的 payroll 包已经包含了 Employee 类，接下来向 payroll 包中添加一个 Boss 类。Boss 类引用 Employee 类的时候可以不用使用 payroll 前缀，Boss 类的实例如下。

```java
package payroll;
 
public class Boss
{
   public void payEmployee(Employee e)
   {
      e.mailCheck();
   }
}
```

