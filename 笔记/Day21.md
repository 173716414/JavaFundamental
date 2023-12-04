## Day21

### 分层解耦

三层架构拆分

单一职责原则

controller service dao

图片：

在Dao和Service中创建接口和实现类

面向接口方式编程

在service中创建对应dao对象并调用对应方法

最终编写controller层代码 



maven相关

**artifactId**

　　可以认为是Maven构建的项目名，比如你的项目中有子项目，就可以使用"项目名-子项目名"的命名方式

**version**

　　版本号，SNAPSHOT意为快照，说明该项目还在开发中，是不稳定的版本。在Maven中很重要的一点是，**groupId、artifactId、version三个元素生成了一个Maven项目的基本坐标**

**properties**

　　properties是用来定义一些配置属性的，例如project.build.sourceEncoding（项目构建源码编码方式），可以设置为UTF-8，防止中文乱码，也可定义相关构建版本号，便于日后统一升级。

Maven的目录结构：

- main目录下是项目的主要代码，test目录下存放测试相关的代码
- 编译输出后的代码会放在target目录下
- src/main/java下存放Java代码，src/main/resources下存放配置文件
- Web项目会有webapp目录，webapp下存放Web应用相关代码
- pom.xml是Maven项目的配置文件

### Maven多模块项目

　　Maven多模块项目,适用于一些比较大的项目，通过合理的模块拆分，实现代码的复用，便于维护和管理。尤其是一些开源框架，也是采用多模块的方式，提供插件集成，用户可以根据需要配置指定的模块。

项目结构如下：

 　　　　test-hd-parent 　(父级)
    　　　　 ---pom.xml
    　　　　 ---test-hd-api  　　  (第三方接口层)
       　　　　　 ----pom.xml   
  　　　　　 ---test-hd-foundation   (基础工具层)
       　　　　　 ----pom.xml
    　　　　 ---test-hd-resource　  (资源层) 
        　　　　　　----pom.xml
    　　　　 ---test-hd-service 　　  (逻辑业务层)
       　　　　　 ----pom.xml
  　　　　　  ---test-hd-modules 　　 (web层)
       　　　　　　----pom.xml
   　　　 　　 　　---test-hd-www  　 　　(web模块1)
         　　　　　 　　 ----pom.xml
   　　　 　　 　　---test-hd-admin 　  　　(web模块2)
         　　　　　 　　 ----pom.xml　　　　　

在parent中指定打包方式为pom

在子模块中指定parent的id和version

在父模块中指定子module

一定要注意打包的plugin

```xml
		  <plugin>
                <groupId>org.apache.maven.plugins</groupId>
                <artifactId>maven-compiler-plugin</artifactId>
                <version>3.8.1</version>
                <configuration>
                    <source>17</source>
                    <target>17</target>
                    <encoding>UTF-8</encoding>
                </configuration>
            </plugin>
```

