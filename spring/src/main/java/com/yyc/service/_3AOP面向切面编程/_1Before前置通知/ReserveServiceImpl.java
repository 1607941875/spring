package com.yyc.service._3AOP面向切面编程._1Before前置通知;

public class ReserveServiceImpl implements ReserveService {

    @Override
    public void login(Integer id, String name) {
        System.out.println("登录中..");
        System.out.println("登录成功");
    }
}
