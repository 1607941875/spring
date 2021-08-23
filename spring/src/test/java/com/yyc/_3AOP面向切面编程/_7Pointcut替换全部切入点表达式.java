package com.yyc._3AOP面向切面编程;

import com.yyc.service._3AOP面向切面编程._7Pointcut替换全部切入点表达式.ReserveService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class _7Pointcut替换全部切入点表达式 {
    @Test
    public void _7Pointcut替换全部切入点表达式() {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("_3AOP面向切面编程/_7Pointcut替换全部切入点表达式.xml");
        ReserveService reserveService = (ReserveService) applicationContext.getBean("reserveService");
        reserveService.login(000, "yyc");
        System.out.println(reserveService.getClass().getName());

    }
}
