package com.yyc._3AOP面向切面编程;

import com.yyc.service._3AOP面向切面编程._5AfterThrowing异常通知.ReserveService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class _5AfterThrowing异常通知 {
 @Test
    public void _5AfterThrowing异常通知(){

     ApplicationContext applicationContext = new ClassPathXmlApplicationContext("_3AOP面向切面编程/_5AfterThrowing异常通知.xml");
     ReserveService reserveService = (ReserveService) applicationContext.getBean("reserveService");
     reserveService.login(000, "yyc");
 }

}
