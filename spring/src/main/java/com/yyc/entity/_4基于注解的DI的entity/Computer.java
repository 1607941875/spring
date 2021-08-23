package com.yyc.entity._4基于注解的DI的entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Computer {
    @Value("macbookPro")
    private String brand;
    @Value("🐂闪闪M1")
    private String cpu;

    @Value("CoreI7")
    public void setCpu(String cpu) {
        System.out.println("调用setCpu方法===="+cpu);

    }

    public Computer() {
        System.out.println("执行Computer的无参数构造方法");
    }

    @Override
    public String toString() {
        return "Computer{" +
                "brand='" + brand + '\'' +
                ", cpu='" + cpu + '\'' +
                '}';
    }
}
