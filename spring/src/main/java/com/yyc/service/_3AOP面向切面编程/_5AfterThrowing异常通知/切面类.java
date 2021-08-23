package com.yyc.service._3AOP面向切面编程._5AfterThrowing异常通知;

import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class 切面类 {
    /**
     * 异常通知方法的定义格式
     *  1.public
     *  2.没有返回值
     *  3.方法名称自定义
     *  4.方法有个一个Exception， 如果还有是JoinPoint,
     */

    /**
     * @AfterThrowing:异常通知 属性：1. value 切入点表达式
     * 2. throwing 自定义的变量，表示目标方法抛出的异常对象。
     * 变量名必须和方法的参数名一样
     * 特点：
     * 1. 在目标方法抛出异常时执行的
     * 2. 可以做异常的监控程序， 监控目标方法执行时是不是有异常。
     * 如果有异常，可以发送邮件，短信进行通知
     * <p>
     * 执行就是：
     * try{
     * SomeServiceImpl.doSecond(..)
     * }catch(Exception e){
     * myAfterThrowing(e);
     * }
     */
    @AfterThrowing(value = "execution(* *.._5AfterThrowing异常通知.ReserveServiceImpl.login(..))", throwing = "exception")
    public void 异常通知(Exception exception) {

        System.out.println("异常通知！！发生了异常！！！只有发生异常才会执行");

    }


}
