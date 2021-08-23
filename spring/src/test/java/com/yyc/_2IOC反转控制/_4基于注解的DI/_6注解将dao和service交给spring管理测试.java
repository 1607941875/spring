package com.yyc._2IOC反转控制._4基于注解的DI;

import com.yyc.dao.ReaderDao;
import com.yyc.service.ReaderService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class _6注解将dao和service交给spring管理测试 {

    @Test
    public void 注解将dao和service交给spring管理测试() {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("_2IOC反转控制/_4基于注解的DI/_6注解将dao和service交给spring管理测试.xml");
        ReaderService readerService = (ReaderService) applicationContext.getBean("readerServiceImpl");
        readerService.进入图书馆业务();
    }
}
