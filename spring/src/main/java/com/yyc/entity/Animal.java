package com.yyc.entity;

public class Animal {
    private String name;
    private String color;
    private Student student;

    public Animal() {
        System.out.println("执行Animal构造方法");
    }

    public Animal(String name, String color, Student student) {
        this.name = name;
        this.color = color;
        this.student = student;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println("=======Animal 执行setName"+name);
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        System.out.println("=======Animal 执行setColor"+color);
        this.color = color;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        System.out.println("=======Animal 执行setName"+student.toString());
        this.student = student;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", student=" + student +
                '}';
    }
}
