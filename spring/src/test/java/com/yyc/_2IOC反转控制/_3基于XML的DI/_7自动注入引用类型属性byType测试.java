package com.yyc._2IOC反转控制._3基于XML的DI;

import com.yyc.entity.Person;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class _7自动注入引用类型属性byType测试 {

    @Test
    public void 自动注入引用类型属性byType测试() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("_2IOC反转控制/_3基于XML的DI/_7自动注入引用类型属性byType测试.xml");
        Person person = (Person) applicationContext.getBean("person");
        System.out.println(person.toString());
    }
}
