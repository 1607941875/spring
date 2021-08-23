package com.yyc.entity._4基于注解的DI的entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class Cat {
    @Value("🐱")
    private String name;

    @Resource
    private 猫砂 猫砂;

    public Cat() {
        System.out.println("执行Cat的无参数构造方法");
    }

    @Resource
    public void set猫砂(com.yyc.entity._4基于注解的DI的entity.猫砂 猫砂) {
        System.out.println("执行set猫砂====" + 猫砂);
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", 猫砂=" + 猫砂 +
                '}';
    }
}

