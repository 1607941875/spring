package com.yyc._2IOC反转控制._5多配置文件进行模块化;

import com.yyc.entity.Person;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class _1多配置文件进行模块化测试 {
    @Test
    public void 多配置文件进行模块化测试(){

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("_2IOC反转控制/_5多配置文件进行模块化/total.xml");
        Person person = (Person) applicationContext.getBean("person");
        System.out.println(person.toString());


    }

}
