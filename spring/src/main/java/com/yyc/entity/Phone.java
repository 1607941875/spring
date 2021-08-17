package com.yyc.entity;

import org.springframework.stereotype.Component;

@Component
public class Phone {

    private String brand;
    private String color;

    public Phone() {
        System.out.println("执行Phone的无参数构造方法");
    }
}
