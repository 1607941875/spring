## 第三章 aop

### 1.动态代理
实现方式：jdk动态代理，使用jdk中的Proxy，Method，InvocationHandler创建代理对象。
jdk动态代理要求目标类必须实现接口

cglib动态代理：第三方的工具库，创建代理对象，原理是继承。 通过继承目标类，创建子类。
子类就是代理对象。 要求目标类不能是final的， 方法也不能是final的

### 2.动态代理的作用：
1）在目标类源代码不改变的情况下，增加功能。
2）减少代码的重复
3）专注业务逻辑代码
4）解耦合，让你的业务功能和日志，事务非业务功能分离。

### 3.Aop:面向切面编程， 基于动态代理的，可以使用jdk，cglib两种代理方式。
Aop就是动态代理的规范化， 把动态代理的实现步骤，方式都定义好了，
让开发人员用一种统一的方式，使用动态代理。

3.Aop:面向切面编程， 基于动态代理的，可以使用jdk，cglib两种代理方式。
Aop就是动态代理的规范化， 把动态代理的实现步骤，方式都定义好了，
让开发人员用一种统一的方式，使用动态代理。

4. AOP（Aspect Orient Programming）面向切面编程
   Aspect: 切面，给你的目标类增加的功能，就是切面。 像上面用的日志，事务都是切面。
   切面的特点： 一般都是非业务方法，独立使用的。
   Orient：面向， 对着。
   Programming：编程

oop: 面向对象编程

怎么理解面向切面编程 ？
1）需要在分析项目功能时，找出切面。
2）合理的安排切面的执行时间（在目标方法前， 还是目标方法后）
3）合理的安全切面执行的位置，在哪个类，哪个方法增加增强功能
术语：
1）Aspect:切面，表示增强的功能， 就是一堆代码，完成某个一个功能。非业务功能，
常见的切面功能有日志， 事务， 统计信息， 参数检查， 权限验证。

2）JoinPoint:连接点 ，连接业务方法和切面的位置。 就某类中的业务方法
3）Pointcut : 切入点 ，指多个连接点方法的集合。多个方法
4）目标对象： 给哪个类的方法增加功能， 这个类就是目标对象
5）Advice:通知，通知表示切面功能执行的时间。

	说一个切面有三个关键的要素：
	1）切面的功能代码，切面干什么
	2）切面的执行位置，使用Pointcut表示切面执行的位置
	3）切面的执行时间，使用Advice表示时间，在目标方法之前，还是目标方法之后。
5.aop的实现
aop是一个规范，是动态的一个规范化，一个标准
aop的技术实现框架：
1.spring：spring在内部实现了aop规范，能做aop的工作。
spring主要在事务处理时使用aop。
我们项目开发中很少使用spring的aop实现。 因为spring的aop比较笨重。


2.aspectJ: 一个开源的专门做aop的框架。spring框架中集成了aspectj框架，通过spring就能使用aspectj的功能。
aspectJ框架实现aop有两种方式：
1.使用xml的配置文件 ： 配置全局事务
2.使用注解，我们在项目中要做aop功能，一般都使用注解， aspectj有5个注解。


6.学习aspectj框架的使用。


1）切面的执行时间， 这个执行时间在规范中叫做Advice(通知，增强)
在aspectj框架中使用注解表示的。也可以使用xml配置文件中的标签
1）@Before
2）@AfterReturning
3）@Around
4）@AfterThrowing
5）@After