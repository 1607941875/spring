package com.yyc._1helloSpring;

import com.yyc.service._1helloSpring;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class _1helloSpring测试 {
    @Test
    public void helloSpring测试() {

        //使用spring容器创建的对象
        //1.指定spring配置文件的名称

        String springConfig = "_1helloSpring/applicationContext.xml";
        //2.创建表示spring容器的对象,ApplicationContext
        //ApplicationContext就是表示 Spring容器,通过容器获取对象了
        //ClasspathXmlApplicationContext:表示从类路径中加载 spring的配置文件
        /**
         * spring会在创建容器，调用所以bean的构造方法，也就是创建对象
         * */
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(springConfig);
        //3.从容器中获取某个对象,你要调用对象的方法
        //getBean("配置文件中的bean的id值")
        _1helloSpring hello = (_1helloSpring) applicationContext.getBean("_1helloSpring");
        hello.helloSpring();

    }
}
