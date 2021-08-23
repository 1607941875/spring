package com.yyc.service._3AOP面向切面编程._2joinPoint连接点;

public class ReserveServiceImpl implements ReserveService {

    @Override
    public void login(Integer id, String name) {
        System.out.println("登录中..");
        System.out.println("登录成功");
    }
}
