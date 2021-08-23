package com.yyc.entity._4基于注解的DI的entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class 猫砂 {
    @Value("大盆猫砂")
    private String type;

    public 猫砂() {
        System.out.println("执行猫砂的无参数构造方法");
    }

    @Override
    public String toString() {
        return "猫砂{" +
                "type='" + type + '\'' +
                '}';
    }
}
