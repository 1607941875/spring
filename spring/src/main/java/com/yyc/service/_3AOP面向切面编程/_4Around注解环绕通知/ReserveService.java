package com.yyc.service._3AOP面向切面编程._4Around注解环绕通知;

public interface ReserveService {

    public void login(Integer id, String name);

    public Object logout(Integer id, String name);
}
