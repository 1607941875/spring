package com.yyc.entity._4基于注解的DI的entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("employee_custom")
public class Employee {
    @Value("李大白")
    private String name;

    public Employee() {
        System.out.println("执行Employee的无参数构造方法");
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                '}';
    }
}
