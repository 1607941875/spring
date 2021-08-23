package com.yyc._3AOP面向切面编程;

import com.yyc.service._3AOP面向切面编程._6After最终通知.ReserveService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class _6After最终通知 {
    @Test
    public void _6After最终通知() {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("_3AOP面向切面编程/_6After最终通知.xml");
        ReserveService reserveService = (ReserveService) applicationContext.getBean("reserveService");
        reserveService.login(000, "yyc");

    }
}
