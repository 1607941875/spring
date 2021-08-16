package com.yyc._2IOC反转控制._3基于XML的DI;


import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.awt.*;
import java.io.File;

import static com.sun.javafx.scene.control.skin.Utils.getResource;

public class _4构造方法注入非自定义类型File测试 {
    @Test
    public void 构造方法注入非自定义类型测试(){


        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("_2IOC反转控制._3基于XML的DI/_4构造方法注入非自定义类型File测试.xml");
        File 自定义file = (File) applicationContext.getBean("File自定义类型");
        System.out.println("不管--文件是否存在"+自定义file.exists());
        //相对路径的根目录是project的根文件夹
        File f = new File( "target/classes/com/yyc/entity/test.txt");
        File f2 = new File("src/main/java/com/yyc/entity/test.txt");
        System.out.println(f.exists());
        System.out.println(f2.exists());
        System.out.println(this.getClass().getResource("/").getFile());

        System.out.println("============");
        //classpath的文件路径
       String cp = "com/yyc/entity/test.txt";

        //当前类的绝对路径
        System.out.println(Test. class.getResource( "/").getFile());
        //指定CLASSPATH文件的绝对路径
        System.out.println(Test. class.getResource("/").getFile());
        //指定CLASSPATH文件的绝对路径
//        File f3 = new File(Test. class.getResource(cp).getFile());
//        System.out.println(f3.getPath());

    }


}
