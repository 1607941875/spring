package com.yyc._2IOC反转控制._3基于XML的DI;

import com.yyc.entity.Car;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class _3构造方法注入基本数据类型的DI测试 {

    @Test
    public void 构造方法注入测试() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("_2IOC反转控制/_3基于XML的DI/_3构造方法注入基本数据类型的DI测试.xml");
        Car car = (Car) applicationContext.getBean("car基本类型");
        System.out.println(car.toString());

    }
}
