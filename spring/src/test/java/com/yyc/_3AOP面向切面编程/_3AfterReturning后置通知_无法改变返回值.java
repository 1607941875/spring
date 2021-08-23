package com.yyc._3AOP面向切面编程;

import com.yyc.service._3AOP面向切面编程._3AfterReturning后置通知_无法改变返回值.Car;
import com.yyc.service._3AOP面向切面编程._3AfterReturning后置通知_无法改变返回值.ReserveService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class _3AfterReturning后置通知_无法改变返回值 {

    @Test
    public void _3AfterReturning后置通知_无法改变返回值() {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("_3AOP面向切面编程/_3AfterReturning后置通知_无法改变返回值.xml");
        ReserveService reserveService = (ReserveService) applicationContext.getBean("reserveService");
        Car car = (Car) reserveService.logout(00, "xxx");
        System.out.println("宝马不会变特斯拉===========" + car.toString());

    }

}

