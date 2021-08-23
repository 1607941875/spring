package com.yyc.entity._4基于注解的DI的entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Boos {
    private String name;
    @Autowired
    @Qualifier("employee_custom")
    private Employee employee;

    public Boos() {
        System.out.println("执行Boos空参数构造方法");
    }
    @Qualifier("employee_custom")
    @Autowired
    public void setEmployee(Employee employee) {
        System.out.println("执行setEmployee方法====" + employee);
    }

    @Override
    public String toString() {
        return "Boos{" +
                "name='" + name + '\'' +
                ", employee=" + employee +
                '}';
    }
}
