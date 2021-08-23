package com.yyc._3AOP面向切面编程;

import com.yyc.service._3AOP面向切面编程._1Before前置通知.ReserveService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class _1Before注解 {


    @Test
    public void _1Before注解() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("_3AOP面向切面编程/_1Before前置通知.xml");
        ReserveService reserveServiceProxy = (ReserveService) applicationContext.getBean("reserveService");
        reserveServiceProxy.login(888, "hellBefore");
        System.out.println(reserveServiceProxy.getClass().getName());
    }


}
