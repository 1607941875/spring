package com.yyc._2IOC反转控制._3基于XML的DI;

import com.yyc.entity.Animal;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class _6自动注入引用类型属性byName测试 {
    @Test

    public void 自动注入引用类型属性byName测试(){


        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("_2IOC反转控制/_3基于XML的DI/_6自动注入引用类型属性byName测试.xml");
        Animal animal = (Animal) applicationContext.getBean("Animal");
        System.out.println(animal.toString());
    }
}
