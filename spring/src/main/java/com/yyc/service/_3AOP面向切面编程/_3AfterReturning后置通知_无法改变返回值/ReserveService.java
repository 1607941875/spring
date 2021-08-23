package com.yyc.service._3AOP面向切面编程._3AfterReturning后置通知_无法改变返回值;

public interface ReserveService {

    public void login(Integer id, String name);

    public Object logout(Integer id, String name);
}
