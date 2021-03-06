package com.yyc._2IOC反转控制._1spring容器中常用方法;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import java.util.Arrays;
import java.util.List;

public class _1spring容器中常用方法测试 {

    @Test
    public void spring容器中常用方法() {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("_1helloSpring/applicationContext.xml");
        System.out.println("================");
        //------------1.获取bean的精确个数
        int count=applicationContext.getBeanDefinitionCount();
        System.out.println(count);
        //------------2.获取bean的所有id名
        String[] names = applicationContext.getBeanDefinitionNames();
        List<String> nameList = Arrays.asList(names);
        nameList.forEach((name) -> System.out.print(name + "; "));


    }
}
