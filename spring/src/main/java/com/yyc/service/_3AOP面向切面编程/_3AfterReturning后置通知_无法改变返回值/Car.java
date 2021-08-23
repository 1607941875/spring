package com.yyc.service._3AOP面向切面编程._3AfterReturning后置通知_无法改变返回值;

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


    public void setBrand(String brand) {
        this.brand = brand;
        System.out.println("=========执行Car的setBrand方法");
    }

    public void setType(String type) {
        this.type = type;
        System.out.println("=========执行Car的type方法");
    }
}
