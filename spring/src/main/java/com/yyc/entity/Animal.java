package com.yyc.entity;

public class Animal {
    private String name;
    private String color;
    private Student student;
    private Animal animal;

    public Animal() {
        System.out.println("执行Animal空参数构造方法");
    }

    public void setName(String name) {
        System.out.println("=======Animal 执行setName"+name);
        this.name = name;
    }

    public void setColor(String color) {
        System.out.println("=======Animal 执行setColor"+color);
        this.color = color;
    }

    public void setStudent(Student student) {
        System.out.println("=======Animal 执行setName"+student.toString());
        this.student = student;
    }

    public void setAnimal(Animal animal) {
        System.out.println("=======Animal 执行setAnimal"+animal.toString());
        this.animal = animal;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", student=" + student +
                ", animal='" + animal + '\'' +
                '}';
    }
}
