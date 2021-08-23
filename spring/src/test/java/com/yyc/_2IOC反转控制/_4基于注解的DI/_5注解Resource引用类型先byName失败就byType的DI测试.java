package com.yyc._2IOC反转控制._4基于注解的DI;

import com.yyc.entity._4基于注解的DI的entity.Cat;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class _5注解Resource引用类型先byName失败就byType的DI测试 {
    @Test
    public void 注解Resource引用类型先byName失败就byType的DI测试(){

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("_2IOC反转控制/_4基于注解的DI/_5注解Resource引用类型先byName失败就byType的DI测试.xml");
        Cat cat= (Cat) applicationContext.getBean("cat");
        System.out.println(cat.toString());

    }
}
