package com.yyc._2IOC反转控制._3基于XML的DI;

import com.yyc.entity.Animal;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class _2set方法注入属性是引用对象的DI测试 {

    @Test
    public void 引用属性的DI测试() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("_2IOC反转控制/_3基于XML的DI/_2set方法注入属性是引用对象的DI测试.xml");
        Animal animal = (Animal) applicationContext.getBean("Animal");
        System.out.println(animal.toString());
    }


    @Test
    public void 多层引用类型嵌套DI就是由内而外赋值() {
        /**
         * spring 第一遍会把所有的 bean创建出来后
         * 发现存在 没有被赋值的引用，就执行第二遍，因为第一遍以及赋值了，所以第二遍直接赋值就行了
         * */
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("_2IOC反转控制/_3基于XML的DI/_2set方法注入属性是引用对象的DI测试.xml");
        Animal animal01 = (Animal) applicationContext.getBean("Animal01");
        System.out.println(animal01.toString());
    }
}
