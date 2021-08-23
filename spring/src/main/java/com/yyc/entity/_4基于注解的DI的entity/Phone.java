package com.yyc.entity._4基于注解的DI的entity;

import org.springframework.stereotype.Component;

@Component
public class Phone {

    private String brand;
    private String color;

    public Phone() {
        System.out.println("执行Phone的无参数构造方法");
    }
}
