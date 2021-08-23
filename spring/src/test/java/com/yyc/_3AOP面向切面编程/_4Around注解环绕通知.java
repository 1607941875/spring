package com.yyc._3AOP面向切面编程;


import com.yyc.service._3AOP面向切面编程._4Around注解环绕通知.ReserveService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class _4Around注解环绕通知 {
    @Test
    public void Around注解环绕通知() {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("_3AOP面向切面编程/_4Around注解环绕通知.xml");
        ReserveService reserveService = (ReserveService) applicationContext.getBean("reserveService");
        String str = (String) reserveService.logout(000, "yyc");
        System.out.println(str);

    }

}
