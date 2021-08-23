package com.yyc.entity._4基于注解的DI通过properties实现解耦;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Computer {
    @Value("${brand}")
    private String brand;
    @Value("${cpu}")
    private String cpu;

    @Value("${cpu}")
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
