package com.yyc._2IOC反转控制._4基于注解的DI;

import com.yyc.entity._4基于注解的DI的entity.Boos;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class _4注解Qualifier引用类型byName的DI测试 {
    @Test
    public void 注解Qualifier引用类型byName的DI测试(){

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("_2IOC反转控制/_4基于注解的DI/_4注解Qualifier引用类型byName的DI测试.xml");
        Boos boos= (Boos) applicationContext.getBean("boos");
        System.out.println(boos.toString());
    }
}

