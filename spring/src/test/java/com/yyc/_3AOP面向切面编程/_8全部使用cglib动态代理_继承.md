## 全部使用cglib动态代理，也就是继承的方式
 ### 1. 有接口的类
> spring默认使用`jdk`动态代理
### 2. 没有接口的类
> spring默认使用`cglib`代理

### 3. 即使 目标类有接口，也使用cglib代理
> 需要在`配置文件.xml`配置如下:


```xml
 <!--
       如果你期望目标类有接口，使用cglib代理
       proxy-target-class="true":告诉框架，要使用cglib动态代理
    -->
    <aop:aspectj-autoproxy proxy-target-class="true"/>
```