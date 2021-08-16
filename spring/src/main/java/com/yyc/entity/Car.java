package com.yyc.entity;

public class Car {
private String brand;
private String type;

    public Car() {
        System.out.println("=========执行Car的空参数构造方法");
    }

    public Car(String brand, String type) {
        System.out.println("=========执行Car的有参数构造方法");
        this.brand = brand;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
