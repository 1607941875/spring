package com.yyc.service._3AOP面向切面编程._3AfterReturning后置通知_改变返回值;

public interface ReserveService {

    public void login(Integer id, String name);

    public Car logout(Integer id, String name);
}
