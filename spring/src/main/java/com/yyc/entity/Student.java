package com.yyc.entity;

public class Student {
    private String name;
    private int age;


    public Student() {
        System.out.println("执行Student的无参数构造方法");
    }


    public void setName(String name) {
        System.out.println("=======Student 执行setName" + name);
        this.name = name;
    }


    public void setAge(int age) {
        System.out.println("=======Student 执行age" + age);
        this.age = age;
    }

    public void setEmail(String ags) {
        System.out.println("执行setEmail方法");

    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
