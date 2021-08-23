package com.yyc._2IOC反转控制._4基于注解的DI;

import com.yyc.entity._4基于注解的DI的entity.Computer;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class _2注解Value基本数据类型的DI测试 {
    @Test
    public void _2注解Value基本数据类型的DI测试() {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("_2IOC反转控制/_4基于注解的DI/_2注解Value基本数据类型的DI测试.xml");
        Computer computer = (Computer) applicationContext.getBean("computer");
        System.out.println(computer.toString());
    }
}
