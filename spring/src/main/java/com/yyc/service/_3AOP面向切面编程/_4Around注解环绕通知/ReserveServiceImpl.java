package com.yyc.service._3AOP面向切面编程._4Around注解环绕通知;


public class ReserveServiceImpl implements ReserveService {

    @Override
    public void login(Integer id, String name) {
        System.out.println("登录中..");
        System.out.println("登录成功");
    }

    @Override
    public Object logout(Integer id, String name) {

        System.out.println("执行logout方法");
        Car car = new Car();
        car.setBrand("宝马");
        car.setType("越野车");


        return car;

    }
}
