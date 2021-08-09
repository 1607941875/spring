package com.yyc._2IOC反转控制._2获取非自定义对象;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;

public class _1获取非自定义对象测试 {
    @Test
    public void 获取非自定义对象测试(){

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("_1helloSpring/applicationContext.xml");
        Date myDate    = (Date) applicationContext.getBean("myDate");
        System.out.println(myDate);
    }
}
