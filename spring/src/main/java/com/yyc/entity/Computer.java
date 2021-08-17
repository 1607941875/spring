package com.yyc.entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Computer {
    @Value("macbookPro")
    private String brand;
    @Value("🐂闪闪M1")
    private String cpu;

    public Computer() {
        System.out.println("执行Computer的构造方法");
    }

    @Override
    public String toString() {
        return "Computer{" +
                "brand='" + brand + '\'' +
                ", cpu='" + cpu + '\'' +
                '}';
    }
}
