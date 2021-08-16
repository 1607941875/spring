package com.yyc._2IOC反转控制._3基于XML的DI;

import com.yyc.entity.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;

public class _1set方法注入基本数据类型的DI测试 {


    @Test
    public void _1基于XML的DI测试(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("_2IOC反转控制._3基于XML的DI/_1set方法注入基本数据类型的DI测试.xml");
       Student student = (Student) applicationContext.getBean("Student");
        System.out.println(student.toString());
    }
    @Test
    public void _2只要有set方法就能执行_无关属性测试(){

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("_2IOC反转控制._3基于XML的DI/_1set方法注入基本数据类型的DI测试.xml");
        Student student = (Student) applicationContext.getBean("Student");

    }
    @Test
    public void _3根据2来给myDate初始化值(){

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("_2IOC反转控制._3基于XML的DI/_1set方法注入基本数据类型的DI测试.xml");
        Date myDate  = (Date) applicationContext.getBean("myDate");
        System.out.println(myDate);

    }



}
