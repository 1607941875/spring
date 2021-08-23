package com.yyc._2IOC反转控制._4基于注解的DI;

import com.yyc.entity._4基于注解的DI的entity.老师;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class _3注解Autowired引用类型byType的DI测试 {

    @Test
    public void 注解Autowired引用类型的DI测试() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("_2IOC反转控制/_4基于注解的DI/_3注解Autowired引用类型byType的DI测试.xml");
        老师  老师= (老师) applicationContext.getBean("老师");
        System.out.println(老师.toString());
    }
}

