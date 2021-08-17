package com.yyc._2IOC反转控制._4基于注解的DI;

import com.yyc.entity.Phone;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class _1注解创建对象测试 {
    @Test
    public void 注解创建对象测试() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("_2IOC反转控制/_4基于注解的DI/_1注解创建对象测试.xml");
        Phone phone = (Phone) applicationContext.getBean("phone");
    }
}
