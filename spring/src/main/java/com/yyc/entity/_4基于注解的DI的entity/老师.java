package com.yyc.entity._4基于注解的DI的entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class 老师 {
    public 老师() {
        System.out.println("执行老师的无参数构造方法");
    }

    @Value("👩‍🏫")
    private String 姓名;
    @Value("20")
    private int 年龄;
    /**
     * 引用类型
     * @Autowired: spring框架提供的注解，实现引用类型的赋值。
     * spring中通过注解给引用类型赋值，使用的是自动注入原理 ，支持byName, byType
     * @Autowired:默认使用的是byType自动注入。
     *
     *  位置：1）在属性定义的上面，无需set方法， 推荐使用
     *       2）在set方法的上面
     *
     *  如果要使用byName方式，需要做的是：
     *  1.在属性上面加入@Autowired
     *  2.在属性上面加入@Qualifier(value="bean的id") ：表示使用指定名称的bean完成赋值。
     */

    @Autowired
    private 衣服 衣;

    @Autowired
    public void set衣(衣服 衣) {
        System.out.println("调用set衣方法===="+衣.toString());
    }

    @Override
    public String toString() {
        return "老师{" +
                "姓名='" + 姓名 + '\'' +
                ", 年龄=" + 年龄 +
                ", 衣=" + 衣 +
                '}';
    }
}
