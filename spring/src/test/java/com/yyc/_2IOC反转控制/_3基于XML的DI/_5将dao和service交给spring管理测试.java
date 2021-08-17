package com.yyc._2IOC反转控制._3基于XML的DI;

import com.yyc.service.StudentService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class _5将dao和service交给spring管理测试 {

@Test
    public void 将dao和service交给spring管理测试(){

    System.out.println("执行一个事务");
    ApplicationContext applicationContext = new ClassPathXmlApplicationContext("_2IOC反转控制/_3基于XML的DI/_5将dao和service交给spring管理测试.xml");
    StudentService studentService =(StudentService) applicationContext.getBean("studentService");
    studentService.增加学生业务();

    }
}
