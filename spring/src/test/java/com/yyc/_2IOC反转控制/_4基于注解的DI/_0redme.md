### 1. 实现步骤：
   1. 加入依赖
   2. 创建类，在类中加入注解
   3. 创建spring的配置文件 声明组件扫描器的标签，指名注解在你的项目的中的位置。
   4. 使用注解创建对象， 创建容器ApplicationContext

### 2. 扫描组件(扫描注解)

```xml
<!--声明组件扫描器(component-scan),组件就是java对象
        base-package：指定注解在你的项目中的包名。
        component-scan工作方式： spring会扫描遍历base-package指定的包，
           把包中和子包中的所有类，找到类中的注解，按照注解的功能创建对象，或给属性赋值。

       加入了component-scan标签，配置文件的变化：
        1.加入一个新的约束文件spring-context.xsd
        2.给这个新的约束文件起个命名空间的名称
    -->
    <context:component-scan base-package="com.yyc.entity" />

    <!--指定多个包的三种方式-->
    <!--第一种方式：使用多次组件扫描器，指定不同的包-->
    <context:component-scan base-package="com.yyc.dao"/>
    <context:component-scan base-package="com.yyc.service"/>

    <!--第二种方式：使用分隔符（;或,）分隔多个包名-->
    <context:component-scan base-package="com.yyc.dao;com.yyc.service" />

    <!--第三种方式：指定父包-->
    <context:component-scan base-package="com.yyc" />

```

### 3. 创建对象的常用注解

 1. @Component(value = "id") -----> `<bean id=""/> `

    * @Component(value = "myStudent") //使用value属性，指定对象名称
    * @Component("myStudent") //省略value
    * @Component//不指定对象名称，由spring提供默认名称: 类名的首字母小写

2. `@Repository`（用在持久层类的上面） : 放在dao的实现类上面，
              表示创建dao对象，dao对象是能访问数据库的。
3. `@Service`(用在业务层类的上面)：放在service的实现类上面，
             创建service对象，service对象是做业务处理，可以有事务等功能的。
4. `@Controller`(用在控制器的上面)：放在控制器（处理器）类的上面，创建控制器对象的，
             控制器对象，能够接受用户提交的参数，显示请求的处理结果。
> 以上三个注解的使用语法和@Component一样的。 都能创建对象，但是这三个注解还有额外的功能。
`@Repository`，`@Service`，`@Controller`是给项目的对象分层的

### 4. 基本类型赋值 和 引用类型赋值


1. 基本类型
   * `@Value`使用范围:属性或方法
2. 引用类型
   * `@Autowired` 使用范围:属性或方法
     * required属性 --ture 赋值失败报错,程序中止 --> `推荐`
     * required属性  --false 赋值失败 引用类型为null
     > 通过 byType 赋值
   * `@Qualifier(value="bean的id")` 使用范围:属性或方法
     > 通过byName赋值
     
   * `@resource`来自jdk的注解 
     > byName?byName:byType




